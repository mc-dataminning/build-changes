import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface hjq<T> {
   @Nullable
   T b(czy var1, @Nullable gmb var2, @Nullable bxu var3, int var4, czw var5);

   Codec<T> b();

   hjq.a<? extends hjq<T>, T> a();

   public static record a<P extends hjq<T>, T>(MapCodec<hhw.d<P, T>> a) {
      public static <P extends hjq<T>, T> hjq.a<P, T> a(MapCodec<P> $$0, Codec<T> $$1) {
         MapCodec<hhw.d<P, T>> $$2 = RecordCodecBuilder.mapCodec(
            $$2x -> $$2x.group($$0.forGetter(hhw.d::a), a($$1).forGetter(hhw.d::b)).apply($$2x, hhw.d::new)
         );
         return new hjq.a<>($$2);
      }

      public static <T> MapCodec<List<hhw.b<T>>> a(Codec<T> $$0) {
         return hhw.b.a($$0).listOf().validate(hjq.a::a).fieldOf("cases");
      }

      private static <T> DataResult<List<hhw.b<T>>> a(List<hhw.b<T>> $$0) {
         if ($$0.isEmpty()) {
            return DataResult.error(() -> "Empty case list");
         } else {
            Multiset<T> $$1 = HashMultiset.create();

            for (hhw.b<T> $$2 : $$0) {
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
