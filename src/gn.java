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

public class gn implements ArgumentType<go> {
   private static final Collection<String> b = Arrays.asList("0 0", "~ ~", "~1 ~-2", "^ ^", "^-1 ^0");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wu.c("argument.pos2d.incomplete"));

   public static gn a() {
      return new gn();
   }

   public static aqa a(CommandContext<eq> $$0, String $$1) {
      ja $$2 = ((go)$$0.getArgument($$1, go.class)).c((eq)$$0.getSource());
      return new aqa($$2.u(), $$2.w());
   }

   public go a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      if (!$$0.canRead()) {
         throw a.createWithContext($$0);
      } else {
         gu $$2 = gu.a($$0);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            gu $$3 = gu.a($$0);
            return new gv($$2, new gu(true, 0.0), $$3);
         } else {
            $$0.setCursor($$1);
            throw a.createWithContext($$0);
         }
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      if (!($$0.getSource() instanceof ev)) {
         return Suggestions.empty();
      } else {
         String $$2 = $$1.getRemaining();
         Collection<ev.b> $$3;
         if (!$$2.isEmpty() && $$2.charAt(0) == '^') {
            $$3 = Collections.singleton(ev.b.a);
         } else {
            $$3 = ((ev)$$0.getSource()).B();
         }

         return ev.b($$2, $$3, $$1, er.a(this::a));
      }
   }

   public Collection<String> getExamples() {
      return b;
   }
}
