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

public interface is extends ih.b {
   Logger a = LogUtils.getLogger();
   is.b b = new is.c(Map.of()).d();

   <E> Optional<ir<E>> c(ags<? extends ir<? extends E>> var1);

   @Override
   default <T> Optional<ih.c<T>> a(ags<? extends ir<? extends T>> $$0) {
      return this.c($$0).map(ir::p);
   }

   default <E> ir<E> d(ags<? extends ir<? extends E>> $$0) {
      return this.c($$0).orElseThrow(() -> new IllegalStateException("Missing registry: " + $$0));
   }

   Stream<is.d<?>> c();

   @Override
   default Stream<ags<? extends ir<?>>> a() {
      return this.c().map(is.d::a);
   }

   static is.b a(final ir<? extends ir<?>> $$0) {
      return new is.b() {
         @Override
         public <T> Optional<ir<T>> c(ags<? extends ir<? extends T>> $$0x) {
            ir<ir<T>> $$1 = (ir<ir<T>>)$$0;
            return $$1.d((ags<ir<T>>)$$0);
         }

         @Override
         public Stream<is.d<?>> c() {
            return $$0.g().stream().map(is.d::a);
         }

         @Override
         public is.b d() {
            return this;
         }
      };
   }

   default is.b d() {
      class a extends is.c implements is.b {
         protected a(Stream<is.d<?>> $$1) {
            super($$1);
         }
      }

      return new a(this.c().map(is.d::c));
   }

   default Lifecycle e() {
      return this.c().map($$0 -> $$0.b.d()).reduce(Lifecycle.stable(), Lifecycle::add);
   }

   public interface b extends is {
   }

   public static class c implements is {
      private final Map<? extends ags<? extends ir<?>>, ? extends ir<?>> c;

      public c(List<? extends ir<?>> $$0) {
         this.c = $$0.stream().collect(Collectors.toUnmodifiableMap(ir::c, $$0x -> $$0x));
      }

      public c(Map<? extends ags<? extends ir<?>>, ? extends ir<?>> $$0) {
         this.c = Map.copyOf($$0);
      }

      public c(Stream<is.d<?>> $$0) {
         this.c = $$0.collect(ImmutableMap.toImmutableMap(is.d::a, is.d::b));
      }

      @Override
      public <E> Optional<ir<E>> c(ags<? extends ir<? extends E>> $$0) {
         return Optional.ofNullable(this.c.get($$0)).map($$0x -> $$0x);
      }

      @Override
      public Stream<is.d<?>> c() {
         return this.c.entrySet().stream().map(is.d::a);
      }
   }

   public static record d<T>(ags<? extends ir<T>> a, ir<T> b) {

      private static <T, R extends ir<? extends T>> is.d<T> a(Entry<? extends ags<? extends ir<?>>, R> $$0) {
         return a((ags<? extends ir<?>>)$$0.getKey(), $$0.getValue());
      }

      private static <T> is.d<T> a(ags<? extends ir<?>> $$0, ir<?> $$1) {
         return new is.d<>((ags<? extends ir<T>>)$$0, (ir<T>)$$1);
      }

      private is.d<T> c() {
         return new is.d<>(this.a, this.b.l());
      }
   }
}
