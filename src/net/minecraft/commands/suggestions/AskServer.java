package net.minecraft.commands.suggestions;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.concurrent.CompletableFuture;

public class AskServer implements SerializableCustomSuggestion {
   public static final AskServer INSTANCE = new AskServer();
   public static final SerializableCustomSuggestion.Type<AskServer> TYPE = SerializableCustomSuggestion.singletonType(INSTANCE);

   @Override
   public SerializableCustomSuggestion.Type<AskServer> type() {
      return TYPE;
   }

   @Override
   public CompletableFuture<Suggestions> generate(final CommandContext<? extends SuggestionContext> context, final SuggestionsBuilder builder) throws CommandSyntaxException {
      return ((SuggestionContext)context.getSource()).customSuggestion(context);
   }
}
