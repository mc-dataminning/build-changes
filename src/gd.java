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

public class gd implements ArgumentType<fz> {
   private static final Collection<String> b = Arrays.asList("0 0", "~ ~", "0.1 -0.5", "~1 ~-2");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(ws.c("argument.pos2d.incomplete"));
   private final boolean c;

   public gd(boolean $$0) {
      this.c = $$0;
   }

   public static gd a() {
      return new gd(true);
   }

   public static gd a(boolean $$0) {
      return new gd($$0);
   }

   public static ete a(CommandContext<ec> $$0, String $$1) {
      etf $$2 = ((fz)$$0.getArgument($$1, fz.class)).a((ec)$$0.getSource());
      return new ete((float)$$2.c, (float)$$2.e);
   }

   public fz a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      if (!$$0.canRead()) {
         throw a.createWithContext($$0);
      } else {
         gf $$2 = gf.a($$0, this.c);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            gf $$3 = gf.a($$0, this.c);
            return new gg($$2, new gf(true, 0.0), $$3);
         } else {
            $$0.setCursor($$1);
            throw a.createWithContext($$0);
         }
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      if (!($$0.getSource() instanceof eh)) {
         return Suggestions.empty();
      } else {
         String $$2 = $$1.getRemaining();
         Collection<eh.b> $$3;
         if (!$$2.isEmpty() && $$2.charAt(0) == '^') {
            $$3 = Collections.singleton(eh.b.a);
         } else {
            $$3 = ((eh)$$0.getSource()).C();
         }

         return eh.b($$2, $$3, $$1, ed.a(this::a));
      }
   }

   public Collection<String> getExamples() {
      return b;
   }
}
