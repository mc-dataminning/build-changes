package net.minecraft.client.gui.screens.friends;

import com.mojang.authlib.services.response.PresenceResponse;
import com.mojang.authlib.services.response.PresenceStatus;
import java.util.Comparator;
import java.util.UUID;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.components.StringWidget;
import net.minecraft.client.gui.components.Tooltip;
import net.minecraft.client.gui.components.WidgetSprites;
import net.minecraft.client.gui.screens.social.PlayerSocialManager;
import net.minecraft.client.gui.screens.social.PlayerStatus;
import net.minecraft.client.input.MouseButtonEvent;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.util.ARGB;

public class FriendEntry extends AbstractFriendsEntryContainerWidget {
   private static final WidgetSprites PROFILE_SPRITE = new WidgetSprites(
      Identifier.withDefaultNamespace("friends/profile"), Identifier.withDefaultNamespace("friends/profile_highlighted")
   );
   private static final Tooltip PLAYER_OPTIONS_TOOLTIP = Tooltip.create(Component.translatable("gui.friends.player_options"));
   private static final int NAME_RIGHT_PADDING = 2;
   public static final Comparator<FriendEntry> ALPHABETICAL_COMPARATOR = Comparator.comparing(
      AbstractFriendsEntryContainerWidget::playerName, String.CASE_INSENSITIVE_ORDER
   );
   public static final Comparator<FriendEntry> PRESENCE_COMPARATOR = Comparator.comparingInt(FriendEntry::presenceStatusSortOrder);
   private final Button profileButton;
   protected final PresenceStatusWidget statusWidget;

   public FriendEntry(
      final Minecraft minecraft,
      final int width,
      final UUID playerId,
      final String playerName,
      final PlayerStatus playerStatus,
      final Runnable openPlayerOptions
   ) {
      super(minecraft, width, playerId, playerName);
      this.statusWidget = new PresenceStatusWidget(playerStatus, minecraft.font);
      this.profileButton = new ImageButton(
         24, 24, PROFILE_SPRITE, var1 -> openPlayerOptions.run(), Component.translatable("gui.friends.narration.button.player_options", playerName)
      );
      this.profileButton.setTooltip(PLAYER_OPTIONS_TOOLTIP);
      this.addChild(this.statusWidget);
      this.addChild(this.profileButton);
   }

   public FriendEntry(
      final Minecraft minecraft,
      final int width,
      final UUID playerId,
      final String playerName,
      final PresenceResponse latestPresence,
      final PlayerSocialManager.Visibility visibility,
      final Runnable openPlayerOptions
   ) {
      this(minecraft, width, playerId, playerName, new PlayerStatus(PresenceStatus.OFFLINE, visibility), openPlayerOptions);
      this.applyPresence(latestPresence);
   }

   public void applyPresence(final PresenceResponse latestPresence) {
      this.statusWidget.applyPresenceForProfile(latestPresence, this.playerId);
   }

   public int presenceStatusSortOrder() {
      return switch (this.statusWidget.status().presence()) {
         case PLAYING_HOSTED_SERVER -> 0;
         case PLAYING_SERVER -> 1;
         case PLAYING_REALMS -> 2;
         case PLAYING_OFFLINE -> 3;
         case ONLINE -> 4;
         case OFFLINE -> 5;
         default -> throw new MatchException(null, null);
      };
   }

   @Override
   public boolean mouseClicked(final MouseButtonEvent event, final boolean doubleClick) {
      if (super.mouseClicked(event, doubleClick)) {
         return true;
      } else if (event.isLeftMouse() && !this.profileButton.isFocused()) {
         this.setFocused(this.profileButton);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void disable() {
   }

   @Override
   protected Component getEntryNarration() {
      return Component.translatable("gui.friends.narration.entry.friend", this.playerName);
   }

   @Override
   protected int getProfileInfoHeight() {
      return 9 * 2 + 2;
   }

   @Override
   protected void extractWidgetRenderState(final GuiGraphicsExtractor graphics) {
      super.extractWidgetRenderState(graphics);
      int x = this.playerFaceWidget.getX() + 1;
      int y = this.playerFaceWidget.getY() + 1;
      this.profileButton.setPosition(x, y);
      if (this.isHoveredOrFocused()) {
         graphics.fill(x, y, x + this.profileButton.getWidth(), y + this.profileButton.getHeight(), -1601138544);
         this.profileButton.extractRenderState(graphics);
      }

      int statusWidgetX = this.playerFaceWidget.getRight() + 5;
      int statusWidth = this.getRight() - statusWidgetX - 2;
      this.statusWidget.setMaxWidth(statusWidth, StringWidget.TextOverflow.SCROLLING);
      this.statusWidget.setPosition(statusWidgetX, this.nameWidget.getBottom() + 2);
      this.statusWidget.extractRenderState(graphics);
      if (this.profileButton.isFocused()) {
         graphics.outline(this.getX() - 1, this.getY(), this.getWidth() + 1, this.getHeight() - 1, ARGB.white(this.alpha));
      }
   }
}
