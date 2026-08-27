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

public interface ht extends hh.b {
   Logger a = LogUtils.getLogger();
   ht.b b = new ht.c(Map.of()).c();

   <E> Optional<hs<E>> c(aeo<? extends hs<? extends E>> var1);

   @Override
   default <T> Optional<hh.c<T>> a(aeo<? extends hs<? extends T>> $$0) {
      return this.c($$0).map(hs::p);
   }

   default <E> hs<E> d(aeo<? extends hs<? extends E>> $$0) {
      return this.c($$0).orElseThrow(() -> new IllegalStateException("Missing registry: " + $$0));
   }

   Stream<ht.d<?>> b();

   static ht.b a(final hs<? extends hs<?>> $$0) {
      return new ht.b() {
         @Override
         public <T> Optional<hs<T>> c(aeo<? extends hs<? extends T>> $$0x) {
            hs<hs<T>> $$1 = (hs<hs<T>>)$$0;
            return $$1.d((aeo<hs<T>>)$$0);
         }

         @Override
         public Stream<ht.d<?>> b() {
            return $$0.g().stream().map(ht.d::a);
         }

         @Override
         public ht.b c() {
            return this;
         }
      };
   }

   default ht.b c() {
      class a extends ht.c implements ht.b {
         protected a(Stream<ht.d<?>> $$1) {
            super($$1);
         }
      }

      return new a(this.b().map(ht.d::c));
   }

   default Lifecycle d() {
      return this.b().map($$0 -> $$0.b.d()).reduce(Lifecycle.stable(), Lifecycle::add);
   }

   public interface b extends ht {
   }

   public static class c implements ht {
      private final Map<? extends aeo<? extends hs<?>>, ? extends hs<?>> c;

      public c(List<? extends hs<?>> $$0) {
         this.c = $$0.stream().collect(Collectors.toUnmodifiableMap(hs::c, $$0x -> $$0x));
      }

      public c(Map<? extends aeo<? extends hs<?>>, ? extends hs<?>> $$0) {
         this.c = Map.copyOf($$0);
      }

      public c(Stream<ht.d<?>> $$0) {
         this.c = $$0.collect(ImmutableMap.toImmutableMap(ht.d::a, ht.d::b));
      }

      @Override
      public <E> Optional<hs<E>> c(aeo<? extends hs<? extends E>> $$0) {
         return Optional.ofNullable(this.c.get($$0)).map($$0x -> $$0x);
      }

      @Override
      public Stream<ht.d<?>> b() {
         return this.c.entrySet().stream().map(ht.d::a);
      }
   }

   public static record d<T>(aeo<? extends hs<T>> a, hs<T> b) {

      private static <T, R extends hs<? extends T>> ht.d<T> a(Entry<? extends aeo<? extends hs<?>>, R> $$0) {
         return a((aeo<? extends hs<?>>)$$0.getKey(), $$0.getValue());
      }

      private static <T> ht.d<T> a(aeo<? extends hs<?>> $$0, hs<?> $$1) {
         return new ht.d<>((aeo<? extends hs<T>>)$$0, (hs<T>)$$1);
      }

      private ht.d<T> c() {
         return new ht.d<>(this.a, this.b.l());
      }
   }
}
