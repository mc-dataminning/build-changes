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

public class gh implements ArgumentType<gi> {
   private static final Collection<String> b = Arrays.asList("0 0", "~ ~", "~1 ~-2", "^ ^", "^-1 ^0");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wy.c("argument.pos2d.incomplete"));

   public static gh a() {
      return new gh();
   }

   public static arb a(CommandContext<ej> $$0, String $$1) {
      iv $$2 = ((gi)$$0.getArgument($$1, gi.class)).c((ej)$$0.getSource());
      return new arb($$2.u(), $$2.w());
   }

   public gi a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      if (!$$0.canRead()) {
         throw a.createWithContext($$0);
      } else {
         go $$2 = go.a($$0);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            go $$3 = go.a($$0);
            return new gp($$2, new go(true, 0.0), $$3);
         } else {
            $$0.setCursor($$1);
            throw a.createWithContext($$0);
         }
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      if (!($$0.getSource() instanceof eo)) {
         return Suggestions.empty();
      } else {
         String $$2 = $$1.getRemaining();
         Collection<eo.b> $$3;
         if (!$$2.isEmpty() && $$2.charAt(0) == '^') {
            $$3 = Collections.singleton(eo.b.a);
         } else {
            $$3 = ((eo)$$0.getSource()).A();
         }

         return eo.b($$2, $$3, $$1, ek.a(this::a));
      }
   }

   public Collection<String> getExamples() {
      return b;
   }
}
