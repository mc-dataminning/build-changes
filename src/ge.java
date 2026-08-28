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

public class ge implements ArgumentType<Integer> {
   private static final Collection<String> a = Arrays.asList("container.5", "weapon");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xv.b("slot.unknown", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xv.b("slot.only_single_allowed", $$0));

   public static ge a() {
      return new ge();
   }

   public static int a(CommandContext<ew> $$0, String $$1) {
      return (Integer)$$0.getArgument($$1, Integer.class);
   }

   public Integer a(StringReader $$0) throws CommandSyntaxException {
      String $$1 = fa.a($$0, $$0x -> $$0x != ' ');
      cuv $$2 = cuw.a($$1);
      if ($$2 == null) {
         throw b.createWithContext($$0, $$1);
      } else if ($$2.b() != 1) {
         throw c.createWithContext($$0, $$1);
      } else {
         return $$2.a().getInt(0);
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return fb.b(cuw.b(), $$1);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
