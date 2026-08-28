import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.slf4j.Logger;

public interface ju extends ji.a {
   Logger a = LogUtils.getLogger();
   ju.b b = new ju.c(Map.of()).e();

   @Override
   <E> Optional<jt<E>> a(alq<? extends jt<? extends E>> var1);

   default <E> jt<E> f(alq<? extends jt<? extends E>> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing registry: " + $$0));
   }

   Stream<ju.d<?>> a();

   @Override
   default Stream<alq<? extends jt<?>>> b() {
      return this.a().map($$0 -> $$0.a);
   }

   static ju.b a(final jt<? extends jt<?>> $$0) {
      return new ju.b() {
         @Override
         public <T> Optional<jt<T>> a(alq<? extends jt<? extends T>> $$0x) {
            jt<jt<T>> $$1 = (jt<jt<T>>)$$0;
            return $$1.f((alq<jt<T>>)$$0);
         }

         @Override
         public Stream<ju.d<?>> a() {
            return $$0.k().stream().map(ju.d::a);
         }

         @Override
         public ju.b e() {
            return this;
         }
      };
   }

   default ju.b e() {
      class a extends ju.c implements ju.b {
         protected a(final Stream<ju.d<?>> $$1) {
            super($$1);
         }
      }

      return new a(this.a().map(ju.d::c));
   }

   public interface b extends ju {
   }

   public static class c implements ju {
      private final Map<? extends alq<? extends jt<?>>, ? extends jt<?>> c;

      public c(List<? extends jt<?>> $$0) {
         this.c = $$0.stream().collect(Collectors.toUnmodifiableMap(jt::g, $$0x -> $$0x));
      }

      public c(Map<? extends alq<? extends jt<?>>, ? extends jt<?>> $$0) {
         this.c = Map.copyOf($$0);
      }

      public c(Stream<ju.d<?>> $$0) {
         this.c = $$0.collect(ImmutableMap.toImmutableMap(ju.d::a, ju.d::b));
      }

      @Override
      public <E> Optional<jt<E>> a(alq<? extends jt<? extends E>> $$0) {
         return Optional.ofNullable(this.c.get($$0)).map($$0x -> $$0x);
      }

      @Override
      public Stream<ju.d<?>> a() {
         return this.c.entrySet().stream().map(ju.d::a);
      }
   }

   public static record d<T>(alq<? extends jt<T>> a, jt<T> b) {

      private static <T, R extends jt<? extends T>> ju.d<T> a(Entry<? extends alq<? extends jt<?>>, R> $$0) {
         return a((alq<? extends jt<?>>)$$0.getKey(), $$0.getValue());
      }

      private static <T> ju.d<T> a(alq<? extends jt<?>> $$0, jt<?> $$1) {
         return new ju.d<>((alq<? extends jt<T>>)$$0, (jt<T>)$$1);
      }

      private ju.d<T> c() {
         return new ju.d<>(this.a, this.b.n());
      }
   }
}
