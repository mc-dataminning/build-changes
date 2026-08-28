import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class hh implements ArgumentType<hi> {
   private static final Collection<String> a = Arrays.asList("stick", "minecraft:stick", "stick{foo=bar}");
   private final hj b;

   public hh(et $$0) {
      this.b = new hj($$0);
   }

   public static hh a(et $$0) {
      return new hh($$0);
   }

   public hi a(StringReader $$0) throws CommandSyntaxException {
      hj.a $$1 = this.b.a($$0);
      return new hi($$1.a(), $$1.b());
   }

   public static <S> hi a(CommandContext<S> $$0, String $$1) {
      return (hi)$$0.getArgument($$1, hi.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return this.b.a($$1);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
