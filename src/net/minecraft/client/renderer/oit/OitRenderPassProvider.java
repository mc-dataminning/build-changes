package net.minecraft.client.renderer.oit;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.renderpearl.api.commands.RenderPass;
import com.mojang.renderpearl.api.commands.RenderPassDescriptor;
import com.mojang.renderpearl.api.textures.FilterMode;
import com.mojang.renderpearl.api.textures.GpuSampler;
import com.mojang.renderpearl.api.textures.GpuTextureView;
import java.util.Optional;
import java.util.function.Supplier;
import net.minecraft.client.renderer.LevelRenderer;

public class OitRenderPassProvider {
   public static RenderPass createRenderPass(
      final OitStage stage, final Supplier<String> label, final OitRenderPassProvider.Parameters params, final boolean shouldClearTargets
   ) {
      return switch (stage) {
         case DEPTH_BOUNDS -> createDepthBoundsPass(label, params, shouldClearTargets);
         case TRANSMITTANCE -> createTransmittancePass(label, params, shouldClearTargets);
         case ACCUMULATE -> createAccumulatePass(label, params, shouldClearTargets);
         default -> throw new IllegalArgumentException("Invalid OIT stage.");
      };
   }

   private static RenderPass createDepthBoundsPass(
      final Supplier<String> label, final OitRenderPassProvider.Parameters params, final boolean shouldClearTargets
   ) {
      RenderPassDescriptor descriptor = RenderPassDescriptor.builder(() -> "OIT Depth Bounds for " + label.get())
         .withColorAttachment(params.depthBoundsTargetView, shouldClearTargets ? Optional.of(LevelRenderer.DEPTH_BOUNDS_CLEAR_COLOR) : Optional.empty())
         .withDepthAttachment(params.depthTextureView)
         .build();
      RenderPass renderPass = RenderSystem.getDevice().createCommandEncoder().createRenderPass(descriptor);
      RenderSystem.bindDefaultUniforms(renderPass);
      return renderPass;
   }

   private static RenderPass createTransmittancePass(
      final Supplier<String> label, final OitRenderPassProvider.Parameters params, final boolean shouldClearTargets
   ) {
      RenderPassDescriptor.Builder descriptor = RenderPassDescriptor.builder(() -> "OIT Transmittance for " + label.get())
         .withDepthAttachment(params.depthTextureView);

      for (int i = 0; i < 2; i++) {
         descriptor.withColorAttachment(params.transmittanceTargetViews[i], shouldClearTargets ? Optional.of(LevelRenderer.ZERO_CLEAR_COLOR) : Optional.empty());
      }

      GpuSampler nearestSampler = RenderSystem.getSamplerCache().getClampToEdge(FilterMode.NEAREST);
      RenderPass renderPass = RenderSystem.getDevice().createCommandEncoder().createRenderPass(descriptor.build());
      RenderSystem.bindDefaultUniforms(renderPass);
      renderPass.setUniform("DepthBoundsSampler", params.depthBoundsTargetView, nearestSampler);
      return renderPass;
   }

   private static RenderPass createAccumulatePass(final Supplier<String> label, final OitRenderPassProvider.Parameters params, final boolean shouldClearTargets) {
      RenderPassDescriptor descriptor = RenderPassDescriptor.builder(() -> "OIT Accumulate for " + label.get())
         .withColorAttachment(params.accumulateTargetView, shouldClearTargets ? Optional.of(LevelRenderer.ZERO_CLEAR_COLOR) : Optional.empty())
         .withDepthAttachment(params.depthTextureView)
         .build();
      RenderPass renderPass = RenderSystem.getDevice().createCommandEncoder().createRenderPass(descriptor);
      GpuSampler nearestSampler = RenderSystem.getSamplerCache().getClampToEdge(FilterMode.NEAREST);
      RenderSystem.bindDefaultUniforms(renderPass);

      for (int i = 0; i < 2; i++) {
         renderPass.setUniform("Bins" + i, params.transmittanceTargetViews[i], nearestSampler);
      }

      renderPass.setUniform("DepthBoundsSampler", params.depthBoundsTargetView, nearestSampler);
      return renderPass;
   }

   public static final class Parameters {
      private GpuTextureView depthBoundsTargetView;
      private final GpuTextureView[] transmittanceTargetViews;
      private final GpuTextureView accumulateTargetView;
      private final GpuTextureView depthTextureView;

      public Parameters(
         final GpuTextureView depthBoundsTargetView,
         final GpuTextureView[] transmittanceTargetViews,
         final GpuTextureView accumulateTargetView,
         final GpuTextureView depthTextureView
      ) {
         this.depthBoundsTargetView = depthBoundsTargetView;
         this.transmittanceTargetViews = transmittanceTargetViews;
         this.accumulateTargetView = accumulateTargetView;
         this.depthTextureView = depthTextureView;
      }

      public void setDepthBoundsTargetView(final GpuTextureView depthBoundsTargetView) {
         this.depthBoundsTargetView = depthBoundsTargetView;
      }
   }
}
