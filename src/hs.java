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

public interface hs extends hg.b {
   Logger a = LogUtils.getLogger();
   hs.b b = new hs.c(Map.of()).c();

   <E> Optional<hr<E>> c(acp<? extends hr<? extends E>> var1);

   @Override
   default <T> Optional<hg.c<T>> a(acp<? extends hr<? extends T>> $$0) {
      return this.c($$0).map(hr::p);
   }

   default <E> hr<E> d(acp<? extends hr<? extends E>> $$0) {
      return this.c($$0).orElseThrow(() -> new IllegalStateException("Missing registry: " + $$0));
   }

   Stream<hs.d<?>> b();

   static hs.b a(final hr<? extends hr<?>> $$0) {
      return new hs.b() {
         @Override
         public <T> Optional<hr<T>> c(acp<? extends hr<? extends T>> $$0x) {
            hr<hr<T>> $$1 = (hr<hr<T>>)$$0;
            return $$1.d((acp<hr<T>>)$$0);
         }

         @Override
         public Stream<hs.d<?>> b() {
            return $$0.g().stream().map(hs.d::a);
         }

         @Override
         public hs.b c() {
            return this;
         }
      };
   }

   default hs.b c() {
      class a extends hs.c implements hs.b {
         protected a(Stream<hs.d<?>> $$1) {
            super($$1);
         }
      }

      return new a(this.b().map(hs.d::c));
   }

   default Lifecycle d() {
      return this.b().map($$0 -> $$0.b.d()).reduce(Lifecycle.stable(), Lifecycle::add);
   }

   public interface b extends hs {
   }

   public static class c implements hs {
      private final Map<? extends acp<? extends hr<?>>, ? extends hr<?>> c;

      public c(List<? extends hr<?>> $$0) {
         this.c = $$0.stream().collect(Collectors.toUnmodifiableMap(hr::c, $$0x -> $$0x));
      }

      public c(Map<? extends acp<? extends hr<?>>, ? extends hr<?>> $$0) {
         this.c = Map.copyOf($$0);
      }

      public c(Stream<hs.d<?>> $$0) {
         this.c = $$0.collect(ImmutableMap.toImmutableMap(hs.d::a, hs.d::b));
      }

      @Override
      public <E> Optional<hr<E>> c(acp<? extends hr<? extends E>> $$0) {
         return Optional.ofNullable(this.c.get($$0)).map($$0x -> $$0x);
      }

      @Override
      public Stream<hs.d<?>> b() {
         return this.c.entrySet().stream().map(hs.d::a);
      }
   }

   public static record d<T>(acp<? extends hr<T>> a, hr<T> b) {

      private static <T, R extends hr<? extends T>> hs.d<T> a(Entry<? extends acp<? extends hr<?>>, R> $$0) {
         return a((acp<? extends hr<?>>)$$0.getKey(), $$0.getValue());
      }

      private static <T> hs.d<T> a(acp<? extends hr<?>> $$0, hr<?> $$1) {
         return new hs.d<>((acp<? extends hr<T>>)$$0, (hr<T>)$$1);
      }

      private hs.d<T> c() {
         return new hs.d<>(this.a, this.b.l());
      }
   }
}
