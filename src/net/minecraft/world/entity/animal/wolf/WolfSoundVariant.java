package net.minecraft.world.entity.animal.wolf;

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

public record WolfSoundVariant(WolfSoundVariant.WolfSoundSet adultSounds, WolfSoundVariant.WolfSoundSet babySounds)
   implements AgeableSoundVariant<WolfSoundVariant.WolfSoundSet> {
   public static final Codec<WolfSoundVariant> DIRECT_CODEC = AgeableSoundVariant.codec(WolfSoundVariant.WolfSoundSet.CODEC, WolfSoundVariant::new);
   public static final Codec<Holder<WolfSoundVariant>> CODEC = RegistryCodecs.holder(Registries.WOLF_SOUND_VARIANT);
   public static final StreamCodec<RegistryFriendlyByteBuf, Holder<WolfSoundVariant>> STREAM_CODEC = ByteBufCodecs.holderRegistry(Registries.WOLF_SOUND_VARIANT);

   public record WolfSoundSet(
      Optional<Holder<SoundEvent>> ambientSound,
      Optional<Holder<SoundEvent>> deathSound,
      Optional<Holder<SoundEvent>> growlSound,
      Optional<Holder<SoundEvent>> hurtSound,
      Optional<Holder<SoundEvent>> pantSound,
      Optional<Holder<SoundEvent>> whineSound,
      Optional<Holder<SoundEvent>> stepSound
   ) {
      public static final Codec<WolfSoundVariant.WolfSoundSet> CODEC = RecordCodecBuilder.create(
         i -> i.group(
               SoundEvent.CODEC.optionalFieldOf("ambient_sound").forGetter(WolfSoundVariant.WolfSoundSet::ambientSound),
               SoundEvent.CODEC.optionalFieldOf("death_sound").forGetter(WolfSoundVariant.WolfSoundSet::deathSound),
               SoundEvent.CODEC.optionalFieldOf("growl_sound").forGetter(WolfSoundVariant.WolfSoundSet::growlSound),
               SoundEvent.CODEC.optionalFieldOf("hurt_sound").forGetter(WolfSoundVariant.WolfSoundSet::hurtSound),
               SoundEvent.CODEC.optionalFieldOf("pant_sound").forGetter(WolfSoundVariant.WolfSoundSet::pantSound),
               SoundEvent.CODEC.optionalFieldOf("whine_sound").forGetter(WolfSoundVariant.WolfSoundSet::whineSound),
               SoundEvent.CODEC.optionalFieldOf("step_sound").forGetter(WolfSoundVariant.WolfSoundSet::stepSound)
            )
            .apply(i, WolfSoundVariant.WolfSoundSet::new)
      );
   }
}
