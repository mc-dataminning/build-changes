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

public class gl implements ArgumentType<gn> {
   private static final Collection<String> d = Arrays.asList("0 0 0", "~ ~ ~", "^ ^ ^", "^1 ^ ^-5", "~0.5 ~1 ~-5");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xp.c("argument.pos.unloaded"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xp.c("argument.pos.outofworld"));
   public static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xp.c("argument.pos.outofbounds"));

   public static gl a() {
      return new gl();
   }

   public static iz a(CommandContext<ep> $$0, String $$1) throws CommandSyntaxException {
      arf $$2 = ((ep)$$0.getSource()).e();
      return a($$0, $$2, $$1);
   }

   public static iz a(CommandContext<ep> $$0, arf $$1, String $$2) throws CommandSyntaxException {
      iz $$3 = b($$0, $$2);
      if (!$$1.B($$3)) {
         throw a.create();
      } else if (!$$1.k($$3)) {
         throw b.create();
      } else {
         return $$3;
      }
   }

   public static iz b(CommandContext<ep> $$0, String $$1) {
      return ((gn)$$0.getArgument($$1, gn.class)).c((ep)$$0.getSource());
   }

   public static iz c(CommandContext<ep> $$0, String $$1) throws CommandSyntaxException {
      iz $$2 = b($$0, $$1);
      if (!dca.l($$2)) {
         throw c.create();
      } else {
         return $$2;
      }
   }

   public gn a(StringReader $$0) throws CommandSyntaxException {
      return (gn)($$0.canRead() && $$0.peek() == '^' ? go.a($$0) : gu.a($$0));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      if (!($$0.getSource() instanceof eu)) {
         return Suggestions.empty();
      } else {
         String $$2 = $$1.getRemaining();
         Collection<eu.b> $$3;
         if (!$$2.isEmpty() && $$2.charAt(0) == '^') {
            $$3 = Collections.singleton(eu.b.a);
         } else {
            $$3 = ((eu)$$0.getSource()).B();
         }

         return eu.a($$2, $$3, $$1, eq.a(this::a));
      }
   }

   public Collection<String> getExamples() {
      return d;
   }
}
