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

public class gf implements ArgumentType<gh> {
   private static final Collection<String> d = Arrays.asList("0 0 0", "~ ~ ~", "^ ^ ^", "^1 ^ ^-5", "~0.5 ~1 ~-5");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(ww.c("argument.pos.unloaded"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(ww.c("argument.pos.outofworld"));
   public static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(ww.c("argument.pos.outofbounds"));

   public static gf a() {
      return new gf();
   }

   public static iu a(CommandContext<ei> $$0, String $$1) throws CommandSyntaxException {
      aro $$2 = ((ei)$$0.getSource()).e();
      return a($$0, $$2, $$1);
   }

   public static iu a(CommandContext<ei> $$0, aro $$1, String $$2) throws CommandSyntaxException {
      iu $$3 = b($$0, $$2);
      if (!$$1.C($$3)) {
         throw a.create();
      } else if (!$$1.k($$3)) {
         throw b.create();
      } else {
         return $$3;
      }
   }

   public static iu b(CommandContext<ei> $$0, String $$1) {
      return ((gh)$$0.getArgument($$1, gh.class)).c((ei)$$0.getSource());
   }

   public static iu c(CommandContext<ei> $$0, String $$1) throws CommandSyntaxException {
      iu $$2 = b($$0, $$1);
      if (!dip.l($$2)) {
         throw c.create();
      } else {
         return $$2;
      }
   }

   public gh a(StringReader $$0) throws CommandSyntaxException {
      return (gh)($$0.canRead() && $$0.peek() == '^' ? gi.a($$0) : go.a($$0));
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
            $$3 = ((en)$$0.getSource()).A();
         }

         return en.a($$2, $$3, $$1, ej.a(this::a));
      }
   }

   public Collection<String> getExamples() {
      return d;
   }
}
