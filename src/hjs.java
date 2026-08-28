import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface hjs<T> {
   @Nullable
   T b(daa var1, @Nullable gmd var2, @Nullable bxw var3, int var4, czy var5);

   Codec<T> b();

   hjs.a<? extends hjs<T>, T> a();

   public static record a<P extends hjs<T>, T>(MapCodec<hhy.d<P, T>> a) {
      public static <P extends hjs<T>, T> hjs.a<P, T> a(MapCodec<P> $$0, Codec<T> $$1) {
         MapCodec<hhy.d<P, T>> $$2 = RecordCodecBuilder.mapCodec(
            $$2x -> $$2x.group($$0.forGetter(hhy.d::a), a($$1).forGetter(hhy.d::b)).apply($$2x, hhy.d::new)
         );
         return new hjs.a<>($$2);
      }

      public static <T> MapCodec<List<hhy.b<T>>> a(Codec<T> $$0) {
         return hhy.b.a($$0).listOf().validate(hjs.a::a).fieldOf("cases");
      }

      private static <T> DataResult<List<hhy.b<T>>> a(List<hhy.b<T>> $$0) {
         if ($$0.isEmpty()) {
            return DataResult.error(() -> "Empty case list");
         } else {
            Multiset<T> $$1 = HashMultiset.create();

            for (hhy.b<T> $$2 : $$0) {
               $$1.addAll($$2.a());
            }

            return $$1.size() != $$1.entrySet().size()
               ? DataResult.error(
                  () -> "Duplicate case conditions: "
                        + $$1.entrySet()
                           .stream()
                           .filter($$0xx -> $$0xx.getCount() > 1)
                           .map($$0xx -> $$0xx.getElement().toString())
                           .collect(Collectors.joining(", "))
               )
               : DataResult.success($$0);
         }
      }
   }
}
