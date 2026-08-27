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

public interface iu extends ij.b {
   Logger a = LogUtils.getLogger();
   iu.b b = new iu.c(Map.of()).d();

   <E> Optional<it<E>> c(ahc<? extends it<? extends E>> var1);

   @Override
   default <T> Optional<ij.c<T>> a(ahc<? extends it<? extends T>> $$0) {
      return this.c($$0).map(it::p);
   }

   default <E> it<E> d(ahc<? extends it<? extends E>> $$0) {
      return this.c($$0).orElseThrow(() -> new IllegalStateException("Missing registry: " + $$0));
   }

   Stream<iu.d<?>> c();

   @Override
   default Stream<ahc<? extends it<?>>> a() {
      return this.c().map(iu.d::a);
   }

   static iu.b a(final it<? extends it<?>> $$0) {
      return new iu.b() {
         @Override
         public <T> Optional<it<T>> c(ahc<? extends it<? extends T>> $$0x) {
            it<it<T>> $$1 = (it<it<T>>)$$0;
            return $$1.d((ahc<it<T>>)$$0);
         }

         @Override
         public Stream<iu.d<?>> c() {
            return $$0.g().stream().map(iu.d::a);
         }

         @Override
         public iu.b d() {
            return this;
         }
      };
   }

   default iu.b d() {
      class a extends iu.c implements iu.b {
         protected a(Stream<iu.d<?>> $$1) {
            super($$1);
         }
      }

      return new a(this.c().map(iu.d::c));
   }

   default Lifecycle e() {
      return this.c().map($$0 -> $$0.b.d()).reduce(Lifecycle.stable(), Lifecycle::add);
   }

   public interface b extends iu {
   }

   public static class c implements iu {
      private final Map<? extends ahc<? extends it<?>>, ? extends it<?>> c;

      public c(List<? extends it<?>> $$0) {
         this.c = $$0.stream().collect(Collectors.toUnmodifiableMap(it::c, $$0x -> $$0x));
      }

      public c(Map<? extends ahc<? extends it<?>>, ? extends it<?>> $$0) {
         this.c = Map.copyOf($$0);
      }

      public c(Stream<iu.d<?>> $$0) {
         this.c = $$0.collect(ImmutableMap.toImmutableMap(iu.d::a, iu.d::b));
      }

      @Override
      public <E> Optional<it<E>> c(ahc<? extends it<? extends E>> $$0) {
         return Optional.ofNullable(this.c.get($$0)).map($$0x -> $$0x);
      }

      @Override
      public Stream<iu.d<?>> c() {
         return this.c.entrySet().stream().map(iu.d::a);
      }
   }

   public static record d<T>(ahc<? extends it<T>> a, it<T> b) {

      private static <T, R extends it<? extends T>> iu.d<T> a(Entry<? extends ahc<? extends it<?>>, R> $$0) {
         return a((ahc<? extends it<?>>)$$0.getKey(), $$0.getValue());
      }

      private static <T> iu.d<T> a(ahc<? extends it<?>> $$0, it<?> $$1) {
         return new iu.d<>((ahc<? extends it<T>>)$$0, (it<T>)$$1);
      }

      private iu.d<T> c() {
         return new iu.d<>(this.a, this.b.l());
      }
   }
}
