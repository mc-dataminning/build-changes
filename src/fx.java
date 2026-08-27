import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.datafixers.util.Either;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class fx implements ArgumentType<fx.a> {
   private static final Collection<String> a = Arrays.asList("stick", "minecraft:stick", "#stick", "#stick{foo=bar}");
   private final hg<cit> b;

   public fx(dl $$0) {
      this.b = $$0.a(jc.D);
   }

   public static fx a(dl $$0) {
      return new fx($$0);
   }

   public fx.a a(StringReader $$0) throws CommandSyntaxException {
      Either<fw.a, fw.b> $$1 = fw.b(this.b, $$0);
      return (fx.a)$$1.map($$0x -> a($$1x -> $$1x == $$0x.a(), $$0x.b()), $$0x -> a($$0x.a()::a, $$0x.b()));
   }

   public static Predicate<ciy> a(CommandContext<dr> $$0, String $$1) {
      return (Predicate<ciy>)$$0.getArgument($$1, fx.a.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return fw.a(this.b, $$1, true);
   }

   public Collection<String> getExamples() {
      return a;
   }

   private static fx.a a(Predicate<he<cit>> $$0, @Nullable qr $$1) {
      return $$1 != null ? $$2 -> $$2.a($$0) && rd.a($$1, $$2.v(), true) : $$1x -> $$1x.a($$0);
   }

   public interface a extends Predicate<ciy> {
   }
}
