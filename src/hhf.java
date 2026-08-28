import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface hhf<T> {
   @Nullable
   T b(cyy var1, @Nullable gjr var2, @Nullable bxc var3, int var4, cyw var5);

   Codec<T> b();

   hhf.a<? extends hhf<T>, T> a();

   public static record a<P extends hhf<T>, T>(MapCodec<hfl.d<P, T>> a) {
      public static <P extends hhf<T>, T> hhf.a<P, T> a(MapCodec<P> $$0, Codec<T> $$1) {
         MapCodec<hfl.d<P, T>> $$2 = RecordCodecBuilder.mapCodec(
            $$2x -> $$2x.group($$0.forGetter(hfl.d::a), a($$1).forGetter(hfl.d::b)).apply($$2x, hfl.d::new)
         );
         return new hhf.a<>($$2);
      }

      public static <T> MapCodec<List<hfl.b<T>>> a(Codec<T> $$0) {
         return hfl.b.a($$0).listOf().validate(hhf.a::a).fieldOf("cases");
      }

      private static <T> DataResult<List<hfl.b<T>>> a(List<hfl.b<T>> $$0) {
         if ($$0.isEmpty()) {
            return DataResult.error(() -> "Empty case list");
         } else {
            Multiset<T> $$1 = HashMultiset.create();

            for (hfl.b<T> $$2 : $$0) {
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
