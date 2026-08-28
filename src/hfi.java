import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface hfi<T> {
   @Nullable
   T b(cxy var1, @Nullable ghz var2, @Nullable bwr var3, int var4, cxw var5);

   hfi.a<? extends hfi<T>, T> a();

   public static record a<P extends hfi<T>, T>(MapCodec<hdq.c<P, T>> a) {
      public static <P extends hfi<T>, T> hfi.a<P, T> a(MapCodec<P> $$0, Codec<T> $$1) {
         MapCodec<hdq.c<P, T>> $$2 = RecordCodecBuilder.mapCodec(
            $$2x -> $$2x.group($$0.forGetter(hdq.c::a), a($$1).forGetter(hdq.c::b)).apply($$2x, hdq.c::new)
         );
         return new hfi.a<>($$2);
      }

      public static <T> MapCodec<List<hdq.a<T>>> a(Codec<T> $$0) {
         return hdq.a.a($$0).listOf().validate(hfi.a::a).fieldOf("cases");
      }

      private static <T> DataResult<List<hdq.a<T>>> a(List<hdq.a<T>> $$0) {
         if ($$0.isEmpty()) {
            return DataResult.error(() -> "Empty case list");
         } else {
            Multiset<T> $$1 = HashMultiset.create();

            for (hdq.a<T> $$2 : $$0) {
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
