import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class gq implements ArgumentType<gr> {
   private static final Collection<String> a = Arrays.asList("stick", "minecraft:stick", "stick{foo=bar}");
   private final gs b;

   public gq(ed $$0) {
      this.b = new gs($$0);
   }

   public static gq a(ed $$0) {
      return new gq($$0);
   }

   public gr a(StringReader $$0) throws CommandSyntaxException {
      gs.a $$1 = this.b.a($$0);
      return new gr($$1.a(), $$1.b());
   }

   public static <S> gr a(CommandContext<S> $$0, String $$1) {
      return (gr)$$0.getArgument($$1, gr.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return this.b.a($$1);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
