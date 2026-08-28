import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class gt implements ArgumentType<gu> {
   private static final Collection<String> a = Arrays.asList("stick", "minecraft:stick", "stick{foo=bar}");
   private final gv b;

   public gt(ef $$0) {
      this.b = new gv($$0);
   }

   public static gt a(ef $$0) {
      return new gt($$0);
   }

   public gu a(StringReader $$0) throws CommandSyntaxException {
      gv.a $$1 = this.b.a($$0);
      return new gu($$1.a(), $$1.b());
   }

   public static <S> gu a(CommandContext<S> $$0, String $$1) {
      return (gu)$$0.getArgument($$1, gu.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return this.b.a($$1);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
