import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class hv {
   private static <T> MapCodec<hv.a<T>> a(aew<? extends ht<T>> $$0, MapCodec<T> $$1) {
      return RecordCodecBuilder.mapCodec(
         $$2 -> $$2.group(aew.a($$0).fieldOf("name").forGetter(hv.a::a), Codec.INT.fieldOf("id").forGetter(hv.a::b), $$1.forGetter(hv.a::c))
               .apply($$2, hv.a::new)
      );
   }

   public static <T> Codec<ht<T>> a(aew<? extends ht<T>> $$0, Lifecycle $$1, Codec<T> $$2) {
      return a($$0, $$2.fieldOf("element")).codec().listOf().xmap($$2x -> {
         ho<T> $$3 = new ho<>($$0, $$1);

         for (hv.a<T> $$4 : $$2x) {
            $$3.a($$4.b(), $$4.a(), $$4.c(), $$1);
         }

         return $$3;
      }, $$0x -> {
         Builder<hv.a<T>> $$1x = ImmutableList.builder();

         for (T $$2x : $$0x) {
            $$1x.add(new hv.a((aew<T>)$$0x.c($$2x).get(), $$0x.a($$2x), $$2x));
         }

         return $$1x.build();
      });
   }

   public static <E> Codec<ht<E>> b(aew<? extends ht<E>> $$0, Lifecycle $$1, Codec<E> $$2) {
      Codec<Map<aew<E>, E>> $$3 = Codec.unboundedMap(aew.a($$0), $$2);
      return $$3.xmap($$2x -> {
         ic<E> $$3x = new ho<>($$0, $$1);
         $$2x.forEach(($$2xx, $$3xx) -> $$3x.a($$2xx, (E)$$3xx, $$1));
         return $$3x.l();
      }, $$0x -> ImmutableMap.copyOf($$0x.g()));
   }

   public static <E> Codec<hk<E>> a(aew<? extends ht<E>> $$0, Codec<E> $$1) {
      return a($$0, $$1, false);
   }

   public static <E> Codec<hk<E>> a(aew<? extends ht<E>> $$0, Codec<E> $$1, boolean $$2) {
      return aer.a($$0, aet.a($$0, $$1), $$2);
   }

   public static <E> Codec<hk<E>> a(aew<? extends ht<E>> $$0) {
      return a($$0, false);
   }

   public static <E> Codec<hk<E>> a(aew<? extends ht<E>> $$0, boolean $$1) {
      return aer.a($$0, aeu.a($$0), $$1);
   }

   static record a<T>(aew<T> a, int b, T c) {
   }
}
