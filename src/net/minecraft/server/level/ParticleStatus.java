package net.minecraft.server.level;

import com.mojang.serialization.Codec;
import net.minecraft.network.chat.Component;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.EnumStreamCodec;
import net.minecraft.util.ByIdMap;

public enum ParticleStatus {
   ALL(0, "options.particles.all"),
   DECREASED(1, "options.particles.decreased"),
   MINIMAL(2, "options.particles.minimal");

   public static final EnumStreamCodec<ParticleStatus> STREAM_CODEC = ByteBufCodecs.enumCodec(ParticleStatus.class, s -> s.id, ByIdMap.OutOfBoundsStrategy.WRAP);
   public static final Codec<ParticleStatus> LEGACY_CODEC = Codec.INT.xmap(STREAM_CODEC::byId, s -> s.id);
   private final int id;
   private final Component caption;

   ParticleStatus(final int id, final String key) {
      this.id = id;
      this.caption = Component.translatable(key);
   }

   public Component caption() {
      return this.caption;
   }
}
