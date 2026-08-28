import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class hc implements ArgumentType<hd> {
   private static final Collection<String> a = Arrays.asList("stick", "minecraft:stick", "stick{foo=bar}");
   private final he b;

   public hc(ep $$0) {
      this.b = new he($$0);
   }

   public static hc a(ep $$0) {
      return new hc($$0);
   }

   public hd a(StringReader $$0) throws CommandSyntaxException {
      he.a $$1 = this.b.a($$0);
      return new hd($$1.a(), $$1.b());
   }

   public static <S> hd a(CommandContext<S> $$0, String $$1) {
      return (hd)$$0.getArgument($$1, hd.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return this.b.a($$1);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
