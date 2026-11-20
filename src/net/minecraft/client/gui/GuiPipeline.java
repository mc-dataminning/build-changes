package net.minecraft.client.gui;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import java.util.function.Supplier;
import net.minecraft.SharedConstants;
import net.minecraft.client.renderer.pipeline.RenderPipelines;
import net.minecraft.client.renderer.pipeline.variant.GuiRenderPipelineVariant;
import net.minecraft.client.renderer.pipeline.variant.TextRenderPipelineVariant;
import org.jspecify.annotations.Nullable;

public final class GuiPipeline {
   public static final GuiPipeline DEFAULT = of(GuiRenderPipelineVariant.DEFAULT);
   public static final GuiPipeline INVERT = of(GuiRenderPipelineVariant.INVERT);
   public static final GuiPipeline TEXT_HIGHLIGHT = of(GuiRenderPipelineVariant.TEXT_HIGHLIGHT);
   public static final GuiPipeline TEXTURED = of(GuiRenderPipelineVariant.TEXTURED);
   public static final GuiPipeline TEXTURED_PREMULTIPLIED_ALPHA = of(GuiRenderPipelineVariant.TEXTURED_PREMULTIPLIED_ALPHA);
   public static final GuiPipeline OPAQUE_TEXTURED_BACKGROUND = of(GuiRenderPipelineVariant.OPAQUE_TEXTURED_BACKGROUND);
   public static final GuiPipeline NAUSEA_OVERLAY = of(GuiRenderPipelineVariant.NAUSEA_OVERLAY);
   public static final GuiPipeline VIGNETTE = of(GuiRenderPipelineVariant.VIGNETTE);
   public static final GuiPipeline CROSSHAIR = of(GuiRenderPipelineVariant.CROSSHAIR);
   public static final GuiPipeline MOJANG_LOGO = of(GuiRenderPipelineVariant.MOJANG_LOGO);
   public static final GuiPipeline TEXT = of(() -> RenderPipelines.text(new RenderPipelines.TextParameters(TextRenderPipelineVariant.GUI, null)));
   public static final GuiPipeline TEXT_GRAYSCALE = of(
      () -> RenderPipelines.text(new RenderPipelines.TextParameters(TextRenderPipelineVariant.GUI_GRAYSCALE, null))
   );
   public static final GuiPipeline END_PORTAL = of(() -> RenderPipelines.endPortal(new RenderPipelines.EndPortalParameters(false, true)));
   private static int nextSortKey;
   private static int sortKeySeed;
   private final int sortKey;
   private final Supplier<RenderPipeline> pipelineSupplier;
   private @Nullable RenderPipeline cachedPipeline;

   private GuiPipeline(final Supplier<RenderPipeline> pipelineSupplier) {
      this.sortKey = nextSortKey++;
      this.pipelineSupplier = pipelineSupplier;
   }

   public static GuiPipeline of(final GuiRenderPipelineVariant variant) {
      return new GuiPipeline(() -> RenderPipelines.gui(new RenderPipelines.GuiParameters(variant)));
   }

   public static GuiPipeline of(final Supplier<RenderPipeline> pipelineSupplier) {
      return new GuiPipeline(pipelineSupplier);
   }

   public RenderPipeline pipeline() {
      RenderPipeline pipeline = this.cachedPipeline;
      if (pipeline == null) {
         this.cachedPipeline = pipeline = this.pipelineSupplier.get();
      }

      return pipeline;
   }

   public int getSortKey() {
      return SharedConstants.DEBUG_SHUFFLE_UI_RENDERING_ORDER ? this.hashCode() * (sortKeySeed + 1) : this.sortKey;
   }

   public static void updateSortKeySeed() {
      sortKeySeed = Math.round(100000.0F * (float)Math.random());
   }
}
