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

public class ga implements ArgumentType<gb> {
   private static final Collection<String> b = Arrays.asList("0 0", "~ ~", "~1 ~-2", "^ ^", "^-1 ^0");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wu.c("argument.pos2d.incomplete"));

   public static ga a() {
      return new ga();
   }

   public static apx a(CommandContext<ed> $$0, String $$1) {
      in $$2 = ((gb)$$0.getArgument($$1, gb.class)).c((ed)$$0.getSource());
      return new apx($$2.u(), $$2.w());
   }

   public gb a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      if (!$$0.canRead()) {
         throw a.createWithContext($$0);
      } else {
         gh $$2 = gh.a($$0);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            gh $$3 = gh.a($$0);
            return new gi($$2, new gh(true, 0.0), $$3);
         } else {
            $$0.setCursor($$1);
            throw a.createWithContext($$0);
         }
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      if (!($$0.getSource() instanceof ei)) {
         return Suggestions.empty();
      } else {
         String $$2 = $$1.getRemaining();
         Collection<ei.b> $$3;
         if (!$$2.isEmpty() && $$2.charAt(0) == '^') {
            $$3 = Collections.singleton(ei.b.a);
         } else {
            $$3 = ((ei)$$0.getSource()).B();
         }

         return ei.b($$2, $$3, $$1, ee.a(this::a));
      }
   }

   public Collection<String> getExamples() {
      return b;
   }
}
