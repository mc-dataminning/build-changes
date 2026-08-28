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

public class gr implements ArgumentType<gt> {
   private static final Collection<String> d = Arrays.asList("0 0 0", "~ ~ ~", "^ ^ ^", "^1 ^ ^-5", "~0.5 ~1 ~-5");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xh.c("argument.pos.unloaded"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xh.c("argument.pos.outofworld"));
   public static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xh.c("argument.pos.outofbounds"));

   public static gr a() {
      return new gr();
   }

   public static jg a(CommandContext<ev> $$0, String $$1) throws CommandSyntaxException {
      arm $$2 = ((ev)$$0.getSource()).e();
      return a($$0, $$2, $$1);
   }

   public static jg a(CommandContext<ev> $$0, arm $$1, String $$2) throws CommandSyntaxException {
      jg $$3 = b($$0, $$2);
      if (!$$1.B($$3)) {
         throw a.create();
      } else if (!$$1.k($$3)) {
         throw b.create();
      } else {
         return $$3;
      }
   }

   public static jg b(CommandContext<ev> $$0, String $$1) {
      return ((gt)$$0.getArgument($$1, gt.class)).c((ev)$$0.getSource());
   }

   public static jg c(CommandContext<ev> $$0, String $$1) throws CommandSyntaxException {
      jg $$2 = b($$0, $$1);
      if (!dev.l($$2)) {
         throw c.create();
      } else {
         return $$2;
      }
   }

   public gt a(StringReader $$0) throws CommandSyntaxException {
      return (gt)($$0.canRead() && $$0.peek() == '^' ? gu.a($$0) : ha.a($$0));
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
            $$3 = ((fa)$$0.getSource()).B();
         }

         return fa.a($$2, $$3, $$1, ew.a(this::a));
      }
   }

   public Collection<String> getExamples() {
      return d;
   }
}
