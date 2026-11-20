package net.minecraft.client.gui.screens.social;

import java.util.Collection;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import net.minecraft.client.GameNarrator;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.components.AbstractButton;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.SpriteIconCycleButton;
import net.minecraft.client.gui.components.StringWidget;
import net.minecraft.client.gui.components.tabs.Tab;
import net.minecraft.client.gui.components.tabs.TabManager;
import net.minecraft.client.gui.components.tabs.TabNavigationBar;
import net.minecraft.client.gui.layouts.HeaderAndFooterLayout;
import net.minecraft.client.gui.layouts.LayoutSettings;
import net.minecraft.client.gui.layouts.LinearLayout;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.screens.friends.AbstractFriendsTab;
import net.minecraft.client.gui.screens.friends.FriendsListFilter;
import net.minecraft.client.gui.screens.friends.FriendsListOrder;
import net.minecraft.client.gui.screens.friends.FriendsOverlayTabButton;
import net.minecraft.client.input.KeyEvent;
import net.minecraft.client.input.MouseButtonEvent;
import net.minecraft.client.multiplayer.PlayerInfo;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.network.chat.CommonComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import org.jspecify.annotations.Nullable;

public class SocialInteractionsScreen extends Screen {
   private static final Component TITLE = Component.translatable("gui.player_interactions.title", CommonComponents.EMPTY);
   private static final Identifier BACKGROUND_SPRITE = Identifier.withDefaultNamespace("friends/background");
   private static final Component TAB_MUTED = Component.translatable("gui.player_interactions.tab_muted");
   private static final Component TAB_BLOCKED = Component.translatable("gui.player_interactions.tab_blocked");
   private static final Component SORT_LIST = Component.translatable("gui.friends.sort");
   private static final Component SEARCH = Component.translatable("gui.player_interactions.search");
   private static final int HEADER_HEIGHT = 21;
   private static final int HEADER_CONTENT_MARGIN = -2;
   private static final int FOOTER_MARGIN = 10;
   private static final int BG_BORDER_WIDTH = 8;
   private static final int OVERLAY_WIDTH = 220;
   private static final int TAB_BUTTON_WIDTH = 73;
   private static final int TAB_BUTTON_WIDTH_2 = 74;
   private static final int TAB_BUTTON_HEIGHT = 20;
   private static final int WIDGET_SPACING = 3;
   private static final int BUTTON_SIZE = 20;
   private final @Nullable Screen backgroundScreen;
   private final SocialInteractionsPlayerList socialInteractionsPlayerList;
   private EditBox searchBox;
   private SocialInteractionsScreen.Page page = SocialInteractionsScreen.Page.ALL;
   private PlayerInteractionsTab allTab;
   private PlayerInteractionsTab mutedTab;
   private PlayerInteractionsTab blockedTab;
   private TabNavigationBar tabNavigationBar;
   private LinearLayout contentLayout;
   private FriendsOverlayTabButton allTabButton;
   private final HeaderAndFooterLayout layout = new HeaderAndFooterLayout(this, 21, 0);
   private final TabManager tabManager;
   private final StringWidget titleWidget;
   private final FriendsListFilter friendsListFilter = new FriendsListFilter(this::refreshLists);
   private final FriendsListOrder friendsListOrder = new FriendsListOrder(this::refreshLists);
   private int playerCount;

   public SocialInteractionsScreen() {
      this(null);
   }

   public SocialInteractionsScreen(final @Nullable Screen backgroundScreen) {
      super(TITLE);
      this.backgroundScreen = backgroundScreen;
      this.socialInteractionsPlayerList = new SocialInteractionsPlayerList(Minecraft.getInstance(), this, this.friendsListFilter, this.friendsListOrder);
      this.tabManager = new TabManager(x$0 -> this.addRenderableWidget(x$0), x$0 -> this.removeWidget(x$0), this::selectTab, this::deselectTab);
      this.titleWidget = new StringWidget(TITLE, this.getFont());
   }

   @Override
   public void added() {
      if (this.backgroundScreen != null) {
         this.backgroundScreen.clearFocus();
      }

      if (this.isInitialized()) {
         this.refreshLists();
      }
   }

   @Override
   public Component getNarrationMessage() {
      return this.titleWidget.getMessage();
   }

