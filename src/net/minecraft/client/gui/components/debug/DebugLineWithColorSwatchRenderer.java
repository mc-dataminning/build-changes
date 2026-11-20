package net.minecraft.client.gui.components.debug;

import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.network.chat.Component;
import org.jspecify.annotations.Nullable;

public record DebugLineWithColorSwatchRenderer(Font font, Component text, @Nullable Integer color) implements DebugCustomRenderer {
   private static final int SWATCH_GAP = 3;

   @Override
   public void extract(final GuiGraphicsExtractor graphics, final int left, final int top, final DebugColumn.Side side) {
      int swatchSize = 9 - 1;
      graphics.text(this.font, this.text, left, top, -2039584, false);
      if (this.color != null) {
         int x = left + this.font.width(this.text) + 3;
         graphics.fill(x, top, x + swatchSize, top + swatchSize, -16777216);
         graphics.fill(x + 1, top + 1, x + swatchSize - 1, top + swatchSize - 1, this.color);
      }
   }

   @Override
   public int height() {
      return 9;
   }

   @Override
   public int width(final int groupWidth) {
      return Math.max(groupWidth, this.font.width(this.text) + (this.color == null ? 0 : 3 + 9 - 1));
   }
}
