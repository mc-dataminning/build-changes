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

public class gq implements ArgumentType<gr> {
   private static final Collection<String> b = Arrays.asList("0 0", "~ ~", "~1 ~-2", "^ ^", "^-1 ^0");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xd.c("argument.pos2d.incomplete"));

   public static gq a() {
      return new gq();
   }

   public static aqt a(CommandContext<et> $$0, String $$1) {
      je $$2 = ((gr)$$0.getArgument($$1, gr.class)).c((et)$$0.getSource());
      return new aqt($$2.u(), $$2.w());
   }

   public gr a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      if (!$$0.canRead()) {
         throw a.createWithContext($$0);
      } else {
         gx $$2 = gx.a($$0);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            gx $$3 = gx.a($$0);
            return new gy($$2, new gx(true, 0.0), $$3);
         } else {
            $$0.setCursor($$1);
            throw a.createWithContext($$0);
         }
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      if (!($$0.getSource() instanceof ey)) {
         return Suggestions.empty();
      } else {
         String $$2 = $$1.getRemaining();
         Collection<ey.b> $$3;
         if (!$$2.isEmpty() && $$2.charAt(0) == '^') {
            $$3 = Collections.singleton(ey.b.a);
         } else {
            $$3 = ((ey)$$0.getSource()).B();
         }

         return ey.b($$2, $$3, $$1, eu.a(this::a));
      }
   }

   public Collection<String> getExamples() {
      return b;
   }
}
