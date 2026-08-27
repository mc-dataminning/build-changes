import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class gn implements ArgumentType<go> {
   private static final Collection<String> a = Arrays.asList("stick", "minecraft:stick", "stick{foo=bar}");
   private final gp b;

   public gn(ea $$0) {
      this.b = new gp($$0);
   }

   public static gn a(ea $$0) {
      return new gn($$0);
   }

   public go a(StringReader $$0) throws CommandSyntaxException {
      gp.a $$1 = this.b.a($$0);
      return new go($$1.a(), $$1.b());
   }

   public static <S> go a(CommandContext<S> $$0, String $$1) {
      return (go)$$0.getArgument($$1, go.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return this.b.a($$1);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
