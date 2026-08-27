import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class ga implements ArgumentType<fy> {
   private static final Collection<String> a = Arrays.asList("stone", "minecraft:stone", "stone[foo=bar]", "foo{bar=baz}");
   private final jc<dfc> b;

   public ga(ed $$0) {
      this.b = $$0.b(li.f);
   }

   public static ga a(ed $$0) {
      return new ga($$0);
   }

   public fy a(StringReader $$0) throws CommandSyntaxException {
      gb.a $$1 = gb.a(this.b, $$0, true);
      return new fy($$1.a(), $$1.b().keySet(), $$1.c());
   }

   public static fy a(CommandContext<eh> $$0, String $$1) {
      return (fy)$$0.getArgument($$1, fy.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return gb.a(this.b, $$1, false, true);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
