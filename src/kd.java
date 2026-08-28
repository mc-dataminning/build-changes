import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.slf4j.Logger;

public interface kd extends jr.a {
   Logger a = LogUtils.getLogger();
   kd.b b = new kd.c(Map.of()).e();

   @Override
   <E> Optional<kc<E>> a(alg<? extends kc<? extends E>> var1);

   default <E> kc<E> e(alg<? extends kc<? extends E>> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing registry: " + $$0));
   }

   Stream<kd.d<?>> d();

   @Override
   default Stream<alg<? extends kc<?>>> a() {
      return this.d().map($$0 -> $$0.a);
   }

   static kd.b a(final kc<? extends kc<?>> $$0) {
      return new kd.b() {
         @Override
         public <T> Optional<kc<T>> a(alg<? extends kc<? extends T>> $$0x) {
            kc<kc<T>> $$1 = (kc<kc<T>>)$$0;
            return $$1.f((alg<kc<T>>)$$0);
         }

         @Override
         public Stream<kd.d<?>> d() {
            return $$0.k().stream().map(kd.d::a);
         }

         @Override
         public kd.b e() {
            return this;
         }
      };
   }

   default kd.b e() {
      class a extends kd.c implements kd.b {
         protected a(final Stream<kd.d<?>> $$1) {
            super($$1);
         }
      }

      return new a(this.d().map(kd.d::c));
   }

   public interface b extends kd {
   }

   public static class c implements kd {
      private final Map<? extends alg<? extends kc<?>>, ? extends kc<?>> c;

      public c(List<? extends kc<?>> $$0) {
         this.c = $$0.stream().collect(Collectors.toUnmodifiableMap(kc::g, $$0x -> $$0x));
      }

      public c(Map<? extends alg<? extends kc<?>>, ? extends kc<?>> $$0) {
         this.c = Map.copyOf($$0);
      }

      public c(Stream<kd.d<?>> $$0) {
         this.c = $$0.collect(ImmutableMap.toImmutableMap(kd.d::a, kd.d::b));
      }

      @Override
      public <E> Optional<kc<E>> a(alg<? extends kc<? extends E>> $$0) {
         return Optional.ofNullable(this.c.get($$0)).map($$0x -> $$0x);
      }

      @Override
      public Stream<kd.d<?>> d() {
         return this.c.entrySet().stream().map(kd.d::a);
      }
   }

   public static record d<T>(alg<? extends kc<T>> a, kc<T> b) {

      private static <T, R extends kc<? extends T>> kd.d<T> a(Entry<? extends alg<? extends kc<?>>, R> $$0) {
         return a((alg<? extends kc<?>>)$$0.getKey(), $$0.getValue());
      }

      private static <T> kd.d<T> a(alg<? extends kc<?>> $$0, kc<?> $$1) {
         return new kd.d<>((alg<? extends kc<T>>)$$0, (kc<T>)$$1);
      }

      private kd.d<T> c() {
         return new kd.d<>(this.a, this.b.n());
      }
   }
}
