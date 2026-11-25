package net.minecraft.client.gui.components.inventory;

import java.util.function.BooleanSupplier;
import java.util.function.Supplier;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.GuiPipeline;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.components.Tooltip;
import net.minecraft.client.gui.components.WidgetSprites;
import net.minecraft.client.gui.narration.NarrationElementOutput;
import net.minecraft.client.renderer.blockentity.BannerRenderer;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.resources.model.sprite.SpriteId;
import net.minecraft.client.resources.sounds.SimpleSoundInstance;
import net.minecraft.client.sounds.SoundManager;
import net.minecraft.core.Holder;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.ItemStack;

public final class IconRadioButton extends Button {
   private final WidgetSprites sprites;
   private final IconRadioButton.Icon icon;
   private final Holder<SoundEvent> selectSound;
   private final Supplier<Tooltip> tooltip;
   private final BooleanSupplier selected;

   public IconRadioButton(
      final int width,
      final int height,
      final Component message,
      final WidgetSprites sprites,
      final IconRadioButton.Icon icon,
      final Holder<SoundEvent> selectSound,
      final Button.OnPress onPress,
      final Button.CreateNarration createNarration,
      final Supplier<Tooltip> tooltip,
      final BooleanSupplier selected
   ) {
      super(0, 0, width, height, message, onPress, createNarration);
      this.sprites = sprites;
      this.icon = icon;
      this.selectSound = selectSound;
      this.tooltip = tooltip;
      this.selected = selected;
   }

   @Override
   protected void extractContents(final GuiGraphicsExtractor graphics) {
      graphics.blitSprite(
         GuiPipeline.TEXTURED, this.sprites.get(this.selected.getAsBoolean(), this.isHighlighted()), this.getX(), this.getY(), this.width, this.height
      );
      switch (this.icon) {
         case IconRadioButton.ItemIcon(ItemStack stack):
            graphics.item(stack, this.getX(), this.getY() + 1);
            break;
         case IconRadioButton.BannerPatternIcon bannerPatternIcon:
            bannerPatternIcon.extractContents(graphics, this.getX(), this.getY());
            break;
         default:
            throw new MatchException(null, null);
      }
   }

   @Override
   protected void extractTooltipForNextRenderPass(final GuiGraphicsExtractor graphics) {
      if (this.isHovered() || this.isFocused() && Minecraft.getInstance().getLastInputType().isKeyboard()) {
         this.setTooltip(this.tooltip.get());
      }

      super.extractTooltipForNextRenderPass(graphics);
   }

   @Override
   public void playDownSound(final SoundManager soundManager) {
      if (!this.selected.getAsBoolean()) {
         soundManager.play(SimpleSoundInstance.forUI(this.selectSound));
      }
   }

   @Override
   protected MutableComponent createNarrationMessage() {
      MutableComponent narration = super.createNarrationMessage();
      return this.selected.getAsBoolean() ? Component.translatable("narrator.select", narration) : narration;
   }

   @Override
   protected void updateTooltipNarration(final NarrationElementOutput output) {
   }

   public record BannerPatternIcon(SpriteId sprite) implements IconRadioButton.Icon {
      private static final float TEXTURE_SIZE = 64.0F;
      private static final float PATTERN_WIDTH = 21.0F;
      private static final float PATTERN_HEIGHT = 40.0F;

      private void extractContents(final GuiGraphicsExtractor graphics, final int posX, final int posY) {
         TextureAtlasSprite bannerPatternSprite = graphics.getSprite(this.sprite);
         graphics.pose().pushMatrix();
         graphics.pose().translate(posX + 4, posY + 2);
         float patternU0 = bannerPatternSprite.getU0();
         float patternU1 = patternU0 + (bannerPatternSprite.getU1() - bannerPatternSprite.getU0()) * 21.0F / 64.0F;
         float patternVSpan = bannerPatternSprite.getV1() - bannerPatternSprite.getV0();
         float patternV0 = bannerPatternSprite.getV0() + patternVSpan / 64.0F;
         float patternV1 = patternV0 + patternVSpan * 40.0F / 64.0F;
         int bannerWidth = 5;
         int bannerHeight = 10;
         graphics.fill(0, 0, 5, 10, BannerRenderer.DYED_PATTERN_COLOR.gray());
         graphics.blit(bannerPatternSprite.atlasLocation(), 0, 0, 5, 10, patternU0, patternU1, patternV0, patternV1);
         graphics.pose().popMatrix();
      }
   }

   public sealed interface Icon permits IconRadioButton.ItemIcon, IconRadioButton.BannerPatternIcon {
   }

   public record ItemIcon(ItemStack stack) implements IconRadioButton.Icon {
   }
}
