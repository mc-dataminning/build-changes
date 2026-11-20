package net.minecraft.client.renderer.pipeline.variant;

import com.mojang.renderpearl.api.pipeline.BlendFunction;
import com.mojang.renderpearl.api.pipeline.ColorTargetState;
import java.util.List;

public record ItemRenderPipelineVariant(String name, ColorTargetState nonOitColorTargetState, boolean supportsOit, ItemRenderPipelineVariant.GlintType glintType)
   implements RenderPipelineVariant {
   private static final VariantValuesList<ItemRenderPipelineVariant> VALUES = new VariantValuesList<>();
   public static final ItemRenderPipelineVariant CUTOUT = VALUES.add(
      new ItemRenderPipelineVariant("cutout", ColorTargetState.DEFAULT, false, ItemRenderPipelineVariant.GlintType.NONE)
   );
   public static final ItemRenderPipelineVariant CUTOUT_GLINT = VALUES.add(
      new ItemRenderPipelineVariant("cutout_glint", ColorTargetState.DEFAULT, false, ItemRenderPipelineVariant.GlintType.NORMAL)
   );
   public static final ItemRenderPipelineVariant CUTOUT_GLINT_SPECIAL = VALUES.add(
      new ItemRenderPipelineVariant("cutout_glint_special", ColorTargetState.DEFAULT, false, ItemRenderPipelineVariant.GlintType.SPECIAL)
   );
   public static final ItemRenderPipelineVariant TRANSLUCENT = VALUES.add(
      new ItemRenderPipelineVariant("translucent", new ColorTargetState(BlendFunction.TRANSLUCENT), true, ItemRenderPipelineVariant.GlintType.NONE)
   );
   public static final ItemRenderPipelineVariant TRANSLUCENT_GLINT = VALUES.add(
      new ItemRenderPipelineVariant("translucent_glint", new ColorTargetState(BlendFunction.TRANSLUCENT), true, ItemRenderPipelineVariant.GlintType.NORMAL)
   );
   public static final ItemRenderPipelineVariant TRANSLUCENT_GLINT_SPECIAL = VALUES.add(
      new ItemRenderPipelineVariant(
         "translucent_glint_special", new ColorTargetState(BlendFunction.TRANSLUCENT), true, ItemRenderPipelineVariant.GlintType.SPECIAL
      )
   );

   public static List<ItemRenderPipelineVariant> values() {
      return VALUES.values();
   }

   public enum GlintType {
      NONE,
      NORMAL,
      SPECIAL;
   }
}
