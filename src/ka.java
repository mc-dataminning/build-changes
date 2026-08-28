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

public interface ka extends jo.a {
   Logger a = LogUtils.getLogger();
   ka.b b = new ka.c(Map.of()).d();

   <E> Optional<jz<E>> c(akp<? extends jz<? extends E>> var1);

   @Override
   default <T> Optional<jo.b<T>> a(akp<? extends jz<? extends T>> $$0) {
      return this.c($$0).map(jz::q);
   }

   default <E> jz<E> d(akp<? extends jz<? extends E>> $$0) {
      return this.c($$0).orElseThrow(() -> new IllegalStateException("Missing registry: " + $$0));
   }

   Stream<ka.d<?>> c();

   @Override
   default Stream<akp<? extends jz<?>>> a() {
      return this.c().map(ka.d::a);
   }

   static ka.b a(final jz<? extends jz<?>> $$0) {
      return new ka.b() {
         @Override
         public <T> Optional<jz<T>> c(akp<? extends jz<? extends T>> $$0x) {
            jz<jz<T>> $$1 = (jz<jz<T>>)$$0;
            return $$1.e((akp<jz<T>>)$$0);
         }

         @Override
         public Stream<ka.d<?>> c() {
            return $$0.h().stream().map(ka.d::a);
         }

         @Override
         public ka.b d() {
            return this;
         }
      };
   }

   default ka.b d() {
      class a extends ka.c implements ka.b {
         protected a(final Stream<ka.d<?>> $$1) {
            super($$1);
         }
      }

      return new a(this.c().map(ka.d::c));
   }

   default Lifecycle e() {
      return this.c().map($$0 -> $$0.b.e()).reduce(Lifecycle.stable(), Lifecycle::add);
   }

   public interface b extends ka {
   }

   public static class c implements ka {
      private final Map<? extends akp<? extends jz<?>>, ? extends jz<?>> c;

      public c(List<? extends jz<?>> $$0) {
         this.c = $$0.stream().collect(Collectors.toUnmodifiableMap(jz::d, $$0x -> $$0x));
      }

      public c(Map<? extends akp<? extends jz<?>>, ? extends jz<?>> $$0) {
         this.c = Map.copyOf($$0);
      }

      public c(Stream<ka.d<?>> $$0) {
         this.c = $$0.collect(ImmutableMap.toImmutableMap(ka.d::a, ka.d::b));
      }

      @Override
      public <E> Optional<jz<E>> c(akp<? extends jz<? extends E>> $$0) {
         return Optional.ofNullable(this.c.get($$0)).map($$0x -> $$0x);
      }

      @Override
      public Stream<ka.d<?>> c() {
         return this.c.entrySet().stream().map(ka.d::a);
      }
   }

   public static record d<T>(akp<? extends jz<T>> a, jz<T> b) {

      private static <T, R extends jz<? extends T>> ka.d<T> a(Entry<? extends akp<? extends jz<?>>, R> $$0) {
         return a((akp<? extends jz<?>>)$$0.getKey(), $$0.getValue());
      }

      private static <T> ka.d<T> a(akp<? extends jz<?>> $$0, jz<?> $$1) {
         return new ka.d<>((akp<? extends jz<T>>)$$0, (jz<T>)$$1);
      }

      private ka.d<T> c() {
         return new ka.d<>(this.a, this.b.m());
      }
   }
}
