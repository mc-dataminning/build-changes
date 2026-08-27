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

public class gh implements ArgumentType<gc> {
   private static final Collection<String> c = Arrays.asList("0 0 0", "~ ~ ~", "^ ^ ^", "^1 ^ ^-5", "0.1 -0.5 .9", "~0.5 ~1 ~-5");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wx.c("argument.pos3d.incomplete"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wx.c("argument.pos.mixed"));
   private final boolean d;

   public gh(boolean $$0) {
      this.d = $$0;
   }

   public static gh a() {
      return new gh(true);
   }

   public static gh a(boolean $$0) {
      return new gh($$0);
   }

   public static eum a(CommandContext<ee> $$0, String $$1) {
      return ((gc)$$0.getArgument($$1, gc.class)).a((ee)$$0.getSource());
   }

   public static gc b(CommandContext<ee> $$0, String $$1) {
      return (gc)$$0.getArgument($$1, gc.class);
   }

   public gc a(StringReader $$0) throws CommandSyntaxException {
      return (gc)($$0.canRead() && $$0.peek() == '^' ? gd.a($$0) : gj.a($$0, this.d));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      if (!($$0.getSource() instanceof ej)) {
         return Suggestions.empty();
      } else {
         String $$2 = $$1.getRemaining();
         Collection<ej.b> $$3;
         if (!$$2.isEmpty() && $$2.charAt(0) == '^') {
            $$3 = Collections.singleton(ej.b.a);
         } else {
            $$3 = ((ej)$$0.getSource()).C();
         }

         return ej.a($$2, $$3, $$1, ef.a(this::a));
      }
   }

   public Collection<String> getExamples() {
      return c;
   }
}
