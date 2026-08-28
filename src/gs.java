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

public class gs implements ArgumentType<gn> {
   private static final Collection<String> c = Arrays.asList("0 0 0", "~ ~ ~", "^ ^ ^", "^1 ^ ^-5", "0.1 -0.5 .9", "~0.5 ~1 ~-5");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xp.c("argument.pos3d.incomplete"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xp.c("argument.pos.mixed"));
   private final boolean d;

   public gs(boolean $$0) {
      this.d = $$0;
   }

   public static gs a() {
      return new gs(true);
   }

   public static gs a(boolean $$0) {
      return new gs($$0);
   }

   public static evt a(CommandContext<ep> $$0, String $$1) {
      return ((gn)$$0.getArgument($$1, gn.class)).a((ep)$$0.getSource());
   }

   public static gn b(CommandContext<ep> $$0, String $$1) {
      return (gn)$$0.getArgument($$1, gn.class);
   }

   public gn a(StringReader $$0) throws CommandSyntaxException {
      return (gn)($$0.canRead() && $$0.peek() == '^' ? go.a($$0) : gu.a($$0, this.d));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      if (!($$0.getSource() instanceof eu)) {
         return Suggestions.empty();
      } else {
         String $$2 = $$1.getRemaining();
         Collection<eu.b> $$3;
         if (!$$2.isEmpty() && $$2.charAt(0) == '^') {
            $$3 = Collections.singleton(eu.b.a);
         } else {
            $$3 = ((eu)$$0.getSource()).C();
         }

         return eu.a($$2, $$3, $$1, eq.a(this::a));
      }
   }

   public Collection<String> getExamples() {
      return c;
   }
}
