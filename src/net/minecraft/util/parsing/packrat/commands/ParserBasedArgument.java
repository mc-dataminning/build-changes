package net.minecraft.util.parsing.packrat.commands;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.concurrent.CompletableFuture;
import net.minecraft.commands.ParseContext;
import net.minecraft.commands.arguments.SerializableArgument;
import net.minecraft.commands.suggestions.SuggestionContext;

public abstract class ParserBasedArgument<S extends CommandParserState, T> implements SerializableArgument<T> {
   private final CommandParserState.Factory<? extends S> factory;
   private final CommandArgumentParser<S, T> parser;

   protected ParserBasedArgument(final CommandParserState.Factory<? extends S> factory, final CommandArgumentParser<S, T> parser) {
      this.factory = factory;
      this.parser = parser;
   }

   @Override
   public abstract SerializableArgument.Type<? extends ParserBasedArgument<S, T>> type();

   @Override
   public T parse(final StringReader reader, final ParseContext context) throws CommandSyntaxException {
      return this.parser.parseForCommands((S)this.factory.create(context, reader));
   }

   @Override
   public CompletableFuture<Suggestions> listSuggestions(final CommandContext<? extends SuggestionContext> context, final SuggestionsBuilder builder) throws CommandSyntaxException {
      return this.parser.parseForSuggestions(context, this.factory, builder);
   }
}
