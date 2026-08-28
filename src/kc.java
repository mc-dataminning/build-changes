import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.slf4j.Logger;

public interface kc extends jq.a {
   Logger a = LogUtils.getLogger();
   kc.b b = new kc.c(Map.of()).e();

   @Override
   <E> Optional<kb<E>> a(ald<? extends kb<? extends E>> var1);

   default <E> kb<E> e(ald<? extends kb<? extends E>> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing registry: " + $$0));
   }

   Stream<kc.d<?>> d();

   @Override
   default Stream<ald<? extends kb<?>>> a() {
      return this.d().map($$0 -> $$0.a);
   }

   static kc.b a(final kb<? extends kb<?>> $$0) {
      return new kc.b() {
         @Override
         public <T> Optional<kb<T>> a(ald<? extends kb<? extends T>> $$0x) {
            kb<kb<T>> $$1 = (kb<kb<T>>)$$0;
            return $$1.f((ald<kb<T>>)$$0);
         }

         @Override
         public Stream<kc.d<?>> d() {
            return $$0.k().stream().map(kc.d::a);
         }

         @Override
         public kc.b e() {
            return this;
         }
      };
   }

   default kc.b e() {
      class a extends kc.c implements kc.b {
         protected a(final Stream<kc.d<?>> $$1) {
            super($$1);
         }
      }

      return new a(this.d().map(kc.d::c));
   }

   public interface b extends kc {
   }

   public static class c implements kc {
      private final Map<? extends ald<? extends kb<?>>, ? extends kb<?>> c;

      public c(List<? extends kb<?>> $$0) {
         this.c = $$0.stream().collect(Collectors.toUnmodifiableMap(kb::g, $$0x -> $$0x));
      }

      public c(Map<? extends ald<? extends kb<?>>, ? extends kb<?>> $$0) {
         this.c = Map.copyOf($$0);
      }

      public c(Stream<kc.d<?>> $$0) {
         this.c = $$0.collect(ImmutableMap.toImmutableMap(kc.d::a, kc.d::b));
      }

      @Override
      public <E> Optional<kb<E>> a(ald<? extends kb<? extends E>> $$0) {
         return Optional.ofNullable(this.c.get($$0)).map($$0x -> $$0x);
      }

      @Override
      public Stream<kc.d<?>> d() {
         return this.c.entrySet().stream().map(kc.d::a);
      }
   }

   public static record d<T>(ald<? extends kb<T>> a, kb<T> b) {

      private static <T, R extends kb<? extends T>> kc.d<T> a(Entry<? extends ald<? extends kb<?>>, R> $$0) {
         return a((ald<? extends kb<?>>)$$0.getKey(), $$0.getValue());
      }

      private static <T> kc.d<T> a(ald<? extends kb<?>> $$0, kb<?> $$1) {
         return new kc.d<>((ald<? extends kb<T>>)$$0, (kb<T>)$$1);
      }

      private kc.d<T> c() {
         return new kc.d<>(this.a, this.b.n());
      }
   }
}
