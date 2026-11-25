package net.minecraft.client.gui.screens.inventory;

import java.util.List;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.GuiPipeline;
import net.minecraft.client.gui.components.AbstractScrollArea;
import net.minecraft.client.gui.components.AbstractWidget;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.components.ScrollableLayout;
import net.minecraft.client.gui.layouts.Layout;
import net.minecraft.client.gui.layouts.LinearLayout;
import net.minecraft.client.gui.narration.GroupNarration;
import net.minecraft.client.gui.navigation.ScreenAxis;
import net.minecraft.client.gui.screens.inventory.tooltip.BelowOrAboveWidgetTooltipPositioner;
import net.minecraft.client.input.KeyEvent;
import net.minecraft.client.input.MouseButtonEvent;
import net.minecraft.network.chat.CommonComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.protocol.game.ServerboundSelectTradePacket;
import net.minecraft.resources.Identifier;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.npc.villager.VillagerData;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.MerchantMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraft.world.item.trading.MerchantOffers;
import org.jspecify.annotations.Nullable;

public class MerchantScreen extends AbstractContainerScreen<MerchantMenu> {
   private static final Identifier OUT_OF_STOCK_SPRITE = Identifier.withDefaultNamespace("container/villager/out_of_stock");
   private static final Identifier EXPERIENCE_BAR_BACKGROUND_SPRITE = Identifier.withDefaultNamespace("container/villager/experience_bar_background");
   private static final Identifier EXPERIENCE_BAR_CURRENT_SPRITE = Identifier.withDefaultNamespace("container/villager/experience_bar_current");
   private static final Identifier EXPERIENCE_BAR_RESULT_SPRITE = Identifier.withDefaultNamespace("container/villager/experience_bar_result");
   private static final Identifier SCROLLER_SPRITE = Identifier.withDefaultNamespace("container/villager/scroller");
   private static final Identifier SCROLLER_DISABLED_SPRITE = Identifier.withDefaultNamespace("container/villager/scroller_disabled");
   private static final Identifier TRADE_ARROW_OUT_OF_STOCK_SPRITE = Identifier.withDefaultNamespace("container/villager/trade_arrow_out_of_stock");
   private static final Identifier TRADE_ARROW_SPRITE = Identifier.withDefaultNamespace("container/villager/trade_arrow");
   private static final Identifier DISCOUNT_STRIKETHRUOGH_SPRITE = Identifier.withDefaultNamespace("container/villager/discount_strikethrough");
   private static final Identifier VILLAGER_LOCATION = Identifier.withDefaultNamespace("textures/gui/container/villager.png");
   private static final int TEXTURE_WIDTH = 512;
   private static final int TEXTURE_HEIGHT = 256;
   private static final int MERCHANT_MENU_PART_X = 99;
   private static final int PROGRESS_BAR_X = 136;
   private static final int PROGRESS_BAR_Y = 16;
   private static final int SELL_ITEM_1_X = 5;
   private static final int SELL_ITEM_2_X = 35;
   private static final int BUY_ITEM_X = 68;
   private static final int LABEL_Y = 6;
   private static final int TRADE_BUTTON_X = 5;
   private static final int TRADE_BUTTON_HEIGHT = 20;
   private static final int TRADE_BUTTON_WIDTH = 88;
   private static final int SCROLLER_HEIGHT = 27;
   private static final int SCROLLER_WIDTH = 6;
   private static final int SCROLL_BAR_HEIGHT = 139;
   private static final int SCROLL_BAR_TOP_POS_Y = 18;
   private static final Component TRADES_LABEL = Component.translatable("merchant.trades");
   private static final Component DEPRECATED_TOOLTIP = Component.translatable("merchant.deprecated");
   private int selectedOfferIndex;
   private boolean hasSelectedTrade;
   private @Nullable ScrollableLayout tradeArea;

   public MerchantScreen(final MerchantMenu menu, final Inventory inventory, final Component title) {
      super(menu, inventory, title, 276, 166);
      this.inventoryLabelX = 107;
      menu.registerUpdateListener(this::tradesChanged);
   }

