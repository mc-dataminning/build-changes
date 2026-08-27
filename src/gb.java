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

public class gb implements ArgumentType<gc> {
   private static final Collection<String> b = Arrays.asList("0 0", "~ ~", "~1 ~-2", "^ ^", "^-1 ^0");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wx.c("argument.pos2d.incomplete"));

   public static gb a() {
      return new gb();
   }

   public static aqd a(CommandContext<ee> $$0, String $$1) {
      io $$2 = ((gc)$$0.getArgument($$1, gc.class)).c((ee)$$0.getSource());
      return new aqd($$2.u(), $$2.w());
   }

   public gc a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      if (!$$0.canRead()) {
         throw a.createWithContext($$0);
      } else {
         gi $$2 = gi.a($$0);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            gi $$3 = gi.a($$0);
            return new gj($$2, new gi(true, 0.0), $$3);
         } else {
            $$0.setCursor($$1);
            throw a.createWithContext($$0);
         }
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      if (!($$0.getSource() instanceof ej)) {
         return Suggestions.empty();
      } else {
         String $$2 = $$1.getRemaining();
         Collection<ej.b> $$3;
         if (!$$2.isEmpty() && $$2.charAt(0) == '^') {
            $$3 = Collections.singleton(ej.b.a);
         } else {
            $$3 = ((ej)$$0.getSource()).B();
         }

         return ej.b($$2, $$3, $$1, ef.a(this::a));
      }
   }

   public Collection<String> getExamples() {
      return b;
   }
}
