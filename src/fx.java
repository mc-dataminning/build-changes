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

public class fx implements ArgumentType<fs> {
   private static final Collection<String> c = Arrays.asList("0 0 0", "~ ~ ~", "^ ^ ^", "^1 ^ ^-5", "0.1 -0.5 .9", "~0.5 ~1 ~-5");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wi.c("argument.pos3d.incomplete"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wi.c("argument.pos.mixed"));
   private final boolean d;

   public fx(boolean $$0) {
      this.d = $$0;
   }

   public static fx a() {
      return new fx(true);
   }

   public static fx a(boolean $$0) {
      return new fx($$0);
   }

   public static esj a(CommandContext<dv> $$0, String $$1) {
      return ((fs)$$0.getArgument($$1, fs.class)).a((dv)$$0.getSource());
   }

   public static fs b(CommandContext<dv> $$0, String $$1) {
      return (fs)$$0.getArgument($$1, fs.class);
   }

   public fs a(StringReader $$0) throws CommandSyntaxException {
      return (fs)($$0.canRead() && $$0.peek() == '^' ? ft.a($$0) : fz.a($$0, this.d));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      if (!($$0.getSource() instanceof ea)) {
         return Suggestions.empty();
      } else {
         String $$2 = $$1.getRemaining();
         Collection<ea.b> $$3;
         if (!$$2.isEmpty() && $$2.charAt(0) == '^') {
            $$3 = Collections.singleton(ea.b.a);
         } else {
            $$3 = ((ea)$$0.getSource()).C();
         }

         return ea.a($$2, $$3, $$1, dw.a(this::a));
      }
   }

   public Collection<String> getExamples() {
      return c;
   }
}
