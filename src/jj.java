import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Keyable;
import com.mojang.serialization.Lifecycle;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public interface jj<T> extends Keyable, jb<T> {
   akg<? extends jj<T>> c();

   default Codec<T> q() {
      return this.a().flatComapMap(iw.c::a, $$0 -> this.a(this.e((T)$$0)));
   }

   default Codec<iw<T>> r() {
      return this.a().flatComapMap($$0 -> $$0, this::a);
   }

   private Codec<iw.c<T>> a() {
      Codec<iw.c<T>> $$0 = akh.a
         .comapFlatMap(
            $$0x -> this.c($$0x)
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Unknown registry key in " + this.c() + ": " + $$0x)),
            $$0x -> $$0x.h().a()
         );
      return axh.a($$0, (Function<iw.c<T>, Lifecycle>)($$0x -> this.c($$0x.h()).map(ji::b).orElse(Lifecycle.experimental())));
   }

   private DataResult<iw.c<T>> a(iw<T> $$0) {
      return $$0 instanceof iw.c<T> $$1 ? DataResult.success($$1) : DataResult.error(() -> "Unregistered holder in " + this.c() + ": " + $$0);
   }

   default <U> Stream<U> keys(DynamicOps<U> $$0) {
      return this.e().stream().map($$1 -> (U)$$0.createString($$1.toString()));
   }

   @Nullable
   akh b(T var1);

   Optional<akg<T>> d(T var1);

   @Override
   int a(@Nullable T var1);

   @Nullable
   T a(@Nullable akg<T> var1);

   @Nullable
   T a(@Nullable akh var1);

   Optional<ji> c(akg<T> var1);

   Lifecycle d();

   default Optional<T> b(@Nullable akh $$0) {
      return Optional.ofNullable(this.a($$0));
   }

   default Optional<T> e(@Nullable akg<T> $$0) {
      return Optional.ofNullable(this.a($$0));
   }

   default T f(akg<T> $$0) {
      T $$1 = this.a($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Missing key in " + this.c() + ": " + $$0);
      } else {
         return $$1;
      }
   }

   Set<akh> e();

   Set<Entry<akg<T>, T>> g();

   Set<akg<T>> f();

   Optional<iw.c<T>> a(ayg var1);

   default Stream<T> s() {
      return StreamSupport.stream(this.spliterator(), false);
   }

   boolean d(akh var1);

   boolean d(akg<T> var1);

   static <T> T a(jj<? super T> $$0, String $$1, T $$2) {
      return a($$0, new akh($$1), $$2);
   }

   static <V, T extends V> T a(jj<V> $$0, akh $$1, T $$2) {
      return a($$0, akg.a($$0.c(), $$1), $$2);
   }

   static <V, T extends V> T a(jj<V> $$0, akg<V> $$1, T $$2) {
      ((js)$$0).a($$1, (V)$$2, ji.a);
      return $$2;
   }

   static <T> iw.c<T> b(jj<T> $$0, akg<T> $$1, T $$2) {
      return ((js)$$0).a($$1, $$2, ji.a);
   }

   static <T> iw.c<T> b(jj<T> $$0, akh $$1, T $$2) {
      return b($$0, akg.a($$0.c(), $$1), $$2);
   }

   jj<T> l();

   iw.c<T> f(T var1);

   Optional<iw.c<T>> c(int var1);

   Optional<iw.c<T>> c(akh var1);

   Optional<iw.c<T>> b(akg<T> var1);

   iw<T> e(T var1);

   default iw.c<T> g(akg<T> $$0) {
      return this.b($$0).orElseThrow(() -> new IllegalStateException("Missing key in " + this.c() + ": " + $$0));
   }

   Stream<iw.c<T>> h();

   Optional<ja.c<T>> b(awg<T> var1);

   default Iterable<iw<T>> c(awg<T> $$0) {
      return (Iterable<iw<T>>)DataFixUtils.orElse(this.b($$0), List.of());
   }

   default Optional<iw<T>> a(awg<T> $$0, ayg $$1) {
      return this.b($$0).flatMap($$1x -> $$1x.a($$1));
   }

   ja.c<T> a(awg<T> var1);

   Stream<Pair<awg<T>, ja.c<T>>> i();

   Stream<awg<T>> j();

   void m();

   void a(Map<awg<T>, List<iw<T>>> var1);

   default jb<iw<T>> t() {
      return new jb<iw<T>>() {
         public int a(iw<T> $$0) {
            return jj.this.a($$0.a());
         }

         @Nullable
         public iw<T> c(int $$0) {
            return (iw<T>)jj.this.c($$0).orElse(null);
         }

         @Override
         public int b() {
            return jj.this.b();
         }

         @Override
         public Iterator<iw<T>> iterator() {
            return jj.this.h().map($$0 -> (iw<T>)$$0).iterator();
         }
      };
   }

   iz<T> o();

   iy.b<T> p();

   default iy.b<T> u() {
      return new iy.b.a<T>() {
         @Override
         public iy.b<T> a() {
            return jj.this.p();
         }

         @Override
         public Optional<ja.c<T>> a(awg<T> $$0) {
            return Optional.of(this.b($$0));
         }

         @Override
         public ja.c<T> b(awg<T> $$0) {
            return jj.this.a($$0);
         }
      };
   }
}
