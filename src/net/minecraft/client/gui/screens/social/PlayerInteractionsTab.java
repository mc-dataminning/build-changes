package net.minecraft.client.gui.screens.social;

import java.net.URI;
import java.util.List;
import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.components.ImageWidget;
import net.minecraft.client.gui.components.MultiLineTextWidget;
import net.minecraft.client.gui.layouts.LinearLayout;
import net.minecraft.client.gui.layouts.SpacerElement;
import net.minecraft.client.gui.screens.PrivacyConfirmLinkScreen;
import net.minecraft.client.gui.screens.friends.AbstractFriendsTab;
import net.minecraft.client.renderer.pipeline.RenderPipelines;
import net.minecraft.network.chat.ClickEvent;
import net.minecraft.network.chat.Component;
import net.minecraft.util.CommonLinks;

class PlayerInteractionsTab extends AbstractFriendsTab {
   private static final Component EMPTY = Component.translatable("gui.player_interactions.empty").withStyle(ChatFormatting.GRAY);
   public static final Component EMPTY_SEARCH = Component.translatable("gui.player_interactions.search.no_results").withStyle(ChatFormatting.GRAY);
   public static final Component EMPTY_MUTED = Component.translatable("gui.player_interactions.empty_muted").withStyle(ChatFormatting.GRAY);
   private static final Component MICROSOFT_ACCOUNT_LINK = Component.translatable("gui.player_interactions.empty_blocked.link")
      .withStyle(style -> style.withUnderlined(true).withColor(ChatFormatting.GRAY).withClickEvent(new ClickEvent.OpenUrl(CommonLinks.BLOCKING_HELP)));
   public static final Component EMPTY_BLOCKED = Component.translatable("gui.player_interactions.empty_blocked", MICROSOFT_ACCOUNT_LINK)
      .withStyle(ChatFormatting.GRAY);
   private static final Component MANAGE_ACCOUNT_FOOTER = Component.translatable("gui.player_interactions.manage_account_footer", MICROSOFT_ACCOUNT_LINK)
      .withStyle(ChatFormatting.GRAY);
   private static final int HEADER_VERTICAL_PADDING = 5;
   private final SocialInteractionsScreen screen;
   private final SocialInteractionsScreen.Page page;
   private boolean isEmpty;

   public PlayerInteractionsTab(
      final Minecraft minecraft,
      final SocialInteractionsScreen screen,
      final SocialInteractionsScreen.Page page,
      final int width,
      final int height,
      final LinearLayout widgets
   ) {
      super(minecraft, width, height);
      this.screen = screen;
      this.page = page;
      LinearLayout header = this.headerFrame.addChild(LinearLayout.vertical());
      header.addChild(widgets, settings -> settings.paddingVertical(5).alignHorizontallyCenter());
      header.addChild(ImageWidget.sprite(width, 2, LIST_SEPARATOR_TOP));
      this.rearrangeElements();
   }

   @Override
   public Component getTabExtraNarration() {
      return Component.empty();
   }

   public SocialInteractionsScreen.Page getPage() {
      return this.page;
   }

   public void replaceEntries(final List<PlayerEntry> entries, final boolean filterEmpty) {
      if (entries.isEmpty()) {
         this.showEmpty(EMPTY_SEARCH);
      } else {
         this.scrollableLayout.alignVerticallyTop();
         this.scrollableContent.removeChildren();
         this.scrollableContent.addChild(SpacerElement.height(3));
         entries.forEach(this.scrollableContent::addChild);
         this.isEmpty = false;
         if (filterEmpty && this.page == SocialInteractionsScreen.Page.BLOCKED) {
            this.showManageAccountFooter(this.screen, MANAGE_ACCOUNT_FOOTER);
         }
      }
   }

   public void addEntry(final PlayerEntry entry, final boolean filterEmpty) {
      if (this.isEmpty) {
         this.replaceEntries(List.of(entry), filterEmpty);
      } else {
         this.scrollableContent.addChild(entry);
      }
   }

   private void showEmpty(final Component message) {
      MultiLineTextWidget text = this.createCenteredText(message, this.screen.getFont(), this.getListContentWidth());
      text.setComponentClickHandler(style -> {
         if (style.getClickEvent() instanceof ClickEvent.OpenUrl(URI uri)) {
            PrivacyConfirmLinkScreen.confirmLinkNow(this.screen, uri);
         }
      });
      this.showCenteredContent(text);
      this.isEmpty = true;
   }

   public void showEmpty() {
      switch (this.page) {
         case ALL:
            this.showEmpty(EMPTY);
            break;
         case MUTED:
            this.showEmpty(EMPTY_MUTED);
            break;
         case BLOCKED:
            this.showEmpty(EMPTY_BLOCKED);
      }
   }

   @Override
   public void extractBackground(final GuiGraphicsExtractor graphics) {
      graphics.blitSprite(
         RenderPipelines.GUI_TEXTURED,
         BACKGROUND_LIGHT_SPRITE,
         this.headerFrame.getX(),
         this.headerFrame.getY(),
         this.headerFrame.getWidth(),
         this.headerFrame.getHeight() - 2
      );
   }
}
