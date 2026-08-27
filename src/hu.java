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
   private static final Map<aev<? extends hq<?>>, hu.a<?>> b = ac.a(() -> {
      Builder<aev<? extends hq<?>>, hu.a<?>> $$0 = ImmutableMap.builder();
      a($$0, jc.ap, cqt.b);
      a($$0, jc.aq, th.a);
      a($$0, jc.aE, clk.a);
      a($$0, jc.aD, cli.a);
      a($$0, jc.au, dis.h);
      a($$0, jc.p, bhq.a);
      return $$0.build();
   });
   public static final Codec<hr> a = a();

   private static <E> void a(Builder<aev<? extends hq<?>>, hu.a<?>> $$0, aev<? extends hq<E>> $$1, Codec<E> $$2) {
      $$0.put($$1, new hu.a<>($$1, $$2));
   }

   private static Stream<hr.d<?>> a(hr $$0) {
      return $$0.b().filter($$0x -> b.containsKey($$0x.a()));
   }

   private static <E> DataResult<? extends Codec<E>> a(aev<? extends hq<E>> $$0) {
      return Optional.ofNullable(b.get($$0))
         .map($$0x -> $$0x.b())
         .<DataResult<? extends Codec<E>>>map(DataResult::success)
         .orElseGet(() -> DataResult.error(() -> "Unknown or not serializable registry: " + $$0));
   }

   private static <E> Codec<hr> a() {
      Codec<aev<? extends hq<E>>> $$0 = aew.a.xmap(aev::a, aev::a);
      Codec<hq<E>> $$1 = $$0.partialDispatch(
         "type", $$0x -> DataResult.success($$0x.c()), $$0x -> a($$0x).map($$1x -> hs.a($$0x, Lifecycle.experimental(), $$1x))
      );
      UnboundedMapCodec<? extends aev<? extends hq<?>>, ? extends hq<?>> $$2 = Codec.unboundedMap($$0, $$1);
      return a($$2);
   }

   private static <K extends aev<? extends hq<?>>, V extends hq<?>> Codec<hr> a(UnboundedMapCodec<K, V> $$0) {
      return $$0.xmap(hr.c::new, $$0x -> a($$0x).collect(ImmutableMap.toImmutableMap($$0xx -> $$0xx.a(), $$0xx -> $$0xx.b())));
   }

   public static Stream<hr.d<?>> a(hl<aff> $$0) {
      return a($$0.c(aff.b));
   }

   public static Stream<hr.d<?>> b(hl<aff> $$0) {
      Stream<hr.d<?>> $$1 = $$0.a(aff.a).b();
      Stream<hr.d<?>> $$2 = a($$0);
      return Stream.concat($$2, $$1);
   }

   static record a<E>(aev<? extends hq<E>> a, Codec<E> b) {
   }
}
