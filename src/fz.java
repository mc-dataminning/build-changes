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

public class fz implements ArgumentType<fz.a> {
   private static final Collection<String> a = Arrays.asList("stick", "minecraft:stick", "#stick", "#stick{foo=bar}");
   private final hi<cja> b;

   public fz(dn $$0) {
      this.b = $$0.a(je.D);
   }

   public static fz a(dn $$0) {
      return new fz($$0);
   }

   public fz.a a(StringReader $$0) throws CommandSyntaxException {
      Either<fy.a, fy.b> $$1 = fy.b(this.b, $$0);
      return (fz.a)$$1.map($$0x -> a($$1x -> $$1x == $$0x.a(), $$0x.b()), $$0x -> a($$0x.a()::a, $$0x.b()));
   }

   public static Predicate<cjf> a(CommandContext<dt> $$0, String $$1) {
      return (Predicate<cjf>)$$0.getArgument($$1, fz.a.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return fy.a(this.b, $$1, true);
   }

   public Collection<String> getExamples() {
      return a;
   }

   private static fz.a a(Predicate<hg<cja>> $$0, @Nullable qx $$1) {
      return $$1 != null ? $$2 -> $$2.a($$0) && rj.a($$1, $$2.v(), true) : $$1x -> $$1x.a($$0);
   }

   public interface a extends Predicate<cjf> {
   }
}
