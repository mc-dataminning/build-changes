import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface hjg<T> {
   @Nullable
   T b(dak var1, @Nullable glo var2, @Nullable byf var3, int var4, dai var5);

   Codec<T> b();

   hjg.a<? extends hjg<T>, T> a();

   public static record a<P extends hjg<T>, T>(MapCodec<hhm.d<P, T>> a) {
      public static <P extends hjg<T>, T> hjg.a<P, T> a(MapCodec<P> $$0, Codec<T> $$1) {
         MapCodec<hhm.d<P, T>> $$2 = RecordCodecBuilder.mapCodec(
            $$2x -> $$2x.group($$0.forGetter(hhm.d::a), a($$1).forGetter(hhm.d::b)).apply($$2x, hhm.d::new)
         );
         return new hjg.a<>($$2);
      }

      public static <T> MapCodec<List<hhm.b<T>>> a(Codec<T> $$0) {
         return hhm.b.a($$0).listOf().validate(hjg.a::a).fieldOf("cases");
      }

      private static <T> DataResult<List<hhm.b<T>>> a(List<hhm.b<T>> $$0) {
         if ($$0.isEmpty()) {
            return DataResult.error(() -> "Empty case list");
         } else {
            Multiset<T> $$1 = HashMultiset.create();

            for (hhm.b<T> $$2 : $$0) {
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
