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

public class gk implements ArgumentType<gf> {
   private static final Collection<String> c = Arrays.asList("0 0 0", "~ ~ ~", "^ ^ ^", "^1 ^ ^-5", "0.1 -0.5 .9", "~0.5 ~1 ~-5");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xe.c("argument.pos3d.incomplete"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xe.c("argument.pos.mixed"));
   private final boolean d;

   public gk(boolean $$0) {
      this.d = $$0;
   }

   public static gk a() {
      return new gk(true);
   }

   public static gk a(boolean $$0) {
      return new gk($$0);
   }

   public static ewu a(CommandContext<eh> $$0, String $$1) {
      return ((gf)$$0.getArgument($$1, gf.class)).a((eh)$$0.getSource());
   }

   public static gf b(CommandContext<eh> $$0, String $$1) {
      return (gf)$$0.getArgument($$1, gf.class);
   }

   public gf a(StringReader $$0) throws CommandSyntaxException {
      return (gf)($$0.canRead() && $$0.peek() == '^' ? gg.a($$0) : gm.a($$0, this.d));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      if (!($$0.getSource() instanceof em)) {
         return Suggestions.empty();
      } else {
         String $$2 = $$1.getRemaining();
         Collection<em.b> $$3;
         if (!$$2.isEmpty() && $$2.charAt(0) == '^') {
            $$3 = Collections.singleton(em.b.a);
         } else {
            $$3 = ((em)$$0.getSource()).C();
         }

         return em.a($$2, $$3, $$1, ei.a(this::a));
      }
   }

   public Collection<String> getExamples() {
      return c;
   }
}
