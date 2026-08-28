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

public class gz implements ArgumentType<gv> {
   private static final Collection<String> b = Arrays.asList("0 0", "~ ~", "0.1 -0.5", "~1 ~-2");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wp.c("argument.pos2d.incomplete"));
   private final boolean c;

   public gz(boolean $$0) {
      this.c = $$0;
   }

   public static gz a() {
      return new gz(true);
   }

   public static gz a(boolean $$0) {
      return new gz($$0);
   }

   public static fbw a(CommandContext<ex> $$0, String $$1) {
      fbx $$2 = ((gv)$$0.getArgument($$1, gv.class)).a((ex)$$0.getSource());
      return new fbw((float)$$2.d, (float)$$2.f);
   }

   public gv a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      if (!$$0.canRead()) {
         throw a.createWithContext($$0);
      } else {
         hb $$2 = hb.a($$0, this.c);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            hb $$3 = hb.a($$0, this.c);
            return new hc($$2, new hb(true, 0.0), $$3);
         } else {
            $$0.setCursor($$1);
            throw a.createWithContext($$0);
         }
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      if (!($$0.getSource() instanceof fc)) {
         return Suggestions.empty();
      } else {
         String $$2 = $$1.getRemaining();
         Collection<fc.b> $$3;
         if (!$$2.isEmpty() && $$2.charAt(0) == '^') {
            $$3 = Collections.singleton(fc.b.a);
         } else {
            $$3 = ((fc)$$0.getSource()).B();
         }

         return fc.b($$2, $$3, $$1, ey.a(this::a));
      }
   }

   public Collection<String> getExamples() {
      return b;
   }
}
