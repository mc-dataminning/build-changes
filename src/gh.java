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

public class gh implements ArgumentType<gj> {
   private static final Collection<String> d = Arrays.asList("0 0 0", "~ ~ ~", "^ ^ ^", "^1 ^ ^-5", "~0.5 ~1 ~-5");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xc.c("argument.pos.unloaded"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xc.c("argument.pos.outofworld"));
   public static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xc.c("argument.pos.outofbounds"));

   public static gh a() {
      return new gh();
   }

   public static iw a(CommandContext<ek> $$0, String $$1) throws CommandSyntaxException {
      aru $$2 = ((ek)$$0.getSource()).e();
      return a($$0, $$2, $$1);
   }

   public static iw a(CommandContext<ek> $$0, aru $$1, String $$2) throws CommandSyntaxException {
      iw $$3 = b($$0, $$2);
      if (!$$1.C($$3)) {
         throw a.create();
      } else if (!$$1.k($$3)) {
         throw b.create();
      } else {
         return $$3;
      }
   }

   public static iw b(CommandContext<ek> $$0, String $$1) {
      return ((gj)$$0.getArgument($$1, gj.class)).c((ek)$$0.getSource());
   }

   public static iw c(CommandContext<ek> $$0, String $$1) throws CommandSyntaxException {
      iw $$2 = b($$0, $$1);
      if (!djz.l($$2)) {
         throw c.create();
      } else {
         return $$2;
      }
   }

   public gj a(StringReader $$0) throws CommandSyntaxException {
      return (gj)($$0.canRead() && $$0.peek() == '^' ? gk.a($$0) : gq.a($$0));
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

         return ep.a($$2, $$3, $$1, el.a(this::a));
      }
   }

   public Collection<String> getExamples() {
      return d;
   }
}
