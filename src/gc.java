import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class gc implements ArgumentType<ga> {
   private static final Collection<String> a = Arrays.asList("stone", "minecraft:stone", "stone[foo=bar]", "foo{bar=baz}");
   private final jg<dlu> b;

   public gc(ee $$0) {
      this.b = $$0.e(mg.i);
   }

   public static gc a(ee $$0) {
      return new gc($$0);
   }

   public ga a(StringReader $$0) throws CommandSyntaxException {
      gd.a $$1 = gd.a(this.b, $$0, true);
      return new ga($$1.a(), $$1.b().keySet(), $$1.c());
   }

   public static ga a(CommandContext<ei> $$0, String $$1) {
      return (ga)$$0.getArgument($$1, ga.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return gd.a(this.b, $$1, false, true);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
