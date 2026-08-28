import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface hdj<T> {
   @Nullable
   T b(cwq var1, @Nullable gga var2, @Nullable bvi var3, int var4, cwo var5);

   hdj.a<? extends hdj<T>, T> a();

   public static record a<P extends hdj<T>, T>(MapCodec<hbs.c<P, T>> a) {
      public static <P extends hdj<T>, T> hdj.a<P, T> a(MapCodec<P> $$0, Codec<T> $$1) {
         Codec<List<hbs.a<T>>> $$2 = hbs.a.a($$1)
            .listOf()
            .validate(
               $$0x -> {
                  if ($$0x.isEmpty()) {
                     return DataResult.error(() -> "Empty case list");
                  } else {
                     Multiset<T> $$1x = HashMultiset.create();

                     for (hbs.a<T> $$2x : $$0x) {
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
         MapCodec<hbs.c<P, T>> $$3 = RecordCodecBuilder.mapCodec(
            $$2x -> $$2x.group($$0.forGetter(hbs.c::a), $$2.fieldOf("cases").forGetter(hbs.c::b)).apply($$2x, hbs.c::new)
         );
         return new hdj.a<>($$3);
      }
   }
}
