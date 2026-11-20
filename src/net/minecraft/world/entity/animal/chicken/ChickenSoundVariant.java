package net.minecraft.world.entity.animal.chicken;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.codec.RegistryCodecs;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.animal.AgeableSoundVariant;

public record ChickenSoundVariant(ChickenSoundVariant.ChickenSoundSet adultSounds, ChickenSoundVariant.ChickenSoundSet babySounds)
   implements AgeableSoundVariant<ChickenSoundVariant.ChickenSoundSet> {
   public static final Codec<ChickenSoundVariant> DIRECT_CODEC = AgeableSoundVariant.codec(ChickenSoundVariant.ChickenSoundSet.CODEC, ChickenSoundVariant::new);
   public static final Codec<Holder<ChickenSoundVariant>> CODEC = RegistryCodecs.holder(Registries.CHICKEN_SOUND_VARIANT);
   public static final StreamCodec<RegistryFriendlyByteBuf, Holder<ChickenSoundVariant>> STREAM_CODEC = ByteBufCodecs.holderRegistry(
      Registries.CHICKEN_SOUND_VARIANT
   );

   public record ChickenSoundSet(
      Optional<Holder<SoundEvent>> ambientSound,
      Optional<Holder<SoundEvent>> hurtSound,
      Optional<Holder<SoundEvent>> deathSound,
      Optional<Holder<SoundEvent>> stepSound
   ) {
      private static final Codec<ChickenSoundVariant.ChickenSoundSet> CODEC = RecordCodecBuilder.create(
         i -> i.group(
               SoundEvent.CODEC.optionalFieldOf("ambient_sound").forGetter(ChickenSoundVariant.ChickenSoundSet::ambientSound),
               SoundEvent.CODEC.optionalFieldOf("hurt_sound").forGetter(ChickenSoundVariant.ChickenSoundSet::hurtSound),
               SoundEvent.CODEC.optionalFieldOf("death_sound").forGetter(ChickenSoundVariant.ChickenSoundSet::deathSound),
               SoundEvent.CODEC.optionalFieldOf("step_sound").forGetter(ChickenSoundVariant.ChickenSoundSet::stepSound)
            )
            .apply(i, ChickenSoundVariant.ChickenSoundSet::new)
      );
   }
}
