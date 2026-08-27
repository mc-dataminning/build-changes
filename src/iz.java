import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.UnboundedMapCodec;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

public class iz {
   private static final Map<aix<? extends iv<?>>, iz.a<?>> b = ac.a(() -> {
      Builder<aix<? extends iv<?>>, iz.a<?>> $$0 = ImmutableMap.builder();
      a($$0, kg.at, cwm.b);
      a($$0, kg.au, vm.a);
      a($$0, kg.aJ, crd.a);
      a($$0, kg.aI, crb.a);
      a($$0, kg.ay, doo.h);
      a($$0, kg.r, bmp.a);
      return $$0.build();
   });
   public static final Codec<iw> a = a();

   private static <E> void a(Builder<aix<? extends iv<?>>, iz.a<?>> $$0, aix<? extends iv<E>> $$1, Codec<E> $$2) {
      $$0.put($$1, new iz.a<>($$1, $$2));
   }

   private static Stream<iw.d<?>> a(iw $$0) {
      return $$0.c().filter($$0x -> b.containsKey($$0x.a()));
   }

   private static <E> DataResult<? extends Codec<E>> a(aix<? extends iv<E>> $$0) {
      return Optional.ofNullable(b.get($$0))
         .map($$0x -> $$0x.b())
         .<DataResult<? extends Codec<E>>>map(DataResult::success)
         .orElseGet(() -> DataResult.error(() -> "Unknown or not serializable registry: " + $$0));
   }

   private static <E> Codec<iw> a() {
      Codec<aix<? extends iv<E>>> $$0 = aiy.a.xmap(aix::a, aix::a);
      Codec<iv<E>> $$1 = $$0.partialDispatch(
         "type", $$0x -> DataResult.success($$0x.c()), $$0x -> a($$0x).map($$1x -> ix.a($$0x, Lifecycle.experimental(), $$1x))
      );
      UnboundedMapCodec<? extends aix<? extends iv<?>>, ? extends iv<?>> $$2 = Codec.unboundedMap($$0, $$1);
      return a($$2);
   }

   private static <K extends aix<? extends iv<?>>, V extends iv<?>> Codec<iw> a(UnboundedMapCodec<K, V> $$0) {
      return $$0.xmap(iw.c::new, $$0x -> a($$0x).collect(ImmutableMap.toImmutableMap($$0xx -> $$0xx.a(), $$0xx -> $$0xx.b())));
   }

   public static Stream<iw.d<?>> a(iq<ajh> $$0) {
      return a($$0.c(ajh.b));
   }

   public static Stream<iw.d<?>> b(iq<ajh> $$0) {
      Stream<iw.d<?>> $$1 = $$0.a(ajh.a).c();
      Stream<iw.d<?>> $$2 = a($$0);
      return Stream.concat($$2, $$1);
   }

   static record a<E>(aix<? extends iv<E>> a, Codec<E> b) {
   }
}
