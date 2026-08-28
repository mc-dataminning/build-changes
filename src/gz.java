import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class gz implements ArgumentType<ha> {
   private static final Collection<String> a = Arrays.asList("stick", "minecraft:stick", "stick{foo=bar}");
   private final hb b;

   public gz(em $$0) {
      this.b = new hb($$0);
   }

   public static gz a(em $$0) {
      return new gz($$0);
   }

   public ha a(StringReader $$0) throws CommandSyntaxException {
      hb.a $$1 = this.b.a($$0);
      return new ha($$1.a(), $$1.b());
   }

   public static <S> ha a(CommandContext<S> $$0, String $$1) {
      return (ha)$$0.getArgument($$1, ha.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return this.b.a($$1);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
