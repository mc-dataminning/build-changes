import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class hs {
   private static <T> MapCodec<hs.a<T>> a(aev<? extends hq<T>> $$0, MapCodec<T> $$1) {
      return RecordCodecBuilder.mapCodec(
         $$2 -> $$2.group(aev.a($$0).fieldOf("name").forGetter(hs.a::a), Codec.INT.fieldOf("id").forGetter(hs.a::b), $$1.forGetter(hs.a::c))
               .apply($$2, hs.a::new)
      );
   }

   public static <T> Codec<hq<T>> a(aev<? extends hq<T>> $$0, Lifecycle $$1, Codec<T> $$2) {
      return a($$0, $$2.fieldOf("element")).codec().listOf().xmap($$2x -> {
         hm<T> $$3 = new hm<>($$0, $$1);

         for (hs.a<T> $$4 : $$2x) {
            $$3.a($$4.b(), $$4.a(), $$4.c(), $$1);
         }

         return $$3;
      }, $$0x -> {
         Builder<hs.a<T>> $$1x = ImmutableList.builder();

         for (T $$2x : $$0x) {
            $$1x.add(new hs.a((aev<T>)$$0x.c($$2x).get(), $$0x.a($$2x), $$2x));
         }

         return $$1x.build();
      });
   }

   public static <E> Codec<hq<E>> b(aev<? extends hq<E>> $$0, Lifecycle $$1, Codec<E> $$2) {
      Codec<Map<aev<E>, E>> $$3 = Codec.unboundedMap(aev.a($$0), $$2);
      return $$3.xmap($$2x -> {
         hz<E> $$3x = new hm<>($$0, $$1);
         $$2x.forEach(($$2xx, $$3xx) -> $$3x.a($$2xx, (E)$$3xx, $$1));
         return $$3x.l();
      }, $$0x -> ImmutableMap.copyOf($$0x.g()));
   }

   public static <E> Codec<hi<E>> a(aev<? extends hq<E>> $$0, Codec<E> $$1) {
      return a($$0, $$1, false);
   }

   public static <E> Codec<hi<E>> a(aev<? extends hq<E>> $$0, Codec<E> $$1, boolean $$2) {
      return aeq.a($$0, aes.a($$0, $$1), $$2);
   }

   public static <E> Codec<hi<E>> a(aev<? extends hq<E>> $$0) {
      return a($$0, false);
   }

   public static <E> Codec<hi<E>> a(aev<? extends hq<E>> $$0, boolean $$1) {
      return aeq.a($$0, aet.a($$0), $$1);
   }

   static record a<T>(aev<T> a, int b, T c) {
   }
}
