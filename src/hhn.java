import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface hhn<T> {
   @Nullable
   T b(czd var1, @Nullable gjz var2, @Nullable bxe var3, int var4, czb var5);

   Codec<T> b();

   hhn.a<? extends hhn<T>, T> a();

   public static record a<P extends hhn<T>, T>(MapCodec<hft.d<P, T>> a) {
      public static <P extends hhn<T>, T> hhn.a<P, T> a(MapCodec<P> $$0, Codec<T> $$1) {
         MapCodec<hft.d<P, T>> $$2 = RecordCodecBuilder.mapCodec(
            $$2x -> $$2x.group($$0.forGetter(hft.d::a), a($$1).forGetter(hft.d::b)).apply($$2x, hft.d::new)
         );
         return new hhn.a<>($$2);
      }

      public static <T> MapCodec<List<hft.b<T>>> a(Codec<T> $$0) {
         return hft.b.a($$0).listOf().validate(hhn.a::a).fieldOf("cases");
      }

      private static <T> DataResult<List<hft.b<T>>> a(List<hft.b<T>> $$0) {
         if ($$0.isEmpty()) {
            return DataResult.error(() -> "Empty case list");
         } else {
            Multiset<T> $$1 = HashMultiset.create();

            for (hft.b<T> $$2 : $$0) {
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
