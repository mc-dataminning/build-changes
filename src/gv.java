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

public class gv implements ArgumentType<gw> {
   private static final Collection<String> b = Arrays.asList("0 0", "~ ~", "~1 ~-2", "^ ^", "^-1 ^0");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wv.c("argument.pos2d.incomplete"));

   public static gv a() {
      return new gv();
   }

   public static aqy a(CommandContext<ex> $$0, String $$1) {
      jj $$2 = ((gw)$$0.getArgument($$1, gw.class)).c((ex)$$0.getSource());
      return new aqy($$2.u(), $$2.w());
   }

   public gw a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      if (!$$0.canRead()) {
         throw a.createWithContext($$0);
      } else {
         hc $$2 = hc.a($$0);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            hc $$3 = hc.a($$0);
            return new hd($$2, new hc(true, 0.0), $$3);
         } else {
            $$0.setCursor($$1);
            throw a.createWithContext($$0);
         }
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      if (!($$0.getSource() instanceof fc)) {
         return Suggestions.empty();
      } else {
         String $$2 = $$1.getRemaining();
         Collection<fc.b> $$3;
         if (!$$2.isEmpty() && $$2.charAt(0) == '^') {
            $$3 = Collections.singleton(fc.b.a);
         } else {
            $$3 = ((fc)$$0.getSource()).A();
         }

         return fc.b($$2, $$3, $$1, ey.a(this::a));
      }
   }

   public Collection<String> getExamples() {
      return b;
   }
}
