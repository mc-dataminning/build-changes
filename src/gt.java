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

public class gt implements ArgumentType<go> {
   private static final Collection<String> c = Arrays.asList("0 0 0", "~ ~ ~", "^ ^ ^", "^1 ^ ^-5", "0.1 -0.5 .9", "~0.5 ~1 ~-5");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wu.c("argument.pos3d.incomplete"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wu.c("argument.pos.mixed"));
   private final boolean d;

   public gt(boolean $$0) {
      this.d = $$0;
   }

   public static gt a() {
      return new gt(true);
   }

   public static gt a(boolean $$0) {
      return new gt($$0);
   }

   public static ewf a(CommandContext<eq> $$0, String $$1) {
      return ((go)$$0.getArgument($$1, go.class)).a((eq)$$0.getSource());
   }

   public static go b(CommandContext<eq> $$0, String $$1) {
      return (go)$$0.getArgument($$1, go.class);
   }

   public go a(StringReader $$0) throws CommandSyntaxException {
      return (go)($$0.canRead() && $$0.peek() == '^' ? gp.a($$0) : gv.a($$0, this.d));
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
            $$3 = ((ev)$$0.getSource()).C();
         }

         return ev.a($$2, $$3, $$1, er.a(this::a));
      }
   }

   public Collection<String> getExamples() {
      return c;
   }
}
