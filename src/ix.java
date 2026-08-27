import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class ix {
   private static <T> MapCodec<ix.a<T>> a(aix<? extends iv<T>> $$0, MapCodec<T> $$1) {
      return RecordCodecBuilder.mapCodec(
         $$2 -> $$2.group(aix.a($$0).fieldOf("name").forGetter(ix.a::a), Codec.INT.fieldOf("id").forGetter(ix.a::b), $$1.forGetter(ix.a::c))
               .apply($$2, ix.a::new)
      );
   }

   public static <T> Codec<iv<T>> a(aix<? extends iv<T>> $$0, Lifecycle $$1, Codec<T> $$2) {
      return a($$0, $$2.fieldOf("element")).codec().listOf().xmap($$2x -> {
         ir<T> $$3 = new ir<>($$0, $$1);

         for (ix.a<T> $$4 : $$2x) {
            $$3.a($$4.b(), $$4.a(), $$4.c(), $$1);
         }

         return $$3;
      }, $$0x -> {
         Builder<ix.a<T>> $$1x = ImmutableList.builder();

         for (T $$2x : $$0x) {
            $$1x.add(new ix.a((aix<T>)$$0x.d($$2x).get(), $$0x.a($$2x), $$2x));
         }

         return $$1x.build();
      });
   }

   public static <E> Codec<iv<E>> b(aix<? extends iv<E>> $$0, Lifecycle $$1, Codec<E> $$2) {
      Codec<Map<aix<E>, E>> $$3 = Codec.unboundedMap(aix.a($$0), $$2);
      return $$3.xmap($$2x -> {
         je<E> $$3x = new ir<>($$0, $$1);
         $$2x.forEach(($$2xx, $$3xx) -> $$3x.a($$2xx, (E)$$3xx, $$1));
         return $$3x.l();
      }, $$0x -> ImmutableMap.copyOf($$0x.g()));
   }

   public static <E> Codec<in<E>> a(aix<? extends iv<E>> $$0, Codec<E> $$1) {
      return a($$0, $$1, false);
   }

   public static <E> Codec<in<E>> a(aix<? extends iv<E>> $$0, Codec<E> $$1, boolean $$2) {
      return ais.a($$0, aiu.a($$0, $$1), $$2);
   }

   public static <E> Codec<in<E>> a(aix<? extends iv<E>> $$0) {
      return a($$0, false);
   }

   public static <E> Codec<in<E>> a(aix<? extends iv<E>> $$0, boolean $$1) {
      return ais.a($$0, aiv.a($$0), $$1);
   }

   static record a<T>(aix<T> a, int b, T c) {
   }
}
