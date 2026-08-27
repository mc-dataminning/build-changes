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

public interface jl extends iz.a {
   Logger a = LogUtils.getLogger();
   jl.b b = new jl.c(Map.of()).d();

   <E> Optional<jk<E>> c(akl<? extends jk<? extends E>> var1);

   @Override
   default <T> Optional<iz.b<T>> a(akl<? extends jk<? extends T>> $$0) {
      return this.c($$0).map(jk::p);
   }

   default <E> jk<E> d(akl<? extends jk<? extends E>> $$0) {
      return this.c($$0).orElseThrow(() -> new IllegalStateException("Missing registry: " + $$0));
   }

   Stream<jl.d<?>> c();

   @Override
   default Stream<akl<? extends jk<?>>> a() {
      return this.c().map(jl.d::a);
   }

   static jl.b a(final jk<? extends jk<?>> $$0) {
      return new jl.b() {
         @Override
         public <T> Optional<jk<T>> c(akl<? extends jk<? extends T>> $$0x) {
            jk<jk<T>> $$1 = (jk<jk<T>>)$$0;
            return $$1.e((akl<jk<T>>)$$0);
         }

         @Override
         public Stream<jl.d<?>> c() {
            return $$0.g().stream().map(jl.d::a);
         }

         @Override
         public jl.b d() {
            return this;
         }
      };
   }

   default jl.b d() {
      class a extends jl.c implements jl.b {
         protected a(Stream<jl.d<?>> $$1) {
            super($$1);
         }
      }

      return new a(this.c().map(jl.d::c));
   }

   default Lifecycle e() {
      return this.c().map($$0 -> $$0.b.d()).reduce(Lifecycle.stable(), Lifecycle::add);
   }

   public interface b extends jl {
   }

   public static class c implements jl {
      private final Map<? extends akl<? extends jk<?>>, ? extends jk<?>> c;

      public c(List<? extends jk<?>> $$0) {
         this.c = $$0.stream().collect(Collectors.toUnmodifiableMap(jk::c, $$0x -> $$0x));
      }

      public c(Map<? extends akl<? extends jk<?>>, ? extends jk<?>> $$0) {
         this.c = Map.copyOf($$0);
      }

      public c(Stream<jl.d<?>> $$0) {
         this.c = $$0.collect(ImmutableMap.toImmutableMap(jl.d::a, jl.d::b));
      }

      @Override
      public <E> Optional<jk<E>> c(akl<? extends jk<? extends E>> $$0) {
         return Optional.ofNullable(this.c.get($$0)).map($$0x -> $$0x);
      }

      @Override
      public Stream<jl.d<?>> c() {
         return this.c.entrySet().stream().map(jl.d::a);
      }
   }

   public static record d<T>(akl<? extends jk<T>> a, jk<T> b) {

      private static <T, R extends jk<? extends T>> jl.d<T> a(Entry<? extends akl<? extends jk<?>>, R> $$0) {
         return a((akl<? extends jk<?>>)$$0.getKey(), $$0.getValue());
      }

      private static <T> jl.d<T> a(akl<? extends jk<?>> $$0, jk<?> $$1) {
         return new jl.d<>((akl<? extends jk<T>>)$$0, (jk<T>)$$1);
      }

      private jl.d<T> c() {
         return new jl.d<>(this.a, this.b.l());
      }
   }
}
