package net.minecraft.client.gui.font;

import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiPipeline;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.resources.Identifier;

public record GlyphRenderTypes(RenderType normal, RenderType seeThrough, RenderType polygonOffset, GuiPipeline guiPipeline) {
   public static GlyphRenderTypes createForGrayscaleTexture(final Identifier name) {
      return new GlyphRenderTypes(
         RenderTypes.textGrayscale(name), RenderTypes.textGrayscaleSeeThrough(name), RenderTypes.textGrayscalePolygonOffset(name), GuiPipeline.TEXT_GRAYSCALE
      );
   }

   public static GlyphRenderTypes createForColorTexture(final Identifier name) {
      return new GlyphRenderTypes(RenderTypes.text(name), RenderTypes.textSeeThrough(name), RenderTypes.textPolygonOffset(name), GuiPipeline.TEXT);
   }

   public RenderType select(final Font.DisplayMode mode) {
      return switch (mode) {
         case NORMAL -> this.normal;
         case SEE_THROUGH -> this.seeThrough;
         case POLYGON_OFFSET -> this.polygonOffset;
      };
   }
}
