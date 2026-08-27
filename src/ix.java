import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.UnboundedMapCodec;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

public class ix {
   private static final Map<ahf<? extends it<?>>, ix.a<?>> b = ac.a(() -> {
      Builder<ahf<? extends it<?>>, ix.a<?>> $$0 = ImmutableMap.builder();
      a($$0, ke.at, cuo.b);
      a($$0, ke.au, vb.a);
      a($$0, ke.aJ, cpe.a);
      a($$0, ke.aI, cpc.a);
      a($$0, ke.ay, dmq.h);
      a($$0, ke.r, bkv.a);
      return $$0.build();
   });
   public static final Codec<iu> a = a();

   private static <E> void a(Builder<ahf<? extends it<?>>, ix.a<?>> $$0, ahf<? extends it<E>> $$1, Codec<E> $$2) {
      $$0.put($$1, new ix.a<>($$1, $$2));
   }

   private static Stream<iu.d<?>> a(iu $$0) {
      return $$0.c().filter($$0x -> b.containsKey($$0x.a()));
   }

   private static <E> DataResult<? extends Codec<E>> a(ahf<? extends it<E>> $$0) {
      return Optional.ofNullable(b.get($$0))
         .map($$0x -> $$0x.b())
         .<DataResult<? extends Codec<E>>>map(DataResult::success)
         .orElseGet(() -> DataResult.error(() -> "Unknown or not serializable registry: " + $$0));
   }

   private static <E> Codec<iu> a() {
      Codec<ahf<? extends it<E>>> $$0 = ahg.a.xmap(ahf::a, ahf::a);
      Codec<it<E>> $$1 = $$0.partialDispatch(
         "type", $$0x -> DataResult.success($$0x.c()), $$0x -> a($$0x).map($$1x -> iv.a($$0x, Lifecycle.experimental(), $$1x))
      );
      UnboundedMapCodec<? extends ahf<? extends it<?>>, ? extends it<?>> $$2 = Codec.unboundedMap($$0, $$1);
      return a($$2);
   }

   private static <K extends ahf<? extends it<?>>, V extends it<?>> Codec<iu> a(UnboundedMapCodec<K, V> $$0) {
      return $$0.xmap(iu.c::new, $$0x -> a($$0x).collect(ImmutableMap.toImmutableMap($$0xx -> $$0xx.a(), $$0xx -> $$0xx.b())));
   }

   public static Stream<iu.d<?>> a(io<ahp> $$0) {
      return a($$0.c(ahp.b));
   }

   public static Stream<iu.d<?>> b(io<ahp> $$0) {
      Stream<iu.d<?>> $$1 = $$0.a(ahp.a).c();
      Stream<iu.d<?>> $$2 = a($$0);
      return Stream.concat($$2, $$1);
   }

   static record a<E>(ahf<? extends it<E>> a, Codec<E> b) {
   }
}
