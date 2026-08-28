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

public class gr implements ArgumentType<gn> {
   private static final Collection<String> b = Arrays.asList("0 0", "~ ~", "0.1 -0.5", "~1 ~-2");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xp.c("argument.pos2d.incomplete"));
   private final boolean c;

   public gr(boolean $$0) {
      this.c = $$0;
   }

   public static gr a() {
      return new gr(true);
   }

   public static gr a(boolean $$0) {
      return new gr($$0);
   }

   public static evs a(CommandContext<ep> $$0, String $$1) {
      evt $$2 = ((gn)$$0.getArgument($$1, gn.class)).a((ep)$$0.getSource());
      return new evs((float)$$2.c, (float)$$2.e);
   }

   public gn a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      if (!$$0.canRead()) {
         throw a.createWithContext($$0);
      } else {
         gt $$2 = gt.a($$0, this.c);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            gt $$3 = gt.a($$0, this.c);
            return new gu($$2, new gt(true, 0.0), $$3);
         } else {
            $$0.setCursor($$1);
            throw a.createWithContext($$0);
         }
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      if (!($$0.getSource() instanceof eu)) {
         return Suggestions.empty();
      } else {
         String $$2 = $$1.getRemaining();
         Collection<eu.b> $$3;
         if (!$$2.isEmpty() && $$2.charAt(0) == '^') {
            $$3 = Collections.singleton(eu.b.a);
         } else {
            $$3 = ((eu)$$0.getSource()).C();
         }

         return eu.b($$2, $$3, $$1, eq.a(this::a));
      }
   }

   public Collection<String> getExamples() {
      return b;
   }
}
