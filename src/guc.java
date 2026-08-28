import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;
import java.util.function.Predicate;

@FunctionalInterface
public interface guc {
   Codec<guc> a = Codec.recursive("condition", $$0 -> {
      Codec<gub> $$1 = Codec.simpleMap(gub.a.c, $$0.listOf(), bao.a(gub.a.values())).codec().comapFlatMap($$0x -> {
         if ($$0x.size() != 1) {
            return DataResult.error(() -> "Invalid map size for combiner condition, expected exactly one element");
         } else {
            Entry<gub.a, List<guc>> $$1x = (Entry<gub.a, List<guc>>)$$0x.entrySet().iterator().next();
            return DataResult.success(new gub($$1x.getKey(), $$1x.getValue()));
         }
      }, $$0x -> Map.of($$0x.a(), $$0x.b()));
      return Codec.either($$1, gud.b).flatComapMap($$0x -> (guc)$$0x.map($$0xx -> $$0xx, $$0xx -> $$0xx), $$0x -> {
         Objects.requireNonNull($$0x);

         return switch ($$0x) {
            case gub $$3 -> DataResult.success(Either.left($$3));
            case gud $$4 -> DataResult.success(Either.right($$4));
            default -> DataResult.error(() -> "Unrecognized condition");
         };
      });
   });

   <O, S extends ebi<O, S>> Predicate<S> instantiate(ebh<O, S> var1);
}
