import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class gu implements ArgumentType<gv> {
   private static final Collection<String> a = Arrays.asList("stick", "minecraft:stick", "stick{foo=bar}");
   private final gw b;

   public gu(eg $$0) {
      this.b = new gw($$0);
   }

   public static gu a(eg $$0) {
      return new gu($$0);
   }

   public gv a(StringReader $$0) throws CommandSyntaxException {
      gw.a $$1 = this.b.a($$0);
      return new gv($$1.a(), $$1.b());
   }

   public static <S> gv a(CommandContext<S> $$0, String $$1) {
      return (gv)$$0.getArgument($$1, gv.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return this.b.a($$1);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
