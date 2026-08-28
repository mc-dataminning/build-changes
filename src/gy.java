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

public class gy implements ArgumentType<gu> {
   private static final Collection<String> b = Arrays.asList("0 0", "~ ~", "0.1 -0.5", "~1 ~-2");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xv.c("argument.pos2d.incomplete"));
   private final boolean c;

   public gy(boolean $$0) {
      this.c = $$0;
   }

   public static gy a() {
      return new gy(true);
   }

   public static gy a(boolean $$0) {
      return new gy($$0);
   }

   public static fbx a(CommandContext<ew> $$0, String $$1) {
      fby $$2 = ((gu)$$0.getArgument($$1, gu.class)).a((ew)$$0.getSource());
      return new fbx((float)$$2.d, (float)$$2.f);
   }

   public gu a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      if (!$$0.canRead()) {
         throw a.createWithContext($$0);
      } else {
         ha $$2 = ha.a($$0, this.c);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            ha $$3 = ha.a($$0, this.c);
            return new hb($$2, new ha(true, 0.0), $$3);
         } else {
            $$0.setCursor($$1);
            throw a.createWithContext($$0);
         }
      }
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
            $$3 = ((fb)$$0.getSource()).B();
         }

         return fb.b($$2, $$3, $$1, ex.a(this::a));
      }
   }

   public Collection<String> getExamples() {
      return b;
   }
}
