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
   private static final Map<aeq<? extends hr<?>>, hv.a<?>> b = ac.a(() -> {
      Builder<aeq<? extends hr<?>>, hv.a<?>> $$0 = ImmutableMap.builder();
      a($$0, jc.ap, cqj.b);
      a($$0, jc.aq, tb.a);
      a($$0, jc.aE, clc.a);
      a($$0, jc.aD, cla.a);
      a($$0, jc.au, dii.h);
      a($$0, jc.p, bhi.a);
      return $$0.build();
   });
   public static final Codec<hs> a = a();

   private static <E> void a(Builder<aeq<? extends hr<?>>, hv.a<?>> $$0, aeq<? extends hr<E>> $$1, Codec<E> $$2) {
      $$0.put($$1, new hv.a<>($$1, $$2));
   }

   private static Stream<hs.d<?>> a(hs $$0) {
      return $$0.b().filter($$0x -> b.containsKey($$0x.a()));
   }

   private static <E> DataResult<? extends Codec<E>> a(aeq<? extends hr<E>> $$0) {
      return Optional.ofNullable(b.get($$0))
         .map($$0x -> $$0x.b())
         .<DataResult<? extends Codec<E>>>map(DataResult::success)
         .orElseGet(() -> DataResult.error(() -> "Unknown or not serializable registry: " + $$0));
   }

   private static <E> Codec<hs> a() {
      Codec<aeq<? extends hr<E>>> $$0 = aer.a.xmap(aeq::a, aeq::a);
      Codec<hr<E>> $$1 = $$0.partialDispatch(
         "type", $$0x -> DataResult.success($$0x.c()), $$0x -> a($$0x).map($$1x -> ht.a($$0x, Lifecycle.experimental(), $$1x))
      );
      UnboundedMapCodec<? extends aeq<? extends hr<?>>, ? extends hr<?>> $$2 = Codec.unboundedMap($$0, $$1);
      return a($$2);
   }

   private static <K extends aeq<? extends hr<?>>, V extends hr<?>> Codec<hs> a(UnboundedMapCodec<K, V> $$0) {
      return $$0.xmap(hs.c::new, $$0x -> a($$0x).collect(ImmutableMap.toImmutableMap($$0xx -> $$0xx.a(), $$0xx -> $$0xx.b())));
   }

   public static Stream<hs.d<?>> a(hl<afa> $$0) {
      return a($$0.c(afa.b));
   }

   public static Stream<hs.d<?>> b(hl<afa> $$0) {
      Stream<hs.d<?>> $$1 = $$0.a(afa.a).b();
      Stream<hs.d<?>> $$2 = a($$0);
      return Stream.concat($$2, $$1);
   }

   static record a<E>(aeq<? extends hr<E>> a, Codec<E> b) {
   }
}
