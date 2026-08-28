import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class gn implements ArgumentType<gl> {
   private static final Collection<String> a = Arrays.asList("stone", "minecraft:stone", "stone[foo=bar]", "foo{bar=baz}");
   private final jq<dhm> b;

   public gn(eq $$0) {
      this.b = $$0.d(lw.f);
   }

   public static gn a(eq $$0) {
      return new gn($$0);
   }

   public gl a(StringReader $$0) throws CommandSyntaxException {
      go.a $$1 = go.a(this.b, $$0, true);
      return new gl($$1.a(), $$1.b().keySet(), $$1.c());
   }

   public static gl a(CommandContext<eu> $$0, String $$1) {
      return (gl)$$0.getArgument($$1, gl.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return go.a(this.b, $$1, false, true);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
