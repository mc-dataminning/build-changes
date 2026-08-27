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
import java.util.concurrent.CompletableFuture;

public class qm implements ArgumentType<String> {
   private static final Collection<String> a = Arrays.asList("techtests", "mobtests");

   public String a(StringReader $$0) throws CommandSyntaxException {
      String $$1 = $$0.readUnquotedString();
      if (pz.b($$1)) {
         return $$1;
      } else {
         Message $$2 = tl.b("No such test class: " + $$1);
         throw new CommandSyntaxException(new SimpleCommandExceptionType($$2), $$2);
      }
   }

   public static qm a() {
      return new qm();
   }

   public static String a(CommandContext<dt> $$0, String $$1) {
      return (String)$$0.getArgument($$1, String.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return dw.b(pz.b().stream(), $$1);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
