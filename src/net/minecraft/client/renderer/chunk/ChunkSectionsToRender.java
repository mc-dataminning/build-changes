package net.minecraft.client.renderer.chunk;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.renderpearl.api.buffers.GpuBuffer;
import com.mojang.renderpearl.api.buffers.GpuBufferSlice;
import com.mojang.renderpearl.api.commands.RenderPass;
import com.mojang.renderpearl.api.device.DeviceLimits;
import com.mojang.renderpearl.api.pipeline.IndexType;
import com.mojang.renderpearl.api.pipeline.PrimitiveTopology;
import com.mojang.renderpearl.api.pipeline.RenderPipeline;
import com.mojang.renderpearl.api.textures.FilterMode;
import com.mojang.renderpearl.api.textures.GpuSampler;
import com.mojang.renderpearl.api.textures.GpuTextureView;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.client.renderer.oit.OitRenderPassProvider;
import net.minecraft.client.renderer.oit.OitStage;
import org.jspecify.annotations.Nullable;

public abstract class ChunkSectionsToRender {
   private final int maxIndicesRequired;
   private final GpuBufferSlice terrainTransformUBO;

   private ChunkSectionsToRender(final GpuBufferSlice terrainTransformUBO, final int maxIndicesRequired) {
      this.maxIndicesRequired = maxIndicesRequired;
      this.terrainTransformUBO = terrainTransformUBO;
   }

   protected abstract void render(
      final ChunkSectionLayer layer,
      final RenderPass renderPass,
      @Nullable GpuBuffer defaultIndexBuffer,
      @Nullable IndexType defaultIndexType,
      @Nullable final RenderPipeline renderPipelineOverride,
      @Nullable final RenderPipeline renderPipelineOverrideMultidraw
   );

   public void renderGroup(
      final ChunkSectionLayerGroup group,
      final RenderPass renderPass,
      final GpuSampler sampler,
      final GpuTextureView atlas,
      final boolean renderWireframeTerrain
   ) {
      GameRenderer gameRenderer = Minecraft.getInstance().gameRenderer;
      GpuTextureView lightmap = gameRenderer.lightmap();
      this.renderLayers(
         group.layers(),
         sampler,
         renderPass,
         atlas,
         lightmap,
         renderWireframeTerrain ? RenderPipelines.WIREFRAME : null,
         renderWireframeTerrain ? RenderPipelines.WIREFRAME_MULTIDRAW : null
      );
   }

   public void renderOit(
      final GpuSampler sampler, final OitStage stage, final OitRenderPassProvider.Parameters params, final GpuTextureView atlas, final GpuTextureView lightmap
   ) {
      try (RenderPass renderPass = OitRenderPassProvider.createRenderPass(stage, () -> "Terrain", params)) {
         this.renderLayers(
            ChunkSectionLayerGroup.TRANSLUCENT.layers(),
            sampler,
            renderPass,
            atlas,
            lightmap,
            RenderPipelines.OIT_TERRAIN.getPipeline(stage),
            RenderPipelines.OIT_TERRAIN_MULTIDRAW.getPipeline(stage)
         );
      }
   }

   private void renderLayers(
      final ChunkSectionLayer[] layers,
      final GpuSampler sampler,
      final RenderPass renderPass,
      final GpuTextureView atlas,
      final GpuTextureView lightmap,
      @Nullable final RenderPipeline renderPipelineOverride,
      @Nullable final RenderPipeline renderPipelineOverrideMultidraw
   ) {
      RenderSystem.AutoStorageIndexBuffer autoIndices = RenderSystem.getSequentialBuffer(PrimitiveTopology.QUADS);
      GpuBuffer defaultIndexBuffer = this.maxIndicesRequired == 0 ? null : autoIndices.getBuffer();
      IndexType defaultIndexType = this.maxIndicesRequired == 0 ? null : autoIndices.type();
      renderPass.setUniform("TerrainUniform", this.terrainTransformUBO);
      renderPass.setUniform("Sampler0", atlas, sampler);
      renderPass.setUniform("Sampler2", lightmap, RenderSystem.getSamplerCache().getClampToEdge(FilterMode.LINEAR));

      for (ChunkSectionLayer layer : layers) {
         renderPass.pushDebugGroup(() -> "Terrain layer: " + layer.label());
         this.render(layer, renderPass, defaultIndexBuffer, defaultIndexType, renderPipelineOverride, renderPipelineOverrideMultidraw);
         renderPass.popDebugGroup();
      }
   }

   public static final class DrawIndirect extends ChunkSectionsToRender {
      private final EnumMap<ChunkSectionLayer, List<ChunkSectionsToRender.GpuMultiDrawIndexedIndirect>> drawGroupsPerLayer;
      private final GpuBufferSlice chunkSectionInfos;

