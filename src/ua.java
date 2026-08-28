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

public class ua implements ArgumentType<tz> {
   private static final Collection<String> a = Arrays.asList("techtests.piston", "techtests");

   public tz a(StringReader $$0) throws CommandSyntaxException {
      String $$1 = $$0.readUnquotedString();
      Optional<tz> $$2 = th.e($$1);
      if ($$2.isPresent()) {
         return $$2.get();
      } else {
         Message $$3 = xi.b("No such test: " + $$1);
         throw new CommandSyntaxException(new SimpleCommandExceptionType($$3), $$3);
      }
   }

   public static ua a() {
      return new ua();
   }

   public static tz a(CommandContext<ew> $$0, String $$1) {
      return (tz)$$0.getArgument($$1, tz.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return a($$0, $$1);
   }

   public static <S> CompletableFuture<Suggestions> a(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      Stream<String> $$2 = th.a().stream().map(tz::c);
      return fb.b($$2, $$1);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
