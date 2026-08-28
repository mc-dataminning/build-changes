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

public class go implements ArgumentType<gj> {
   private static final Collection<String> c = Arrays.asList("0 0 0", "~ ~ ~", "^ ^ ^", "^1 ^ ^-5", "0.1 -0.5 .9", "~0.5 ~1 ~-5");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xg.c("argument.pos3d.incomplete"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xg.c("argument.pos.mixed"));
   private final boolean d;

   public go(boolean $$0) {
      this.d = $$0;
   }

   public static go a() {
      return new go(true);
   }

   public static go a(boolean $$0) {
      return new go($$0);
   }

   public static fgc a(CommandContext<ek> $$0, String $$1) {
      return ((gj)$$0.getArgument($$1, gj.class)).a((ek)$$0.getSource());
   }

   public static gj b(CommandContext<ek> $$0, String $$1) {
      return (gj)$$0.getArgument($$1, gj.class);
   }

   public gj a(StringReader $$0) throws CommandSyntaxException {
      return (gj)($$0.canRead() && $$0.peek() == '^' ? gk.a($$0) : gq.a($$0, this.d));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      if (!($$0.getSource() instanceof ep)) {
         return Suggestions.empty();
      } else {
         String $$2 = $$1.getRemaining();
         Collection<ep.b> $$3;
         if (!$$2.isEmpty() && $$2.charAt(0) == '^') {
            $$3 = Collections.singleton(ep.b.a);
         } else {
            $$3 = ((ep)$$0.getSource()).B();
         }

         return ep.a($$2, $$3, $$1, el.a(this::a));
      }
   }

   public Collection<String> getExamples() {
      return c;
   }
}
