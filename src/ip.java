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

public interface ip extends id.b {
   Logger a = LogUtils.getLogger();
   ip.b b = new ip.c(Map.of()).c();

   <E> Optional<io<E>> c(agh<? extends io<? extends E>> var1);

   @Override
   default <T> Optional<id.c<T>> a(agh<? extends io<? extends T>> $$0) {
      return this.c($$0).map(io::p);
   }

   default <E> io<E> d(agh<? extends io<? extends E>> $$0) {
      return this.c($$0).orElseThrow(() -> new IllegalStateException("Missing registry: " + $$0));
   }

   Stream<ip.d<?>> b();

   static ip.b a(final io<? extends io<?>> $$0) {
      return new ip.b() {
         @Override
         public <T> Optional<io<T>> c(agh<? extends io<? extends T>> $$0x) {
            io<io<T>> $$1 = (io<io<T>>)$$0;
            return $$1.d((agh<io<T>>)$$0);
         }

         @Override
         public Stream<ip.d<?>> b() {
            return $$0.g().stream().map(ip.d::a);
         }

         @Override
         public ip.b c() {
            return this;
         }
      };
   }

   default ip.b c() {
      class a extends ip.c implements ip.b {
         protected a(Stream<ip.d<?>> $$1) {
            super($$1);
         }
      }

      return new a(this.b().map(ip.d::c));
   }

   default Lifecycle d() {
      return this.b().map($$0 -> $$0.b.d()).reduce(Lifecycle.stable(), Lifecycle::add);
   }

   public interface b extends ip {
   }

   public static class c implements ip {
      private final Map<? extends agh<? extends io<?>>, ? extends io<?>> c;

      public c(List<? extends io<?>> $$0) {
         this.c = $$0.stream().collect(Collectors.toUnmodifiableMap(io::c, $$0x -> $$0x));
      }

      public c(Map<? extends agh<? extends io<?>>, ? extends io<?>> $$0) {
         this.c = Map.copyOf($$0);
      }

      public c(Stream<ip.d<?>> $$0) {
         this.c = $$0.collect(ImmutableMap.toImmutableMap(ip.d::a, ip.d::b));
      }

      @Override
      public <E> Optional<io<E>> c(agh<? extends io<? extends E>> $$0) {
         return Optional.ofNullable(this.c.get($$0)).map($$0x -> $$0x);
      }

      @Override
      public Stream<ip.d<?>> b() {
         return this.c.entrySet().stream().map(ip.d::a);
      }
   }

   public static record d<T>(agh<? extends io<T>> a, io<T> b) {

      private static <T, R extends io<? extends T>> ip.d<T> a(Entry<? extends agh<? extends io<?>>, R> $$0) {
         return a((agh<? extends io<?>>)$$0.getKey(), $$0.getValue());
      }

      private static <T> ip.d<T> a(agh<? extends io<?>> $$0, io<?> $$1) {
         return new ip.d<>((agh<? extends io<T>>)$$0, (io<T>)$$1);
      }

      private ip.d<T> c() {
         return new ip.d<>(this.a, this.b.l());
      }
   }
}
