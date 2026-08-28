import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;
import java.util.function.Predicate;

@FunctionalInterface
public interface gsq {
   Codec<gsq> a = Codec.recursive("condition", $$0 -> {
      Codec<gsp> $$1 = Codec.simpleMap(gsp.a.c, $$0.listOf(), bak.a(gsp.a.values())).codec().comapFlatMap($$0x -> {
         if ($$0x.size() != 1) {
            return DataResult.error(() -> "Invalid map size for combiner condition, expected exactly one element");
         } else {
            Entry<gsp.a, List<gsq>> $$1x = (Entry<gsp.a, List<gsq>>)$$0x.entrySet().iterator().next();
            return DataResult.success(new gsp($$1x.getKey(), $$1x.getValue()));
         }
      }, $$0x -> Map.of($$0x.a(), $$0x.b()));
      return Codec.either($$1, gsr.b).flatComapMap($$0x -> (gsq)$$0x.map($$0xx -> $$0xx, $$0xx -> $$0xx), $$0x -> {
         Objects.requireNonNull($$0x);

         return switch ($$0x) {
            case gsp $$3 -> DataResult.success(Either.left($$3));
            case gsr $$4 -> DataResult.success(Either.right($$4));
            default -> DataResult.error(() -> "Unrecognized condition");
         };
      });
   });

   <O, S extends eav<O, S>> Predicate<S> instantiate(eau<O, S> var1);
}
