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

public class gn implements ArgumentType<gi> {
   private static final Collection<String> c = Arrays.asList("0 0 0", "~ ~ ~", "^ ^ ^", "^1 ^ ^-5", "0.1 -0.5 .9", "~0.5 ~1 ~-5");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wy.c("argument.pos3d.incomplete"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wy.c("argument.pos.mixed"));
   private final boolean d;

   public gn(boolean $$0) {
      this.d = $$0;
   }

   public static gn a() {
      return new gn(true);
   }

   public static gn a(boolean $$0) {
      return new gn($$0);
   }

   public static ffc a(CommandContext<ej> $$0, String $$1) {
      return ((gi)$$0.getArgument($$1, gi.class)).a((ej)$$0.getSource());
   }

   public static gi b(CommandContext<ej> $$0, String $$1) {
      return (gi)$$0.getArgument($$1, gi.class);
   }

   public gi a(StringReader $$0) throws CommandSyntaxException {
      return (gi)($$0.canRead() && $$0.peek() == '^' ? gj.a($$0) : gp.a($$0, this.d));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      if (!($$0.getSource() instanceof eo)) {
         return Suggestions.empty();
      } else {
         String $$2 = $$1.getRemaining();
         Collection<eo.b> $$3;
         if (!$$2.isEmpty() && $$2.charAt(0) == '^') {
            $$3 = Collections.singleton(eo.b.a);
         } else {
            $$3 = ((eo)$$0.getSource()).B();
         }

         return eo.a($$2, $$3, $$1, ek.a(this::a));
      }
   }

   public Collection<String> getExamples() {
      return c;
   }
}
