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

public class ga implements ArgumentType<gc> {
   private static final Collection<String> d = Arrays.asList("0 0 0", "~ ~ ~", "^ ^ ^", "^1 ^ ^-5", "~0.5 ~1 ~-5");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wx.c("argument.pos.unloaded"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wx.c("argument.pos.outofworld"));
   public static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wx.c("argument.pos.outofbounds"));

   public static ga a() {
      return new ga();
   }

   public static io a(CommandContext<ee> $$0, String $$1) throws CommandSyntaxException {
      aqn $$2 = ((ee)$$0.getSource()).e();
      return a($$0, $$2, $$1);
   }

   public static io a(CommandContext<ee> $$0, aqn $$1, String $$2) throws CommandSyntaxException {
      io $$3 = b($$0, $$2);
      if (!$$1.B($$3)) {
         throw a.create();
      } else if (!$$1.k($$3)) {
         throw b.create();
      } else {
         return $$3;
      }
   }

   public static io b(CommandContext<ee> $$0, String $$1) {
      return ((gc)$$0.getArgument($$1, gc.class)).c((ee)$$0.getSource());
   }

   public static io c(CommandContext<ee> $$0, String $$1) throws CommandSyntaxException {
      io $$2 = b($$0, $$1);
      if (!daz.l($$2)) {
         throw c.create();
      } else {
         return $$2;
      }
   }

   public gc a(StringReader $$0) throws CommandSyntaxException {
      return (gc)($$0.canRead() && $$0.peek() == '^' ? gd.a($$0) : gj.a($$0));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      if (!($$0.getSource() instanceof ej)) {
         return Suggestions.empty();
      } else {
         String $$2 = $$1.getRemaining();
         Collection<ej.b> $$3;
         if (!$$2.isEmpty() && $$2.charAt(0) == '^') {
            $$3 = Collections.singleton(ej.b.a);
         } else {
            $$3 = ((ej)$$0.getSource()).B();
         }

         return ej.a($$2, $$3, $$1, ef.a(this::a));
      }
   }

   public Collection<String> getExamples() {
      return d;
   }
}
