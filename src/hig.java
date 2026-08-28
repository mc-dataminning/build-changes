import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface hig<T> {
   @Nullable
   T b(czn var1, @Nullable gkq var2, @Nullable bxj var3, int var4, czl var5);

   Codec<T> b();

   hig.a<? extends hig<T>, T> a();

   public static record a<P extends hig<T>, T>(MapCodec<hgm.d<P, T>> a) {
      public static <P extends hig<T>, T> hig.a<P, T> a(MapCodec<P> $$0, Codec<T> $$1) {
         MapCodec<hgm.d<P, T>> $$2 = RecordCodecBuilder.mapCodec(
            $$2x -> $$2x.group($$0.forGetter(hgm.d::a), a($$1).forGetter(hgm.d::b)).apply($$2x, hgm.d::new)
         );
         return new hig.a<>($$2);
      }

      public static <T> MapCodec<List<hgm.b<T>>> a(Codec<T> $$0) {
         return hgm.b.a($$0).listOf().validate(hig.a::a).fieldOf("cases");
      }

      private static <T> DataResult<List<hgm.b<T>>> a(List<hgm.b<T>> $$0) {
         if ($$0.isEmpty()) {
            return DataResult.error(() -> "Empty case list");
         } else {
            Multiset<T> $$1 = HashMultiset.create();

            for (hgm.b<T> $$2 : $$0) {
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
