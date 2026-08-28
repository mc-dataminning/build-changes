import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.slf4j.Logger;

public interface js extends jg.a {
   Logger a = LogUtils.getLogger();
   js.b b = new js.c(Map.of()).e();

   @Override
   <E> Optional<jr<E>> a(ald<? extends jr<? extends E>> var1);

   default <E> jr<E> f(ald<? extends jr<? extends E>> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing registry: " + $$0));
   }

   Stream<js.d<?>> a();

   @Override
   default Stream<ald<? extends jr<?>>> b() {
      return this.a().map($$0 -> $$0.a);
   }

   static js.b a(final jr<? extends jr<?>> $$0) {
      return new js.b() {
         @Override
         public <T> Optional<jr<T>> a(ald<? extends jr<? extends T>> $$0x) {
            jr<jr<T>> $$1 = (jr<jr<T>>)$$0;
            return $$1.f((ald<jr<T>>)$$0);
         }

         @Override
         public Stream<js.d<?>> a() {
            return $$0.k().stream().map(js.d::a);
         }

         @Override
         public js.b e() {
            return this;
         }
      };
   }

   default js.b e() {
      class a extends js.c implements js.b {
         protected a(final Stream<js.d<?>> $$1) {
            super($$1);
         }
      }

      return new a(this.a().map(js.d::c));
   }

   public interface b extends js {
   }

   public static class c implements js {
      private final Map<? extends ald<? extends jr<?>>, ? extends jr<?>> c;

      public c(List<? extends jr<?>> $$0) {
         this.c = $$0.stream().collect(Collectors.toUnmodifiableMap(jr::g, $$0x -> $$0x));
      }

      public c(Map<? extends ald<? extends jr<?>>, ? extends jr<?>> $$0) {
         this.c = Map.copyOf($$0);
      }

      public c(Stream<js.d<?>> $$0) {
         this.c = $$0.collect(ImmutableMap.toImmutableMap(js.d::a, js.d::b));
      }

      @Override
      public <E> Optional<jr<E>> a(ald<? extends jr<? extends E>> $$0) {
         return Optional.ofNullable(this.c.get($$0)).map($$0x -> $$0x);
      }

      @Override
      public Stream<js.d<?>> a() {
         return this.c.entrySet().stream().map(js.d::a);
      }
   }

   public static record d<T>(ald<? extends jr<T>> a, jr<T> b) {

      private static <T, R extends jr<? extends T>> js.d<T> a(Entry<? extends ald<? extends jr<?>>, R> $$0) {
         return a((ald<? extends jr<?>>)$$0.getKey(), $$0.getValue());
      }

      private static <T> js.d<T> a(ald<? extends jr<?>> $$0, jr<?> $$1) {
         return new js.d<>((ald<? extends jr<T>>)$$0, (jr<T>)$$1);
      }

      private js.d<T> c() {
         return new js.d<>(this.a, this.b.n());
      }
   }
}
