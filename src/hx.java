import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.UnboundedMapCodec;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

public class hx {
   private static final Map<aex<? extends ht<?>>, hx.a<?>> b = ac.a(() -> {
      Builder<aex<? extends ht<?>>, hx.a<?>> $$0 = ImmutableMap.builder();
      a($$0, je.ap, cqv.b);
      a($$0, je.aq, tj.a);
      a($$0, je.aE, clm.a);
      a($$0, je.aD, clk.a);
      a($$0, je.au, diu.h);
      a($$0, je.p, bhs.a);
      return $$0.build();
   });
   public static final Codec<hu> a = a();

   private static <E> void a(Builder<aex<? extends ht<?>>, hx.a<?>> $$0, aex<? extends ht<E>> $$1, Codec<E> $$2) {
      $$0.put($$1, new hx.a<>($$1, $$2));
   }

   private static Stream<hu.d<?>> a(hu $$0) {
      return $$0.b().filter($$0x -> b.containsKey($$0x.a()));
   }

   private static <E> DataResult<? extends Codec<E>> a(aex<? extends ht<E>> $$0) {
      return Optional.ofNullable(b.get($$0))
         .map($$0x -> $$0x.b())
         .<DataResult<? extends Codec<E>>>map(DataResult::success)
         .orElseGet(() -> DataResult.error(() -> "Unknown or not serializable registry: " + $$0));
   }

   private static <E> Codec<hu> a() {
      Codec<aex<? extends ht<E>>> $$0 = aey.a.xmap(aex::a, aex::a);
      Codec<ht<E>> $$1 = $$0.partialDispatch(
         "type", $$0x -> DataResult.success($$0x.c()), $$0x -> a($$0x).map($$1x -> hv.a($$0x, Lifecycle.experimental(), $$1x))
      );
      UnboundedMapCodec<? extends aex<? extends ht<?>>, ? extends ht<?>> $$2 = Codec.unboundedMap($$0, $$1);
      return a($$2);
   }

   private static <K extends aex<? extends ht<?>>, V extends ht<?>> Codec<hu> a(UnboundedMapCodec<K, V> $$0) {
      return $$0.xmap(hu.c::new, $$0x -> a($$0x).collect(ImmutableMap.toImmutableMap($$0xx -> $$0xx.a(), $$0xx -> $$0xx.b())));
   }

   public static Stream<hu.d<?>> a(hn<afh> $$0) {
      return a($$0.c(afh.b));
   }

   public static Stream<hu.d<?>> b(hn<afh> $$0) {
      Stream<hu.d<?>> $$1 = $$0.a(afh.a).b();
      Stream<hu.d<?>> $$2 = a($$0);
      return Stream.concat($$2, $$1);
   }

   static record a<E>(aex<? extends ht<E>> a, Codec<E> b) {
   }
}
