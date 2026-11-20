package net.minecraft.client.renderer.pipeline.variant;

import com.mojang.renderpearl.api.pipeline.BlendFunction;
import com.mojang.renderpearl.api.pipeline.ColorTargetState;
import java.util.List;

public record BlockRenderPipelineVariant(
   String name, ColorTargetState nonOitColorTargetState, boolean supportsOit, boolean hasAlphaCutout, float alphaCutoutThreshold
) implements RenderPipelineVariant {
   private static final VariantValuesList<BlockRenderPipelineVariant> VALUES = new VariantValuesList<>();
   public static final BlockRenderPipelineVariant SOLID = VALUES.add(new BlockRenderPipelineVariant("solid", ColorTargetState.DEFAULT, false, false, 0.0F));
   public static final BlockRenderPipelineVariant CUTOUT = VALUES.add(new BlockRenderPipelineVariant("cutout", ColorTargetState.DEFAULT, false, true, 0.5F));
   public static final BlockRenderPipelineVariant TRANSLUCENT = VALUES.add(
      new BlockRenderPipelineVariant("translucent", new ColorTargetState(BlendFunction.TRANSLUCENT), true, true, 0.1F)
   );

   public static List<BlockRenderPipelineVariant> values() {
      return VALUES.values();
   }
}
