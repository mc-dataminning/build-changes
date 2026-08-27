import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class hu {
   private static <T> MapCodec<hu.a<T>> a(aeo<? extends hs<T>> $$0, MapCodec<T> $$1) {
      return RecordCodecBuilder.mapCodec(
         $$2 -> $$2.group(aeo.a($$0).fieldOf("name").forGetter(hu.a::a), Codec.INT.fieldOf("id").forGetter(hu.a::b), $$1.forGetter(hu.a::c))
               .apply($$2, hu.a::new)
      );
   }

   public static <T> Codec<hs<T>> a(aeo<? extends hs<T>> $$0, Lifecycle $$1, Codec<T> $$2) {
      return a($$0, $$2.fieldOf("element")).codec().listOf().xmap($$2x -> {
         ib<T> $$3 = new hn<>($$0, $$1);

         for (hu.a<T> $$4 : $$2x) {
            $$3.b($$4.b(), $$4.a(), $$4.c(), $$1);
         }

         return $$3;
      }, $$0x -> {
         Builder<hu.a<T>> $$1x = ImmutableList.builder();

         for (T $$2x : $$0x) {
            $$1x.add(new hu.a((aeo<T>)$$0x.c($$2x).get(), $$0x.a($$2x), $$2x));
         }

         return $$1x.build();
      });
   }

   public static <E> Codec<hs<E>> b(aeo<? extends hs<E>> $$0, Lifecycle $$1, Codec<E> $$2) {
      Codec<Map<aeo<E>, E>> $$3 = Codec.unboundedMap(aeo.a($$0), $$2);
      return $$3.xmap($$2x -> {
         ib<E> $$3x = new hn<>($$0, $$1);
         $$2x.forEach(($$2xx, $$3xx) -> $$3x.a($$2xx, (E)$$3xx, $$1));
         return $$3x.l();
      }, $$0x -> ImmutableMap.copyOf($$0x.g()));
   }

   public static <E> Codec<hj<E>> a(aeo<? extends hs<E>> $$0, Codec<E> $$1) {
      return a($$0, $$1, false);
   }

   public static <E> Codec<hj<E>> a(aeo<? extends hs<E>> $$0, Codec<E> $$1, boolean $$2) {
      return aej.a($$0, ael.a($$0, $$1), $$2);
   }

   public static <E> Codec<hj<E>> a(aeo<? extends hs<E>> $$0) {
      return a($$0, false);
   }

   public static <E> Codec<hj<E>> a(aeo<? extends hs<E>> $$0, boolean $$1) {
      return aej.a($$0, aem.a($$0), $$1);
   }

   static record a<T>(aeo<T> a, int b, T c) {
   }
}
