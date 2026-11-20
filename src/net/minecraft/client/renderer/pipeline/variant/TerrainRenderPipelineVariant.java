package net.minecraft.client.renderer.pipeline.variant;

import com.mojang.renderpearl.api.pipeline.BlendFunction;
import com.mojang.renderpearl.api.pipeline.ColorTargetState;
import java.util.List;

public record TerrainRenderPipelineVariant(
   String name, ColorTargetState nonOitColorTargetState, boolean supportsOit, boolean hasAlphaCutout, float alphaCutoutThreshold
) implements RenderPipelineVariant {
   private static final VariantValuesList<TerrainRenderPipelineVariant> VALUES = new VariantValuesList<>();
   public static final TerrainRenderPipelineVariant SOLID = VALUES.add(new TerrainRenderPipelineVariant("solid", ColorTargetState.DEFAULT, false, false, 0.0F));
   public static final TerrainRenderPipelineVariant CUTOUT = VALUES.add(new TerrainRenderPipelineVariant("cutout", ColorTargetState.DEFAULT, false, true, 0.5F));
   public static final TerrainRenderPipelineVariant TRANSLUCENT = VALUES.add(
      new TerrainRenderPipelineVariant("translucent", new ColorTargetState(BlendFunction.TRANSLUCENT), true, true, 0.1F)
   );

   public static List<TerrainRenderPipelineVariant> values() {
      return VALUES.values();
   }
}