   private void tradesChanged() {
      double scrollAmount = 0.0;
      if (this.tradeArea != null) {
         scrollAmount = this.tradeArea.getScrollAmount();
         MerchantScreen layout = this;
         this.tradeArea.visitWidgets(x$0 -> layout.removeWidget(x$0));
      }

      LinearLayout layout = LinearLayout.vertical();
      MerchantOffers menuOffers = this.menu.getOffers();

      for (int i = 0; i < menuOffers.size(); i++) {
         int index = i;
         layout.addChild(new MerchantScreen.TradeOfferButton(menuOffers.get(i), var2 -> this.selectTrade(index)));
      }

      this.tradeArea = this.createScrollableLayout(layout);
      this.tradeArea.setScrollAmount(scrollAmount);
      if (this.selectedOfferIndex >= menuOffers.size()) {
         this.selectedOfferIndex = 0;
      }
   }

   @Override
   protected void repositionElements() {
      this.leftPos = (this.width - this.imageWidth) / 2;
      this.topPos = (this.height - this.imageHeight) / 2;
      this.updateSlotWidgets();
      if (this.tradeArea != null) {
         this.tradeArea.setPosition(this.leftPos + 5, this.topPos + 18);
         this.tradeArea.arrangeElements();
      }
   }

   private void selectTrade(final int index) {
      this.selectedOfferIndex = index;
      this.hasSelectedTrade = true;
      this.menu.setSelectionHint(this.selectedOfferIndex);
      this.menu.tryMoveItems(this.selectedOfferIndex);
      this.minecraft.getConnection().send(new ServerboundSelectTradePacket(this.selectedOfferIndex));
   }

   @Override
   public boolean keyPressed(final KeyEvent event) {
      return this.minecraft.options.keyRepeatRecipeOrTrade.matches(event) && !this.isInputCaptured() && this.tryRepeatTrade() ? true : super.keyPressed(event);
   }

   @Override
   public boolean mouseClicked(final MouseButtonEvent event, final boolean doubleClick) {
      return this.minecraft.options.keyRepeatRecipeOrTrade.matchesMouse(event) && this.tryRepeatTrade() ? true : super.mouseClicked(event, doubleClick);
   }

   private boolean tryRepeatTrade() {
      if (!this.hasSelectedTrade) {
         return false;
      }

      AbstractWidget.playButtonClickSound(this.minecraft.getSoundManager());
      this.selectTrade(this.selectedOfferIndex);
      return true;
   }

   @Override
   protected void extractLabels(final GuiGraphicsExtractor graphics) {
      int traderLevel = this.menu.getTraderLevel();
      if (traderLevel > 0 && traderLevel <= 5 && this.menu.showProgressBar()) {
         Component titleAndLevel = Component.translatable("merchant.title", this.title, Component.translatable("merchant.level." + traderLevel));
         int totalWidth = this.font.width(titleAndLevel);
         int startX = 49 + this.imageWidth / 2 - totalWidth / 2;
         graphics.text(this.font, titleAndLevel, startX, 6, -12566464, false);
      } else {
         graphics.text(this.font, this.title, 49 + this.imageWidth / 2 - this.font.width(this.title) / 2, 6, -12566464, false);
      }

      graphics.text(this.font, this.playerInventoryTitle, this.inventoryLabelX, this.inventoryLabelY, -12566464, false);
      int textWidth = this.font.width(TRADES_LABEL);
      graphics.text(this.font, TRADES_LABEL, 5 - textWidth / 2 + 48, 6, -12566464, false);
   }

   @Override
   public void extractBackground(final GuiGraphicsExtractor graphics) {
      super.extractBackground(graphics);
      int xo = (this.width - this.imageWidth) / 2;
      int yo = (this.height - this.imageHeight) / 2;
      graphics.blit(GuiPipeline.TEXTURED, VILLAGER_LOCATION, xo, yo, 0.0F, 0.0F, this.imageWidth, this.imageHeight, 512, 256);
      MerchantOffers offers = this.menu.getOffers();
      if (!offers.isEmpty()) {
         int itemIndex = this.selectedOfferIndex;
         if (itemIndex < 0 || itemIndex >= offers.size()) {
            return;
         }

         MerchantOffer offer = offers.get(itemIndex);
         if (offer.isOutOfStock()) {
            graphics.blitSprite(GuiPipeline.TEXTURED, OUT_OF_STOCK_SPRITE, this.leftPos + 83 + 99, this.topPos + 35, 28, 21);
         }
      }
   }

