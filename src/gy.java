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

public class gy implements ArgumentType<gt> {
   private static final Collection<String> c = Arrays.asList("0 0 0", "~ ~ ~", "^ ^ ^", "^1 ^ ^-5", "0.1 -0.5 .9", "~0.5 ~1 ~-5");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xh.c("argument.pos3d.incomplete"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xh.c("argument.pos.mixed"));
   private final boolean d;

   public gy(boolean $$0) {
      this.d = $$0;
   }

   public static gy a() {
      return new gy(true);
   }

   public static gy a(boolean $$0) {
      return new gy($$0);
   }

   public static ezh a(CommandContext<ev> $$0, String $$1) {
      return ((gt)$$0.getArgument($$1, gt.class)).a((ev)$$0.getSource());
   }

   public static gt b(CommandContext<ev> $$0, String $$1) {
      return (gt)$$0.getArgument($$1, gt.class);
   }

   public gt a(StringReader $$0) throws CommandSyntaxException {
      return (gt)($$0.canRead() && $$0.peek() == '^' ? gu.a($$0) : ha.a($$0, this.d));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      if (!($$0.getSource() instanceof fa)) {
         return Suggestions.empty();
      } else {
         String $$2 = $$1.getRemaining();
         Collection<fa.b> $$3;
         if (!$$2.isEmpty() && $$2.charAt(0) == '^') {
            $$3 = Collections.singleton(fa.b.a);
         } else {
            $$3 = ((fa)$$0.getSource()).C();
         }

         return fa.a($$2, $$3, $$1, ew.a(this::a));
      }
   }

   public Collection<String> getExamples() {
      return c;
   }
}
