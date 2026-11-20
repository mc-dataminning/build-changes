package net.minecraft.commands.suggestions;

import com.mojang.serialization.Codec;
import net.minecraft.core.Registry;
import net.minecraft.core.WritableRegistry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;

public class SerializableSuggestionTypes {
   public static final Codec<SerializableCustomSuggestion> CODEC = BuiltInRegistries.COMMAND_SUGGESTION_TYPE
      .byNameCodec()
      .dispatch(SerializableCustomSuggestion::type, SerializableCustomSuggestion.Type::codec);
   public static final StreamCodec<RegistryFriendlyByteBuf, SerializableCustomSuggestion> STREAM_CODEC = ByteBufCodecs.registry(
         Registries.COMMAND_SUGGESTION_TYPE
      )
      .dispatch(SerializableCustomSuggestion::type, SerializableCustomSuggestion.Type::streamCodec);

   public static void bootstrap(final WritableRegistry<SerializableCustomSuggestion.Type<?>> registry) {
      Registry.register(registry, "ask_server", AskServer.TYPE);
      Registry.register(registry, "available_sounds", SuggestAvailableSounds.TYPE);
      Registry.register(registry, "summonable_entities", SuggestSummonableEntities.TYPE);
      Registry.register(registry, "post_effects", SuggestPostEffects.TYPE);
      Registry.register(registry, "literal", SuggestLiteralString.TYPE);
   }
}