   private void extractProgressBar(final GuiGraphicsExtractor graphics, final int xo, final int yo) {
      int traderLevel = this.menu.getTraderLevel();
      int traderXp = this.menu.getTraderXp();
      if (traderLevel < 5) {
         graphics.blitSprite(GuiPipeline.TEXTURED, EXPERIENCE_BAR_BACKGROUND_SPRITE, xo + 136, yo + 16, 102, 5);
         int minXp = VillagerData.getMinXpPerLevel(traderLevel);
         if (traderXp >= minXp && VillagerData.canLevelUp(traderLevel)) {
            int progressLength = 102;
            float multiplier = 102.0F / (VillagerData.getMaxXpPerLevel(traderLevel) - minXp);
            int w = Math.min(Mth.floor(multiplier * (traderXp - minXp)), 102);
            graphics.blitSprite(GuiPipeline.TEXTURED, EXPERIENCE_BAR_CURRENT_SPRITE, 102, 5, 0, 0, xo + 136, yo + 16, w, 5);
            int futureXp = this.menu.getFutureTraderXp();
            if (futureXp > 0) {
               int futureXpWidth = Math.min(Mth.floor(futureXp * multiplier), 102 - w);
               graphics.blitSprite(GuiPipeline.TEXTURED, EXPERIENCE_BAR_RESULT_SPRITE, 102, 5, w, 0, xo + 136 + w, yo + 16, futureXpWidth, 5);
            }
         }
      }
   }

   @Override
   public void extractContents(final GuiGraphicsExtractor graphics) {
      super.extractContents(graphics);
      MerchantOffers offers = this.menu.getOffers();
      if (!offers.isEmpty()) {
         if (this.menu.showProgressBar()) {
            this.extractProgressBar(graphics, this.leftPos, this.topPos);
         }

         if (this.selectedOfferIndex < offers.size()) {
            MerchantOffer selectedOffer = offers.get(this.selectedOfferIndex);
            if (selectedOffer.isOutOfStock() && this.isHovering(186, 35, 22, 21, graphics.mouseX(), graphics.mouseY()) && this.menu.canRestock()) {
               graphics.setTooltipForNextFrame(this.font, DEPRECATED_TOOLTIP, graphics.mouseX(), graphics.mouseY());
            }
         }
      }
   }

   private ScrollableLayout createScrollableLayout(final Layout layout) {
      ScrollableLayout scrollableLayout = new ScrollableLayout(
         this.minecraft,
         layout,
         139,
         new AbstractScrollArea.ScrollbarSettings(SCROLLER_SPRITE, SCROLLER_DISABLED_SPRITE, null, 6, 27, 20, false),
         1,
         ScrollableLayout.ReserveStrategy.RIGHT,
         GroupNarration.list("narrator.position.list", "narration.group_navigation.usage.trade", ScreenAxis.VERTICAL)
      );
      scrollableLayout.setPosition(this.leftPos + 5, this.topPos + 18);
      scrollableLayout.setMinWidth(88);
      scrollableLayout.setMinHeight(139);
      scrollableLayout.arrangeElements();
      scrollableLayout.visitWidgets(x$0 -> this.addRenderableWidget(x$0));
      scrollableLayout.setTabGroup(3);
      scrollableLayout.allowTabNavigationInside(false);
      return scrollableLayout;
   }

   private class TradeOfferButton extends Button.Plain {
      private final MerchantOffer offer;

      public TradeOfferButton(final MerchantOffer offer, final Button.OnPress onPress) {
         super(0, 0, 88, 20, CommonComponents.EMPTY, onPress, DEFAULT_NARRATION);
         this.offer = offer;
      }

      @Override
      protected MutableComponent createNarrationMessage() {
         Component costA = countAndItem(this.offer.getCostA());
         Component result = countAndItem(this.offer.getResult());
         MutableComponent tradeOffer;
         if (this.offer.getCostB().isEmpty()) {
            tradeOffer = Component.translatable("narration.trade_offer.one_cost", costA, result);
         } else {
            Component costB = countAndItem(this.offer.getCostB());
            tradeOffer = Component.translatable("narration.trade_offer.two_costs", costA, costB, result);
         }

         return this.offer.isOutOfStock() ? Component.translatable("narration.trade_offer.out_of_stock", tradeOffer) : tradeOffer;
      }

