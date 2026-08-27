import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class fx implements ArgumentType<fv> {
   private static final Collection<String> a = Arrays.asList("stone", "minecraft:stone", "stone[foo=bar]", "foo{bar=baz}");
   private final iz<dea> b;

   public fx(ea $$0) {
      this.b = $$0.b(lf.f);
   }

   public static fx a(ea $$0) {
      return new fx($$0);
   }

   public fv a(StringReader $$0) throws CommandSyntaxException {
      fy.a $$1 = fy.a(this.b, $$0, true);
      return new fv($$1.a(), $$1.b().keySet(), $$1.c());
   }

   public static fv a(CommandContext<ee> $$0, String $$1) {
      return (fv)$$0.getArgument($$1, fv.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return fy.a(this.b, $$1, false, true);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
