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

public class gz implements ArgumentType<gu> {
   private static final Collection<String> c = Arrays.asList("0 0 0", "~ ~ ~", "^ ^ ^", "^1 ^ ^-5", "0.1 -0.5 .9", "~0.5 ~1 ~-5");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xi.c("argument.pos3d.incomplete"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xi.c("argument.pos.mixed"));
   private final boolean d;

   public gz(boolean $$0) {
      this.d = $$0;
   }

   public static gz a() {
      return new gz(true);
   }

   public static gz a(boolean $$0) {
      return new gz($$0);
   }

   public static ezn a(CommandContext<ew> $$0, String $$1) {
      return ((gu)$$0.getArgument($$1, gu.class)).a((ew)$$0.getSource());
   }

   public static gu b(CommandContext<ew> $$0, String $$1) {
      return (gu)$$0.getArgument($$1, gu.class);
   }

   public gu a(StringReader $$0) throws CommandSyntaxException {
      return (gu)($$0.canRead() && $$0.peek() == '^' ? gv.a($$0) : hb.a($$0, this.d));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      if (!($$0.getSource() instanceof fb)) {
         return Suggestions.empty();
      } else {
         String $$2 = $$1.getRemaining();
         Collection<fb.b> $$3;
         if (!$$2.isEmpty() && $$2.charAt(0) == '^') {
            $$3 = Collections.singleton(fb.b.a);
         } else {
            $$3 = ((fb)$$0.getSource()).C();
         }

         return fb.a($$2, $$3, $$1, ex.a(this::a));
      }
   }

   public Collection<String> getExamples() {
      return c;
   }
}
