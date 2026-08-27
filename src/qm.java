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

public class qm implements ArgumentType<ql> {
   private static final Collection<String> a = Arrays.asList("techtests.piston", "techtests");

   public ql a(StringReader $$0) throws CommandSyntaxException {
      String $$1 = $$0.readUnquotedString();
      Optional<ql> $$2 = pw.e($$1);
      if ($$2.isPresent()) {
         return $$2.get();
      } else {
         Message $$3 = ti.b("No such test: " + $$1);
         throw new CommandSyntaxException(new SimpleCommandExceptionType($$3), $$3);
      }
   }

   public static qm a() {
      return new qm();
   }

   public static ql a(CommandContext<dt> $$0, String $$1) {
      return (ql)$$0.getArgument($$1, ql.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      Stream<String> $$2 = pw.a().stream().map(ql::a);
      return dw.b($$2, $$1);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
