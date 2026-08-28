import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Keyable;
import com.mojang.serialization.Lifecycle;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public interface js<T> extends Keyable, jh.b<T>, jk<T> {
   @Override
   alh<? extends js<T>> g();

   default Codec<T> q() {
      return this.b().flatComapMap(jf.c::a, $$0 -> this.a(this.e((T)$$0)));
   }

   default Codec<jf<T>> r() {
      return this.b().flatComapMap($$0 -> $$0, this::a);
   }

   private Codec<jf.c<T>> b() {
      Codec<jf.c<T>> $$0 = ali.a
         .comapFlatMap(
            $$0x -> this.c($$0x)
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Unknown registry key in " + this.g() + ": " + $$0x)),
            $$0x -> $$0x.h().a()
         );
      return ayw.a($$0, (Function<jf.c<T>, Lifecycle>)($$0x -> this.d($$0x.h()).map(jr::b).orElse(Lifecycle.experimental())));
   }

   private DataResult<jf.c<T>> a(jf<T> $$0) {
      return $$0 instanceof jf.c<T> $$1 ? DataResult.success($$1) : DataResult.error(() -> "Unregistered holder in " + this.g() + ": " + $$0);
   }

   default <U> Stream<U> keys(DynamicOps<U> $$0) {
      return this.i().stream().map($$1 -> (U)$$0.createString($$1.toString()));
   }

   @Nullable
   ali b(T var1);

   Optional<alh<T>> d(T var1);

   @Override
   int a(@Nullable T var1);

   @Nullable
   T c(@Nullable alh<T> var1);

   @Nullable
   T a(@Nullable ali var1);

   Optional<jr> d(alh<T> var1);

   default Optional<T> b(@Nullable ali $$0) {
      return Optional.ofNullable(this.a($$0));
   }

   default Optional<T> f(@Nullable alh<T> $$0) {
      return Optional.ofNullable(this.c($$0));
   }

   Optional<jf.c<T>> a();

   default T g(alh<T> $$0) {
      T $$1 = this.c($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Missing key in " + this.g() + ": " + $$0);
      } else {
         return $$1;
      }
   }

   Set<ali> i();

   Set<Entry<alh<T>, T>> k();

   Set<alh<T>> j();

   Optional<jf.c<T>> a(azx var1);

   default Stream<T> s() {
      return StreamSupport.stream(this.spliterator(), false);
   }

   boolean d(ali var1);

   boolean e(alh<T> var1);

   static <T> T a(js<? super T> $$0, String $$1, T $$2) {
      return a($$0, ali.a($$1), $$2);
   }

   static <V, T extends V> T a(js<V> $$0, ali $$1, T $$2) {
      return a($$0, alh.a($$0.g(), $$1), $$2);
   }

   static <V, T extends V> T a(js<V> $$0, alh<V> $$1, T $$2) {
      ((kb)$$0).a($$1, (V)$$2, jr.a);
      return $$2;
   }

   static <T> jf.c<T> b(js<T> $$0, alh<T> $$1, T $$2) {
      return ((kb)$$0).a($$1, $$2, jr.a);
   }

   static <T> jf.c<T> b(js<T> $$0, ali $$1, T $$2) {
      return b($$0, alh.a($$0.g(), $$1), $$2);
   }

   js<T> n();

   jf.c<T> f(T var1);

   Optional<jf.c<T>> c(int var1);

   Optional<jf.c<T>> c(ali var1);

   jf<T> e(T var1);

   default Iterable<jf<T>> c(axt<T> $$0) {
      return (Iterable<jf<T>>)DataFixUtils.orElse(this.a($$0), List.of());
   }

   default Optional<jf<T>> a(axt<T> $$0, azx $$1) {
      return this.a($$0).flatMap($$1x -> $$1x.a($$1));
   }

   Stream<jj.c<T>> l();

   default jk<jf<T>> t() {
      return new jk<jf<T>>() {
         public int a(jf<T> $$0) {
            return js.this.a($$0.a());
         }

         @Nullable
         public jf<T> c(int $$0) {
            return (jf<T>)js.this.c($$0).orElse(null);
         }

         @Override
         public int d() {
            return js.this.d();
         }

         @Override
         public Iterator<jf<T>> iterator() {
            return js.this.c().map($$0 -> (jf<T>)$$0).iterator();
         }
      };
   }

   js.a<T> a(axu.c<T> var1);

   public interface a<T> {
      alh<? extends js<? extends T>> a();

      jh.b<T> c();

      void d();

      int b();
   }
}
