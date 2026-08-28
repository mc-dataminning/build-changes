import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class hf implements ArgumentType<hg> {
   private static final Collection<String> a = Arrays.asList("stick", "minecraft:stick", "stick{foo=bar}");
   private final hh b;

   public hf(es $$0) {
      this.b = new hh($$0);
   }

   public static hf a(es $$0) {
      return new hf($$0);
   }

   public hg a(StringReader $$0) throws CommandSyntaxException {
      hh.a $$1 = this.b.a($$0);
      return new hg($$1.a(), $$1.b());
   }

   public static <S> hg a(CommandContext<S> $$0, String $$1) {
      return (hg)$$0.getArgument($$1, hg.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return this.b.a($$1);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
