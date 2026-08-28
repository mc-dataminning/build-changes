import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class ge implements ArgumentType<gc> {
   private static final Collection<String> a = Arrays.asList("stone", "minecraft:stone", "stone[foo=bar]", "foo{bar=baz}");
   private final ji<dne> b;

   public ge(eg $$0) {
      this.b = $$0.e(mi.i);
   }

   public static ge a(eg $$0) {
      return new ge($$0);
   }

   public gc a(StringReader $$0) throws CommandSyntaxException {
      gf.a $$1 = gf.a(this.b, $$0, true);
      return new gc($$1.a(), $$1.b().keySet(), $$1.c());
   }

   public static gc a(CommandContext<ek> $$0, String $$1) {
      return (gc)$$0.getArgument($$1, gc.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return gf.a(this.b, $$1, false, true);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
