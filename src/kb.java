import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.slf4j.Logger;

public interface kb extends jp.a {
   Logger a = LogUtils.getLogger();
   kb.b b = new kb.c(Map.of()).f();

   <E> Optional<ka<E>> c(alb<? extends ka<? extends E>> var1);

   @Override
   default <T> Optional<jp.b<T>> a(alb<? extends ka<? extends T>> $$0) {
      return this.c($$0).map(ka::p);
   }

   default <E> ka<E> d(alb<? extends ka<? extends E>> $$0) {
      return this.c($$0).orElseThrow(() -> new IllegalStateException("Missing registry: " + $$0));
   }

   Stream<kb.d<?>> e();

   @Override
   default Stream<alb<? extends ka<?>>> a() {
      return this.e().map($$0 -> $$0.a);
   }

   static kb.b a(final ka<? extends ka<?>> $$0) {
      return new kb.b() {
         @Override
         public <T> Optional<ka<T>> c(alb<? extends ka<? extends T>> $$0x) {
            ka<ka<T>> $$1 = (ka<ka<T>>)$$0;
            return $$1.e((alb<ka<T>>)$$0);
         }

         @Override
         public Stream<kb.d<?>> e() {
            return $$0.h().stream().map(kb.d::a);
         }

         @Override
         public kb.b f() {
            return this;
         }
      };
   }

   default kb.b f() {
      class a extends kb.c implements kb.b {
         protected a(final Stream<kb.d<?>> $$1) {
            super($$1);
         }
      }

      return new a(this.e().map(kb.d::c));
   }

   public interface b extends kb {
   }

   public static class c implements kb {
      private final Map<? extends alb<? extends ka<?>>, ? extends ka<?>> c;

      public c(List<? extends ka<?>> $$0) {
         this.c = $$0.stream().collect(Collectors.toUnmodifiableMap(ka::d, $$0x -> $$0x));
      }

      public c(Map<? extends alb<? extends ka<?>>, ? extends ka<?>> $$0) {
         this.c = Map.copyOf($$0);
      }

      public c(Stream<kb.d<?>> $$0) {
         this.c = $$0.collect(ImmutableMap.toImmutableMap(kb.d::a, kb.d::b));
      }

      @Override
      public <E> Optional<ka<E>> c(alb<? extends ka<? extends E>> $$0) {
         return Optional.ofNullable(this.c.get($$0)).map($$0x -> $$0x);
      }

      @Override
      public Stream<kb.d<?>> e() {
         return this.c.entrySet().stream().map(kb.d::a);
      }
   }

   public static record d<T>(alb<? extends ka<T>> a, ka<T> b) {

      private static <T, R extends ka<? extends T>> kb.d<T> a(Entry<? extends alb<? extends ka<?>>, R> $$0) {
         return a((alb<? extends ka<?>>)$$0.getKey(), $$0.getValue());
      }

      private static <T> kb.d<T> a(alb<? extends ka<?>> $$0, ka<?> $$1) {
         return new kb.d<>((alb<? extends ka<T>>)$$0, (ka<T>)$$1);
      }

      private kb.d<T> c() {
         return new kb.d<>(this.a, this.b.l());
      }
   }
}
