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

public class gi implements ArgumentType<gj> {
   private static final Collection<String> b = Arrays.asList("0 0", "~ ~", "~1 ~-2", "^ ^", "^-1 ^0");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xc.c("argument.pos2d.incomplete"));

   public static gi a() {
      return new gi();
   }

   public static arf a(CommandContext<ek> $$0, String $$1) {
      iw $$2 = ((gj)$$0.getArgument($$1, gj.class)).c((ek)$$0.getSource());
      return new arf($$2.u(), $$2.w());
   }

   public gj a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      if (!$$0.canRead()) {
         throw a.createWithContext($$0);
      } else {
         gp $$2 = gp.a($$0);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            gp $$3 = gp.a($$0);
            return new gq($$2, new gp(true, 0.0), $$3);
         } else {
            $$0.setCursor($$1);
            throw a.createWithContext($$0);
         }
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      if (!($$0.getSource() instanceof ep)) {
         return Suggestions.empty();
      } else {
         String $$2 = $$1.getRemaining();
         Collection<ep.b> $$3;
         if (!$$2.isEmpty() && $$2.charAt(0) == '^') {
            $$3 = Collections.singleton(ep.b.a);
         } else {
            $$3 = ((ep)$$0.getSource()).A();
         }

         return ep.b($$2, $$3, $$1, el.a(this::a));
      }
   }

   public Collection<String> getExamples() {
      return b;
   }
}
