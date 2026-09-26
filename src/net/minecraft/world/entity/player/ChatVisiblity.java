package net.minecraft.world.entity.player;

import com.mojang.serialization.Codec;
import net.minecraft.network.chat.Component;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.EnumStreamCodec;
import net.minecraft.util.ByIdMap;

public enum ChatVisiblity {
   FULL(0, "options.chat.visibility.full"),
   SYSTEM(1, "options.chat.visibility.system"),
   HIDDEN(2, "options.chat.visibility.hidden");

   public static final EnumStreamCodec<ChatVisiblity> STREAM_CODEC = ByteBufCodecs.enumCodec(ChatVisiblity.class, v -> v.id, ByIdMap.OutOfBoundsStrategy.WRAP);
   public static final Codec<ChatVisiblity> LEGACY_CODEC = Codec.INT.xmap(STREAM_CODEC::byId, v -> v.id);
   private final int id;
   private final Component caption;

   ChatVisiblity(final int id, final String key) {
      this.id = id;
      this.caption = Component.translatable(key);
   }

   public Component caption() {
      return this.caption;
   }
}
