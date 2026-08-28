import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class gi implements ArgumentType<gg> {
   private static final Collection<String> a = Arrays.asList("stone", "minecraft:stone", "stone[foo=bar]", "foo{bar=baz}");
   private final jk<dfa> b;

   public gi(el $$0) {
      this.b = $$0.b(lq.f);
   }

   public static gi a(el $$0) {
      return new gi($$0);
   }

   public gg a(StringReader $$0) throws CommandSyntaxException {
      gj.a $$1 = gj.a(this.b, $$0, true);
      return new gg($$1.a(), $$1.b().keySet(), $$1.c());
   }

   public static gg a(CommandContext<ep> $$0, String $$1) {
      return (gg)$$0.getArgument($$1, gg.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return gj.a(this.b, $$1, false, true);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
