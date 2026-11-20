package net.minecraft.client.gui.screens.inventory;

import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.GuiPipeline;
import net.minecraft.client.gui.navigation.ScreenPosition;
import net.minecraft.client.gui.screens.recipebook.CraftingRecipeBookComponent;
import net.minecraft.client.gui.screens.social.EntityPortraitWidget;
import net.minecraft.client.input.MouseButtonEvent;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.InventoryMenu;

public class InventoryScreen extends AbstractRecipeBookScreen<InventoryMenu> {
   private boolean buttonClicked;
   private final EffectsInInventory effects;

   public InventoryScreen(final Player player) {
      super(player.inventoryMenu, new CraftingRecipeBookComponent(player.inventoryMenu), player.getInventory(), Component.translatable("container.crafting"));
      this.titleLabelX = 97;
      this.effects = new EffectsInInventory(this);
   }

   @Override
   public void containerTick() {
      super.containerTick();
      if (this.minecraft.player.hasInfiniteMaterials()) {
         this.minecraft
            .gui
            .setScreen(
               new CreativeModeInventoryScreen(
                  this.minecraft.player, this.minecraft.player.connection.enabledFeatures(), this.minecraft.options.operatorItemsTab().get()
               )
            );
      }
   }

   @Override
   protected ScreenPosition getRecipeBookButtonPosition() {
      return new ScreenPosition(this.leftPos + 104, this.height / 2 - 22);
   }

   @Override
   protected int getRecipeBookButtonTabOrderGroup() {
      return 9;
   }

   @Override
   protected void onRecipeBookButtonClick() {
      this.buttonClicked = true;
   }

   @Override
   protected void extractLabels(final GuiGraphicsExtractor graphics) {
      graphics.text(this.font, this.title, this.titleLabelX, this.titleLabelY, -12566464, false);
   }

   @Override
   public void extractRenderState(final GuiGraphicsExtractor graphics) {
      this.effects.extractRenderState(graphics);
      super.extractRenderState(graphics);
   }

   @Override
   public boolean showsActiveEffects() {
      return this.effects.canSeeEffects();
   }

   @Override
   protected boolean isBiggerResultSlot() {
      return false;
   }

   @Override
   public void extractBackground(final GuiGraphicsExtractor graphics) {
      super.extractBackground(graphics);
      int xo = this.leftPos;
      int yo = this.topPos;
      graphics.blit(GuiPipeline.TEXTURED, INVENTORY_LOCATION, xo, yo, 0.0F, 0.0F, this.imageWidth, this.imageHeight, 256, 256);
      EntityPortraitWidget.extractEntityInInventoryFollowsMouse(graphics, xo + 26, yo + 8, xo + 75, yo + 78, 30.0F, 0.0625F, this.minecraft.player);
   }

   @Override
   public boolean mouseReleased(final MouseButtonEvent event) {
      if (this.buttonClicked) {
         this.buttonClicked = false;
         return true;
      } else {
         return super.mouseReleased(event);
      }
   }
}
