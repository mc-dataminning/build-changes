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

public class gm implements ArgumentType<go> {
   private static final Collection<String> d = Arrays.asList("0 0 0", "~ ~ ~", "^ ^ ^", "^1 ^ ^-5", "~0.5 ~1 ~-5");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wu.c("argument.pos.unloaded"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wu.c("argument.pos.outofworld"));
   public static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wu.c("argument.pos.outofbounds"));

   public static gm a() {
      return new gm();
   }

   public static ja a(CommandContext<eq> $$0, String $$1) throws CommandSyntaxException {
      aqm $$2 = ((eq)$$0.getSource()).e();
      return a($$0, $$2, $$1);
   }

   public static ja a(CommandContext<eq> $$0, aqm $$1, String $$2) throws CommandSyntaxException {
      ja $$3 = b($$0, $$2);
      if (!$$1.B($$3)) {
         throw a.create();
      } else if (!$$1.k($$3)) {
         throw b.create();
      } else {
         return $$3;
      }
   }

   public static ja b(CommandContext<eq> $$0, String $$1) {
      return ((go)$$0.getArgument($$1, go.class)).c((eq)$$0.getSource());
   }

   public static ja c(CommandContext<eq> $$0, String $$1) throws CommandSyntaxException {
      ja $$2 = b($$0, $$1);
      if (!dcg.l($$2)) {
         throw c.create();
      } else {
         return $$2;
      }
   }

   public go a(StringReader $$0) throws CommandSyntaxException {
      return (go)($$0.canRead() && $$0.peek() == '^' ? gp.a($$0) : gv.a($$0));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      if (!($$0.getSource() instanceof ev)) {
         return Suggestions.empty();
      } else {
         String $$2 = $$1.getRemaining();
         Collection<ev.b> $$3;
         if (!$$2.isEmpty() && $$2.charAt(0) == '^') {
            $$3 = Collections.singleton(ev.b.a);
         } else {
            $$3 = ((ev)$$0.getSource()).B();
         }

         return ev.a($$2, $$3, $$1, er.a(this::a));
      }
   }

   public Collection<String> getExamples() {
      return d;
   }
}
