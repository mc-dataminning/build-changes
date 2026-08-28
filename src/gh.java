import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class gh implements ArgumentType<String> {
   private static final Collection<String> a = Arrays.asList("foo", "123");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xh.b("team.notFound", $$0));

   public static gh a() {
      return new gh();
   }

   public static fah a(CommandContext<ev> $$0, String $$1) throws CommandSyntaxException {
      String $$2 = (String)$$0.getArgument($$1, String.class);
      fam $$3 = ((ev)$$0.getSource()).l().aJ();
      fah $$4 = $$3.b($$2);
      if ($$4 == null) {
         throw b.create($$2);
      } else {
         return $$4;
      }
   }

   public String a(StringReader $$0) throws CommandSyntaxException {
      return $$0.readUnquotedString();
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof fa ? fa.b(((fa)$$0.getSource()).r(), $$1) : Suggestions.empty();
   }

   public Collection<String> getExamples() {
      return a;
   }
}
