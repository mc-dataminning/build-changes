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

public interface hr extends hg.b {
   Logger a = LogUtils.getLogger();
   hr.b b = new hr.c(Map.of()).c();

   <E> Optional<hq<E>> c(aev<? extends hq<? extends E>> var1);

   @Override
   default <T> Optional<hg.c<T>> a(aev<? extends hq<? extends T>> $$0) {
      return this.c($$0).map(hq::p);
   }

   default <E> hq<E> d(aev<? extends hq<? extends E>> $$0) {
      return this.c($$0).orElseThrow(() -> new IllegalStateException("Missing registry: " + $$0));
   }

   Stream<hr.d<?>> b();

   static hr.b a(final hq<? extends hq<?>> $$0) {
      return new hr.b() {
         @Override
         public <T> Optional<hq<T>> c(aev<? extends hq<? extends T>> $$0x) {
            hq<hq<T>> $$1 = (hq<hq<T>>)$$0;
            return $$1.d((aev<hq<T>>)$$0);
         }

         @Override
         public Stream<hr.d<?>> b() {
            return $$0.g().stream().map(hr.d::a);
         }

         @Override
         public hr.b c() {
            return this;
         }
      };
   }

   default hr.b c() {
      class a extends hr.c implements hr.b {
         protected a(Stream<hr.d<?>> $$1) {
            super($$1);
         }
      }

      return new a(this.b().map(hr.d::c));
   }

   default Lifecycle d() {
      return this.b().map($$0 -> $$0.b.d()).reduce(Lifecycle.stable(), Lifecycle::add);
   }

   public interface b extends hr {
   }

   public static class c implements hr {
      private final Map<? extends aev<? extends hq<?>>, ? extends hq<?>> c;

      public c(List<? extends hq<?>> $$0) {
         this.c = $$0.stream().collect(Collectors.toUnmodifiableMap(hq::c, $$0x -> $$0x));
      }

      public c(Map<? extends aev<? extends hq<?>>, ? extends hq<?>> $$0) {
         this.c = Map.copyOf($$0);
      }

      public c(Stream<hr.d<?>> $$0) {
         this.c = $$0.collect(ImmutableMap.toImmutableMap(hr.d::a, hr.d::b));
      }

      @Override
      public <E> Optional<hq<E>> c(aev<? extends hq<? extends E>> $$0) {
         return Optional.ofNullable(this.c.get($$0)).map($$0x -> $$0x);
      }

      @Override
      public Stream<hr.d<?>> b() {
         return this.c.entrySet().stream().map(hr.d::a);
      }
   }

   public static record d<T>(aev<? extends hq<T>> a, hq<T> b) {

      private static <T, R extends hq<? extends T>> hr.d<T> a(Entry<? extends aev<? extends hq<?>>, R> $$0) {
         return a((aev<? extends hq<?>>)$$0.getKey(), $$0.getValue());
      }

      private static <T> hr.d<T> a(aev<? extends hq<?>> $$0, hq<?> $$1) {
         return new hr.d<>((aev<? extends hq<T>>)$$0, (hq<T>)$$1);
      }

      private hr.d<T> c() {
         return new hr.d<>(this.a, this.b.l());
      }
   }
}