   @Override
   protected void init() {
      this.layout.setContentMarginTop(-2);
      this.layout.addToHeader(this.titleWidget);
      LinearLayout widgets = this.initTabWidgets();
      int scrollableMaxHeight = this.getTabContentHeight();
      this.allTab = new PlayerInteractionsTab(this.minecraft, this, SocialInteractionsScreen.Page.ALL, 220, scrollableMaxHeight, widgets);
      this.mutedTab = new PlayerInteractionsTab(this.minecraft, this, SocialInteractionsScreen.Page.MUTED, 220, scrollableMaxHeight, widgets);
      this.blockedTab = new PlayerInteractionsTab(this.minecraft, this, SocialInteractionsScreen.Page.BLOCKED, 220, scrollableMaxHeight, widgets);
      this.allTabButton = new FriendsOverlayTabButton(this.tabManager, this.allTab, 74, 20, Component.translatable("gui.player_interactions.tab_all", 0));
      this.tabNavigationBar = TabNavigationBar.builder(this.tabManager, 0, 0, 220, 20)
         .addTab(this.allTabButton, this.allTab)
         .addTab(new FriendsOverlayTabButton(this.tabManager, this.mutedTab, 73, 20, TAB_MUTED), this.mutedTab)
         .addTab(new FriendsOverlayTabButton(this.tabManager, this.blockedTab, 73, 20, TAB_BLOCKED), this.blockedTab)
         .build();
      this.contentLayout = LinearLayout.vertical();
      this.tabManager.setCurrentTab(this.allTab, false, false);
      LinearLayout contentAndTabs = LinearLayout.vertical().spacing(8);
      contentAndTabs.addChild(this.tabNavigationBar);
      contentAndTabs.addChild(this.contentLayout);
      this.layout.addToContents(contentAndTabs, LayoutSettings::alignHorizontallyCenter);
      this.layout.visitWidgets(x$0 -> this.addRenderableWidget(x$0));
      this.showPage();
      this.updateServerLabel();
      this.repositionElements();
   }

   private LinearLayout initTabWidgets() {
      AbstractButton button = SpriteIconCycleButton.builder(SORT_LIST, FriendsListOrder.SortBy::getTranslation, FriendsListOrder.DEFAULT_SORTING)
         .withValues(FriendsListOrder.SortBy.values())
         .sprite(FriendsListOrder.SortBy::getSprites)
         .size(20, 20)
         .withTooltip()
         .build((var1x, sorting) -> this.friendsListOrder.updateSorting(sorting));
      this.searchBox = new EditBox(this.minecraft.font, this.getListContentWidth() - 20 - 3, 20, SEARCH);
      this.searchBox.setResponder(value -> this.friendsListFilter.updateSearchFilter(value.trim()));
      this.searchBox.setHint(SEARCH);
      LinearLayout widgets = LinearLayout.horizontal().spacing(3);
      widgets.addChild(button);
      widgets.addChild(this.searchBox);
      return widgets;
   }

   private int getTabContentHeight() {
      return this.height - 21 - -2 - 10 - 20 - 16;
   }

   int getListContentWidth() {
      return 208;
   }

   @Override
   protected void repositionElements() {
      if (this.backgroundScreen != null) {
         this.backgroundScreen.resize(this.width, this.height);
      }

      int tabHeight = this.getTabContentHeight();
      this.allTab.setHeight(tabHeight);
      this.mutedTab.setHeight(tabHeight);
      this.blockedTab.setHeight(tabHeight);
      this.layout.arrangeElements();
      this.tabNavigationBar.arrangeElements(this.width);
   }

   @Override
   public void tick() {
      this.updateServerLabel();
   }

   @Override
   public void extractBackground(final GuiGraphicsExtractor graphics, final int mouseX, final int mouseY, final float a) {
      if (this.backgroundScreen != null) {
         this.backgroundScreen.extractBackground(graphics, mouseX, mouseY, a);
         graphics.nextStratum();
         this.backgroundScreen.extractRenderState(graphics, -1, -1, a);
         graphics.nextStratum();
         this.extractBlurredBackground(graphics);
      } else {
         super.extractBackground(graphics, mouseX, mouseY, a);
      }

      graphics.blitSprite(
         RenderPipelines.GUI_TEXTURED,
         BACKGROUND_SPRITE,
         this.contentLayout.getX() - 8,
         this.contentLayout.getY() - 8,
         this.contentLayout.getWidth() + 16,
         this.contentLayout.getHeight() + 16 + 1
      );
      if (this.tabManager.getCurrentTab() instanceof AbstractFriendsTab tab) {
         tab.extractBackground(graphics, mouseX, mouseY, a);
      }
   }

