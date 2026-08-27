import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;
import java.util.function.Predicate;

public class gf implements ArgumentType<gf.a> {
   private static final Collection<String> a = Arrays.asList("stick", "minecraft:stick", "#stick", "#stick{foo:'bar'}");
   private final gg b;

   public gf(dr $$0) {
      this.b = new gg($$0);
   }

   public static gf a(dr $$0) {
      return new gf($$0);
   }

   public gf.a a(StringReader $$0) throws CommandSyntaxException {
      Predicate<crs> $$1 = this.b.a($$0);
      return $$1::test;
   }

   public static gf.a a(CommandContext<dv> $$0, String $$1) {
      return (gf.a)$$0.getArgument($$1, gf.a.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return this.b.a($$1);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public interface a extends Predicate<crs> {
   }
}
