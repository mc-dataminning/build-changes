import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class gj implements ArgumentType<gh> {
   private static final Collection<String> a = Arrays.asList("stone", "minecraft:stone", "stone[foo=bar]", "foo{bar=baz}");
   private final jl<dff> b;

   public gj(em $$0) {
      this.b = $$0.b(lr.f);
   }

   public static gj a(em $$0) {
      return new gj($$0);
   }

   public gh a(StringReader $$0) throws CommandSyntaxException {
      gk.a $$1 = gk.a(this.b, $$0, true);
      return new gh($$1.a(), $$1.b().keySet(), $$1.c());
   }

   public static gh a(CommandContext<eq> $$0, String $$1) {
      return (gh)$$0.getArgument($$1, gh.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return gk.a(this.b, $$1, false, true);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
