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

public class gd implements ArgumentType<gd.a> {
   private static final Collection<String> a = Arrays.asList("stick", "minecraft:stick", "#stick", "#stick{foo:'bar'}");
   private final ge b;

   public gd(dq $$0) {
      this.b = new ge($$0);
   }

   public static gd a(dq $$0) {
      return new gd($$0);
   }

   public gd.a a(StringReader $$0) throws CommandSyntaxException {
      Predicate<crj> $$1 = this.b.a($$0);
      return $$1::test;
   }

   public static gd.a a(CommandContext<du> $$0, String $$1) {
      return (gd.a)$$0.getArgument($$1, gd.a.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return this.b.a($$1);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public interface a extends Predicate<crj> {
   }
}
