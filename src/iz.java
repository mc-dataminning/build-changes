import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import java.util.Map;

public class iz {
   public static <E> Codec<ix<E>> a(ajb<? extends ix<E>> $$0, Lifecycle $$1, Codec<E> $$2) {
      Codec<Map<ajb<E>, E>> $$3 = Codec.unboundedMap(ajb.a($$0), $$2);
      return $$3.xmap($$2x -> {
         jg<E> $$3x = new it<>($$0, $$1);
         $$2x.forEach(($$2xx, $$3xx) -> $$3x.a($$2xx, (E)$$3xx, $$1));
         return $$3x.l();
      }, $$0x -> ImmutableMap.copyOf($$0x.g()));
   }

   public static <E> Codec<ip<E>> a(ajb<? extends ix<E>> $$0, Codec<E> $$1) {
      return a($$0, $$1, false);
   }

   public static <E> Codec<ip<E>> a(ajb<? extends ix<E>> $$0, Codec<E> $$1, boolean $$2) {
      return aiw.a($$0, aiy.a($$0, $$1), $$2);
   }

   public static <E> Codec<ip<E>> a(ajb<? extends ix<E>> $$0) {
      return a($$0, false);
   }

   public static <E> Codec<ip<E>> a(ajb<? extends ix<E>> $$0, boolean $$1) {
      return aiw.a($$0, aiz.a($$0), $$1);
   }
}
