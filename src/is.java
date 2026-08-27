import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.UnboundedMapCodec;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

public class is {
   private static final Map<agh<? extends io<?>>, is.a<?>> b = ac.a(() -> {
      Builder<agh<? extends io<?>>, is.a<?>> $$0 = ImmutableMap.builder();
      a($$0, jz.ar, csy.b);
      a($$0, jz.as, un.a);
      a($$0, jz.aG, cno.a);
      a($$0, jz.aF, cnm.a);
      a($$0, jz.aw, dkr.h);
      a($$0, jz.q, bjq.a);
      return $$0.build();
   });
   public static final Codec<ip> a = a();

   private static <E> void a(Builder<agh<? extends io<?>>, is.a<?>> $$0, agh<? extends io<E>> $$1, Codec<E> $$2) {
      $$0.put($$1, new is.a<>($$1, $$2));
   }

   private static Stream<ip.d<?>> a(ip $$0) {
      return $$0.b().filter($$0x -> b.containsKey($$0x.a()));
   }

   private static <E> DataResult<? extends Codec<E>> a(agh<? extends io<E>> $$0) {
      return Optional.ofNullable(b.get($$0))
         .map($$0x -> $$0x.b())
         .<DataResult<? extends Codec<E>>>map(DataResult::success)
         .orElseGet(() -> DataResult.error(() -> "Unknown or not serializable registry: " + $$0));
   }

   private static <E> Codec<ip> a() {
      Codec<agh<? extends io<E>>> $$0 = agi.a.xmap(agh::a, agh::a);
      Codec<io<E>> $$1 = $$0.partialDispatch(
         "type", $$0x -> DataResult.success($$0x.c()), $$0x -> a($$0x).map($$1x -> iq.a($$0x, Lifecycle.experimental(), $$1x))
      );
      UnboundedMapCodec<? extends agh<? extends io<?>>, ? extends io<?>> $$2 = Codec.unboundedMap($$0, $$1);
      return a($$2);
   }

   private static <K extends agh<? extends io<?>>, V extends io<?>> Codec<ip> a(UnboundedMapCodec<K, V> $$0) {
      return $$0.xmap(ip.c::new, $$0x -> a($$0x).collect(ImmutableMap.toImmutableMap($$0xx -> $$0xx.a(), $$0xx -> $$0xx.b())));
   }

   public static Stream<ip.d<?>> a(ij<agr> $$0) {
      return a($$0.c(agr.b));
   }

   public static Stream<ip.d<?>> b(ij<agr> $$0) {
      Stream<ip.d<?>> $$1 = $$0.a(agr.a).b();
      Stream<ip.d<?>> $$2 = a($$0);
      return Stream.concat($$2, $$1);
   }

   static record a<E>(agh<? extends io<E>> a, Codec<E> b) {
   }
}
