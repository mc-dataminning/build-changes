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

public interface jk extends iy.a {
   Logger a = LogUtils.getLogger();
   jk.b b = new jk.c(Map.of()).d();

   <E> Optional<jj<E>> c(akg<? extends jj<? extends E>> var1);

   @Override
   default <T> Optional<iy.b<T>> a(akg<? extends jj<? extends T>> $$0) {
      return this.c($$0).map(jj::p);
   }

   default <E> jj<E> d(akg<? extends jj<? extends E>> $$0) {
      return this.c($$0).orElseThrow(() -> new IllegalStateException("Missing registry: " + $$0));
   }

   Stream<jk.d<?>> c();

   @Override
   default Stream<akg<? extends jj<?>>> a() {
      return this.c().map(jk.d::a);
   }

   static jk.b a(final jj<? extends jj<?>> $$0) {
      return new jk.b() {
         @Override
         public <T> Optional<jj<T>> c(akg<? extends jj<? extends T>> $$0x) {
            jj<jj<T>> $$1 = (jj<jj<T>>)$$0;
            return $$1.e((akg<jj<T>>)$$0);
         }

         @Override
         public Stream<jk.d<?>> c() {
            return $$0.g().stream().map(jk.d::a);
         }

         @Override
         public jk.b d() {
            return this;
         }
      };
   }

   default jk.b d() {
      class a extends jk.c implements jk.b {
         protected a(Stream<jk.d<?>> $$1) {
            super($$1);
         }
      }

      return new a(this.c().map(jk.d::c));
   }

   default Lifecycle e() {
      return this.c().map($$0 -> $$0.b.d()).reduce(Lifecycle.stable(), Lifecycle::add);
   }

   public interface b extends jk {
   }

   public static class c implements jk {
      private final Map<? extends akg<? extends jj<?>>, ? extends jj<?>> c;

      public c(List<? extends jj<?>> $$0) {
         this.c = $$0.stream().collect(Collectors.toUnmodifiableMap(jj::c, $$0x -> $$0x));
      }

      public c(Map<? extends akg<? extends jj<?>>, ? extends jj<?>> $$0) {
         this.c = Map.copyOf($$0);
      }

      public c(Stream<jk.d<?>> $$0) {
         this.c = $$0.collect(ImmutableMap.toImmutableMap(jk.d::a, jk.d::b));
      }

      @Override
      public <E> Optional<jj<E>> c(akg<? extends jj<? extends E>> $$0) {
         return Optional.ofNullable(this.c.get($$0)).map($$0x -> $$0x);
      }

      @Override
      public Stream<jk.d<?>> c() {
         return this.c.entrySet().stream().map(jk.d::a);
      }
   }

   public static record d<T>(akg<? extends jj<T>> a, jj<T> b) {

      private static <T, R extends jj<? extends T>> jk.d<T> a(Entry<? extends akg<? extends jj<?>>, R> $$0) {
         return a((akg<? extends jj<?>>)$$0.getKey(), $$0.getValue());
      }

      private static <T> jk.d<T> a(akg<? extends jj<?>> $$0, jj<?> $$1) {
         return new jk.d<>((akg<? extends jj<T>>)$$0, (jj<T>)$$1);
      }

      private jk.d<T> c() {
         return new jk.d<>(this.a, this.b.l());
      }
   }
}
