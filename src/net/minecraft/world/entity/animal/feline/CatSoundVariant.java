package net.minecraft.world.entity.animal.feline;

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

public record CatSoundVariant(CatSoundVariant.CatSoundSet adultSounds, CatSoundVariant.CatSoundSet babySounds)
   implements AgeableSoundVariant<CatSoundVariant.CatSoundSet> {
   public static final Codec<CatSoundVariant> DIRECT_CODEC = AgeableSoundVariant.codec(CatSoundVariant.CatSoundSet.CODEC, CatSoundVariant::new);
   public static final Codec<Holder<CatSoundVariant>> CODEC = RegistryCodecs.holder(Registries.CAT_SOUND_VARIANT);
   public static final StreamCodec<RegistryFriendlyByteBuf, Holder<CatSoundVariant>> STREAM_CODEC = ByteBufCodecs.holderRegistry(Registries.CAT_SOUND_VARIANT);

   public record CatSoundSet(
      Optional<Holder<SoundEvent>> ambientSound,
      Optional<Holder<SoundEvent>> strayAmbientSound,
      Optional<Holder<SoundEvent>> hissSound,
      Optional<Holder<SoundEvent>> hurtSound,
      Optional<Holder<SoundEvent>> deathSound,
      Optional<Holder<SoundEvent>> eatSound,
      Optional<Holder<SoundEvent>> begForFoodSound,
      Optional<Holder<SoundEvent>> purrSound,
      Optional<Holder<SoundEvent>> purreowSound
   ) {
      private static final Codec<CatSoundVariant.CatSoundSet> CODEC = RecordCodecBuilder.create(
         i -> i.group(
               SoundEvent.CODEC.optionalFieldOf("ambient_sound").forGetter(CatSoundVariant.CatSoundSet::ambientSound),
               SoundEvent.CODEC.optionalFieldOf("stray_ambient_sound").forGetter(CatSoundVariant.CatSoundSet::strayAmbientSound),
               SoundEvent.CODEC.optionalFieldOf("hiss_sound").forGetter(CatSoundVariant.CatSoundSet::hissSound),
               SoundEvent.CODEC.optionalFieldOf("hurt_sound").forGetter(CatSoundVariant.CatSoundSet::hurtSound),
               SoundEvent.CODEC.optionalFieldOf("death_sound").forGetter(CatSoundVariant.CatSoundSet::deathSound),
               SoundEvent.CODEC.optionalFieldOf("eat_sound").forGetter(CatSoundVariant.CatSoundSet::eatSound),
               SoundEvent.CODEC.optionalFieldOf("beg_for_food_sound").forGetter(CatSoundVariant.CatSoundSet::begForFoodSound),
               SoundEvent.CODEC.optionalFieldOf("purr_sound").forGetter(CatSoundVariant.CatSoundSet::purrSound),
               SoundEvent.CODEC.optionalFieldOf("purreow_sound").forGetter(CatSoundVariant.CatSoundSet::purreowSound)
            )
            .apply(i, CatSoundVariant.CatSoundSet::new)
      );
   }
}
