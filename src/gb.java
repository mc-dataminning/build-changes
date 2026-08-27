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

public class gb implements ArgumentType<gb.a> {
   private static final Collection<String> a = Arrays.asList("stick", "minecraft:stick", "#stick", "#stick{foo=bar}");
   private final id<ckw> b;

   public gb(dp $$0) {
      this.b = $$0.a(jz.E);
   }

   public static gb a(dp $$0) {
      return new gb($$0);
   }

   public gb.a a(StringReader $$0) throws CommandSyntaxException {
      Either<ga.a, ga.b> $$1 = ga.b(this.b, $$0);
      return (gb.a)$$1.map($$0x -> a($$1x -> $$1x == $$0x.a(), $$0x.b()), $$0x -> a($$0x.a()::a, $$0x.b()));
   }

   public static Predicate<clb> a(CommandContext<du> $$0, String $$1) {
      return (Predicate<clb>)$$0.getArgument($$1, gb.a.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return ga.a(this.b, $$1, true);
   }

   public Collection<String> getExamples() {
      return a;
   }

   private static gb.a a(Predicate<ib<ckw>> $$0, @Nullable rz $$1) {
      return $$1 != null ? $$2 -> $$2.a($$0) && so.a($$1, $$2.v(), true) : $$1x -> $$1x.a($$0);
   }

   public interface a extends Predicate<clb> {
   }
}
