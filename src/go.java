import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class go implements ArgumentType<gm> {
   private static final Collection<String> a = Arrays.asList("stone", "minecraft:stone", "stone[foo=bar]", "foo{bar=baz}");
   private final jr<dhy> b;

   public go(er $$0) {
      this.b = $$0.d(ly.f);
   }

   public static go a(er $$0) {
      return new go($$0);
   }

   public gm a(StringReader $$0) throws CommandSyntaxException {
      gp.a $$1 = gp.a(this.b, $$0, true);
      return new gm($$1.a(), $$1.b().keySet(), $$1.c());
   }

   public static gm a(CommandContext<ev> $$0, String $$1) {
      return (gm)$$0.getArgument($$1, gm.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return gp.a(this.b, $$1, false, true);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
