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

public class gm implements ArgumentType<gh> {
   private static final Collection<String> c = Arrays.asList("0 0 0", "~ ~ ~", "^ ^ ^", "^1 ^ ^-5", "0.1 -0.5 .9", "~0.5 ~1 ~-5");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(ww.c("argument.pos3d.incomplete"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(ww.c("argument.pos.mixed"));
   private final boolean d;

   public gm(boolean $$0) {
      this.d = $$0;
   }

   public static gm a() {
      return new gm(true);
   }

   public static gm a(boolean $$0) {
      return new gm($$0);
   }

   public static fdw a(CommandContext<ei> $$0, String $$1) {
      return ((gh)$$0.getArgument($$1, gh.class)).a((ei)$$0.getSource());
   }

   public static gh b(CommandContext<ei> $$0, String $$1) {
      return (gh)$$0.getArgument($$1, gh.class);
   }

   public gh a(StringReader $$0) throws CommandSyntaxException {
      return (gh)($$0.canRead() && $$0.peek() == '^' ? gi.a($$0) : go.a($$0, this.d));
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

         return en.a($$2, $$3, $$1, ej.a(this::a));
      }
   }

   public Collection<String> getExamples() {
      return c;
   }
}
