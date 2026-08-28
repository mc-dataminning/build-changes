import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.slf4j.Logger;

public interface kg extends ju.a {
   Logger a = LogUtils.getLogger();
   kg.b b = new kg.c(Map.of()).e();

   @Override
   <E> Optional<kf<E>> a(alc<? extends kf<? extends E>> var1);

   default <E> kf<E> f(alc<? extends kf<? extends E>> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing registry: " + $$0));
   }

   Stream<kg.d<?>> a();

   @Override
   default Stream<alc<? extends kf<?>>> b() {
      return this.a().map($$0 -> $$0.a);
   }

   static kg.b a(final kf<? extends kf<?>> $$0) {
      return new kg.b() {
         @Override
         public <T> Optional<kf<T>> a(alc<? extends kf<? extends T>> $$0x) {
            kf<kf<T>> $$1 = (kf<kf<T>>)$$0;
            return $$1.f((alc<kf<T>>)$$0);
         }

         @Override
         public Stream<kg.d<?>> a() {
            return $$0.k().stream().map(kg.d::a);
         }

         @Override
         public kg.b e() {
            return this;
         }
      };
   }

   default kg.b e() {
      class a extends kg.c implements kg.b {
         protected a(final Stream<kg.d<?>> $$1) {
            super($$1);
         }
      }

      return new a(this.a().map(kg.d::c));
   }

   public interface b extends kg {
   }

   public static class c implements kg {
      private final Map<? extends alc<? extends kf<?>>, ? extends kf<?>> c;

      public c(List<? extends kf<?>> $$0) {
         this.c = $$0.stream().collect(Collectors.toUnmodifiableMap(kf::g, $$0x -> $$0x));
      }

      public c(Map<? extends alc<? extends kf<?>>, ? extends kf<?>> $$0) {
         this.c = Map.copyOf($$0);
      }

      public c(Stream<kg.d<?>> $$0) {
         this.c = $$0.collect(ImmutableMap.toImmutableMap(kg.d::a, kg.d::b));
      }

      @Override
      public <E> Optional<kf<E>> a(alc<? extends kf<? extends E>> $$0) {
         return Optional.ofNullable(this.c.get($$0)).map($$0x -> $$0x);
      }

      @Override
      public Stream<kg.d<?>> a() {
         return this.c.entrySet().stream().map(kg.d::a);
      }
   }

   public static record d<T>(alc<? extends kf<T>> a, kf<T> b) {

      private static <T, R extends kf<? extends T>> kg.d<T> a(Entry<? extends alc<? extends kf<?>>, R> $$0) {
         return a((alc<? extends kf<?>>)$$0.getKey(), $$0.getValue());
      }

      private static <T> kg.d<T> a(alc<? extends kf<?>> $$0, kf<?> $$1) {
         return new kg.d<>((alc<? extends kf<T>>)$$0, (kf<T>)$$1);
      }

      private kg.d<T> c() {
         return new kg.d<>(this.a, this.b.n());
      }
   }
}
