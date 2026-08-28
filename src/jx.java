import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Lifecycle;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.slf4j.Logger;

public interface jx extends jl.a {
   Logger a = LogUtils.getLogger();
   jx.b b = new jx.c(Map.of()).d();

   <E> Optional<jw<E>> c(akj<? extends jw<? extends E>> var1);

   @Override
   default <T> Optional<jl.b<T>> a(akj<? extends jw<? extends T>> $$0) {
      return this.c($$0).map(jw::q);
   }

   default <E> jw<E> d(akj<? extends jw<? extends E>> $$0) {
      return this.c($$0).orElseThrow(() -> new IllegalStateException("Missing registry: " + $$0));
   }

   Stream<jx.d<?>> c();

   @Override
   default Stream<akj<? extends jw<?>>> a() {
      return this.c().map(jx.d::a);
   }

   static jx.b a(final jw<? extends jw<?>> $$0) {
      return new jx.b() {
         @Override
         public <T> Optional<jw<T>> c(akj<? extends jw<? extends T>> $$0x) {
            jw<jw<T>> $$1 = (jw<jw<T>>)$$0;
            return $$1.e((akj<jw<T>>)$$0);
         }

         @Override
         public Stream<jx.d<?>> c() {
            return $$0.h().stream().map(jx.d::a);
         }

         @Override
         public jx.b d() {
            return this;
         }
      };
   }

   default jx.b d() {
      class a extends jx.c implements jx.b {
         protected a(final Stream<jx.d<?>> $$1) {
            super($$1);
         }
      }

      return new a(this.c().map(jx.d::c));
   }

   default Lifecycle e() {
      return this.c().map($$0 -> $$0.b.e()).reduce(Lifecycle.stable(), Lifecycle::add);
   }

   public interface b extends jx {
   }

   public static class c implements jx {
      private final Map<? extends akj<? extends jw<?>>, ? extends jw<?>> c;

      public c(List<? extends jw<?>> $$0) {
         this.c = $$0.stream().collect(Collectors.toUnmodifiableMap(jw::d, $$0x -> $$0x));
      }

      public c(Map<? extends akj<? extends jw<?>>, ? extends jw<?>> $$0) {
         this.c = Map.copyOf($$0);
      }

      public c(Stream<jx.d<?>> $$0) {
         this.c = $$0.collect(ImmutableMap.toImmutableMap(jx.d::a, jx.d::b));
      }

      @Override
      public <E> Optional<jw<E>> c(akj<? extends jw<? extends E>> $$0) {
         return Optional.ofNullable(this.c.get($$0)).map($$0x -> $$0x);
      }

      @Override
      public Stream<jx.d<?>> c() {
         return this.c.entrySet().stream().map(jx.d::a);
      }
   }

   public static record d<T>(akj<? extends jw<T>> a, jw<T> b) {

      private static <T, R extends jw<? extends T>> jx.d<T> a(Entry<? extends akj<? extends jw<?>>, R> $$0) {
         return a((akj<? extends jw<?>>)$$0.getKey(), $$0.getValue());
      }

      private static <T> jx.d<T> a(akj<? extends jw<?>> $$0, jw<?> $$1) {
         return new jx.d<>((akj<? extends jw<T>>)$$0, (jw<T>)$$1);
      }

      private jx.d<T> c() {
         return new jx.d<>(this.a, this.b.m());
      }
   }
}
