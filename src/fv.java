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

public class fv implements ArgumentType<fq> {
   private static final Collection<String> c = Arrays.asList("0 0 0", "~ ~ ~", "^ ^ ^", "^1 ^ ^-5", "0.1 -0.5 .9", "~0.5 ~1 ~-5");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vq.c("argument.pos3d.incomplete"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(vq.c("argument.pos.mixed"));
   private final boolean d;

   public fv(boolean $$0) {
      this.d = $$0;
   }

   public static fv a() {
      return new fv(true);
   }

   public static fv a(boolean $$0) {
      return new fv($$0);
   }

   public static ens a(CommandContext<du> $$0, String $$1) {
      return ((fq)$$0.getArgument($$1, fq.class)).a((du)$$0.getSource());
   }

   public static fq b(CommandContext<du> $$0, String $$1) {
      return (fq)$$0.getArgument($$1, fq.class);
   }

   public fq a(StringReader $$0) throws CommandSyntaxException {
      return (fq)($$0.canRead() && $$0.peek() == '^' ? fr.a($$0) : fx.a($$0, this.d));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      if (!($$0.getSource() instanceof dz)) {
         return Suggestions.empty();
      } else {
         String $$2 = $$1.getRemaining();
         Collection<dz.b> $$3;
         if (!$$2.isEmpty() && $$2.charAt(0) == '^') {
            $$3 = Collections.singleton(dz.b.a);
         } else {
            $$3 = ((dz)$$0.getSource()).C();
         }

         return dz.a($$2, $$3, $$1, dv.a(this::a));
      }
   }

   public Collection<String> getExamples() {
      return c;
   }
}
