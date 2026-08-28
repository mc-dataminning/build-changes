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

public class gt implements ArgumentType<gv> {
   private static final Collection<String> d = Arrays.asList("0 0 0", "~ ~ ~", "^ ^ ^", "^1 ^ ^-5", "~0.5 ~1 ~-5");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wo.c("argument.pos.unloaded"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wo.c("argument.pos.outofworld"));
   public static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wo.c("argument.pos.outofbounds"));

   public static gt a() {
      return new gt();
   }

   public static ji a(CommandContext<ex> $$0, String $$1) throws CommandSyntaxException {
      arc $$2 = ((ex)$$0.getSource()).e();
      return a($$0, $$2, $$1);
   }

   public static ji a(CommandContext<ex> $$0, arc $$1, String $$2) throws CommandSyntaxException {
      ji $$3 = b($$0, $$2);
      if (!$$1.B($$3)) {
         throw a.create();
      } else if (!$$1.k($$3)) {
         throw b.create();
      } else {
         return $$3;
      }
   }

   public static ji b(CommandContext<ex> $$0, String $$1) {
      return ((gv)$$0.getArgument($$1, gv.class)).c((ex)$$0.getSource());
   }

   public static ji c(CommandContext<ex> $$0, String $$1) throws CommandSyntaxException {
      ji $$2 = b($$0, $$1);
      if (!dgi.l($$2)) {
         throw c.create();
      } else {
         return $$2;
      }
   }

   public gv a(StringReader $$0) throws CommandSyntaxException {
      return (gv)($$0.canRead() && $$0.peek() == '^' ? gw.a($$0) : hc.a($$0));
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

         return fc.a($$2, $$3, $$1, ey.a(this::a));
      }
   }

   public Collection<String> getExamples() {
      return d;
   }
}
