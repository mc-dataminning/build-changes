package net.minecraft.util.parsing.packrat.commands;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import net.minecraft.commands.ParseContext;
import net.minecraft.commands.suggestions.SuggestionContext;
import net.minecraft.util.parsing.packrat.DelayedException;
import net.minecraft.util.parsing.packrat.Dictionary;
import net.minecraft.util.parsing.packrat.ErrorCollector;
import net.minecraft.util.parsing.packrat.ErrorEntry;
import net.minecraft.util.parsing.packrat.NamedRule;
import net.minecraft.util.parsing.packrat.ParseState;

public record Grammar<S extends CommandParserState, T>(Dictionary<S> rules, NamedRule<S, T> top) implements CommandArgumentParser<S, T> {
   public Grammar {
      rules.checkAllBound();
   }

   public Optional<T> parse(final ParseState<S> state) {
      return state.parseTopRule(this.top);
   }

   @Override
   public T parseForCommands(final S reader) throws CommandSyntaxException {
      ErrorCollector.LongestOnly errorCollector = new ErrorCollector.LongestOnly();
      StringReaderParserState<S> state = new StringReaderParserState<>(errorCollector, reader);
      Optional<T> result = this.parse(state);
      if (result.isPresent()) {
         return result.get();
      }

      List<ErrorEntry> errorEntries = errorCollector.entries();
      List<Exception> exceptions = errorEntries.stream().<Exception>mapMulti((entry, output) -> {
         if (entry.reason() instanceof DelayedException<?> delayedException) {
            output.accept(delayedException.create(reader.reader().getString(), entry.cursor()));
         } else if (entry.reason() instanceof Exception exceptionx) {
            output.accept(exceptionx);
         }
      }).toList();

      for (Exception exception : exceptions) {
         if (exception instanceof CommandSyntaxException cse) {
            throw cse;
         }
      }

      if (exceptions.size() == 1 && exceptions.get(0) instanceof RuntimeException re) {
         throw re;
      } else {
         throw new IllegalStateException("Failed to parse: " + errorEntries.stream().map(ErrorEntry::toString).collect(Collectors.joining(", ")));
      }
   }

   @Override
   public CompletableFuture<Suggestions> parseForSuggestions(
      final CommandContext<? extends SuggestionContext> context, final CommandParserState.Factory<? extends S> stateFactory, final SuggestionsBuilder builder
   ) throws CommandSyntaxException {
      S reader = (S)stateFactory.create((ParseContext)context.getSource(), builder.getInput());
      reader.reader().setCursor(builder.getStart());
      ErrorCollector.LongestOnly errorCollector = new ErrorCollector.LongestOnly();
      StringReaderParserState<S> state = new StringReaderParserState<>(errorCollector, reader);
      this.parse(state);
      List<ErrorEntry> errorEntries = errorCollector.entries();
      if (errorEntries.isEmpty()) {
         return builder.buildFuture();
      }

      SuggestionsBuilder offsetBuilder = builder.createOffset(errorCollector.cursor());

      for (ErrorEntry entry : errorEntries) {
         entry.suggestion().asCommandSuggestions().getSuggestions(context, offsetBuilder);
      }

      return offsetBuilder.buildFuture();
   }
}
