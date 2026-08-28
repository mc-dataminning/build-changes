import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface hgp<T> {
   @Nullable
   T b(cys var1, @Nullable gjd var2, @Nullable bwz var3, int var4, cyq var5);

   Codec<T> b();

   hgp.a<? extends hgp<T>, T> a();

   public static record a<P extends hgp<T>, T>(MapCodec<hev.d<P, T>> a) {
      public static <P extends hgp<T>, T> hgp.a<P, T> a(MapCodec<P> $$0, Codec<T> $$1) {
         MapCodec<hev.d<P, T>> $$2 = RecordCodecBuilder.mapCodec(
            $$2x -> $$2x.group($$0.forGetter(hev.d::a), a($$1).forGetter(hev.d::b)).apply($$2x, hev.d::new)
         );
         return new hgp.a<>($$2);
      }

      public static <T> MapCodec<List<hev.b<T>>> a(Codec<T> $$0) {
         return hev.b.a($$0).listOf().validate(hgp.a::a).fieldOf("cases");
      }

      private static <T> DataResult<List<hev.b<T>>> a(List<hev.b<T>> $$0) {
         if ($$0.isEmpty()) {
            return DataResult.error(() -> "Empty case list");
         } else {
            Multiset<T> $$1 = HashMultiset.create();

            for (hev.b<T> $$2 : $$0) {
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
