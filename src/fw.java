import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class fw implements ArgumentType<fx> {
   private static final Collection<String> a = Arrays.asList("stick", "minecraft:stick", "stick{foo=bar}");
   private final hi<civ> b;

   public fw(dn $$0) {
      this.b = $$0.a(je.D);
   }

   public static fw a(dn $$0) {
      return new fw($$0);
   }

   public fx a(StringReader $$0) throws CommandSyntaxException {
      fy.a $$1 = fy.a(this.b, $$0);
      return new fx($$1.a(), $$1.b());
   }

   public static <S> fx a(CommandContext<S> $$0, String $$1) {
      return (fx)$$0.getArgument($$1, fx.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return fy.a(this.b, $$1, false);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
