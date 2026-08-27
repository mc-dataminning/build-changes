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

public interface jj extends ix.a {
   Logger a = LogUtils.getLogger();
   jj.b b = new jj.c(Map.of()).d();

   <E> Optional<ji<E>> c(ake<? extends ji<? extends E>> var1);

   @Override
   default <T> Optional<ix.b<T>> a(ake<? extends ji<? extends T>> $$0) {
      return this.c($$0).map(ji::p);
   }

   default <E> ji<E> d(ake<? extends ji<? extends E>> $$0) {
      return this.c($$0).orElseThrow(() -> new IllegalStateException("Missing registry: " + $$0));
   }

   Stream<jj.d<?>> c();

   @Override
   default Stream<ake<? extends ji<?>>> a() {
      return this.c().map(jj.d::a);
   }

   static jj.b a(final ji<? extends ji<?>> $$0) {
      return new jj.b() {
         @Override
         public <T> Optional<ji<T>> c(ake<? extends ji<? extends T>> $$0x) {
            ji<ji<T>> $$1 = (ji<ji<T>>)$$0;
            return $$1.e((ake<ji<T>>)$$0);
         }

         @Override
         public Stream<jj.d<?>> c() {
            return $$0.g().stream().map(jj.d::a);
         }

         @Override
         public jj.b d() {
            return this;
         }
      };
   }

   default jj.b d() {
      class a extends jj.c implements jj.b {
         protected a(Stream<jj.d<?>> $$1) {
            super($$1);
         }
      }

      return new a(this.c().map(jj.d::c));
   }

   default Lifecycle e() {
      return this.c().map($$0 -> $$0.b.d()).reduce(Lifecycle.stable(), Lifecycle::add);
   }

   public interface b extends jj {
   }

   public static class c implements jj {
      private final Map<? extends ake<? extends ji<?>>, ? extends ji<?>> c;

      public c(List<? extends ji<?>> $$0) {
         this.c = $$0.stream().collect(Collectors.toUnmodifiableMap(ji::c, $$0x -> $$0x));
      }

      public c(Map<? extends ake<? extends ji<?>>, ? extends ji<?>> $$0) {
         this.c = Map.copyOf($$0);
      }

      public c(Stream<jj.d<?>> $$0) {
         this.c = $$0.collect(ImmutableMap.toImmutableMap(jj.d::a, jj.d::b));
      }

      @Override
      public <E> Optional<ji<E>> c(ake<? extends ji<? extends E>> $$0) {
         return Optional.ofNullable(this.c.get($$0)).map($$0x -> $$0x);
      }

      @Override
      public Stream<jj.d<?>> c() {
         return this.c.entrySet().stream().map(jj.d::a);
      }
   }

   public static record d<T>(ake<? extends ji<T>> a, ji<T> b) {

      private static <T, R extends ji<? extends T>> jj.d<T> a(Entry<? extends ake<? extends ji<?>>, R> $$0) {
         return a((ake<? extends ji<?>>)$$0.getKey(), $$0.getValue());
      }

      private static <T> jj.d<T> a(ake<? extends ji<?>> $$0, ji<?> $$1) {
         return new jj.d<>((ake<? extends ji<T>>)$$0, (ji<T>)$$1);
      }

      private jj.d<T> c() {
         return new jj.d<>(this.a, this.b.l());
      }
   }
}
