import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class gj implements ArgumentType<gk> {
   private static final Collection<String> a = Arrays.asList("stick", "minecraft:stick", "stick{foo=bar}");
   private final gl b;

   public gj(dy $$0) {
      this.b = new gl($$0);
   }

   public static gj a(dy $$0) {
      return new gj($$0);
   }

   public gk a(StringReader $$0) throws CommandSyntaxException {
      gl.a $$1 = this.b.a($$0);
      return new gk($$1.a(), $$1.b());
   }

   public static <S> gk a(CommandContext<S> $$0, String $$1) {
      return (gk)$$0.getArgument($$1, gk.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return this.b.a($$1);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
