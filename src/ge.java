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

public class ge implements ArgumentType<fz> {
   private static final Collection<String> c = Arrays.asList("0 0 0", "~ ~ ~", "^ ^ ^", "^1 ^ ^-5", "0.1 -0.5 .9", "~0.5 ~1 ~-5");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(ws.c("argument.pos3d.incomplete"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(ws.c("argument.pos.mixed"));
   private final boolean d;

   public ge(boolean $$0) {
      this.d = $$0;
   }

   public static ge a() {
      return new ge(true);
   }

   public static ge a(boolean $$0) {
      return new ge($$0);
   }

   public static etf a(CommandContext<ec> $$0, String $$1) {
      return ((fz)$$0.getArgument($$1, fz.class)).a((ec)$$0.getSource());
   }

   public static fz b(CommandContext<ec> $$0, String $$1) {
      return (fz)$$0.getArgument($$1, fz.class);
   }

   public fz a(StringReader $$0) throws CommandSyntaxException {
      return (fz)($$0.canRead() && $$0.peek() == '^' ? ga.a($$0) : gg.a($$0, this.d));
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
            $$3 = ((eh)$$0.getSource()).C();
         }

         return eh.a($$2, $$3, $$1, ed.a(this::a));
      }
   }

   public Collection<String> getExamples() {
      return c;
   }
}
