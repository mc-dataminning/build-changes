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

public class gd implements ArgumentType<gd.a> {
   private static final Collection<String> a = Arrays.asList("stick", "minecraft:stick", "#stick", "#stick{foo=bar}");
   private final il<coy> b;

   public gd(dq $$0) {
      this.b = $$0.a(kg.F);
   }

   public static gd a(dq $$0) {
      return new gd($$0);
   }

   public gd.a a(StringReader $$0) throws CommandSyntaxException {
      Either<gc.a, gc.b> $$1 = gc.b(this.b, $$0);
      return (gd.a)$$1.map($$0x -> a($$1x -> $$1x.equals($$0x.a()), $$0x.b()), $$0x -> a($$0x.a()::a, $$0x.b()));
   }

   public static Predicate<cpd> a(CommandContext<du> $$0, String $$1) {
      return (Predicate<cpd>)$$0.getArgument($$1, gd.a.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return gc.a(this.b, $$1, true);
   }

   public Collection<String> getExamples() {
      return a;
   }

   private static gd.a a(Predicate<ij<coy>> $$0, @Nullable sw $$1) {
      return $$1 != null ? $$2 -> $$2.a($$0) && tl.a($$1, $$2.w(), true) : $$1x -> $$1x.a($$0);
   }

   public interface a extends Predicate<cpd> {
   }
}
