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

public class fz implements ArgumentType<gb> {
   private static final Collection<String> d = Arrays.asList("0 0 0", "~ ~ ~", "^ ^ ^", "^1 ^ ^-5", "~0.5 ~1 ~-5");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wu.c("argument.pos.unloaded"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wu.c("argument.pos.outofworld"));
   public static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wu.c("argument.pos.outofbounds"));

   public static fz a() {
      return new fz();
   }

   public static in a(CommandContext<ed> $$0, String $$1) throws CommandSyntaxException {
      aqh $$2 = ((ed)$$0.getSource()).e();
      return a($$0, $$2, $$1);
   }

   public static in a(CommandContext<ed> $$0, aqh $$1, String $$2) throws CommandSyntaxException {
      in $$3 = b($$0, $$2);
      if (!$$1.B($$3)) {
         throw a.create();
      } else if (!$$1.k($$3)) {
         throw b.create();
      } else {
         return $$3;
      }
   }

   public static in b(CommandContext<ed> $$0, String $$1) {
      return ((gb)$$0.getArgument($$1, gb.class)).c((ed)$$0.getSource());
   }

   public static in c(CommandContext<ed> $$0, String $$1) throws CommandSyntaxException {
      in $$2 = b($$0, $$1);
      if (!dad.l($$2)) {
         throw c.create();
      } else {
         return $$2;
      }
   }

   public gb a(StringReader $$0) throws CommandSyntaxException {
      return (gb)($$0.canRead() && $$0.peek() == '^' ? gc.a($$0) : gi.a($$0));
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

         return ei.a($$2, $$3, $$1, ee.a(this::a));
      }
   }

   public Collection<String> getExamples() {
      return d;
   }
}
