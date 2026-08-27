import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.UnboundedMapCodec;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

public class iv {
   private static final Map<ags<? extends ir<?>>, iv.a<?>> b = ac.a(() -> {
      Builder<ags<? extends ir<?>>, iv.a<?>> $$0 = ImmutableMap.builder();
      a($$0, kc.as, ctx.b);
      a($$0, kc.at, ux.a);
      a($$0, kc.aI, com.a);
      a($$0, kc.aH, cok.a);
      a($$0, kc.ax, dly.h);
      a($$0, kc.r, bkf.a);
      return $$0.build();
   });
   public static final Codec<is> a = a();

   private static <E> void a(Builder<ags<? extends ir<?>>, iv.a<?>> $$0, ags<? extends ir<E>> $$1, Codec<E> $$2) {
      $$0.put($$1, new iv.a<>($$1, $$2));
   }

   private static Stream<is.d<?>> a(is $$0) {
      return $$0.c().filter($$0x -> b.containsKey($$0x.a()));
   }

   private static <E> DataResult<? extends Codec<E>> a(ags<? extends ir<E>> $$0) {
      return Optional.ofNullable(b.get($$0))
         .map($$0x -> $$0x.b())
         .<DataResult<? extends Codec<E>>>map(DataResult::success)
         .orElseGet(() -> DataResult.error(() -> "Unknown or not serializable registry: " + $$0));
   }

   private static <E> Codec<is> a() {
      Codec<ags<? extends ir<E>>> $$0 = agt.a.xmap(ags::a, ags::a);
      Codec<ir<E>> $$1 = $$0.partialDispatch(
         "type", $$0x -> DataResult.success($$0x.c()), $$0x -> a($$0x).map($$1x -> it.a($$0x, Lifecycle.experimental(), $$1x))
      );
      UnboundedMapCodec<? extends ags<? extends ir<?>>, ? extends ir<?>> $$2 = Codec.unboundedMap($$0, $$1);
      return a($$2);
   }

   private static <K extends ags<? extends ir<?>>, V extends ir<?>> Codec<is> a(UnboundedMapCodec<K, V> $$0) {
      return $$0.xmap(is.c::new, $$0x -> a($$0x).collect(ImmutableMap.toImmutableMap($$0xx -> $$0xx.a(), $$0xx -> $$0xx.b())));
   }

   public static Stream<is.d<?>> a(im<ahc> $$0) {
      return a($$0.c(ahc.b));
   }

   public static Stream<is.d<?>> b(im<ahc> $$0) {
      Stream<is.d<?>> $$1 = $$0.a(ahc.a).c();
      Stream<is.d<?>> $$2 = a($$0);
      return Stream.concat($$2, $$1);
   }

   static record a<E>(ags<? extends ir<E>> a, Codec<E> b) {
   }
}
