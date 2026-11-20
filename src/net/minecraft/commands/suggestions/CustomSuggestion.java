package net.minecraft.commands.suggestions;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.concurrent.CompletableFuture;

public sealed interface CustomSuggestion permits SerializableCustomSuggestion, ServerOnlyCustomSuggestion {
   CompletableFuture<Suggestions> generate(CommandContext<? extends SuggestionContext> context, SuggestionsBuilder builder) throws CommandSyntaxException;

   SerializableCustomSuggestion serializable();

   default <T> SuggestionProvider<T> toBrigadier() {
      return new CustomSuggestion.BrigadierWrapper<>(this);
   }

   static <T> CustomSuggestion.BrigadierWrapper<T> castOrThrow(final SuggestionProvider<T> original) {
      if (original instanceof CustomSuggestion.BrigadierWrapper<T> wrapper) {
         return wrapper;
      } else {
         throw new UnsupportedOperationException("Invalid suggestion type: " + original);
      }
   }

   static CustomSuggestion unwrapOrThrow(final SuggestionProvider<?> original) {
      return castOrThrow(original).suggestion();
   }

   record BrigadierWrapper<T>(CustomSuggestion suggestion) implements SuggestionProvider<T> {
      public CompletableFuture<Suggestions> getSuggestions(final CommandContext<T> context, final SuggestionsBuilder builder) throws CommandSyntaxException {
         if (context.getSource() instanceof SuggestionContext) {
            return this.suggestion.generate(context, builder);
         } else {
            throw new UnsupportedOperationException("Invalid context: " + context.getSource());
         }
      }

      public <S extends SuggestionContext> CustomSuggestion.BrigadierWrapper<S> cast() {
         return this;
      }
   }
}
