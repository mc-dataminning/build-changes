package net.minecraft.client.gui.screens.friends;

import java.util.List;
import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.GuiPipeline;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.ImageWidget;
import net.minecraft.client.gui.components.LoadingDotsWidget;
import net.minecraft.client.gui.components.MultiLineTextWidget;
import net.minecraft.client.gui.layouts.LayoutSettings;
import net.minecraft.client.gui.layouts.LinearLayout;
import net.minecraft.network.chat.Component;

class PendingTab extends AbstractFriendsTab {
   private static final Component RECEIVED_HEADER = Component.translatable("gui.friends.pending.received")
      .withStyle(ChatFormatting.BOLD, ChatFormatting.UNDERLINE);
   private static final Component SENT_HEADER = Component.translatable("gui.friends.pending.sent").withStyle(ChatFormatting.BOLD, ChatFormatting.UNDERLINE);
   private static final Component EMPTY_STATE = Component.translatable("gui.friends.pending.empty").withStyle(ChatFormatting.GRAY);
   private static final Component DISABLED_STATE = Component.translatable("gui.friends.pending.disabled").withStyle(ChatFormatting.GRAY);
   private static final Component SEARCH = Component.translatable("gui.friends.pending.search");
   private static final Component NO_SEARCH_RESULTS = Component.translatable("gui.friends.pending.search.no_results").withStyle(ChatFormatting.GRAY);
   private static final int SEARCH_BAR_REQUEST_THRESHOLD = 15;
   private static final int HEADER_VERTICAL_PADDING = 5;
   private final FriendsOverlayScreen screen;
   private final LoadingDotsWidget loadingDotsWidget;
   private boolean showingSearchBar;
   private final FriendsListFilter friendsListFilter = new FriendsListFilter(this::updateListView);

   public PendingTab(final Minecraft minecraft, final LoadingDotsWidget loadingDotsWidget, final FriendsOverlayScreen screen, final int width, final int height) {
      super(minecraft, width, height);
      this.screen = screen;
      this.loadingDotsWidget = loadingDotsWidget;
      this.rearrangeElements();
   }

   private void updateListView() {
      this.screen.refreshLists();
   }

   private void showSearchBar() {
      if (!this.showingSearchBar) {
         this.showingSearchBar = true;
         LinearLayout header = this.headerFrame.addChild(LinearLayout.vertical());
         EditBox searchBox = header.addChild(new EditBox(this.screen.getFont(), this.getListContentWidth(), 20, SEARCH), settings -> settings.padding(6, 5));
         searchBox.setHint(SEARCH);
         searchBox.setResponder(value -> this.friendsListFilter.updateSearchFilter(value.trim()));
         header.addChild(ImageWidget.sprite(this.width, 2, LIST_SEPARATOR_TOP));
      }
   }

   private void hideSearchBar() {
      if (this.showingSearchBar) {
         this.showingSearchBar = false;
         this.headerFrame.removeChildren();
         this.friendsListFilter.updateSearchFilter("");
      }
   }

   public void showLoading() {
      this.showCenteredContent(this.loadingDotsWidget);
   }

   public void showError(final Component message) {
      MultiLineTextWidget text = this.createCenteredText(message.copy().withStyle(ChatFormatting.GRAY), this.screen.getFont(), this.getListContentWidth());
      this.showCenteredContent(text);
   }

   public void updateEntries(final List<IncomingEntry> incomingEntries, final List<OutgoingEntry> outgoingEntries) {
      int totalRequestsCount = incomingEntries.size() + outgoingEntries.size();
      if (totalRequestsCount < 15) {
         this.hideSearchBar();
      } else {
         this.showSearchBar();
      }

      this.friendsListFilter.filter(incomingEntries);
      this.friendsListFilter.filter(outgoingEntries);
      if (incomingEntries.isEmpty() && outgoingEntries.isEmpty()) {
         this.showEmpty(NO_SEARCH_RESULTS);
      } else {
         this.scrollableLayout.alignVerticallyTop();
         this.scrollableContent.removeChildren();
         if (!incomingEntries.isEmpty()) {
            this.scrollableContent
               .addChild(this.createText(RECEIVED_HEADER, this.screen.getFont(), this.getListContentWidth()), LayoutSettings::alignHorizontallyCenter);
            incomingEntries.forEach(this.scrollableContent::addChild);
         }

         if (!outgoingEntries.isEmpty()) {
            this.scrollableContent
               .addChild(this.createText(SENT_HEADER, this.screen.getFont(), this.getListContentWidth()), LayoutSettings::alignHorizontallyCenter);
            outgoingEntries.forEach(this.scrollableContent::addChild);
         }
      }
   }

   private void showEmpty(final Component message) {
      MultiLineTextWidget text = this.createCenteredText(message, this.screen.getFont(), this.getListContentWidth());
      this.showCenteredContent(text);
   }

   public void showEmpty() {
      this.showEmpty(EMPTY_STATE);
      this.hideSearchBar();
   }

   public void showDisabled() {
      this.showEmpty(DISABLED_STATE);
      this.hideSearchBar();
   }

   @Override
   public void extractBackground(final GuiGraphicsExtractor graphics) {
      if (this.showingSearchBar) {
         graphics.blitSprite(
            GuiPipeline.TEXTURED,
            BACKGROUND_LIGHT_SPRITE,
            this.headerFrame.getX(),
            this.headerFrame.getY(),
            this.headerFrame.getWidth(),
            this.headerFrame.getHeight() - 2
         );
      }
   }
}
