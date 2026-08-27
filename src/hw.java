import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.UnboundedMapCodec;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

public class hw {
   private static final Map<aeo<? extends hs<?>>, hw.a<?>> b = ac.a(() -> {
      Builder<aeo<? extends hs<?>>, hw.a<?>> $$0 = ImmutableMap.builder();
      a($$0, jd.ap, cqi.b);
      a($$0, jd.aq, ta.a);
      a($$0, jd.aE, clb.a);
      a($$0, jd.aD, ckz.a);
      a($$0, jd.au, dih.h);
      a($$0, jd.p, bhg.a);
      return $$0.build();
   });
   public static final Codec<ht> a = a();

   private static <E> void a(Builder<aeo<? extends hs<?>>, hw.a<?>> $$0, aeo<? extends hs<E>> $$1, Codec<E> $$2) {
      $$0.put($$1, new hw.a<>($$1, $$2));
   }

   private static Stream<ht.d<?>> a(ht $$0) {
      return $$0.b().filter($$0x -> b.containsKey($$0x.a()));
   }

   private static <E> DataResult<? extends Codec<E>> a(aeo<? extends hs<E>> $$0) {
      return Optional.ofNullable(b.get($$0))
         .map($$0x -> $$0x.b())
         .<DataResult<? extends Codec<E>>>map(DataResult::success)
         .orElseGet(() -> DataResult.error(() -> "Unknown or not serializable registry: " + $$0));
   }

   private static <E> Codec<ht> a() {
      Codec<aeo<? extends hs<E>>> $$0 = aep.a.xmap(aeo::a, aeo::a);
      Codec<hs<E>> $$1 = $$0.partialDispatch(
         "type", $$0x -> DataResult.success($$0x.c()), $$0x -> a($$0x).map($$1x -> hu.a($$0x, Lifecycle.experimental(), $$1x))
      );
      UnboundedMapCodec<? extends aeo<? extends hs<?>>, ? extends hs<?>> $$2 = Codec.unboundedMap($$0, $$1);
      return a($$2);
   }

   private static <K extends aeo<? extends hs<?>>, V extends hs<?>> Codec<ht> a(UnboundedMapCodec<K, V> $$0) {
      return $$0.xmap(ht.c::new, $$0x -> a($$0x).collect(ImmutableMap.toImmutableMap($$0xx -> $$0xx.a(), $$0xx -> $$0xx.b())));
   }

   public static Stream<ht.d<?>> a(hm<aey> $$0) {
      return a($$0.c(aey.b));
   }

   public static Stream<ht.d<?>> b(hm<aey> $$0) {
      Stream<ht.d<?>> $$1 = $$0.a(aey.a).b();
      Stream<ht.d<?>> $$2 = a($$0);
      return Stream.concat($$2, $$1);
   }

   static record a<E>(aeo<? extends hs<E>> a, Codec<E> b) {
   }
}
