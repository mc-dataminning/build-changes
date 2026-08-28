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

public class fv implements ArgumentType<ewn> {
   private static final Collection<String> b = Arrays.asList("sidebar", "foo.bar");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xp.b("argument.scoreboardDisplaySlot.invalid", $$0));

   private fv() {
   }

   public static fv a() {
      return new fv();
   }

   public static ewn a(CommandContext<ep> $$0, String $$1) {
      return (ewn)$$0.getArgument($$1, ewn.class);
   }

   public ewn a(StringReader $$0) throws CommandSyntaxException {
      String $$1 = $$0.readUnquotedString();
      ewn $$2 = ewn.t.a($$1);
      if ($$2 == null) {
         throw a.createWithContext($$0, $$1);
      } else {
         return $$2;
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return eu.b(Arrays.stream(ewn.values()).map(ewn::c), $$1);
   }

   public Collection<String> getExamples() {
      return b;
   }
}
