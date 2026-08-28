import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface hdb<T> {
   @Nullable
   T b(cwp var1, @Nullable gfy var2, @Nullable bvg var3, int var4, cwn var5);

   hdb.a<? extends hdb<T>, T> a();

   public static record a<P extends hdb<T>, T>(MapCodec<hbo.c<P, T>> a) {
      public static <P extends hdb<T>, T> hdb.a<P, T> a(MapCodec<P> $$0, Codec<T> $$1) {
         Codec<List<hbo.a<T>>> $$2 = hbo.a.a($$1)
            .listOf()
            .validate(
               $$0x -> {
                  if ($$0x.isEmpty()) {
                     return DataResult.error(() -> "Empty case list");
                  } else {
                     Multiset<T> $$1x = HashMultiset.create();

                     for (hbo.a<T> $$2x : $$0x) {
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
         MapCodec<hbo.c<P, T>> $$3 = RecordCodecBuilder.mapCodec(
            $$2x -> $$2x.group($$0.forGetter(hbo.c::a), $$2.fieldOf("cases").forGetter(hbo.c::b)).apply($$2x, hbo.c::new)
         );
         return new hdb.a<>($$3);
      }
   }
}
