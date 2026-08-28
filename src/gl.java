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

public class gl implements ArgumentType<gh> {
   private static final Collection<String> b = Arrays.asList("0 0", "~ ~", "0.1 -0.5", "~1 ~-2");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wy.c("argument.pos2d.incomplete"));
   private final boolean c;

   public gl(boolean $$0) {
      this.c = $$0;
   }

   public static gl a() {
      return new gl(true);
   }

   public static gl a(boolean $$0) {
      return new gl($$0);
   }

   public static feh a(CommandContext<ei> $$0, String $$1) {
      fei $$2 = ((gh)$$0.getArgument($$1, gh.class)).a((ei)$$0.getSource());
      return new feh((float)$$2.d, (float)$$2.f);
   }

   public gh a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      if (!$$0.canRead()) {
         throw a.createWithContext($$0);
      } else {
         gn $$2 = gn.a($$0, this.c);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            gn $$3 = gn.a($$0, this.c);
            return new go($$2, new gn(true, 0.0), $$3);
         } else {
            $$0.setCursor($$1);
            throw a.createWithContext($$0);
         }
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      if (!($$0.getSource() instanceof en)) {
         return Suggestions.empty();
      } else {
         String $$2 = $$1.getRemaining();
         Collection<en.b> $$3;
         if (!$$2.isEmpty() && $$2.charAt(0) == '^') {
            $$3 = Collections.singleton(en.b.a);
         } else {
            $$3 = ((en)$$0.getSource()).B();
         }

         return en.b($$2, $$3, $$1, ej.a(this::a));
      }
   }

   public Collection<String> getExamples() {
      return b;
   }
}
