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

public interface iy extends in.a {
   Logger a = LogUtils.getLogger();
   iy.b b = new iy.c(Map.of()).d();

   <E> Optional<ix<E>> c(ajb<? extends ix<? extends E>> var1);

   @Override
   default <T> Optional<in.b<T>> a(ajb<? extends ix<? extends T>> $$0) {
      return this.c($$0).map(ix::p);
   }

   default <E> ix<E> d(ajb<? extends ix<? extends E>> $$0) {
      return this.c($$0).orElseThrow(() -> new IllegalStateException("Missing registry: " + $$0));
   }

   Stream<iy.d<?>> c();

   @Override
   default Stream<ajb<? extends ix<?>>> a() {
      return this.c().map(iy.d::a);
   }

   static iy.b a(final ix<? extends ix<?>> $$0) {
      return new iy.b() {
         @Override
         public <T> Optional<ix<T>> c(ajb<? extends ix<? extends T>> $$0x) {
            ix<ix<T>> $$1 = (ix<ix<T>>)$$0;
            return $$1.d((ajb<ix<T>>)$$0);
         }

         @Override
         public Stream<iy.d<?>> c() {
            return $$0.g().stream().map(iy.d::a);
         }

         @Override
         public iy.b d() {
            return this;
         }
      };
   }

   default iy.b d() {
      class a extends iy.c implements iy.b {
         protected a(Stream<iy.d<?>> $$1) {
            super($$1);
         }
      }

      return new a(this.c().map(iy.d::c));
   }

   default Lifecycle e() {
      return this.c().map($$0 -> $$0.b.d()).reduce(Lifecycle.stable(), Lifecycle::add);
   }

   public interface b extends iy {
   }

   public static class c implements iy {
      private final Map<? extends ajb<? extends ix<?>>, ? extends ix<?>> c;

      public c(List<? extends ix<?>> $$0) {
         this.c = $$0.stream().collect(Collectors.toUnmodifiableMap(ix::c, $$0x -> $$0x));
      }

      public c(Map<? extends ajb<? extends ix<?>>, ? extends ix<?>> $$0) {
         this.c = Map.copyOf($$0);
      }

      public c(Stream<iy.d<?>> $$0) {
         this.c = $$0.collect(ImmutableMap.toImmutableMap(iy.d::a, iy.d::b));
      }

      @Override
      public <E> Optional<ix<E>> c(ajb<? extends ix<? extends E>> $$0) {
         return Optional.ofNullable(this.c.get($$0)).map($$0x -> $$0x);
      }

      @Override
      public Stream<iy.d<?>> c() {
         return this.c.entrySet().stream().map(iy.d::a);
      }
   }

   public static record d<T>(ajb<? extends ix<T>> a, ix<T> b) {

      private static <T, R extends ix<? extends T>> iy.d<T> a(Entry<? extends ajb<? extends ix<?>>, R> $$0) {
         return a((ajb<? extends ix<?>>)$$0.getKey(), $$0.getValue());
      }

      private static <T> iy.d<T> a(ajb<? extends ix<?>> $$0, ix<?> $$1) {
         return new iy.d<>((ajb<? extends ix<T>>)$$0, (ix<T>)$$1);
      }

      private iy.d<T> c() {
         return new iy.d<>(this.a, this.b.l());
      }
   }
}
