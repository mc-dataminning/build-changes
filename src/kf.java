import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.slf4j.Logger;

public interface kf extends jt.a {
   Logger a = LogUtils.getLogger();
   kf.b b = new kf.c(Map.of()).e();

   @Override
   <E> Optional<ke<E>> a(akt<? extends ke<? extends E>> var1);

   default <E> ke<E> e(akt<? extends ke<? extends E>> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing registry: " + $$0));
   }

   Stream<kf.d<?>> a();

   @Override
   default Stream<akt<? extends ke<?>>> b() {
      return this.a().map($$0 -> $$0.a);
   }

   static kf.b a(final ke<? extends ke<?>> $$0) {
      return new kf.b() {
         @Override
         public <T> Optional<ke<T>> a(akt<? extends ke<? extends T>> $$0x) {
            ke<ke<T>> $$1 = (ke<ke<T>>)$$0;
            return $$1.f((akt<ke<T>>)$$0);
         }

         @Override
         public Stream<kf.d<?>> a() {
            return $$0.k().stream().map(kf.d::a);
         }

         @Override
         public kf.b e() {
            return this;
         }
      };
   }

   default kf.b e() {
      class a extends kf.c implements kf.b {
         protected a(final Stream<kf.d<?>> $$1) {
            super($$1);
         }
      }

      return new a(this.a().map(kf.d::c));
   }

   public interface b extends kf {
   }

   public static class c implements kf {
      private final Map<? extends akt<? extends ke<?>>, ? extends ke<?>> c;

      public c(List<? extends ke<?>> $$0) {
         this.c = $$0.stream().collect(Collectors.toUnmodifiableMap(ke::g, $$0x -> $$0x));
      }

      public c(Map<? extends akt<? extends ke<?>>, ? extends ke<?>> $$0) {
         this.c = Map.copyOf($$0);
      }

      public c(Stream<kf.d<?>> $$0) {
         this.c = $$0.collect(ImmutableMap.toImmutableMap(kf.d::a, kf.d::b));
      }

      @Override
      public <E> Optional<ke<E>> a(akt<? extends ke<? extends E>> $$0) {
         return Optional.ofNullable(this.c.get($$0)).map($$0x -> $$0x);
      }

      @Override
      public Stream<kf.d<?>> a() {
         return this.c.entrySet().stream().map(kf.d::a);
      }
   }

   public static record d<T>(akt<? extends ke<T>> a, ke<T> b) {

      private static <T, R extends ke<? extends T>> kf.d<T> a(Entry<? extends akt<? extends ke<?>>, R> $$0) {
         return a((akt<? extends ke<?>>)$$0.getKey(), $$0.getValue());
      }

      private static <T> kf.d<T> a(akt<? extends ke<?>> $$0, ke<?> $$1) {
         return new kf.d<>((akt<? extends ke<T>>)$$0, (ke<T>)$$1);
      }

      private kf.d<T> c() {
         return new kf.d<>(this.a, this.b.n());
      }
   }
}
