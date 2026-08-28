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

public class fw implements ArgumentType<exa> {
   private static final Collection<String> b = Arrays.asList("sidebar", "foo.bar");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> wu.b("argument.scoreboardDisplaySlot.invalid", $$0));

   private fw() {
   }

   public static fw a() {
      return new fw();
   }

   public static exa a(CommandContext<eq> $$0, String $$1) {
      return (exa)$$0.getArgument($$1, exa.class);
   }

   public exa a(StringReader $$0) throws CommandSyntaxException {
      String $$1 = $$0.readUnquotedString();
      exa $$2 = exa.t.a($$1);
      if ($$2 == null) {
         throw a.createWithContext($$0, $$1);
      } else {
         return $$2;
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return ev.b(Arrays.stream(exa.values()).map(exa::c), $$1);
   }

   public Collection<String> getExamples() {
      return b;
   }
}
