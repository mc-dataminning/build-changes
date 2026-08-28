import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class hg implements ArgumentType<hh> {
   private static final Collection<String> a = Arrays.asList("stick", "minecraft:stick", "stick{foo=bar}");
   private final hi b;

   public hg(et $$0) {
      this.b = new hi($$0);
   }

   public static hg a(et $$0) {
      return new hg($$0);
   }

   public hh a(StringReader $$0) throws CommandSyntaxException {
      hi.a $$1 = this.b.a($$0);
      return new hh($$1.a(), $$1.b());
   }

   public static <S> hh a(CommandContext<S> $$0, String $$1) {
      return (hh)$$0.getArgument($$1, hh.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return this.b.a($$1);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
