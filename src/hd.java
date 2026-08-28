import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class hd implements ArgumentType<he> {
   private static final Collection<String> a = Arrays.asList("stick", "minecraft:stick", "stick{foo=bar}");
   private final hf b;

   public hd(eq $$0) {
      this.b = new hf($$0);
   }

   public static hd a(eq $$0) {
      return new hd($$0);
   }

   public he a(StringReader $$0) throws CommandSyntaxException {
      hf.a $$1 = this.b.a($$0);
      return new he($$1.a(), $$1.b());
   }

   public static <S> he a(CommandContext<S> $$0, String $$1) {
      return (he)$$0.getArgument($$1, he.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return this.b.a($$1);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
