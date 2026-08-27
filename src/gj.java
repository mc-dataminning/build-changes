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

public class gj implements ArgumentType<gf> {
   private static final Collection<String> b = Arrays.asList("0 0", "~ ~", "0.1 -0.5", "~1 ~-2");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xe.c("argument.pos2d.incomplete"));
   private final boolean c;

   public gj(boolean $$0) {
      this.c = $$0;
   }

   public static gj a() {
      return new gj(true);
   }

   public static gj a(boolean $$0) {
      return new gj($$0);
   }

   public static ewt a(CommandContext<eh> $$0, String $$1) {
      ewu $$2 = ((gf)$$0.getArgument($$1, gf.class)).a((eh)$$0.getSource());
      return new ewt((float)$$2.c, (float)$$2.e);
   }

   public gf a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      if (!$$0.canRead()) {
         throw a.createWithContext($$0);
      } else {
         gl $$2 = gl.a($$0, this.c);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            gl $$3 = gl.a($$0, this.c);
            return new gm($$2, new gl(true, 0.0), $$3);
         } else {
            $$0.setCursor($$1);
            throw a.createWithContext($$0);
         }
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      if (!($$0.getSource() instanceof em)) {
         return Suggestions.empty();
      } else {
         String $$2 = $$1.getRemaining();
         Collection<em.b> $$3;
         if (!$$2.isEmpty() && $$2.charAt(0) == '^') {
            $$3 = Collections.singleton(em.b.a);
         } else {
            $$3 = ((em)$$0.getSource()).C();
         }

         return em.b($$2, $$3, $$1, ei.a(this::a));
      }
   }

   public Collection<String> getExamples() {
      return b;
   }
}
