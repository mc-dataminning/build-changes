import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.UnboundedMapCodec;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

public class hu {
   private static final Map<aey<? extends hq<?>>, hu.a<?>> b = ac.a(() -> {
      Builder<aey<? extends hq<?>>, hu.a<?>> $$0 = ImmutableMap.builder();
      a($$0, jc.aq, cqz.b);
      a($$0, jc.ar, th.a);
      a($$0, jc.aF, clq.a);
      a($$0, jc.aE, clo.a);
      a($$0, jc.av, dim.h);
      a($$0, jc.q, bhw.a);
      return $$0.build();
   });
   public static final Codec<hr> a = a();

   private static <E> void a(Builder<aey<? extends hq<?>>, hu.a<?>> $$0, aey<? extends hq<E>> $$1, Codec<E> $$2) {
      $$0.put($$1, new hu.a<>($$1, $$2));
   }

   private static Stream<hr.d<?>> a(hr $$0) {
      return $$0.b().filter($$0x -> b.containsKey($$0x.a()));
   }

   private static <E> DataResult<? extends Codec<E>> a(aey<? extends hq<E>> $$0) {
      return Optional.ofNullable(b.get($$0))
         .map($$0x -> $$0x.b())
         .<DataResult<? extends Codec<E>>>map(DataResult::success)
         .orElseGet(() -> DataResult.error(() -> "Unknown or not serializable registry: " + $$0));
   }

   private static <E> Codec<hr> a() {
      Codec<aey<? extends hq<E>>> $$0 = aez.a.xmap(aey::a, aey::a);
      Codec<hq<E>> $$1 = $$0.partialDispatch(
         "type", $$0x -> DataResult.success($$0x.c()), $$0x -> a($$0x).map($$1x -> hs.a($$0x, Lifecycle.experimental(), $$1x))
      );
      UnboundedMapCodec<? extends aey<? extends hq<?>>, ? extends hq<?>> $$2 = Codec.unboundedMap($$0, $$1);
      return a($$2);
   }

   private static <K extends aey<? extends hq<?>>, V extends hq<?>> Codec<hr> a(UnboundedMapCodec<K, V> $$0) {
      return $$0.xmap(hr.c::new, $$0x -> a($$0x).collect(ImmutableMap.toImmutableMap($$0xx -> $$0xx.a(), $$0xx -> $$0xx.b())));
   }

   public static Stream<hr.d<?>> a(hl<afi> $$0) {
      return a($$0.c(afi.b));
   }

   public static Stream<hr.d<?>> b(hl<afi> $$0) {
      Stream<hr.d<?>> $$1 = $$0.a(afi.a).b();
      Stream<hr.d<?>> $$2 = a($$0);
      return Stream.concat($$2, $$1);
   }

   static record a<E>(aey<? extends hq<E>> a, Codec<E> b) {
   }
}
