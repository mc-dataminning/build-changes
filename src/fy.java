import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class fy implements ArgumentType<fz> {
   private static final Collection<String> a = Arrays.asList("stick", "minecraft:stick", "stick{foo=bar}");
   private final id<ckw> b;

   public fy(dp $$0) {
      this.b = $$0.a(jz.E);
   }

   public static fy a(dp $$0) {
      return new fy($$0);
   }

   public fz a(StringReader $$0) throws CommandSyntaxException {
      ga.a $$1 = ga.a(this.b, $$0);
      return new fz($$1.a(), $$1.b());
   }

   public static <S> fz a(CommandContext<S> $$0, String $$1) {
      return (fz)$$0.getArgument($$1, fz.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return ga.a(this.b, $$1, false);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
