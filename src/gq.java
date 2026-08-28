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

public class gq implements ArgumentType<gs> {
   private static final Collection<String> d = Arrays.asList("0 0 0", "~ ~ ~", "^ ^ ^", "^1 ^ ^-5", "~0.5 ~1 ~-5");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xe.c("argument.pos.unloaded"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xe.c("argument.pos.outofworld"));
   public static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xe.c("argument.pos.outofbounds"));

   public static gq a() {
      return new gq();
   }

   public static jf a(CommandContext<eu> $$0, String $$1) throws CommandSyntaxException {
      arj $$2 = ((eu)$$0.getSource()).e();
      return a($$0, $$2, $$1);
   }

   public static jf a(CommandContext<eu> $$0, arj $$1, String $$2) throws CommandSyntaxException {
      jf $$3 = b($$0, $$2);
      if (!$$1.B($$3)) {
         throw a.create();
      } else if (!$$1.k($$3)) {
         throw b.create();
      } else {
         return $$3;
      }
   }

   public static jf b(CommandContext<eu> $$0, String $$1) {
      return ((gs)$$0.getArgument($$1, gs.class)).c((eu)$$0.getSource());
   }

   public static jf c(CommandContext<eu> $$0, String $$1) throws CommandSyntaxException {
      jf $$2 = b($$0, $$1);
      if (!dej.l($$2)) {
         throw c.create();
      } else {
         return $$2;
      }
   }

   public gs a(StringReader $$0) throws CommandSyntaxException {
      return (gs)($$0.canRead() && $$0.peek() == '^' ? gt.a($$0) : gz.a($$0));
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

         return ez.a($$2, $$3, $$1, ev.a(this::a));
      }
   }

   public Collection<String> getExamples() {
      return d;
   }
}
