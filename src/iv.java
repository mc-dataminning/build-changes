import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class iv {
   private static <T> MapCodec<iv.a<T>> a(ahf<? extends it<T>> $$0, MapCodec<T> $$1) {
      return RecordCodecBuilder.mapCodec(
         $$2 -> $$2.group(ahf.a($$0).fieldOf("name").forGetter(iv.a::a), Codec.INT.fieldOf("id").forGetter(iv.a::b), $$1.forGetter(iv.a::c))
               .apply($$2, iv.a::new)
      );
   }

   public static <T> Codec<it<T>> a(ahf<? extends it<T>> $$0, Lifecycle $$1, Codec<T> $$2) {
      return a($$0, $$2.fieldOf("element")).codec().listOf().xmap($$2x -> {
         ip<T> $$3 = new ip<>($$0, $$1);

         for (iv.a<T> $$4 : $$2x) {
            $$3.a($$4.b(), $$4.a(), $$4.c(), $$1);
         }

         return $$3;
      }, $$0x -> {
         Builder<iv.a<T>> $$1x = ImmutableList.builder();

         for (T $$2x : $$0x) {
            $$1x.add(new iv.a((ahf<T>)$$0x.c($$2x).get(), $$0x.a($$2x), $$2x));
         }

         return $$1x.build();
      });
   }

   public static <E> Codec<it<E>> b(ahf<? extends it<E>> $$0, Lifecycle $$1, Codec<E> $$2) {
      Codec<Map<ahf<E>, E>> $$3 = Codec.unboundedMap(ahf.a($$0), $$2);
      return $$3.xmap($$2x -> {
         jc<E> $$3x = new ip<>($$0, $$1);
         $$2x.forEach(($$2xx, $$3xx) -> $$3x.a($$2xx, (E)$$3xx, $$1));
         return $$3x.l();
      }, $$0x -> ImmutableMap.copyOf($$0x.g()));
   }

   public static <E> Codec<il<E>> a(ahf<? extends it<E>> $$0, Codec<E> $$1) {
      return a($$0, $$1, false);
   }

   public static <E> Codec<il<E>> a(ahf<? extends it<E>> $$0, Codec<E> $$1, boolean $$2) {
      return aha.a($$0, ahc.a($$0, $$1), $$2);
   }

   public static <E> Codec<il<E>> a(ahf<? extends it<E>> $$0) {
      return a($$0, false);
   }

   public static <E> Codec<il<E>> a(ahf<? extends it<E>> $$0, boolean $$1) {
      return aha.a($$0, ahd.a($$0), $$1);
   }

   static record a<T>(ahf<T> a, int b, T c) {
   }
}
