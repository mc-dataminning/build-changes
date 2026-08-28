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

public class hb implements ArgumentType<gw> {
   private static final Collection<String> c = Arrays.asList("0 0 0", "~ ~ ~", "^ ^ ^", "^1 ^ ^-5", "0.1 -0.5 .9", "~0.5 ~1 ~-5");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wv.c("argument.pos3d.incomplete"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wv.c("argument.pos.mixed"));
   private final boolean d;

   public hb(boolean $$0) {
      this.d = $$0;
   }

   public static hb a() {
      return new hb(true);
   }

   public static hb a(boolean $$0) {
      return new hb($$0);
   }

   public static fcu a(CommandContext<ex> $$0, String $$1) {
      return ((gw)$$0.getArgument($$1, gw.class)).a((ex)$$0.getSource());
   }

   public static gw b(CommandContext<ex> $$0, String $$1) {
      return (gw)$$0.getArgument($$1, gw.class);
   }

   public gw a(StringReader $$0) throws CommandSyntaxException {
      return (gw)($$0.canRead() && $$0.peek() == '^' ? gx.a($$0) : hd.a($$0, this.d));
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

         return fc.a($$2, $$3, $$1, ey.a(this::a));
      }
   }

   public Collection<String> getExamples() {
      return c;
   }
}
