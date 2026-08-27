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

public interface hu extends hi.b {
   Logger a = LogUtils.getLogger();
   hu.b b = new hu.c(Map.of()).c();

   <E> Optional<ht<E>> c(aet<? extends ht<? extends E>> var1);

   @Override
   default <T> Optional<hi.c<T>> a(aet<? extends ht<? extends T>> $$0) {
      return this.c($$0).map(ht::p);
   }

   default <E> ht<E> d(aet<? extends ht<? extends E>> $$0) {
      return this.c($$0).orElseThrow(() -> new IllegalStateException("Missing registry: " + $$0));
   }

   Stream<hu.d<?>> b();

   static hu.b a(final ht<? extends ht<?>> $$0) {
      return new hu.b() {
         @Override
         public <T> Optional<ht<T>> c(aet<? extends ht<? extends T>> $$0x) {
            ht<ht<T>> $$1 = (ht<ht<T>>)$$0;
            return $$1.d((aet<ht<T>>)$$0);
         }

         @Override
         public Stream<hu.d<?>> b() {
            return $$0.g().stream().map(hu.d::a);
         }

         @Override
         public hu.b c() {
            return this;
         }
      };
   }

   default hu.b c() {
      class a extends hu.c implements hu.b {
         protected a(Stream<hu.d<?>> $$1) {
            super($$1);
         }
      }

      return new a(this.b().map(hu.d::c));
   }

   default Lifecycle d() {
      return this.b().map($$0 -> $$0.b.d()).reduce(Lifecycle.stable(), Lifecycle::add);
   }

   public interface b extends hu {
   }

   public static class c implements hu {
      private final Map<? extends aet<? extends ht<?>>, ? extends ht<?>> c;

      public c(List<? extends ht<?>> $$0) {
         this.c = $$0.stream().collect(Collectors.toUnmodifiableMap(ht::c, $$0x -> $$0x));
      }

      public c(Map<? extends aet<? extends ht<?>>, ? extends ht<?>> $$0) {
         this.c = Map.copyOf($$0);
      }

      public c(Stream<hu.d<?>> $$0) {
         this.c = $$0.collect(ImmutableMap.toImmutableMap(hu.d::a, hu.d::b));
      }

      @Override
      public <E> Optional<ht<E>> c(aet<? extends ht<? extends E>> $$0) {
         return Optional.ofNullable(this.c.get($$0)).map($$0x -> $$0x);
      }

      @Override
      public Stream<hu.d<?>> b() {
         return this.c.entrySet().stream().map(hu.d::a);
      }
   }

   public static record d<T>(aet<? extends ht<T>> a, ht<T> b) {

      private static <T, R extends ht<? extends T>> hu.d<T> a(Entry<? extends aet<? extends ht<?>>, R> $$0) {
         return a((aet<? extends ht<?>>)$$0.getKey(), $$0.getValue());
      }

      private static <T> hu.d<T> a(aet<? extends ht<?>> $$0, ht<?> $$1) {
         return new hu.d<>((aet<? extends ht<T>>)$$0, (ht<T>)$$1);
      }

      private hu.d<T> c() {
         return new hu.d<>(this.a, this.b.l());
      }
   }
}
