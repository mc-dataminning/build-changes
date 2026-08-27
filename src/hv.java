import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.UnboundedMapCodec;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

public class hv {
   private static final Map<acp<? extends hr<?>>, hv.a<?>> b = ac.a(() -> {
      Builder<acp<? extends hr<?>>, hv.a<?>> $$0 = ImmutableMap.builder();
      a($$0, jc.ap, cnk.b);
      a($$0, jc.aq, ss.a);
      a($$0, jc.aE, cie.a);
      a($$0, jc.aD, cic.a);
      a($$0, jc.au, dfk.h);
      a($$0, jc.p, bep.a);
      return $$0.build();
   });
   public static final Codec<hs> a = a();

   private static <E> void a(Builder<acp<? extends hr<?>>, hv.a<?>> $$0, acp<? extends hr<E>> $$1, Codec<E> $$2) {
      $$0.put($$1, new hv.a<>($$1, $$2));
   }

   private static Stream<hs.d<?>> a(hs $$0) {
      return $$0.b().filter($$0x -> b.containsKey($$0x.a()));
   }

   private static <E> DataResult<? extends Codec<E>> a(acp<? extends hr<E>> $$0) {
      return Optional.ofNullable(b.get($$0))
         .map($$0x -> $$0x.b())
         .<DataResult<? extends Codec<E>>>map(DataResult::success)
         .orElseGet(() -> DataResult.error(() -> "Unknown or not serializable registry: " + $$0));
   }

   private static <E> Codec<hs> a() {
      Codec<acp<? extends hr<E>>> $$0 = acq.a.xmap(acp::a, acp::a);
      Codec<hr<E>> $$1 = $$0.partialDispatch(
         "type", $$0x -> DataResult.success($$0x.c()), $$0x -> a($$0x).map($$1x -> ht.a($$0x, Lifecycle.experimental(), $$1x))
      );
      UnboundedMapCodec<? extends acp<? extends hr<?>>, ? extends hr<?>> $$2 = Codec.unboundedMap($$0, $$1);
      return a($$2);
   }

   private static <K extends acp<? extends hr<?>>, V extends hr<?>> Codec<hs> a(UnboundedMapCodec<K, V> $$0) {
      return $$0.xmap(hs.c::new, $$0x -> a($$0x).collect(ImmutableMap.toImmutableMap($$0xx -> $$0xx.a(), $$0xx -> $$0xx.b())));
   }

   public static Stream<hs.d<?>> a(hl<acz> $$0) {
      return a($$0.c(acz.b));
   }

   public static Stream<hs.d<?>> b(hl<acz> $$0) {
      Stream<hs.d<?>> $$1 = $$0.a(acz.a).b();
      Stream<hs.d<?>> $$2 = a($$0);
      return Stream.concat($$2, $$1);
   }

   static record a<E>(acp<? extends hr<E>> a, Codec<E> b) {
   }
}
