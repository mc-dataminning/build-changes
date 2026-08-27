import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.CompletableFuture;

public class gg implements ArgumentType<gb> {
   private static final Collection<String> c = Arrays.asList("0 0 0", "~ ~ ~", "^ ^ ^", "^1 ^ ^-5", "0.1 -0.5 .9", "~0.5 ~1 ~-5");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wu.c("argument.pos3d.incomplete"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wu.c("argument.pos.mixed"));
   private final boolean d;

   public gg(boolean $$0) {
      this.d = $$0;
   }

   public static gg a() {
      return new gg(true);
   }

   public static gg a(boolean $$0) {
      return new gg($$0);
   }

   public static etp a(CommandContext<ed> $$0, String $$1) {
      return ((gb)$$0.getArgument($$1, gb.class)).a((ed)$$0.getSource());
   }

   public static gb b(CommandContext<ed> $$0, String $$1) {
      return (gb)$$0.getArgument($$1, gb.class);
   }

   public gb a(StringReader $$0) throws CommandSyntaxException {
      return (gb)($$0.canRead() && $$0.peek() == '^' ? gc.a($$0) : gi.a($$0, this.d));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      if (!($$0.getSource() instanceof ei)) {
         return Suggestions.empty();
      } else {
         String $$2 = $$1.getRemaining();
         Collection<ei.b> $$3;
         if (!$$2.isEmpty() && $$2.charAt(0) == '^') {
            $$3 = Collections.singleton(ei.b.a);
         } else {
            $$3 = ((ei)$$0.getSource()).C();
         }

         return ei.a($$2, $$3, $$1, ee.a(this::a));
      }
   }

   public Collection<String> getExamples() {
      return c;
   }
}
