import com.mojang.brigadier.Message;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class tw implements ArgumentType<tv> {
   private static final Collection<String> a = Arrays.asList("techtests.piston", "techtests");

   public tv a(StringReader $$0) throws CommandSyntaxException {
      String $$1 = $$0.readUnquotedString();
      Optional<tv> $$2 = td.e($$1);
      if ($$2.isPresent()) {
         return $$2.get();
      } else {
         Message $$3 = xe.b("No such test: " + $$1);
         throw new CommandSyntaxException(new SimpleCommandExceptionType($$3), $$3);
      }
   }

   public static tw a() {
      return new tw();
   }

   public static tv a(CommandContext<eu> $$0, String $$1) {
      return (tv)$$0.getArgument($$1, tv.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return a($$0, $$1);
   }

   public static <S> CompletableFuture<Suggestions> a(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      Stream<String> $$2 = td.a().stream().map(tv::c);
      return ez.b($$2, $$1);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
