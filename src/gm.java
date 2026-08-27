import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class gm implements ArgumentType<gn> {
   private static final Collection<String> a = Arrays.asList("stick", "minecraft:stick", "stick{foo=bar}");
   private final go b;

   public gm(dz $$0) {
      this.b = new go($$0);
   }

   public static gm a(dz $$0) {
      return new gm($$0);
   }

   public gn a(StringReader $$0) throws CommandSyntaxException {
      go.a $$1 = this.b.a($$0);
      return new gn($$1.a(), $$1.b());
   }

   public static <S> gn a(CommandContext<S> $$0, String $$1) {
      return (gn)$$0.getArgument($$1, gn.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return this.b.a($$1);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
