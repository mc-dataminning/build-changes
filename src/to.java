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

public class to implements ArgumentType<tn> {
   private static final Collection<String> a = Arrays.asList("techtests.piston", "techtests");

   public tn a(StringReader $$0) throws CommandSyntaxException {
      String $$1 = $$0.readUnquotedString();
      Optional<tn> $$2 = sv.e($$1);
      if ($$2.isPresent()) {
         return $$2.get();
      } else {
         Message $$3 = wu.b("No such test: " + $$1);
         throw new CommandSyntaxException(new SimpleCommandExceptionType($$3), $$3);
      }
   }

   public static to a() {
      return new to();
   }

   public static tn a(CommandContext<eq> $$0, String $$1) {
      return (tn)$$0.getArgument($$1, tn.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return a($$0, $$1);
   }

   public static <S> CompletableFuture<Suggestions> a(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      Stream<String> $$2 = sv.a().stream().map(tn::c);
      return ev.b($$2, $$1);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
