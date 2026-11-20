package net.minecraft.world.entity.animal.pig;

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

public record PigSoundVariant(PigSoundVariant.PigSoundSet adultSounds, PigSoundVariant.PigSoundSet babySounds)
   implements AgeableSoundVariant<PigSoundVariant.PigSoundSet> {
   public static final Codec<PigSoundVariant> DIRECT_CODEC = AgeableSoundVariant.codec(PigSoundVariant.PigSoundSet.CODEC, PigSoundVariant::new);
   public static final Codec<Holder<PigSoundVariant>> CODEC = RegistryCodecs.holder(Registries.PIG_SOUND_VARIANT);
   public static final StreamCodec<RegistryFriendlyByteBuf, Holder<PigSoundVariant>> STREAM_CODEC = ByteBufCodecs.holderRegistry(Registries.PIG_SOUND_VARIANT);

   public record PigSoundSet(
      Optional<Holder<SoundEvent>> ambientSound,
      Optional<Holder<SoundEvent>> hurtSound,
      Optional<Holder<SoundEvent>> deathSound,
      Optional<Holder<SoundEvent>> stepSound,
      Optional<Holder<SoundEvent>> eatSound
   ) {
      public static final Codec<PigSoundVariant.PigSoundSet> CODEC = RecordCodecBuilder.create(
         i -> i.group(
               SoundEvent.CODEC.optionalFieldOf("ambient_sound").forGetter(PigSoundVariant.PigSoundSet::ambientSound),
               SoundEvent.CODEC.optionalFieldOf("hurt_sound").forGetter(PigSoundVariant.PigSoundSet::hurtSound),
               SoundEvent.CODEC.optionalFieldOf("death_sound").forGetter(PigSoundVariant.PigSoundSet::deathSound),
               SoundEvent.CODEC.optionalFieldOf("step_sound").forGetter(PigSoundVariant.PigSoundSet::stepSound),
               SoundEvent.CODEC.optionalFieldOf("eat_sound").forGetter(PigSoundVariant.PigSoundSet::eatSound)
            )
            .apply(i, PigSoundVariant.PigSoundSet::new)
      );
   }
}
