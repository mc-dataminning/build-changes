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

public class tz implements ArgumentType<ty> {
   private static final Collection<String> a = Arrays.asList("techtests.piston", "techtests");

   public ty a(StringReader $$0) throws CommandSyntaxException {
      String $$1 = $$0.readUnquotedString();
      Optional<ty> $$2 = tg.e($$1);
      if ($$2.isPresent()) {
         return $$2.get();
      } else {
         Message $$3 = xh.b("No such test: " + $$1);
         throw new CommandSyntaxException(new SimpleCommandExceptionType($$3), $$3);
      }
   }

   public static tz a() {
      return new tz();
   }

   public static ty a(CommandContext<ev> $$0, String $$1) {
      return (ty)$$0.getArgument($$1, ty.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return a($$0, $$1);
   }

   public static <S> CompletableFuture<Suggestions> a(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      Stream<String> $$2 = tg.a().stream().map(ty::c);
      return fa.b($$2, $$1);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
