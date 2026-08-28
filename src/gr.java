import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class gr implements ArgumentType<gp> {
   private static final Collection<String> a = Arrays.asList("stone", "minecraft:stone", "stone[foo=bar]", "foo{bar=baz}");
   private final ju<dku> b;

   public gr(et $$0) {
      this.b = $$0.e(me.f);
   }

   public static gr a(et $$0) {
      return new gr($$0);
   }

   public gp a(StringReader $$0) throws CommandSyntaxException {
      gs.a $$1 = gs.a(this.b, $$0, true);
      return new gp($$1.a(), $$1.b().keySet(), $$1.c());
   }

   public static gp a(CommandContext<ex> $$0, String $$1) {
      return (gp)$$0.getArgument($$1, gp.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return gs.a(this.b, $$1, false, true);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
