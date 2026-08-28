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

public class gw implements ArgumentType<gr> {
   private static final Collection<String> c = Arrays.asList("0 0 0", "~ ~ ~", "^ ^ ^", "^1 ^ ^-5", "0.1 -0.5 .9", "~0.5 ~1 ~-5");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wz.c("argument.pos3d.incomplete"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wz.c("argument.pos.mixed"));
   private final boolean d;

   public gw(boolean $$0) {
      this.d = $$0;
   }

   public static gw a() {
      return new gw(true);
   }

   public static gw a(boolean $$0) {
      return new gw($$0);
   }

   public static exa a(CommandContext<et> $$0, String $$1) {
      return ((gr)$$0.getArgument($$1, gr.class)).a((et)$$0.getSource());
   }

   public static gr b(CommandContext<et> $$0, String $$1) {
      return (gr)$$0.getArgument($$1, gr.class);
   }

   public gr a(StringReader $$0) throws CommandSyntaxException {
      return (gr)($$0.canRead() && $$0.peek() == '^' ? gs.a($$0) : gy.a($$0, this.d));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      if (!($$0.getSource() instanceof ey)) {
         return Suggestions.empty();
      } else {
         String $$2 = $$1.getRemaining();
         Collection<ey.b> $$3;
         if (!$$2.isEmpty() && $$2.charAt(0) == '^') {
            $$3 = Collections.singleton(ey.b.a);
         } else {
            $$3 = ((ey)$$0.getSource()).C();
         }

         return ey.a($$2, $$3, $$1, eu.a(this::a));
      }
   }

   public Collection<String> getExamples() {
      return c;
   }
}
