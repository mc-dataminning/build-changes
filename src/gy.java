import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class gy implements ArgumentType<gz> {
   private static final Collection<String> a = Arrays.asList("stick", "minecraft:stick", "stick{foo=bar}");
   private final ha b;

   public gy(el $$0) {
      this.b = new ha($$0);
   }

   public static gy a(el $$0) {
      return new gy($$0);
   }

   public gz a(StringReader $$0) throws CommandSyntaxException {
      ha.a $$1 = this.b.a($$0);
      return new gz($$1.a(), $$1.b());
   }

   public static <S> gz a(CommandContext<S> $$0, String $$1) {
      return (gz)$$0.getArgument($$1, gz.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return this.b.a($$1);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
