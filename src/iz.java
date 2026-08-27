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

public interface iz extends in.a {
   Logger a = LogUtils.getLogger();
   iz.b b = new iz.c(Map.of()).d();

   <E> Optional<iy<E>> c(ajs<? extends iy<? extends E>> var1);

   @Override
   default <T> Optional<in.b<T>> a(ajs<? extends iy<? extends T>> $$0) {
      return this.c($$0).map(iy::p);
   }

   default <E> iy<E> d(ajs<? extends iy<? extends E>> $$0) {
      return this.c($$0).orElseThrow(() -> new IllegalStateException("Missing registry: " + $$0));
   }

   Stream<iz.d<?>> c();

   @Override
   default Stream<ajs<? extends iy<?>>> a() {
      return this.c().map(iz.d::a);
   }

   static iz.b a(final iy<? extends iy<?>> $$0) {
      return new iz.b() {
         @Override
         public <T> Optional<iy<T>> c(ajs<? extends iy<? extends T>> $$0x) {
            iy<iy<T>> $$1 = (iy<iy<T>>)$$0;
            return $$1.e((ajs<iy<T>>)$$0);
         }

         @Override
         public Stream<iz.d<?>> c() {
            return $$0.g().stream().map(iz.d::a);
         }

         @Override
         public iz.b d() {
            return this;
         }
      };
   }

   default iz.b d() {
      class a extends iz.c implements iz.b {
         protected a(Stream<iz.d<?>> $$1) {
            super($$1);
         }
      }

      return new a(this.c().map(iz.d::c));
   }

   default Lifecycle e() {
      return this.c().map($$0 -> $$0.b.d()).reduce(Lifecycle.stable(), Lifecycle::add);
   }

   public interface b extends iz {
   }

   public static class c implements iz {
      private final Map<? extends ajs<? extends iy<?>>, ? extends iy<?>> c;

      public c(List<? extends iy<?>> $$0) {
         this.c = $$0.stream().collect(Collectors.toUnmodifiableMap(iy::c, $$0x -> $$0x));
      }

      public c(Map<? extends ajs<? extends iy<?>>, ? extends iy<?>> $$0) {
         this.c = Map.copyOf($$0);
      }

      public c(Stream<iz.d<?>> $$0) {
         this.c = $$0.collect(ImmutableMap.toImmutableMap(iz.d::a, iz.d::b));
      }

      @Override
      public <E> Optional<iy<E>> c(ajs<? extends iy<? extends E>> $$0) {
         return Optional.ofNullable(this.c.get($$0)).map($$0x -> $$0x);
      }

      @Override
      public Stream<iz.d<?>> c() {
         return this.c.entrySet().stream().map(iz.d::a);
      }
   }

   public static record d<T>(ajs<? extends iy<T>> a, iy<T> b) {

      private static <T, R extends iy<? extends T>> iz.d<T> a(Entry<? extends ajs<? extends iy<?>>, R> $$0) {
         return a((ajs<? extends iy<?>>)$$0.getKey(), $$0.getValue());
      }

      private static <T> iz.d<T> a(ajs<? extends iy<?>> $$0, iy<?> $$1) {
         return new iz.d<>((ajs<? extends iy<T>>)$$0, (iy<T>)$$1);
      }

      private iz.d<T> c() {
         return new iz.d<>(this.a, this.b.l());
      }
   }
}
