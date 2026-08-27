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

public class gm implements ArgumentType<gm.a> {
   private static final Collection<String> a = Arrays.asList("stick", "minecraft:stick", "#stick", "#stick{foo:'bar'}");
   private final gn b;

   public gm(dy $$0) {
      this.b = new gn($$0);
   }

   public static gm a(dy $$0) {
      return new gm($$0);
   }

   public gm.a a(StringReader $$0) throws CommandSyntaxException {
      Predicate<csd> $$1 = this.b.a($$0);
      return $$1::test;
   }

   public static gm.a a(CommandContext<ec> $$0, String $$1) {
      return (gm.a)$$0.getArgument($$1, gm.a.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return this.b.a($$1);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public interface a extends Predicate<csd> {
   }
}
