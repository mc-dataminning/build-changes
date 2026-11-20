package net.minecraft.commands.suggestions;

import com.mojang.serialization.MapCodec;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;

public non-sealed interface SerializableCustomSuggestion extends CustomSuggestion {
   @Override
   default SerializableCustomSuggestion serializable() {
      return this;
   }

   SerializableCustomSuggestion.Type<? extends SerializableCustomSuggestion> type();

   static <A extends SerializableCustomSuggestion> SerializableCustomSuggestion.Type<A> singletonType(final A instance) {
      return new SerializableCustomSuggestion.Type<>(MapCodec.unit(instance), StreamCodec.unit(instance));
   }

   record Type<A extends SerializableCustomSuggestion>(MapCodec<A> codec, StreamCodec<? super RegistryFriendlyByteBuf, A> streamCodec) {
   }
}
