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

public interface iw extends il.b {
   Logger a = LogUtils.getLogger();
   iw.b b = new iw.c(Map.of()).d();

   <E> Optional<iv<E>> c(aix<? extends iv<? extends E>> var1);

   @Override
   default <T> Optional<il.c<T>> a(aix<? extends iv<? extends T>> $$0) {
      return this.c($$0).map(iv::p);
   }

   default <E> iv<E> d(aix<? extends iv<? extends E>> $$0) {
      return this.c($$0).orElseThrow(() -> new IllegalStateException("Missing registry: " + $$0));
   }

   Stream<iw.d<?>> c();

   @Override
   default Stream<aix<? extends iv<?>>> a() {
      return this.c().map(iw.d::a);
   }

   static iw.b a(final iv<? extends iv<?>> $$0) {
      return new iw.b() {
         @Override
         public <T> Optional<iv<T>> c(aix<? extends iv<? extends T>> $$0x) {
            iv<iv<T>> $$1 = (iv<iv<T>>)$$0;
            return $$1.d((aix<iv<T>>)$$0);
         }

         @Override
         public Stream<iw.d<?>> c() {
            return $$0.g().stream().map(iw.d::a);
         }

         @Override
         public iw.b d() {
            return this;
         }
      };
   }

   default iw.b d() {
      class a extends iw.c implements iw.b {
         protected a(Stream<iw.d<?>> $$1) {
            super($$1);
         }
      }

      return new a(this.c().map(iw.d::c));
   }

   default Lifecycle e() {
      return this.c().map($$0 -> $$0.b.d()).reduce(Lifecycle.stable(), Lifecycle::add);
   }

   public interface b extends iw {
   }

   public static class c implements iw {
      private final Map<? extends aix<? extends iv<?>>, ? extends iv<?>> c;

      public c(List<? extends iv<?>> $$0) {
         this.c = $$0.stream().collect(Collectors.toUnmodifiableMap(iv::c, $$0x -> $$0x));
      }

      public c(Map<? extends aix<? extends iv<?>>, ? extends iv<?>> $$0) {
         this.c = Map.copyOf($$0);
      }

      public c(Stream<iw.d<?>> $$0) {
         this.c = $$0.collect(ImmutableMap.toImmutableMap(iw.d::a, iw.d::b));
      }

      @Override
      public <E> Optional<iv<E>> c(aix<? extends iv<? extends E>> $$0) {
         return Optional.ofNullable(this.c.get($$0)).map($$0x -> $$0x);
      }

      @Override
      public Stream<iw.d<?>> c() {
         return this.c.entrySet().stream().map(iw.d::a);
      }
   }

   public static record d<T>(aix<? extends iv<T>> a, iv<T> b) {

      private static <T, R extends iv<? extends T>> iw.d<T> a(Entry<? extends aix<? extends iv<?>>, R> $$0) {
         return a((aix<? extends iv<?>>)$$0.getKey(), $$0.getValue());
      }

      private static <T> iw.d<T> a(aix<? extends iv<?>> $$0, iv<?> $$1) {
         return new iw.d<>((aix<? extends iv<T>>)$$0, (iv<T>)$$1);
      }

      private iw.d<T> c() {
         return new iw.d<>(this.a, this.b.l());
      }
   }
}
