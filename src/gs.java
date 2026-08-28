import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class gs implements ArgumentType<gt> {
   private static final Collection<String> a = Arrays.asList("stick", "minecraft:stick", "stick{foo=bar}");
   private final gu b;

   public gs(ee $$0) {
      this.b = new gu($$0);
   }

   public static gs a(ee $$0) {
      return new gs($$0);
   }

   public gt a(StringReader $$0) throws CommandSyntaxException {
      gu.a $$1 = this.b.a($$0);
      return new gt($$1.a(), $$1.b());
   }

   public static <S> gt a(CommandContext<S> $$0, String $$1) {
      return (gt)$$0.getArgument($$1, gt.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return this.b.a($$1);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