      private static Component countAndItem(final ItemStack itemStack) {
         return Component.translatable("narration.count_and_item", itemStack.count(), itemStack.getHoverName());
      }

      @Override
      protected void extractContents(final GuiGraphicsExtractor graphics) {
         super.extractContents(graphics);
         ItemStack baseCostA = this.offer.getBaseCostA();
         ItemStack costA = this.offer.getCostA();
         ItemStack costB = this.offer.getCostB();
         ItemStack result = this.offer.getResult();
         int decorHeight = this.getY() + 1;
         int sellItem1X = this.getX() + 5;
         this.extractAndDecorateCostA(graphics, costA, baseCostA, sellItem1X, decorHeight);
         if (!costB.isEmpty()) {
            graphics.fakeItem(costB, this.getX() + 35, decorHeight);
            graphics.itemDecorations(MerchantScreen.this.font, costB, this.getX() + 35, decorHeight);
         }

         this.extractButtonArrows(graphics, decorHeight);
         graphics.fakeItem(result, this.getX() + 68, decorHeight);
         graphics.itemDecorations(MerchantScreen.this.font, result, this.getX() + 68, decorHeight);
         this.extractTooltip(graphics);
      }

      private void extractButtonArrows(final GuiGraphicsExtractor graphics, final int decorHeight) {
         if (this.offer.isOutOfStock()) {
            graphics.blitSprite(GuiPipeline.TEXTURED, MerchantScreen.TRADE_ARROW_OUT_OF_STOCK_SPRITE, this.getX() + 35 + 20, decorHeight + 3, 10, 9);
         } else {
            graphics.blitSprite(GuiPipeline.TEXTURED, MerchantScreen.TRADE_ARROW_SPRITE, this.getX() + 35 + 20, decorHeight + 3, 10, 9);
         }
      }

      private void extractAndDecorateCostA(
         final GuiGraphicsExtractor graphics, final ItemStack costA, final ItemStack baseCostA, final int sellItem1X, final int decorHeight
      ) {
         graphics.fakeItem(costA, sellItem1X, decorHeight);
         if (baseCostA.getCount() == costA.getCount()) {
            graphics.itemDecorations(MerchantScreen.this.font, costA, sellItem1X, decorHeight);
         } else {
            graphics.itemDecorations(MerchantScreen.this.font, baseCostA, sellItem1X, decorHeight, baseCostA.getCount() == 1 ? "1" : null);
            graphics.itemDecorations(MerchantScreen.this.font, costA, sellItem1X + 14, decorHeight, costA.getCount() == 1 ? "1" : null);
            graphics.blitSprite(GuiPipeline.TEXTURED, MerchantScreen.DISCOUNT_STRIKETHRUOGH_SPRITE, sellItem1X + 7, decorHeight + 12, 9, 2);
         }
      }

      private void extractTooltip(final GuiGraphicsExtractor graphics) {
         if (this.isHighlighted()) {
            if (this.isHovered()) {
               if (graphics.mouseX() < this.getX() + 20) {
                  graphics.setTooltipForNextFrame(MerchantScreen.this.font, this.offer.getCostA(), graphics.mouseX(), graphics.mouseY());
               } else if (graphics.mouseX() < this.getX() + 50 && graphics.mouseX() > this.getX() + 30) {
                  if (!this.offer.getCostB().isEmpty()) {
                     graphics.setTooltipForNextFrame(MerchantScreen.this.font, this.offer.getCostB(), graphics.mouseX(), graphics.mouseY());
                  }
               } else if (graphics.mouseX() > this.getX() + 65) {
                  graphics.setTooltipForNextFrame(MerchantScreen.this.font, this.offer.getResult(), graphics.mouseX(), graphics.mouseY());
               }
            } else if (this.isFocused()) {
               graphics.setTooltipForNextFrame(
                  MerchantScreen.this.minecraft.font,
                  List.of(this.createNarrationMessage().getVisualOrderText()),
                  new BelowOrAboveWidgetTooltipPositioner(this.getRectangle()),
                  this.getX(),
                  this.getY(),
                  true
               );
            }
         }
      }
   }
}
