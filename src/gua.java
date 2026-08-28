import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;
import java.util.function.Predicate;

@FunctionalInterface
public interface gua {
   Codec<gua> a = Codec.recursive("condition", $$0 -> {
      Codec<gtz> $$1 = Codec.simpleMap(gtz.a.c, $$0.listOf(), bam.a(gtz.a.values())).codec().comapFlatMap($$0x -> {
         if ($$0x.size() != 1) {
            return DataResult.error(() -> "Invalid map size for combiner condition, expected exactly one element");
         } else {
            Entry<gtz.a, List<gua>> $$1x = (Entry<gtz.a, List<gua>>)$$0x.entrySet().iterator().next();
            return DataResult.success(new gtz($$1x.getKey(), $$1x.getValue()));
         }
      }, $$0x -> Map.of($$0x.a(), $$0x.b()));
      return Codec.either($$1, gub.b).flatComapMap($$0x -> (gua)$$0x.map($$0xx -> $$0xx, $$0xx -> $$0xx), $$0x -> {
         Objects.requireNonNull($$0x);

         return switch ($$0x) {
            case gtz $$3 -> DataResult.success(Either.left($$3));
            case gub $$4 -> DataResult.success(Either.right($$4));
            default -> DataResult.error(() -> "Unrecognized condition");
         };
      });
   });

   <O, S extends ebg<O, S>> Predicate<S> instantiate(ebf<O, S> var1);
}
