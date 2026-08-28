import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class he implements ArgumentType<hf> {
   private static final Collection<String> a = Arrays.asList("stick", "minecraft:stick", "stick{foo=bar}");
   private final hg b;

   public he(er $$0) {
      this.b = new hg($$0);
   }

   public static he a(er $$0) {
      return new he($$0);
   }

   public hf a(StringReader $$0) throws CommandSyntaxException {
      hg.a $$1 = this.b.a($$0);
      return new hf($$1.a(), $$1.b());
   }

   public static <S> hf a(CommandContext<S> $$0, String $$1) {
      return (hf)$$0.getArgument($$1, hf.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return this.b.a($$1);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
