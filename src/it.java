import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class it {
   private static <T> MapCodec<it.a<T>> a(ags<? extends ir<T>> $$0, MapCodec<T> $$1) {
      return RecordCodecBuilder.mapCodec(
         $$2 -> $$2.group(ags.a($$0).fieldOf("name").forGetter(it.a::a), Codec.INT.fieldOf("id").forGetter(it.a::b), $$1.forGetter(it.a::c))
               .apply($$2, it.a::new)
      );
   }

   public static <T> Codec<ir<T>> a(ags<? extends ir<T>> $$0, Lifecycle $$1, Codec<T> $$2) {
      return a($$0, $$2.fieldOf("element")).codec().listOf().xmap($$2x -> {
         in<T> $$3 = new in<>($$0, $$1);

         for (it.a<T> $$4 : $$2x) {
            $$3.a($$4.b(), $$4.a(), $$4.c(), $$1);
         }

         return $$3;
      }, $$0x -> {
         Builder<it.a<T>> $$1x = ImmutableList.builder();

         for (T $$2x : $$0x) {
            $$1x.add(new it.a((ags<T>)$$0x.c($$2x).get(), $$0x.a($$2x), $$2x));
         }

         return $$1x.build();
      });
   }

   public static <E> Codec<ir<E>> b(ags<? extends ir<E>> $$0, Lifecycle $$1, Codec<E> $$2) {
      Codec<Map<ags<E>, E>> $$3 = Codec.unboundedMap(ags.a($$0), $$2);
      return $$3.xmap($$2x -> {
         ja<E> $$3x = new in<>($$0, $$1);
         $$2x.forEach(($$2xx, $$3xx) -> $$3x.a($$2xx, (E)$$3xx, $$1));
         return $$3x.l();
      }, $$0x -> ImmutableMap.copyOf($$0x.g()));
   }

   public static <E> Codec<ij<E>> a(ags<? extends ir<E>> $$0, Codec<E> $$1) {
      return a($$0, $$1, false);
   }

   public static <E> Codec<ij<E>> a(ags<? extends ir<E>> $$0, Codec<E> $$1, boolean $$2) {
      return agn.a($$0, agp.a($$0, $$1), $$2);
   }

   public static <E> Codec<ij<E>> a(ags<? extends ir<E>> $$0) {
      return a($$0, false);
   }

   public static <E> Codec<ij<E>> a(ags<? extends ir<E>> $$0, boolean $$1) {
      return agn.a($$0, agq.a($$0), $$1);
   }

   static record a<T>(ags<T> a, int b, T c) {
   }
}
