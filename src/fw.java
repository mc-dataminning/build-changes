import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class fw implements ArgumentType<fu> {
   private static final Collection<String> a = Arrays.asList("stone", "minecraft:stone", "stone[foo=bar]", "foo{bar=baz}");
   private final iy<dde> b;

   public fw(dz $$0) {
      this.b = $$0.b(le.f);
   }

   public static fw a(dz $$0) {
      return new fw($$0);
   }

   public fu a(StringReader $$0) throws CommandSyntaxException {
      fx.a $$1 = fx.a(this.b, $$0, true);
      return new fu($$1.a(), $$1.b().keySet(), $$1.c());
   }

   public static fu a(CommandContext<ed> $$0, String $$1) {
      return (fu)$$0.getArgument($$1, fu.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return fx.a(this.b, $$1, false, true);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
