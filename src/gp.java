import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class gp implements ArgumentType<gn> {
   private static final Collection<String> a = Arrays.asList("stone", "minecraft:stone", "stone[foo=bar]", "foo{bar=baz}");
   private final js<dkd> b;

   public gp(es $$0) {
      this.b = $$0.d(mb.f);
   }

   public static gp a(es $$0) {
      return new gp($$0);
   }

   public gn a(StringReader $$0) throws CommandSyntaxException {
      gq.a $$1 = gq.a(this.b, $$0, true);
      return new gn($$1.a(), $$1.b().keySet(), $$1.c());
   }

   public static gn a(CommandContext<ew> $$0, String $$1) {
      return (gn)$$0.getArgument($$1, gn.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return gq.a(this.b, $$1, false, true);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
