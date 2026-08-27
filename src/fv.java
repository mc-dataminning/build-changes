import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class fv implements ArgumentType<fw> {
   private static final Collection<String> a = Arrays.asList("stick", "minecraft:stick", "stick{foo=bar}");
   private final hh<cir> b;

   public fv(dm $$0) {
      this.b = $$0.a(jd.D);
   }

   public static fv a(dm $$0) {
      return new fv($$0);
   }

   public fw a(StringReader $$0) throws CommandSyntaxException {
      fx.a $$1 = fx.a(this.b, $$0);
      return new fw($$1.a(), $$1.b());
   }

   public static <S> fw a(CommandContext<S> $$0, String $$1) {
      return (fw)$$0.getArgument($$1, fw.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return fx.a(this.b, $$1, false);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
