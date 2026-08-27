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

public class fy implements ArgumentType<fy.a> {
   private static final Collection<String> a = Arrays.asList("stick", "minecraft:stick", "#stick", "#stick{foo=bar}");
   private final hh<cir> b;

   public fy(dm $$0) {
      this.b = $$0.a(jd.D);
   }

   public static fy a(dm $$0) {
      return new fy($$0);
   }

   public fy.a a(StringReader $$0) throws CommandSyntaxException {
      Either<fx.a, fx.b> $$1 = fx.b(this.b, $$0);
      return (fy.a)$$1.map($$0x -> a($$1x -> $$1x == $$0x.a(), $$0x.b()), $$0x -> a($$0x.a()::a, $$0x.b()));
   }

   public static Predicate<ciw> a(CommandContext<ds> $$0, String $$1) {
      return (Predicate<ciw>)$$0.getArgument($$1, fy.a.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return fx.a(this.b, $$1, true);
   }

   public Collection<String> getExamples() {
      return a;
   }

   private static fy.a a(Predicate<hf<cir>> $$0, @Nullable qs $$1) {
      return $$1 != null ? $$2 -> $$2.a($$0) && re.a($$1, $$2.v(), true) : $$1x -> $$1x.a($$0);
   }

   public interface a extends Predicate<ciw> {
   }
}
