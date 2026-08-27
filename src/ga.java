import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class ga implements ArgumentType<gb> {
   private static final Collection<String> a = Arrays.asList("stick", "minecraft:stick", "stick{foo=bar}");
   private final il<coy> b;

   public ga(dq $$0) {
      this.b = $$0.a(kg.F);
   }

   public static ga a(dq $$0) {
      return new ga($$0);
   }

   public gb a(StringReader $$0) throws CommandSyntaxException {
      gc.a $$1 = gc.a(this.b, $$0);
      return new gb($$1.a(), $$1.b());
   }

   public static <S> gb a(CommandContext<S> $$0, String $$1) {
      return (gb)$$0.getArgument($$1, gb.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return gc.a(this.b, $$1, false);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
