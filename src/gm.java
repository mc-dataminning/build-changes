import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class gm implements ArgumentType<gk> {
   private static final Collection<String> a = Arrays.asList("stone", "minecraft:stone", "stone[foo=bar]", "foo{bar=baz}");
   private final jp<dhj> b;

   public gm(ep $$0) {
      this.b = $$0.b(lv.f);
   }

   public static gm a(ep $$0) {
      return new gm($$0);
   }

   public gk a(StringReader $$0) throws CommandSyntaxException {
      gn.a $$1 = gn.a(this.b, $$0, true);
      return new gk($$1.a(), $$1.b().keySet(), $$1.c());
   }

   public static gk a(CommandContext<et> $$0, String $$1) {
      return (gk)$$0.getArgument($$1, gk.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return gn.a(this.b, $$1, false, true);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
