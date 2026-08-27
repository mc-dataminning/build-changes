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

public interface jo extends jc.a {
   Logger a = LogUtils.getLogger();
   jo.b b = new jo.c(Map.of()).d();

   <E> Optional<jn<E>> c(aks<? extends jn<? extends E>> var1);

   @Override
   default <T> Optional<jc.b<T>> a(aks<? extends jn<? extends T>> $$0) {
      return this.c($$0).map(jn::p);
   }

   default <E> jn<E> d(aks<? extends jn<? extends E>> $$0) {
      return this.c($$0).orElseThrow(() -> new IllegalStateException("Missing registry: " + $$0));
   }

   Stream<jo.d<?>> c();

   @Override
   default Stream<aks<? extends jn<?>>> a() {
      return this.c().map(jo.d::a);
   }

   static jo.b a(final jn<? extends jn<?>> $$0) {
      return new jo.b() {
         @Override
         public <T> Optional<jn<T>> c(aks<? extends jn<? extends T>> $$0x) {
            jn<jn<T>> $$1 = (jn<jn<T>>)$$0;
            return $$1.e((aks<jn<T>>)$$0);
         }

         @Override
         public Stream<jo.d<?>> c() {
            return $$0.g().stream().map(jo.d::a);
         }

         @Override
         public jo.b d() {
            return this;
         }
      };
   }

   default jo.b d() {
      class a extends jo.c implements jo.b {
         protected a(Stream<jo.d<?>> $$1) {
            super($$1);
         }
      }

      return new a(this.c().map(jo.d::c));
   }

   default Lifecycle e() {
      return this.c().map($$0 -> $$0.b.d()).reduce(Lifecycle.stable(), Lifecycle::add);
   }

   public interface b extends jo {
   }

   public static class c implements jo {
      private final Map<? extends aks<? extends jn<?>>, ? extends jn<?>> c;

      public c(List<? extends jn<?>> $$0) {
         this.c = $$0.stream().collect(Collectors.toUnmodifiableMap(jn::c, $$0x -> $$0x));
      }

      public c(Map<? extends aks<? extends jn<?>>, ? extends jn<?>> $$0) {
         this.c = Map.copyOf($$0);
      }

      public c(Stream<jo.d<?>> $$0) {
         this.c = $$0.collect(ImmutableMap.toImmutableMap(jo.d::a, jo.d::b));
      }

      @Override
      public <E> Optional<jn<E>> c(aks<? extends jn<? extends E>> $$0) {
         return Optional.ofNullable(this.c.get($$0)).map($$0x -> $$0x);
      }

      @Override
      public Stream<jo.d<?>> c() {
         return this.c.entrySet().stream().map(jo.d::a);
      }
   }

   public static record d<T>(aks<? extends jn<T>> a, jn<T> b) {

      private static <T, R extends jn<? extends T>> jo.d<T> a(Entry<? extends aks<? extends jn<?>>, R> $$0) {
         return a((aks<? extends jn<?>>)$$0.getKey(), $$0.getValue());
      }

      private static <T> jo.d<T> a(aks<? extends jn<?>> $$0, jn<?> $$1) {
         return new jo.d<>((aks<? extends jn<T>>)$$0, (jn<T>)$$1);
      }

      private jo.d<T> c() {
         return new jo.d<>(this.a, this.b.l());
      }
   }
}
