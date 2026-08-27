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

public class ge implements ArgumentType<gf> {
   private static final Collection<String> b = Arrays.asList("0 0", "~ ~", "~1 ~-2", "^ ^", "^-1 ^0");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xe.c("argument.pos2d.incomplete"));

   public static ge a() {
      return new ge();
   }

   public static aqj a(CommandContext<eh> $$0, String $$1) {
      ir $$2 = ((gf)$$0.getArgument($$1, gf.class)).c((eh)$$0.getSource());
      return new aqj($$2.u(), $$2.w());
   }

   public gf a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      if (!$$0.canRead()) {
         throw a.createWithContext($$0);
      } else {
         gl $$2 = gl.a($$0);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            gl $$3 = gl.a($$0);
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
            $$3 = ((em)$$0.getSource()).B();
         }

         return em.b($$2, $$3, $$1, ei.a(this::a));
      }
   }

   public Collection<String> getExamples() {
      return b;
   }
}
