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

public interface jb extends ip.a {
   Logger a = LogUtils.getLogger();
   jb.b b = new jb.c(Map.of()).d();

   <E> Optional<ja<E>> c(aju<? extends ja<? extends E>> var1);

   @Override
   default <T> Optional<ip.b<T>> a(aju<? extends ja<? extends T>> $$0) {
      return this.c($$0).map(ja::p);
   }

   default <E> ja<E> d(aju<? extends ja<? extends E>> $$0) {
      return this.c($$0).orElseThrow(() -> new IllegalStateException("Missing registry: " + $$0));
   }

   Stream<jb.d<?>> c();

   @Override
   default Stream<aju<? extends ja<?>>> a() {
      return this.c().map(jb.d::a);
   }

   static jb.b a(final ja<? extends ja<?>> $$0) {
      return new jb.b() {
         @Override
         public <T> Optional<ja<T>> c(aju<? extends ja<? extends T>> $$0x) {
            ja<ja<T>> $$1 = (ja<ja<T>>)$$0;
            return $$1.e((aju<ja<T>>)$$0);
         }

         @Override
         public Stream<jb.d<?>> c() {
            return $$0.g().stream().map(jb.d::a);
         }

         @Override
         public jb.b d() {
            return this;
         }
      };
   }

   default jb.b d() {
      class a extends jb.c implements jb.b {
         protected a(Stream<jb.d<?>> $$1) {
            super($$1);
         }
      }

      return new a(this.c().map(jb.d::c));
   }

   default Lifecycle e() {
      return this.c().map($$0 -> $$0.b.d()).reduce(Lifecycle.stable(), Lifecycle::add);
   }

   public interface b extends jb {
   }

   public static class c implements jb {
      private final Map<? extends aju<? extends ja<?>>, ? extends ja<?>> c;

      public c(List<? extends ja<?>> $$0) {
         this.c = $$0.stream().collect(Collectors.toUnmodifiableMap(ja::c, $$0x -> $$0x));
      }

      public c(Map<? extends aju<? extends ja<?>>, ? extends ja<?>> $$0) {
         this.c = Map.copyOf($$0);
      }

      public c(Stream<jb.d<?>> $$0) {
         this.c = $$0.collect(ImmutableMap.toImmutableMap(jb.d::a, jb.d::b));
      }

      @Override
      public <E> Optional<ja<E>> c(aju<? extends ja<? extends E>> $$0) {
         return Optional.ofNullable(this.c.get($$0)).map($$0x -> $$0x);
      }

      @Override
      public Stream<jb.d<?>> c() {
         return this.c.entrySet().stream().map(jb.d::a);
      }
   }

   public static record d<T>(aju<? extends ja<T>> a, ja<T> b) {

      private static <T, R extends ja<? extends T>> jb.d<T> a(Entry<? extends aju<? extends ja<?>>, R> $$0) {
         return a((aju<? extends ja<?>>)$$0.getKey(), $$0.getValue());
      }

      private static <T> jb.d<T> a(aju<? extends ja<?>> $$0, ja<?> $$1) {
         return new jb.d<>((aju<? extends ja<T>>)$$0, (ja<T>)$$1);
      }

      private jb.d<T> c() {
         return new jb.d<>(this.a, this.b.l());
      }
   }
}
