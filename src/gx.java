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

public class gx implements ArgumentType<gt> {
   private static final Collection<String> b = Arrays.asList("0 0", "~ ~", "0.1 -0.5", "~1 ~-2");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xh.c("argument.pos2d.incomplete"));
   private final boolean c;

   public gx(boolean $$0) {
      this.c = $$0;
   }

   public static gx a() {
      return new gx(true);
   }

   public static gx a(boolean $$0) {
      return new gx($$0);
   }

   public static ezg a(CommandContext<ev> $$0, String $$1) {
      ezh $$2 = ((gt)$$0.getArgument($$1, gt.class)).a((ev)$$0.getSource());
      return new ezg((float)$$2.d, (float)$$2.f);
   }

   public gt a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      if (!$$0.canRead()) {
         throw a.createWithContext($$0);
      } else {
         gz $$2 = gz.a($$0, this.c);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            gz $$3 = gz.a($$0, this.c);
            return new ha($$2, new gz(true, 0.0), $$3);
         } else {
            $$0.setCursor($$1);
            throw a.createWithContext($$0);
         }
      }
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

         return fa.b($$2, $$3, $$1, ew.a(this::a));
      }
   }

   public Collection<String> getExamples() {
      return b;
   }
}
