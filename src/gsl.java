import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;
import java.util.function.Predicate;

@FunctionalInterface
public interface gsl {
   Codec<gsl> a = Codec.recursive("condition", $$0 -> {
      Codec<gsk> $$1 = Codec.simpleMap(gsk.a.c, $$0.listOf(), bak.a(gsk.a.values())).codec().comapFlatMap($$0x -> {
         if ($$0x.size() != 1) {
            return DataResult.error(() -> "Invalid map size for combiner condition, expected exactly one element");
         } else {
            Entry<gsk.a, List<gsl>> $$1x = (Entry<gsk.a, List<gsl>>)$$0x.entrySet().iterator().next();
            return DataResult.success(new gsk($$1x.getKey(), $$1x.getValue()));
         }
      }, $$0x -> Map.of($$0x.a(), $$0x.b()));
      return Codec.either($$1, gsm.b).flatComapMap($$0x -> (gsl)$$0x.map($$0xx -> $$0xx, $$0xx -> $$0xx), $$0x -> {
         Objects.requireNonNull($$0x);

         return switch ($$0x) {
            case gsk $$3 -> DataResult.success(Either.left($$3));
            case gsm $$4 -> DataResult.success(Either.right($$4));
            default -> DataResult.error(() -> "Unrecognized condition");
         };
      });
   });

   <O, S extends eaq<O, S>> Predicate<S> instantiate(eap<O, S> var1);
}
