import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class gq implements ArgumentType<go> {
   private static final Collection<String> a = Arrays.asList("stone", "minecraft:stone", "stone[foo=bar]", "foo{bar=baz}");
   private final jt<djm> b;

   public gq(et $$0) {
      this.b = $$0.d(mc.f);
   }

   public static gq a(et $$0) {
      return new gq($$0);
   }

   public go a(StringReader $$0) throws CommandSyntaxException {
      gr.a $$1 = gr.a(this.b, $$0, true);
      return new go($$1.a(), $$1.b().keySet(), $$1.c());
   }

   public static go a(CommandContext<ex> $$0, String $$1) {
      return (go)$$0.getArgument($$1, go.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return gr.a(this.b, $$1, false, true);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
