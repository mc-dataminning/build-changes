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

public interface it extends ii.b {
   Logger a = LogUtils.getLogger();
   it.b b = new it.c(Map.of()).c();

   <E> Optional<is<E>> c(agl<? extends is<? extends E>> var1);

   @Override
   default <T> Optional<ii.c<T>> a(agl<? extends is<? extends T>> $$0) {
      return this.c($$0).map(is::p);
   }

   default <E> is<E> d(agl<? extends is<? extends E>> $$0) {
      return this.c($$0).orElseThrow(() -> new IllegalStateException("Missing registry: " + $$0));
   }

   Stream<it.d<?>> b();

   static it.b a(final is<? extends is<?>> $$0) {
      return new it.b() {
         @Override
         public <T> Optional<is<T>> c(agl<? extends is<? extends T>> $$0x) {
            is<is<T>> $$1 = (is<is<T>>)$$0;
            return $$1.d((agl<is<T>>)$$0);
         }

         @Override
         public Stream<it.d<?>> b() {
            return $$0.g().stream().map(it.d::a);
         }

         @Override
         public it.b c() {
            return this;
         }
      };
   }

   default it.b c() {
      class a extends it.c implements it.b {
         protected a(Stream<it.d<?>> $$1) {
            super($$1);
         }
      }

      return new a(this.b().map(it.d::c));
   }

   default Lifecycle d() {
      return this.b().map($$0 -> $$0.b.d()).reduce(Lifecycle.stable(), Lifecycle::add);
   }

   public interface b extends it {
   }

   public static class c implements it {
      private final Map<? extends agl<? extends is<?>>, ? extends is<?>> c;

      public c(List<? extends is<?>> $$0) {
         this.c = $$0.stream().collect(Collectors.toUnmodifiableMap(is::c, $$0x -> $$0x));
      }

      public c(Map<? extends agl<? extends is<?>>, ? extends is<?>> $$0) {
         this.c = Map.copyOf($$0);
      }

      public c(Stream<it.d<?>> $$0) {
         this.c = $$0.collect(ImmutableMap.toImmutableMap(it.d::a, it.d::b));
      }

      @Override
      public <E> Optional<is<E>> c(agl<? extends is<? extends E>> $$0) {
         return Optional.ofNullable(this.c.get($$0)).map($$0x -> $$0x);
      }

      @Override
      public Stream<it.d<?>> b() {
         return this.c.entrySet().stream().map(it.d::a);
      }
   }

   public static record d<T>(agl<? extends is<T>> a, is<T> b) {

      private static <T, R extends is<? extends T>> it.d<T> a(Entry<? extends agl<? extends is<?>>, R> $$0) {
         return a((agl<? extends is<?>>)$$0.getKey(), $$0.getValue());
      }

      private static <T> it.d<T> a(agl<? extends is<?>> $$0, is<?> $$1) {
         return new it.d<>((agl<? extends is<T>>)$$0, (is<T>)$$1);
      }

      private it.d<T> c() {
         return new it.d<>(this.a, this.b.l());
      }
   }
}
