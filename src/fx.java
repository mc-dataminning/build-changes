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

public class fx implements ArgumentType<fz> {
   private static final Collection<String> d = Arrays.asList("0 0 0", "~ ~ ~", "^ ^ ^", "^1 ^ ^-5", "~0.5 ~1 ~-5");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(ws.c("argument.pos.unloaded"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(ws.c("argument.pos.outofworld"));
   public static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(ws.c("argument.pos.outofbounds"));

   public static fx a() {
      return new fx();
   }

   public static im a(CommandContext<ec> $$0, String $$1) throws CommandSyntaxException {
      aqe $$2 = ((ec)$$0.getSource()).e();
      return a($$0, $$2, $$1);
   }

   public static im a(CommandContext<ec> $$0, aqe $$1, String $$2) throws CommandSyntaxException {
      im $$3 = b($$0, $$2);
      if (!$$1.B($$3)) {
         throw a.create();
      } else if (!$$1.k($$3)) {
         throw b.create();
      } else {
         return $$3;
      }
   }

   public static im b(CommandContext<ec> $$0, String $$1) {
      return ((fz)$$0.getArgument($$1, fz.class)).c((ec)$$0.getSource());
   }

   public static im c(CommandContext<ec> $$0, String $$1) throws CommandSyntaxException {
      im $$2 = b($$0, $$1);
      if (!czu.l($$2)) {
         throw c.create();
      } else {
         return $$2;
      }
   }

   public fz a(StringReader $$0) throws CommandSyntaxException {
      return (fz)($$0.canRead() && $$0.peek() == '^' ? ga.a($$0) : gg.a($$0));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      if (!($$0.getSource() instanceof eh)) {
         return Suggestions.empty();
      } else {
         String $$2 = $$1.getRemaining();
         Collection<eh.b> $$3;
         if (!$$2.isEmpty() && $$2.charAt(0) == '^') {
            $$3 = Collections.singleton(eh.b.a);
         } else {
            $$3 = ((eh)$$0.getSource()).B();
         }

         return eh.a($$2, $$3, $$1, ed.a(this::a));
      }
   }

   public Collection<String> getExamples() {
      return d;
   }
}
