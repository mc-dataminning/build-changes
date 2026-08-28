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

public interface jw extends jk.a {
   Logger a = LogUtils.getLogger();
   jw.b b = new jw.c(Map.of()).d();

   <E> Optional<jv<E>> c(ald<? extends jv<? extends E>> var1);

   @Override
   default <T> Optional<jk.b<T>> a(ald<? extends jv<? extends T>> $$0) {
      return this.c($$0).map(jv::p);
   }

   default <E> jv<E> d(ald<? extends jv<? extends E>> $$0) {
      return this.c($$0).orElseThrow(() -> new IllegalStateException("Missing registry: " + $$0));
   }

   Stream<jw.d<?>> c();

   @Override
   default Stream<ald<? extends jv<?>>> a() {
      return this.c().map(jw.d::a);
   }

   static jw.b a(final jv<? extends jv<?>> $$0) {
      return new jw.b() {
         @Override
         public <T> Optional<jv<T>> c(ald<? extends jv<? extends T>> $$0x) {
            jv<jv<T>> $$1 = (jv<jv<T>>)$$0;
            return $$1.e((ald<jv<T>>)$$0);
         }

         @Override
         public Stream<jw.d<?>> c() {
            return $$0.g().stream().map(jw.d::a);
         }

         @Override
         public jw.b d() {
            return this;
         }
      };
   }

   default jw.b d() {
      class a extends jw.c implements jw.b {
         protected a(final Stream<jw.d<?>> $$1) {
            super($$1);
         }
      }

      return new a(this.c().map(jw.d::c));
   }

   default Lifecycle e() {
      return this.c().map($$0 -> $$0.b.d()).reduce(Lifecycle.stable(), Lifecycle::add);
   }

   public interface b extends jw {
   }

   public static class c implements jw {
      private final Map<? extends ald<? extends jv<?>>, ? extends jv<?>> c;

      public c(List<? extends jv<?>> $$0) {
         this.c = $$0.stream().collect(Collectors.toUnmodifiableMap(jv::c, $$0x -> $$0x));
      }

      public c(Map<? extends ald<? extends jv<?>>, ? extends jv<?>> $$0) {
         this.c = Map.copyOf($$0);
      }

      public c(Stream<jw.d<?>> $$0) {
         this.c = $$0.collect(ImmutableMap.toImmutableMap(jw.d::a, jw.d::b));
      }

      @Override
      public <E> Optional<jv<E>> c(ald<? extends jv<? extends E>> $$0) {
         return Optional.ofNullable(this.c.get($$0)).map($$0x -> $$0x);
      }

      @Override
      public Stream<jw.d<?>> c() {
         return this.c.entrySet().stream().map(jw.d::a);
      }
   }

   public static record d<T>(ald<? extends jv<T>> a, jv<T> b) {

      private static <T, R extends jv<? extends T>> jw.d<T> a(Entry<? extends ald<? extends jv<?>>, R> $$0) {
         return a((ald<? extends jv<?>>)$$0.getKey(), $$0.getValue());
      }

      private static <T> jw.d<T> a(ald<? extends jv<?>> $$0, jv<?> $$1) {
         return new jw.d<>((ald<? extends jv<T>>)$$0, (jv<T>)$$1);
      }

      private jw.d<T> c() {
         return new jw.d<>(this.a, this.b.l());
      }
   }
}
