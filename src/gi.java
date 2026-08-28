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

public class gi implements ArgumentType<String> {
   private static final Collection<String> a = Arrays.asList("foo", "123");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xi.b("team.notFound", $$0));

   public static gi a() {
      return new gi();
   }

   public static fan a(CommandContext<ew> $$0, String $$1) throws CommandSyntaxException {
      String $$2 = (String)$$0.getArgument($$1, String.class);
      fas $$3 = ((ew)$$0.getSource()).l().aJ();
      fan $$4 = $$3.b($$2);
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
      return $$0.getSource() instanceof fb ? fb.b(((fb)$$0.getSource()).r(), $$1) : Suggestions.empty();
   }

   public Collection<String> getExamples() {
      return a;
   }
}
