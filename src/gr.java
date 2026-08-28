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

public class gr implements ArgumentType<gs> {
   private static final Collection<String> b = Arrays.asList("0 0", "~ ~", "~1 ~-2", "^ ^", "^-1 ^0");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xe.c("argument.pos2d.incomplete"));

   public static gr a() {
      return new gr();
   }

   public static aqw a(CommandContext<eu> $$0, String $$1) {
      jf $$2 = ((gs)$$0.getArgument($$1, gs.class)).c((eu)$$0.getSource());
      return new aqw($$2.u(), $$2.w());
   }

   public gs a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      if (!$$0.canRead()) {
         throw a.createWithContext($$0);
      } else {
         gy $$2 = gy.a($$0);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            gy $$3 = gy.a($$0);
            return new gz($$2, new gy(true, 0.0), $$3);
         } else {
            $$0.setCursor($$1);
            throw a.createWithContext($$0);
         }
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      if (!($$0.getSource() instanceof ez)) {
         return Suggestions.empty();
      } else {
         String $$2 = $$1.getRemaining();
         Collection<ez.b> $$3;
         if (!$$2.isEmpty() && $$2.charAt(0) == '^') {
            $$3 = Collections.singleton(ez.b.a);
         } else {
            $$3 = ((ez)$$0.getSource()).B();
         }

         return ez.b($$2, $$3, $$1, ev.a(this::a));
      }
   }

   public Collection<String> getExamples() {
      return b;
   }
}
