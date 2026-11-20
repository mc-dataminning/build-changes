package net.minecraft.commands.suggestions;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.concurrent.CompletableFuture;
import net.minecraft.commands.CommandSourceStack;

public class SuggestPostEffects implements SerializableCustomSuggestion {
   private static final SuggestPostEffects INSTANCE = new SuggestPostEffects();
   public static final SerializableCustomSuggestion.Type<SuggestPostEffects> TYPE = SerializableCustomSuggestion.singletonType(INSTANCE);

   @Override
   public SerializableCustomSuggestion.Type<SuggestPostEffects> type() {
      return TYPE;
   }

   public static SuggestionProvider<CommandSourceStack> suggestPostEffects() {
      return INSTANCE.toBrigadier();
   }

   @Override
   public CompletableFuture<Suggestions> generate(final CommandContext<? extends SuggestionContext> context, final SuggestionsBuilder builder) throws CommandSyntaxException {
      return SuggestionContext.suggestResource(((SuggestionContext)context.getSource()).availablePostEffects(), builder);
   }
}
