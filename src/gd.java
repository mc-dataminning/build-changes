import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class gd implements ArgumentType<fbw> {
   private static final Collection<String> b = Arrays.asList("sidebar", "foo.bar");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> wp.b("argument.scoreboardDisplaySlot.invalid", $$0));

   private gd() {
   }

   public static gd a() {
      return new gd();
   }

   public static fbw a(CommandContext<ex> $$0, String $$1) {
      return (fbw)$$0.getArgument($$1, fbw.class);
   }

   public fbw a(StringReader $$0) throws CommandSyntaxException {
      String $$1 = $$0.readUnquotedString();
      fbw $$2 = fbw.t.a($$1);
      if ($$2 == null) {
         throw a.createWithContext($$0, $$1);
      } else {
         return $$2;
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return fc.b(Arrays.stream(fbw.values()).map(fbw::c), $$1);
   }

   public Collection<String> getExamples() {
      return b;
   }
}
