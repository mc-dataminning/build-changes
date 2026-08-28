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

public class fz implements ArgumentType<ezo> {
   private static final Collection<String> b = Arrays.asList("sidebar", "foo.bar");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xd.b("argument.scoreboardDisplaySlot.invalid", $$0));

   private fz() {
   }

   public static fz a() {
      return new fz();
   }

   public static ezo a(CommandContext<et> $$0, String $$1) {
      return (ezo)$$0.getArgument($$1, ezo.class);
   }

   public ezo a(StringReader $$0) throws CommandSyntaxException {
      String $$1 = $$0.readUnquotedString();
      ezo $$2 = ezo.t.a($$1);
      if ($$2 == null) {
         throw a.createWithContext($$0, $$1);
      } else {
         return $$2;
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return ey.b(Arrays.stream(ezo.values()).map(ezo::c), $$1);
   }

   public Collection<String> getExamples() {
      return b;
   }
}
