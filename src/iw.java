import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.UnboundedMapCodec;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

public class iw {
   private static final Map<agl<? extends is<?>>, iw.a<?>> b = ac.a(() -> {
      Builder<agl<? extends is<?>>, iw.a<?>> $$0 = ImmutableMap.builder();
      a($$0, kd.ar, ctd.b);
      a($$0, kd.as, ur.a);
      a($$0, kd.aG, cnt.a);
      a($$0, kd.aF, cnr.a);
      a($$0, kd.aw, dkw.h);
      a($$0, kd.q, bjv.a);
      return $$0.build();
   });
   public static final Codec<it> a = a();

   private static <E> void a(Builder<agl<? extends is<?>>, iw.a<?>> $$0, agl<? extends is<E>> $$1, Codec<E> $$2) {
      $$0.put($$1, new iw.a<>($$1, $$2));
   }

   private static Stream<it.d<?>> a(it $$0) {
      return $$0.b().filter($$0x -> b.containsKey($$0x.a()));
   }

   private static <E> DataResult<? extends Codec<E>> a(agl<? extends is<E>> $$0) {
      return Optional.ofNullable(b.get($$0))
         .map($$0x -> $$0x.b())
         .<DataResult<? extends Codec<E>>>map(DataResult::success)
         .orElseGet(() -> DataResult.error(() -> "Unknown or not serializable registry: " + $$0));
   }

   private static <E> Codec<it> a() {
      Codec<agl<? extends is<E>>> $$0 = agm.a.xmap(agl::a, agl::a);
      Codec<is<E>> $$1 = $$0.partialDispatch(
         "type", $$0x -> DataResult.success($$0x.c()), $$0x -> a($$0x).map($$1x -> iu.a($$0x, Lifecycle.experimental(), $$1x))
      );
      UnboundedMapCodec<? extends agl<? extends is<?>>, ? extends is<?>> $$2 = Codec.unboundedMap($$0, $$1);
      return a($$2);
   }

   private static <K extends agl<? extends is<?>>, V extends is<?>> Codec<it> a(UnboundedMapCodec<K, V> $$0) {
      return $$0.xmap(it.c::new, $$0x -> a($$0x).collect(ImmutableMap.toImmutableMap($$0xx -> $$0xx.a(), $$0xx -> $$0xx.b())));
   }

   public static Stream<it.d<?>> a(in<agv> $$0) {
      return a($$0.c(agv.b));
   }

   public static Stream<it.d<?>> b(in<agv> $$0) {
      Stream<it.d<?>> $$1 = $$0.a(agv.a).b();
      Stream<it.d<?>> $$2 = a($$0);
      return Stream.concat($$2, $$1);
   }

   static record a<E>(agl<? extends is<E>> a, Codec<E> b) {
   }
}
