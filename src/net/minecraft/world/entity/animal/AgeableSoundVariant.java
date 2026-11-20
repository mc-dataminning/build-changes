package net.minecraft.world.entity.animal;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public interface AgeableSoundVariant<T> {
   static <T, S extends AgeableSoundVariant<T>> Codec<S> codec(final Codec<T> elementCodec, final AgeableSoundVariant.Factory<T, S> factory) {
      return RecordCodecBuilder.create(
         i -> i.group(
               elementCodec.fieldOf("adult_sounds").forGetter(AgeableSoundVariant::adultSounds),
               elementCodec.fieldOf("baby_sounds").forGetter(AgeableSoundVariant::babySounds)
            )
            .apply(i, factory::create)
      );
   }

   T adultSounds();

   T babySounds();

   @FunctionalInterface
   interface Factory<T, S extends AgeableSoundVariant<T>> {
      S create(T adultSounds, T babySounds);
   }
}
