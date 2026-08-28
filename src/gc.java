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

public class gc implements ArgumentType<faj> {
   private static final Collection<String> b = Arrays.asList("sidebar", "foo.bar");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xi.b("argument.scoreboardDisplaySlot.invalid", $$0));

   private gc() {
   }

   public static gc a() {
      return new gc();
   }

   public static faj a(CommandContext<ew> $$0, String $$1) {
      return (faj)$$0.getArgument($$1, faj.class);
   }

   public faj a(StringReader $$0) throws CommandSyntaxException {
      String $$1 = $$0.readUnquotedString();
      faj $$2 = faj.t.a($$1);
      if ($$2 == null) {
         throw a.createWithContext($$0, $$1);
      } else {
         return $$2;
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return fb.b(Arrays.stream(faj.values()).map(faj::c), $$1);
   }

   public Collection<String> getExamples() {
      return b;
   }
}
