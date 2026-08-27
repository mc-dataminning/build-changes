import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class iu {
   private static <T> MapCodec<iu.a<T>> a(agl<? extends is<T>> $$0, MapCodec<T> $$1) {
      return RecordCodecBuilder.mapCodec(
         $$2 -> $$2.group(agl.a($$0).fieldOf("name").forGetter(iu.a::a), Codec.INT.fieldOf("id").forGetter(iu.a::b), $$1.forGetter(iu.a::c))
               .apply($$2, iu.a::new)
      );
   }

   public static <T> Codec<is<T>> a(agl<? extends is<T>> $$0, Lifecycle $$1, Codec<T> $$2) {
      return a($$0, $$2.fieldOf("element")).codec().listOf().xmap($$2x -> {
         io<T> $$3 = new io<>($$0, $$1);

         for (iu.a<T> $$4 : $$2x) {
            $$3.a($$4.b(), $$4.a(), $$4.c(), $$1);
         }

         return $$3;
      }, $$0x -> {
         Builder<iu.a<T>> $$1x = ImmutableList.builder();

         for (T $$2x : $$0x) {
            $$1x.add(new iu.a((agl<T>)$$0x.c($$2x).get(), $$0x.a($$2x), $$2x));
         }

         return $$1x.build();
      });
   }

   public static <E> Codec<is<E>> b(agl<? extends is<E>> $$0, Lifecycle $$1, Codec<E> $$2) {
      Codec<Map<agl<E>, E>> $$3 = Codec.unboundedMap(agl.a($$0), $$2);
      return $$3.xmap($$2x -> {
         jb<E> $$3x = new io<>($$0, $$1);
         $$2x.forEach(($$2xx, $$3xx) -> $$3x.a($$2xx, (E)$$3xx, $$1));
         return $$3x.l();
      }, $$0x -> ImmutableMap.copyOf($$0x.g()));
   }

   public static <E> Codec<ik<E>> a(agl<? extends is<E>> $$0, Codec<E> $$1) {
      return a($$0, $$1, false);
   }

   public static <E> Codec<ik<E>> a(agl<? extends is<E>> $$0, Codec<E> $$1, boolean $$2) {
      return agg.a($$0, agi.a($$0, $$1), $$2);
   }

   public static <E> Codec<ik<E>> a(agl<? extends is<E>> $$0) {
      return a($$0, false);
   }

   public static <E> Codec<ik<E>> a(agl<? extends is<E>> $$0, boolean $$1) {
      return agg.a($$0, agj.a($$0), $$1);
   }

   static record a<T>(agl<T> a, int b, T c) {
   }
}
