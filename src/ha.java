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

public class ha implements ArgumentType<gv> {
   private static final Collection<String> c = Arrays.asList("0 0 0", "~ ~ ~", "^ ^ ^", "^1 ^ ^-5", "0.1 -0.5 .9", "~0.5 ~1 ~-5");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wp.c("argument.pos3d.incomplete"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wp.c("argument.pos.mixed"));
   private final boolean d;

   public ha(boolean $$0) {
      this.d = $$0;
   }

   public static ha a() {
      return new ha(true);
   }

   public static ha a(boolean $$0) {
      return new ha($$0);
   }

   public static fbx a(CommandContext<ex> $$0, String $$1) {
      return ((gv)$$0.getArgument($$1, gv.class)).a((ex)$$0.getSource());
   }

   public static gv b(CommandContext<ex> $$0, String $$1) {
      return (gv)$$0.getArgument($$1, gv.class);
   }

   public gv a(StringReader $$0) throws CommandSyntaxException {
      return (gv)($$0.canRead() && $$0.peek() == '^' ? gw.a($$0) : hc.a($$0, this.d));
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
