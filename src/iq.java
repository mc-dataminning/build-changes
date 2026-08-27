import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class iq {
   private static <T> MapCodec<iq.a<T>> a(agh<? extends io<T>> $$0, MapCodec<T> $$1) {
      return RecordCodecBuilder.mapCodec(
         $$2 -> $$2.group(agh.a($$0).fieldOf("name").forGetter(iq.a::a), Codec.INT.fieldOf("id").forGetter(iq.a::b), $$1.forGetter(iq.a::c))
               .apply($$2, iq.a::new)
      );
   }

   public static <T> Codec<io<T>> a(agh<? extends io<T>> $$0, Lifecycle $$1, Codec<T> $$2) {
      return a($$0, $$2.fieldOf("element")).codec().listOf().xmap($$2x -> {
         ik<T> $$3 = new ik<>($$0, $$1);

         for (iq.a<T> $$4 : $$2x) {
            $$3.a($$4.b(), $$4.a(), $$4.c(), $$1);
         }

         return $$3;
      }, $$0x -> {
         Builder<iq.a<T>> $$1x = ImmutableList.builder();

         for (T $$2x : $$0x) {
            $$1x.add(new iq.a((agh<T>)$$0x.c($$2x).get(), $$0x.a($$2x), $$2x));
         }

         return $$1x.build();
      });
   }

   public static <E> Codec<io<E>> b(agh<? extends io<E>> $$0, Lifecycle $$1, Codec<E> $$2) {
      Codec<Map<agh<E>, E>> $$3 = Codec.unboundedMap(agh.a($$0), $$2);
      return $$3.xmap($$2x -> {
         ix<E> $$3x = new ik<>($$0, $$1);
         $$2x.forEach(($$2xx, $$3xx) -> $$3x.a($$2xx, (E)$$3xx, $$1));
         return $$3x.l();
      }, $$0x -> ImmutableMap.copyOf($$0x.g()));
   }

   public static <E> Codec<ig<E>> a(agh<? extends io<E>> $$0, Codec<E> $$1) {
      return a($$0, $$1, false);
   }

   public static <E> Codec<ig<E>> a(agh<? extends io<E>> $$0, Codec<E> $$1, boolean $$2) {
      return agc.a($$0, age.a($$0, $$1), $$2);
   }

   public static <E> Codec<ig<E>> a(agh<? extends io<E>> $$0) {
      return a($$0, false);
   }

   public static <E> Codec<ig<E>> a(agh<? extends io<E>> $$0, boolean $$1) {
      return agc.a($$0, agf.a($$0), $$1);
   }

   static record a<T>(agh<T> a, int b, T c) {
   }
}
