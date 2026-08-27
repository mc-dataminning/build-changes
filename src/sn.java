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

public class sn implements ArgumentType<sm> {
   private static final Collection<String> a = Arrays.asList("techtests.piston", "techtests");

   public sm a(StringReader $$0) throws CommandSyntaxException {
      String $$1 = $$0.readUnquotedString();
      Optional<sm> $$2 = ru.e($$1);
      if ($$2.isPresent()) {
         return $$2.get();
      } else {
         Message $$3 = vq.b("No such test: " + $$1);
         throw new CommandSyntaxException(new SimpleCommandExceptionType($$3), $$3);
      }
   }

   public static sn a() {
      return new sn();
   }

   public static sm a(CommandContext<du> $$0, String $$1) {
      return (sm)$$0.getArgument($$1, sm.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return a($$0, $$1);
   }

   public static <S> CompletableFuture<Suggestions> a(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      Stream<String> $$2 = ru.a().stream().map(sm::c);
      return dz.b($$2, $$1);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