      public DrawIndirect(
         final GpuBufferSlice terrainTransformUBO,
         final EnumMap<ChunkSectionLayer, List<ChunkSectionsToRender.GpuMultiDrawIndexedIndirect>> drawGroupsPerLayer,
         final int maxIndicesRequired,
         final GpuBufferSlice chunkSectionInfos
      ) {
         super(terrainTransformUBO, maxIndicesRequired);
         this.drawGroupsPerLayer = drawGroupsPerLayer;
         this.chunkSectionInfos = chunkSectionInfos;
      }

      @Override
      protected void render(
         final ChunkSectionLayer layer,
         final RenderPass renderPass,
         @Nullable final GpuBuffer defaultIndexBuffer,
         @Nullable final IndexType defaultIndexType,
         @Nullable final RenderPipeline renderPipelineOverride,
         @Nullable final RenderPipeline renderPipelineOverrideMultidraw
      ) {
         renderPass.setPipeline(
            RenderSystem.getCompiledPipeline(renderPipelineOverrideMultidraw != null ? renderPipelineOverrideMultidraw : layer.pipeline(true))
         );
         DeviceLimits deviceLimits = RenderSystem.getDevice().getDeviceInfo().limits();
         int maxDrawIndirectDrawCount = deviceLimits.maxDrawIndirectDrawCount();
         List<ChunkSectionsToRender.GpuMultiDrawIndexedIndirect> drawGroups = this.drawGroupsPerLayer.get(layer);
         if (!drawGroups.isEmpty()) {
            renderPass.setVertexBuffer(1, this.chunkSectionInfos);
         }

         for (ChunkSectionsToRender.GpuMultiDrawIndexedIndirect indirectDraw : drawGroups) {
            if (indirectDraw.drawCount() > 0) {
               renderPass.setVertexBuffer(0, indirectDraw.vertexBuffer);
               IndexType indexType = indirectDraw.indexType() == null ? defaultIndexType : indirectDraw.indexType();
               renderPass.setIndexBuffer(indirectDraw.indexBuffer() == null ? defaultIndexBuffer : indirectDraw.indexBuffer().buffer(), indexType);
               GpuBuffer buffer = indirectDraw.indirectCommandBuffer.buffer();
               long startOffset = indirectDraw.indirectCommandBuffer().offset();
               int remainingDrawCount = indirectDraw.drawCount();

               while (remainingDrawCount > 0) {
                  int passDrawCount = Integer.min(remainingDrawCount, maxDrawIndirectDrawCount);
                  long length = (long)passDrawCount * 20L;
                  GpuBufferSlice passSlice = buffer.slice(startOffset, length);
                  renderPass.drawIndexedIndirect(passSlice, passDrawCount);
                  remainingDrawCount -= passDrawCount;
                  startOffset += length;
               }
            }
         }
      }
   }

   public static final class DrawSeparate extends ChunkSectionsToRender {
      private final Map<ChunkSectionLayer, List<RenderPass.Draw<GpuBufferSlice[]>>> drawsPerLayer;
      private final GpuBufferSlice[] chunkSectionInfos;

      public DrawSeparate(
         final GpuBufferSlice terrainTransformUBO,
         final Map<ChunkSectionLayer, List<RenderPass.Draw<GpuBufferSlice[]>>> drawsPerLayer,
         final int maxIndicesRequired,
         final GpuBufferSlice[] chunkSectionInfos
      ) {
         super(terrainTransformUBO, maxIndicesRequired);
         this.drawsPerLayer = drawsPerLayer;
         this.chunkSectionInfos = chunkSectionInfos;
      }

      @Override
      protected void render(
         final ChunkSectionLayer layer,
         final RenderPass renderPass,
         @Nullable final GpuBuffer defaultIndexBuffer,
         @Nullable final IndexType defaultIndexType,
         @Nullable final RenderPipeline renderPipelineOverride,
         @Nullable final RenderPipeline renderPipelineOverrideMultidraw
      ) {
         renderPass.setPipeline(RenderSystem.getCompiledPipeline(renderPipelineOverride != null ? renderPipelineOverride : layer.pipeline(false)));
         List<RenderPass.Draw<GpuBufferSlice[]>> draws = this.drawsPerLayer.get(layer);
         if (!draws.isEmpty()) {
            renderPass.drawMultipleIndexed(draws, defaultIndexBuffer, defaultIndexType, List.of("ChunkSection"), this.chunkSectionInfos);
         }
      }
   }

   public static record GpuMultiDrawIndexedIndirect(
      GpuBufferSlice vertexBuffer, @Nullable GpuBufferSlice indexBuffer, @Nullable IndexType indexType, GpuBufferSlice indirectCommandBuffer, int drawCount
   ) {
   }
}
