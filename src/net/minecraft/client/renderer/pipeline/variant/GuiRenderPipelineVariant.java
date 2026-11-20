package net.minecraft.client.renderer.pipeline.variant;

import com.mojang.renderpearl.api.pipeline.BlendFactor;
import com.mojang.renderpearl.api.pipeline.BlendFunction;
import com.mojang.renderpearl.api.pipeline.ColorTargetState;
import java.util.List;
import java.util.Optional;

public record GuiRenderPipelineVariant(String name, boolean isTextured, ColorTargetState colorTargetState) implements RenderPipelineVariant {
   private static final VariantValuesList<GuiRenderPipelineVariant> VALUES = new VariantValuesList<>();
   public static final GuiRenderPipelineVariant DEFAULT = VALUES.add(
      new GuiRenderPipelineVariant("default", false, new ColorTargetState(BlendFunction.TRANSLUCENT))
   );
   public static final GuiRenderPipelineVariant INVERT = VALUES.add(new GuiRenderPipelineVariant("invert", false, new ColorTargetState(BlendFunction.INVERT)));
   public static final GuiRenderPipelineVariant TEXT_HIGHLIGHT = VALUES.add(
      new GuiRenderPipelineVariant("text_highlight", false, new ColorTargetState(BlendFunction.ADDITIVE))
   );
   public static final GuiRenderPipelineVariant TEXTURED = VALUES.add(
      new GuiRenderPipelineVariant("textured", true, new ColorTargetState(BlendFunction.TRANSLUCENT))
   );
   public static final GuiRenderPipelineVariant TEXTURED_PREMULTIPLIED_ALPHA = VALUES.add(
      new GuiRenderPipelineVariant("textured_premultiplied_alpha", true, new ColorTargetState(BlendFunction.TRANSLUCENT_PREMULTIPLIED_ALPHA))
   );
   public static final GuiRenderPipelineVariant OPAQUE_TEXTURED_BACKGROUND = VALUES.add(
      new GuiRenderPipelineVariant("opaque_textured_background", true, new ColorTargetState(Optional.empty(), 15))
   );
   public static final GuiRenderPipelineVariant NAUSEA_OVERLAY = VALUES.add(
      new GuiRenderPipelineVariant("nausea_overlay", true, new ColorTargetState(BlendFunction.ADDITIVE))
   );
   public static final GuiRenderPipelineVariant VIGNETTE = VALUES.add(
      new GuiRenderPipelineVariant(
         "vignette", true, new ColorTargetState(new BlendFunction(BlendFactor.ZERO, BlendFactor.ONE_MINUS_SRC_COLOR, BlendFactor.ZERO, BlendFactor.ONE))
      )
   );
   public static final GuiRenderPipelineVariant CROSSHAIR = VALUES.add(
      new GuiRenderPipelineVariant("crosshair", true, new ColorTargetState(BlendFunction.INVERT))
   );
   public static final GuiRenderPipelineVariant MOJANG_LOGO = VALUES.add(
      new GuiRenderPipelineVariant("mojang_logo", true, new ColorTargetState(new BlendFunction(BlendFactor.SRC_ALPHA, BlendFactor.ONE)))
   );

   public static List<GuiRenderPipelineVariant> values() {
      return VALUES.values();
   }

   @Override
   public boolean supportsOit() {
      return false;
   }
}
