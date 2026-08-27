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

public class qk implements ArgumentType<qj> {
   private static final Collection<String> a = Arrays.asList("techtests.piston", "techtests");

   public qj a(StringReader $$0) throws CommandSyntaxException {
      String $$1 = $$0.readUnquotedString();
      Optional<qj> $$2 = pu.e($$1);
      if ($$2.isPresent()) {
         return $$2.get();
      } else {
         Message $$3 = te.b("No such test: " + $$1);
         throw new CommandSyntaxException(new SimpleCommandExceptionType($$3), $$3);
      }
   }

   public static qk a() {
      return new qk();
   }

   public static qj a(CommandContext<ds> $$0, String $$1) {
      return (qj)$$0.getArgument($$1, qj.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      Stream<String> $$2 = pu.a().stream().map(qj::a);
      return dv.b($$2, $$1);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
