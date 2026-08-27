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

public class rl implements ArgumentType<rk> {
   private static final Collection<String> a = Arrays.asList("techtests.piston", "techtests");

   public rk a(StringReader $$0) throws CommandSyntaxException {
      String $$1 = $$0.readUnquotedString();
      Optional<rk> $$2 = qv.e($$1);
      if ($$2.isPresent()) {
         return $$2.get();
      } else {
         Message $$3 = ui.b("No such test: " + $$1);
         throw new CommandSyntaxException(new SimpleCommandExceptionType($$3), $$3);
      }
   }

   public static rl a() {
      return new rl();
   }

   public static rk a(CommandContext<du> $$0, String $$1) {
      return (rk)$$0.getArgument($$1, rk.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      Stream<String> $$2 = qv.a().stream().map(rk::a);
      return dy.b($$2, $$1);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
