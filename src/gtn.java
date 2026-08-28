import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;
import java.util.function.Predicate;

@FunctionalInterface
public interface gtn {
   Codec<gtn> a = Codec.recursive("condition", $$0 -> {
      Codec<gtm> $$1 = Codec.simpleMap(gtm.a.c, $$0.listOf(), bax.a(gtm.a.values())).codec().comapFlatMap($$0x -> {
         if ($$0x.size() != 1) {
            return DataResult.error(() -> "Invalid map size for combiner condition, expected exactly one element");
         } else {
            Entry<gtm.a, List<gtn>> $$1x = (Entry<gtm.a, List<gtn>>)$$0x.entrySet().iterator().next();
            return DataResult.success(new gtm($$1x.getKey(), $$1x.getValue()));
         }
      }, $$0x -> Map.of($$0x.a(), $$0x.b()));
      return Codec.either($$1, gto.b).flatComapMap($$0x -> (gtn)$$0x.map($$0xx -> $$0xx, $$0xx -> $$0xx), $$0x -> {
         Objects.requireNonNull($$0x);

         return switch ($$0x) {
            case gtm $$3 -> DataResult.success(Either.left($$3));
            case gto $$4 -> DataResult.success(Either.right($$4));
            default -> DataResult.error(() -> "Unrecognized condition");
         };
      });
   });

   <O, S extends ebs<O, S>> Predicate<S> instantiate(ebr<O, S> var1);
}
