import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class gc implements ArgumentType<gd> {
   private static final Collection<String> a = Arrays.asList("stick", "minecraft:stick", "stick{foo=bar}");
   private final ge b;

   public gc(dr $$0) {
      this.b = new ge($$0);
   }

   public static gc a(dr $$0) {
      return new gc($$0);
   }

   public gd a(StringReader $$0) throws CommandSyntaxException {
      ge.a $$1 = this.b.a($$0);
      return new gd($$1.a(), $$1.b());
   }

   public static <S> gd a(CommandContext<S> $$0, String $$1) {
      return (gd)$$0.getArgument($$1, gd.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return this.b.a($$1);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
