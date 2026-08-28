import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class gd implements ArgumentType<gb> {
   private static final Collection<String> a = Arrays.asList("stone", "minecraft:stone", "stone[foo=bar]", "foo{bar=baz}");
   private final jh<dmm> b;

   public gd(ef $$0) {
      this.b = $$0.e(mh.i);
   }

   public static gd a(ef $$0) {
      return new gd($$0);
   }

   public gb a(StringReader $$0) throws CommandSyntaxException {
      ge.a $$1 = ge.a(this.b, $$0, true);
      return new gb($$1.a(), $$1.b().keySet(), $$1.c());
   }

   public static gb a(CommandContext<ej> $$0, String $$1) {
      return (gb)$$0.getArgument($$1, gb.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return ge.a(this.b, $$1, false, true);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
