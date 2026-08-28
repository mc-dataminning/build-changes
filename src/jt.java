import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.slf4j.Logger;

public interface jt extends jh.a {
   Logger a = LogUtils.getLogger();
   jt.b b = new jt.c(Map.of()).e();

   @Override
   <E> Optional<js<E>> a(alf<? extends js<? extends E>> var1);

   default <E> js<E> f(alf<? extends js<? extends E>> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing registry: " + $$0));
   }

   Stream<jt.d<?>> a();

   @Override
   default Stream<alf<? extends js<?>>> b() {
      return this.a().map($$0 -> $$0.a);
   }

   static jt.b a(final js<? extends js<?>> $$0) {
      return new jt.b() {
         @Override
         public <T> Optional<js<T>> a(alf<? extends js<? extends T>> $$0x) {
            js<js<T>> $$1 = (js<js<T>>)$$0;
            return $$1.f((alf<js<T>>)$$0);
         }

         @Override
         public Stream<jt.d<?>> a() {
            return $$0.k().stream().map(jt.d::a);
         }

         @Override
         public jt.b e() {
            return this;
         }
      };
   }

   default jt.b e() {
      class a extends jt.c implements jt.b {
         protected a(final Stream<jt.d<?>> $$1) {
            super($$1);
         }
      }

      return new a(this.a().map(jt.d::c));
   }

   public interface b extends jt {
   }

   public static class c implements jt {
      private final Map<? extends alf<? extends js<?>>, ? extends js<?>> c;

      public c(List<? extends js<?>> $$0) {
         this.c = $$0.stream().collect(Collectors.toUnmodifiableMap(js::g, $$0x -> $$0x));
      }

      public c(Map<? extends alf<? extends js<?>>, ? extends js<?>> $$0) {
         this.c = Map.copyOf($$0);
      }

      public c(Stream<jt.d<?>> $$0) {
         this.c = $$0.collect(ImmutableMap.toImmutableMap(jt.d::a, jt.d::b));
      }

      @Override
      public <E> Optional<js<E>> a(alf<? extends js<? extends E>> $$0) {
         return Optional.ofNullable(this.c.get($$0)).map($$0x -> $$0x);
      }

      @Override
      public Stream<jt.d<?>> a() {
         return this.c.entrySet().stream().map(jt.d::a);
      }
   }

   public static record d<T>(alf<? extends js<T>> a, js<T> b) {

      private static <T, R extends js<? extends T>> jt.d<T> a(Entry<? extends alf<? extends js<?>>, R> $$0) {
         return a((alf<? extends js<?>>)$$0.getKey(), $$0.getValue());
      }

      private static <T> jt.d<T> a(alf<? extends js<?>> $$0, js<?> $$1) {
         return new jt.d<>((alf<? extends js<T>>)$$0, (js<T>)$$1);
      }

      private jt.d<T> c() {
         return new jt.d<>(this.a, this.b.n());
      }
   }
}
