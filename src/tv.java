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

public class tv implements ArgumentType<tu> {
   private static final Collection<String> a = Arrays.asList("techtests.piston", "techtests");

   public tu a(StringReader $$0) throws CommandSyntaxException {
      String $$1 = $$0.readUnquotedString();
      Optional<tu> $$2 = tc.e($$1);
      if ($$2.isPresent()) {
         return $$2.get();
      } else {
         Message $$3 = xd.b("No such test: " + $$1);
         throw new CommandSyntaxException(new SimpleCommandExceptionType($$3), $$3);
      }
   }

   public static tv a() {
      return new tv();
   }

   public static tu a(CommandContext<et> $$0, String $$1) {
      return (tu)$$0.getArgument($$1, tu.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return a($$0, $$1);
   }

   public static <S> CompletableFuture<Suggestions> a(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      Stream<String> $$2 = tc.a().stream().map(tu::c);
      return ey.b($$2, $$1);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
