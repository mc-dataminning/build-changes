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

public class gs implements ArgumentType<gu> {
   private static final Collection<String> d = Arrays.asList("0 0 0", "~ ~ ~", "^ ^ ^", "^1 ^ ^-5", "~0.5 ~1 ~-5");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xl.c("argument.pos.unloaded"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xl.c("argument.pos.outofworld"));
   public static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xl.c("argument.pos.outofbounds"));

   public static gs a() {
      return new gs();
   }

   public static jh a(CommandContext<ew> $$0, String $$1) throws CommandSyntaxException {
      arq $$2 = ((ew)$$0.getSource()).e();
      return a($$0, $$2, $$1);
   }

   public static jh a(CommandContext<ew> $$0, arq $$1, String $$2) throws CommandSyntaxException {
      jh $$3 = b($$0, $$2);
      if (!$$1.B($$3)) {
         throw a.create();
      } else if (!$$1.k($$3)) {
         throw b.create();
      } else {
         return $$3;
      }
   }

   public static jh b(CommandContext<ew> $$0, String $$1) {
      return ((gu)$$0.getArgument($$1, gu.class)).c((ew)$$0.getSource());
   }

   public static jh c(CommandContext<ew> $$0, String $$1) throws CommandSyntaxException {
      jh $$2 = b($$0, $$1);
      if (!dff.l($$2)) {
         throw c.create();
      } else {
         return $$2;
      }
   }

   public gu a(StringReader $$0) throws CommandSyntaxException {
      return (gu)($$0.canRead() && $$0.peek() == '^' ? gv.a($$0) : hb.a($$0));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      if (!($$0.getSource() instanceof fb)) {
         return Suggestions.empty();
      } else {
         String $$2 = $$1.getRemaining();
         Collection<fb.b> $$3;
         if (!$$2.isEmpty() && $$2.charAt(0) == '^') {
            $$3 = Collections.singleton(fb.b.a);
         } else {
            $$3 = ((fb)$$0.getSource()).B();
         }

         return fb.a($$2, $$3, $$1, ex.a(this::a));
      }
   }

   public Collection<String> getExamples() {
      return d;
   }
}
