package net.minecraft.commands.arguments;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Collection;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import net.minecraft.commands.suggestions.SuggestionContext;

public abstract class BrigadierWrapperArgument<T, A extends ArgumentType<T>> implements SerializableArgument.ContextFree<T> {
   private final A original;

   protected BrigadierWrapperArgument(final A original) {
      this.original = original;
   }

   @Override
   public abstract SerializableArgument.Type<? extends BrigadierWrapperArgument<T, A>> type();

   protected A original() {
      return this.original;
   }

   @Override
   public T parse(final StringReader reader) throws CommandSyntaxException {
      return (T)this.original.parse(reader);
   }

   @Override
   public CompletableFuture<Suggestions> listSuggestions(final CommandContext<? extends SuggestionContext> context, final SuggestionsBuilder builder) {
      return this.original.listSuggestions(context, builder);
   }

   @Override
   public Collection<String> getExamples() {
      return this.original.getExamples();
   }

   @Override
   public boolean equals(final Object o) {
      return o instanceof BrigadierWrapperArgument<?, ?> that && Objects.equals(this.original, that.original);
   }

   @Override
   public int hashCode() {
      return this.original.hashCode();
   }
}
