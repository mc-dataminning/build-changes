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

public class gd implements ArgumentType<gf> {
   private static final Collection<String> d = Arrays.asList("0 0 0", "~ ~ ~", "^ ^ ^", "^1 ^ ^-5", "~0.5 ~1 ~-5");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xe.c("argument.pos.unloaded"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xe.c("argument.pos.outofworld"));
   public static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xe.c("argument.pos.outofbounds"));

   public static gd a() {
      return new gd();
   }

   public static ir a(CommandContext<eh> $$0, String $$1) throws CommandSyntaxException {
      aqt $$2 = ((eh)$$0.getSource()).e();
      return a($$0, $$2, $$1);
   }

   public static ir a(CommandContext<eh> $$0, aqt $$1, String $$2) throws CommandSyntaxException {
      ir $$3 = b($$0, $$2);
      if (!$$1.B($$3)) {
         throw a.create();
      } else if (!$$1.k($$3)) {
         throw b.create();
      } else {
         return $$3;
      }
   }

   public static ir b(CommandContext<eh> $$0, String $$1) {
      return ((gf)$$0.getArgument($$1, gf.class)).c((eh)$$0.getSource());
   }

   public static ir c(CommandContext<eh> $$0, String $$1) throws CommandSyntaxException {
      ir $$2 = b($$0, $$1);
      if (!dca.l($$2)) {
         throw c.create();
      } else {
         return $$2;
      }
   }

   public gf a(StringReader $$0) throws CommandSyntaxException {
      return (gf)($$0.canRead() && $$0.peek() == '^' ? gg.a($$0) : gm.a($$0));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      if (!($$0.getSource() instanceof em)) {
         return Suggestions.empty();
      } else {
         String $$2 = $$1.getRemaining();
         Collection<em.b> $$3;
         if (!$$2.isEmpty() && $$2.charAt(0) == '^') {
            $$3 = Collections.singleton(em.b.a);
         } else {
            $$3 = ((em)$$0.getSource()).B();
         }

         return em.a($$2, $$3, $$1, ei.a(this::a));
      }
   }

   public Collection<String> getExamples() {
      return d;
   }
}
