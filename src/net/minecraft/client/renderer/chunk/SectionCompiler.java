package net.minecraft.client.renderer.chunk;

import com.mojang.blaze3d.vertex.ByteBufferBuilder;
import com.mojang.blaze3d.vertex.MeshData;
import com.mojang.blaze3d.vertex.SectionBufferBuilder;
import com.mojang.blaze3d.vertex.VertexSorting;
import com.mojang.renderpearl.api.pipeline.PrimitiveTopology;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import net.minecraft.CrashReport;
import net.minecraft.CrashReportCategory;
import net.minecraft.CrashReportUtil;
import net.minecraft.ReportedException;
import net.minecraft.client.color.block.BlockColors;
import net.minecraft.client.renderer.SectionBufferBuilderPack;
import net.minecraft.client.renderer.block.BlockModelLighter;
import net.minecraft.client.renderer.block.BlockQuadOutput;
import net.minecraft.client.renderer.block.BlockStateModelSet;
import net.minecraft.client.renderer.block.FluidRenderer;
import net.minecraft.client.renderer.block.FluidStateModelSet;
import net.minecraft.client.renderer.block.ModelBlockRenderer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.SectionPos;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FluidState;
import org.jspecify.annotations.Nullable;

public class SectionCompiler {
   private final boolean ambientOcclusion;
   private final boolean cutoutLeaves;
   private final BlockStateModelSet blockModelSet;
   private final FluidStateModelSet fluidModelSet;
   private final BlockColors blockColors;

   public SectionCompiler(
      final boolean ambientOcclusion,
      final boolean cutoutLeaves,
      final BlockStateModelSet blockModelSet,
      final FluidStateModelSet fluidModelSet,
      final BlockColors blockColors
   ) {
      this.ambientOcclusion = ambientOcclusion;
      this.cutoutLeaves = cutoutLeaves;
      this.blockModelSet = blockModelSet;
      this.fluidModelSet = fluidModelSet;
      this.blockColors = blockColors;
   }

   public SectionCompiler.Results compile(
      final SectionPos sectionPos, final RenderSectionRegion region, final VertexSorting vertexSorting, final SectionBufferBuilderPack builders
   ) {
      SectionCompiler.Results results = new SectionCompiler.Results();
      BlockPos minPos = sectionPos.origin();
      BlockPos maxPos = minPos.offset(15, 15, 15);
      VisGraph visGraph = new VisGraph();
      BlockModelLighter.enableCaching();
      ModelBlockRenderer blockRenderer = new ModelBlockRenderer(this.ambientOcclusion, true, this.blockColors);
      FluidRenderer fluidRenderer = new FluidRenderer(this.fluidModelSet);
      Map<ChunkSectionLayer, SectionBufferBuilder> startedLayers = new EnumMap<>(ChunkSectionLayer.class);
      BlockQuadOutput quadOutput = (x, y, z, quad, instance) -> {
         ChunkSectionLayer layerx = quad.materialInfo().layer();
         SectionBufferBuilder builderx = this.getOrBeginLayer(startedLayers, builders, layerx);
         builderx.addQuad(x, y, z, quad, instance);
      };
      BlockQuadOutput opaqueQuadOutput = (x, y, z, quad, instance) -> {
         SectionBufferBuilder builderx = this.getOrBeginLayer(startedLayers, builders, ChunkSectionLayer.SOLID);
         builderx.addQuad(x, y, z, quad, instance);
      };
      FluidRenderer.Output fluidOutput = (layerx, x, y, z, quad, color, brightness, lightCoords) -> {
         SectionBufferBuilder builderx = this.getOrBeginLayer(startedLayers, builders, layerx);
         builderx.addFluidQuad(x, y, z, quad, color, brightness, lightCoords);
      };

      for (BlockPos pos : BlockPos.betweenClosed(minPos, maxPos)) {
         BlockState blockState = region.getBlockState(pos);
         if (!blockState.isAir()) {
            try {
               if (blockState.isSolidRender()) {
                  visGraph.setOpaque(pos);
               }

               if (blockState.hasBlockEntity()) {
                  BlockEntity blockEntity = region.getBlockEntity(pos);
                  if (blockEntity != null) {
                     this.handleBlockEntity(results, blockEntity);
                  }
               }

               FluidState fluidState = blockState.getFluidState();
               if (!fluidState.isEmpty()) {
                  fluidRenderer.tesselate(region, pos, fluidOutput, blockState, fluidState);
               }

               if (blockState.getRenderShape() == RenderShape.MODEL) {
                  blockRenderer.tesselateBlock(
                     ModelBlockRenderer.forceOpaque(this.cutoutLeaves, blockState) ? opaqueQuadOutput : quadOutput,
                     SectionPos.sectionRelative(pos.getX()),
                     SectionPos.sectionRelative(pos.getY()),
                     SectionPos.sectionRelative(pos.getZ()),
                     region,
                     pos,
                     blockState,
                     this.blockModelSet.get(blockState),
                     blockState.getSeed(pos)
                  );
               }
            } catch (Throwable t) {
               CrashReport report = CrashReport.forThrowable(t, "Tesselating block in world");
               CrashReportCategory category = report.addCategory("Block being tesselated");
               CrashReportUtil.populateBlockDetails(category, region, pos, blockState);
               throw new ReportedException(report);
            }
         }
      }

      for (Entry<ChunkSectionLayer, SectionBufferBuilder> entry : startedLayers.entrySet()) {
         ChunkSectionLayer layer = entry.getKey();
         SectionBufferBuilder builder = entry.getValue();
         MeshData mesh = builder.build();
         if (mesh != null) {
            if (layer == ChunkSectionLayer.TRANSLUCENT) {
               results.transparencyState = mesh.sortQuads(builders.buffer(layer), vertexSorting, layer);
            }

            results.renderedLayers.put(layer, mesh);
         }
      }

      BlockModelLighter.clearCache();
      results.visibilitySet = visGraph.resolve();
      return results;
   }

   private SectionBufferBuilder getOrBeginLayer(
      final Map<ChunkSectionLayer, SectionBufferBuilder> startedLayers, final SectionBufferBuilderPack buffers, final ChunkSectionLayer layer
   ) {
      SectionBufferBuilder builder = startedLayers.get(layer);
      if (builder == null) {
         ByteBufferBuilder buffer = buffers.buffer(layer);
         builder = new SectionBufferBuilder(buffer, PrimitiveTopology.QUADS, layer);
         startedLayers.put(layer, builder);
      }

      return builder;
   }

   private <E extends BlockEntity> void handleBlockEntity(final SectionCompiler.Results results, final E blockEntity) {
      results.blockEntities.add(blockEntity);
   }

   public static final class Results {
      public final List<BlockEntity> blockEntities = new ArrayList<>();
      public final Map<ChunkSectionLayer, MeshData> renderedLayers = new EnumMap<>(ChunkSectionLayer.class);
      public VisibilitySet visibilitySet = new VisibilitySet();
      public MeshData.@Nullable SortState transparencyState;

      public void release() {
         this.renderedLayers.values().forEach(MeshData::close);
      }
   }
}
