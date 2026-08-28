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

public class gx implements ArgumentType<gs> {
   private static final Collection<String> c = Arrays.asList("0 0 0", "~ ~ ~", "^ ^ ^", "^1 ^ ^-5", "0.1 -0.5 .9", "~0.5 ~1 ~-5");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xe.c("argument.pos3d.incomplete"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xe.c("argument.pos.mixed"));
   private final boolean d;

   public gx(boolean $$0) {
      this.d = $$0;
   }

   public static gx a() {
      return new gx(true);
   }

   public static gx a(boolean $$0) {
      return new gx($$0);
   }

   public static eyw a(CommandContext<eu> $$0, String $$1) {
      return ((gs)$$0.getArgument($$1, gs.class)).a((eu)$$0.getSource());
   }

   public static gs b(CommandContext<eu> $$0, String $$1) {
      return (gs)$$0.getArgument($$1, gs.class);
   }

   public gs a(StringReader $$0) throws CommandSyntaxException {
      return (gs)($$0.canRead() && $$0.peek() == '^' ? gt.a($$0) : gz.a($$0, this.d));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      if (!($$0.getSource() instanceof ez)) {
         return Suggestions.empty();
      } else {
         String $$2 = $$1.getRemaining();
         Collection<ez.b> $$3;
         if (!$$2.isEmpty() && $$2.charAt(0) == '^') {
            $$3 = Collections.singleton(ez.b.a);
         } else {
            $$3 = ((ez)$$0.getSource()).C();
         }

         return ez.a($$2, $$3, $$1, ev.a(this::a));
      }
   }

   public Collection<String> getExamples() {
      return c;
   }
}
