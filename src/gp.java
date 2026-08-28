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

public class gp implements ArgumentType<gr> {
   private static final Collection<String> d = Arrays.asList("0 0 0", "~ ~ ~", "^ ^ ^", "^1 ^ ^-5", "~0.5 ~1 ~-5");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wz.c("argument.pos.unloaded"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wz.c("argument.pos.outofworld"));
   public static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wz.c("argument.pos.outofbounds"));

   public static gp a() {
      return new gp();
   }

   public static jd a(CommandContext<et> $$0, String $$1) throws CommandSyntaxException {
      aqu $$2 = ((et)$$0.getSource()).e();
      return a($$0, $$2, $$1);
   }

   public static jd a(CommandContext<et> $$0, aqu $$1, String $$2) throws CommandSyntaxException {
      jd $$3 = b($$0, $$2);
      if (!$$1.B($$3)) {
         throw a.create();
      } else if (!$$1.k($$3)) {
         throw b.create();
      } else {
         return $$3;
      }
   }

   public static jd b(CommandContext<et> $$0, String $$1) {
      return ((gr)$$0.getArgument($$1, gr.class)).c((et)$$0.getSource());
   }

   public static jd c(CommandContext<et> $$0, String $$1) throws CommandSyntaxException {
      jd $$2 = b($$0, $$1);
      if (!dcw.l($$2)) {
         throw c.create();
      } else {
         return $$2;
      }
   }

   public gr a(StringReader $$0) throws CommandSyntaxException {
      return (gr)($$0.canRead() && $$0.peek() == '^' ? gs.a($$0) : gy.a($$0));
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

         return ey.a($$2, $$3, $$1, eu.a(this::a));
      }
   }

   public Collection<String> getExamples() {
      return d;
   }
}
