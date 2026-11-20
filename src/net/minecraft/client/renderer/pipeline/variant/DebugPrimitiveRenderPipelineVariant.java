package net.minecraft.client.renderer.pipeline.variant;

import com.mojang.renderpearl.api.pipeline.PrimitiveTopology;

public record DebugPrimitiveRenderPipelineVariant(String name, PrimitiveTopology primitiveTopology) {
   public static final DebugPrimitiveRenderPipelineVariant POINTS = new DebugPrimitiveRenderPipelineVariant("points", PrimitiveTopology.POINTS);
   public static final DebugPrimitiveRenderPipelineVariant QUADS = new DebugPrimitiveRenderPipelineVariant("quads", PrimitiveTopology.QUADS);
   public static final DebugPrimitiveRenderPipelineVariant TRIANGLE_FAN = new DebugPrimitiveRenderPipelineVariant(
      "triangle_fan", PrimitiveTopology.TRIANGLE_FAN
   );
}
