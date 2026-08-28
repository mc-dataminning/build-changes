import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface hia<T> {
   @Nullable
   T b(czk var1, @Nullable gkl var2, @Nullable bxj var3, int var4, czi var5);

   Codec<T> b();

   hia.a<? extends hia<T>, T> a();

   public static record a<P extends hia<T>, T>(MapCodec<hgg.d<P, T>> a) {
      public static <P extends hia<T>, T> hia.a<P, T> a(MapCodec<P> $$0, Codec<T> $$1) {
         MapCodec<hgg.d<P, T>> $$2 = RecordCodecBuilder.mapCodec(
            $$2x -> $$2x.group($$0.forGetter(hgg.d::a), a($$1).forGetter(hgg.d::b)).apply($$2x, hgg.d::new)
         );
         return new hia.a<>($$2);
      }

      public static <T> MapCodec<List<hgg.b<T>>> a(Codec<T> $$0) {
         return hgg.b.a($$0).listOf().validate(hia.a::a).fieldOf("cases");
      }

      private static <T> DataResult<List<hgg.b<T>>> a(List<hgg.b<T>> $$0) {
         if ($$0.isEmpty()) {
            return DataResult.error(() -> "Empty case list");
         } else {
            Multiset<T> $$1 = HashMultiset.create();

            for (hgg.b<T> $$2 : $$0) {
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
