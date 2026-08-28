import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface heh<T> {
   @Nullable
   T b(cxh var1, @Nullable ggy var2, @Nullable bvy var3, int var4, cxf var5);

   heh.a<? extends heh<T>, T> a();

   public static record a<P extends heh<T>, T>(MapCodec<hcq.c<P, T>> a) {
      public static <P extends heh<T>, T> heh.a<P, T> a(MapCodec<P> $$0, Codec<T> $$1) {
         Codec<List<hcq.a<T>>> $$2 = hcq.a.a($$1)
            .listOf()
            .validate(
               $$0x -> {
                  if ($$0x.isEmpty()) {
                     return DataResult.error(() -> "Empty case list");
                  } else {
                     Multiset<T> $$1x = HashMultiset.create();

                     for (hcq.a<T> $$2x : $$0x) {
                        $$1x.addAll($$2x.a());
                     }

                     return $$1x.size() != $$1x.entrySet().size()
                        ? DataResult.error(
                           () -> "Duplicate case conditions: "
                                 + $$1x.entrySet()
                                    .stream()
                                    .filter($$0xxx -> $$0xxx.getCount() > 1)
                                    .map($$0xxx -> $$0xxx.getElement().toString())
                                    .collect(Collectors.joining(", "))
                        )
                        : DataResult.success($$0x);
                  }
               }
            );
         MapCodec<hcq.c<P, T>> $$3 = RecordCodecBuilder.mapCodec(
            $$2x -> $$2x.group($$0.forGetter(hcq.c::a), $$2.fieldOf("cases").forGetter(hcq.c::b)).apply($$2x, hcq.c::new)
         );
         return new heh.a<>($$3);
      }
   }
}