   private void selectTab(final Tab tab) {
      if (tab instanceof PlayerInteractionsTab interactionsTab) {
         this.socialInteractionsPlayerList.setActiveTab(interactionsTab);
         this.page = interactionsTab.getPage();
         this.showPage();
      }

      if (this.contentLayout != null) {
         this.contentLayout.addChild(tab.getLayout());
         this.repositionElements();
      }
   }

   private void deselectTab(final Tab tab) {
      if (this.contentLayout != null) {
         this.contentLayout.removeChildren();
      }
   }

   @Override
   public boolean mouseClicked(final MouseButtonEvent event, final boolean doubleClick) {
      if (super.mouseClicked(event, doubleClick)) {
         return true;
      } else if (this.contentLayout != null && !this.contentLayout.getRectangle().expandInAllDirections(8).containsPoint((int)event.x(), (int)event.y())) {
         this.minecraft.gui.setScreen(this.backgroundScreen);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean keyPressed(final KeyEvent event) {
      if (!this.isInputCaptured() && this.minecraft.options.keyOtherPlayers.matches(event)) {
         this.onClose();
         return true;
      } else {
         return this.tabNavigationBar != null && this.tabNavigationBar.keyPressed(event) ? true : super.keyPressed(event);
      }
   }

   @Override
   public void onClose() {
      this.minecraft.gui.setScreen(this.backgroundScreen);
   }

   public void refreshLists() {
      this.showPage();
      this.contentLayout.arrangeElements();
   }

   private void showPage() {
      boolean isEmpty = false;
      switch (this.page) {
         case ALL:
            Collection<UUID> onlinePlayerIds = this.minecraft.player.connection.getOnlinePlayerIds();
            this.socialInteractionsPlayerList.updatePlayerList(onlinePlayerIds, true);
            break;
         case MUTED:
            Set<UUID> hiddenPlayers = this.minecraft.getPlayerSocialManager().getHiddenPlayers();
            isEmpty = hiddenPlayers.isEmpty();
            this.socialInteractionsPlayerList.updatePlayerList(hiddenPlayers, false);
            break;
         case BLOCKED:
            PlayerSocialManager socialManager = this.minecraft.getPlayerSocialManager();
            Set<UUID> blockedPlayers = this.minecraft
               .player
               .connection
               .getOnlinePlayerIds()
               .stream()
               .filter(socialManager::isBlocked)
               .collect(Collectors.toSet());
            isEmpty = blockedPlayers.isEmpty();
            this.socialInteractionsPlayerList.updatePlayerList(blockedPlayers, false);
      }

      GameNarrator narrator = this.minecraft.getNarrator();
      if (!this.searchBox.getValue().isEmpty() && this.socialInteractionsPlayerList.isEmpty() && !this.searchBox.isFocused()) {
         narrator.saySystemNow(PlayerInteractionsTab.EMPTY_SEARCH);
      } else if (isEmpty) {
         if (this.page == SocialInteractionsScreen.Page.MUTED) {
            narrator.saySystemNow(PlayerInteractionsTab.EMPTY_MUTED);
         } else if (this.page == SocialInteractionsScreen.Page.BLOCKED) {
            narrator.saySystemNow(PlayerInteractionsTab.EMPTY_BLOCKED);
         }
      }
   }

   private void updateServerLabel() {
      int playerCount = this.minecraft.getConnection().getOnlinePlayers().size();
      if (this.playerCount != playerCount) {
         if (this.minecraft.isLocalServer()) {
            String serverName = this.minecraft.getSingleplayerServer().getMotd();
            this.titleWidget.setMessage(Component.translatable("gui.player_interactions.title.full", serverName));
         } else {
            ServerData currentServer = this.minecraft.getCurrentServer();
            if (currentServer != null) {
               this.titleWidget.setMessage(Component.translatable("gui.player_interactions.title.full", currentServer.name));
            } else {
               this.titleWidget.setMessage(TITLE);
            }
         }

         this.allTabButton.setMessage(Component.translatable("gui.player_interactions.tab_all", playerCount - 1));
         this.playerCount = playerCount;
      }
   }

   public void onAddPlayer(final PlayerInfo info) {
      this.socialInteractionsPlayerList.addPlayer(info, this.page);
   }

   public void onRemovePlayer(final UUID id) {
      this.socialInteractionsPlayerList.removePlayer(id);
   }

   public enum Page {
      ALL,
      MUTED,
      BLOCKED;
   }
}
