package net.minecraft.client.gui.screens.friends;

import com.mojang.authlib.services.response.PresenceResponse;
import com.mojang.authlib.services.response.PresenceStatus;
import com.mojang.authlib.services.response.PresenceStatusDto;
import java.util.Locale;
import java.util.UUID;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.components.StringWidget;
import net.minecraft.client.gui.screens.social.PlayerSocialManager;
import net.minecraft.client.gui.screens.social.PlayerStatus;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;

public class PresenceStatusWidget extends StringWidget {
   private static final Component PRESENCE_OFFLINE = Component.translatable("gui.friends.presence.status.offline");
   private PlayerStatus playerStatus;

   public PresenceStatusWidget(final PlayerStatus playerStatus, final Font font) {
      super(statusComponent(playerStatus), font);
      this.playerStatus = playerStatus;
   }

   public PlayerStatus status() {
      return this.playerStatus;
   }

   public void applyPlayerStatus(final PlayerStatus newPlayerStatus) {
      if (!this.playerStatus.equals(newPlayerStatus)) {
         this.playerStatus = newPlayerStatus;
         this.setMessage(statusComponent(this.playerStatus));
      }
   }

   public void applyPresence(final PresenceStatus presence) {
      this.applyPlayerStatus(new PlayerStatus(presence, this.playerStatus.visibility()));
   }

   public void applyPresenceForProfile(final PresenceResponse latestPresence, final UUID profileId) {
      for (PresenceStatusDto presenceStatus : latestPresence.presence()) {
         if (presenceStatus.profileId().equals(profileId)) {
            this.applyPresence(presenceStatus.status());
            return;
         }
      }
   }

   public void applyVisibility(final PlayerSocialManager.Visibility visibility) {
      this.applyPlayerStatus(new PlayerStatus(this.playerStatus.presence(), visibility));
   }

   private static Component statusComponent(final PlayerStatus playerStatus) {
      if (playerStatus.presence() == PresenceStatus.OFFLINE) {
         return decorateStatusComponent(PRESENCE_OFFLINE.copy(), playerStatus.visibility()).withColor(-6250336);
      }

      String key = "gui.friends.presence.status." + playerStatus.presence().toString().toLowerCase(Locale.ROOT);
      return decorateStatusComponent(Component.translatable(key), playerStatus.visibility()).withColor(-16711936);
   }

   private static MutableComponent decorateStatusComponent(final MutableComponent component, final PlayerSocialManager.Visibility visibility) {
      return switch (visibility) {
         case NORMAL -> component;
         case MUTED -> Component.translatable("gui.player_options.status.muted", component);
         case BLOCKED -> Component.translatable("gui.player_options.status.blocked", component);
      };
   }
}
