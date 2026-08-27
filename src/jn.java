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

public interface jn<T> extends Keyable, jf<T> {
   aks<? extends jn<T>> c();

   default Codec<T> q() {
      return this.a().flatComapMap(ja.c::a, $$0 -> this.a(this.e((T)$$0)));
   }

   default Codec<ja<T>> r() {
      return this.a().flatComapMap($$0 -> $$0, this::a);
   }

   private Codec<ja.c<T>> a() {
      Codec<ja.c<T>> $$0 = akt.a
         .comapFlatMap(
            $$0x -> this.c($$0x)
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Unknown registry key in " + this.c() + ": " + $$0x)),
            $$0x -> $$0x.h().a()
         );
      return axu.a($$0, (Function<ja.c<T>, Lifecycle>)($$0x -> this.c($$0x.h()).map(jm::b).orElse(Lifecycle.experimental())));
   }

   private DataResult<ja.c<T>> a(ja<T> $$0) {
      return $$0 instanceof ja.c<T> $$1 ? DataResult.success($$1) : DataResult.error(() -> "Unregistered holder in " + this.c() + ": " + $$0);
   }

   default <U> Stream<U> keys(DynamicOps<U> $$0) {
      return this.e().stream().map($$1 -> (U)$$0.createString($$1.toString()));
   }

   @Nullable
   akt b(T var1);

   Optional<aks<T>> d(T var1);

   @Override
   int a(@Nullable T var1);

   @Nullable
   T a(@Nullable aks<T> var1);

   @Nullable
   T a(@Nullable akt var1);

   Optional<jm> c(aks<T> var1);

   Lifecycle d();

   default Optional<T> b(@Nullable akt $$0) {
      return Optional.ofNullable(this.a($$0));
   }

   default Optional<T> e(@Nullable aks<T> $$0) {
      return Optional.ofNullable(this.a($$0));
   }

   default T f(aks<T> $$0) {
      T $$1 = this.a($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Missing key in " + this.c() + ": " + $$0);
      } else {
         return $$1;
      }
   }

   Set<akt> e();

   Set<Entry<aks<T>, T>> g();

   Set<aks<T>> f();

   Optional<ja.c<T>> a(ayt var1);

   default Stream<T> s() {
      return StreamSupport.stream(this.spliterator(), false);
   }

   boolean d(akt var1);

   boolean d(aks<T> var1);

   static <T> T a(jn<? super T> $$0, String $$1, T $$2) {
      return a($$0, new akt($$1), $$2);
   }

   static <V, T extends V> T a(jn<V> $$0, akt $$1, T $$2) {
      return a($$0, aks.a($$0.c(), $$1), $$2);
   }

   static <V, T extends V> T a(jn<V> $$0, aks<V> $$1, T $$2) {
      ((jw)$$0).a($$1, (V)$$2, jm.a);
      return $$2;
   }

   static <T> ja.c<T> b(jn<T> $$0, aks<T> $$1, T $$2) {
      return ((jw)$$0).a($$1, $$2, jm.a);
   }

   static <T> ja.c<T> b(jn<T> $$0, akt $$1, T $$2) {
      return b($$0, aks.a($$0.c(), $$1), $$2);
   }

   jn<T> l();

   ja.c<T> f(T var1);

   Optional<ja.c<T>> c(int var1);

   Optional<ja.c<T>> c(akt var1);

   Optional<ja.c<T>> b(aks<T> var1);

   ja<T> e(T var1);

   default ja.c<T> g(aks<T> $$0) {
      return this.b($$0).orElseThrow(() -> new IllegalStateException("Missing key in " + this.c() + ": " + $$0));
   }

   Stream<ja.c<T>> h();

   Optional<je.c<T>> b(awt<T> var1);

   default Iterable<ja<T>> c(awt<T> $$0) {
      return (Iterable<ja<T>>)DataFixUtils.orElse(this.b($$0), List.of());
   }

   default Optional<ja<T>> a(awt<T> $$0, ayt $$1) {
      return this.b($$0).flatMap($$1x -> $$1x.a($$1));
   }

   je.c<T> a(awt<T> var1);

   Stream<Pair<awt<T>, je.c<T>>> i();

   Stream<awt<T>> j();

   void m();

   void a(Map<awt<T>, List<ja<T>>> var1);

   default jf<ja<T>> t() {
      return new jf<ja<T>>() {
         public int a(ja<T> $$0) {
            return jn.this.a($$0.a());
         }

         @Nullable
         public ja<T> c(int $$0) {
            return (ja<T>)jn.this.c($$0).orElse(null);
         }

         @Override
         public int b() {
            return jn.this.b();
         }

         @Override
         public Iterator<ja<T>> iterator() {
            return jn.this.h().map($$0 -> (ja<T>)$$0).iterator();
         }
      };
   }

   jd<T> o();

   jc.b<T> p();

   default jc.b<T> u() {
      return new jc.b.a<T>() {
         @Override
         public jc.b<T> a() {
            return jn.this.p();
         }

         @Override
         public Optional<je.c<T>> a(awt<T> $$0) {
            return Optional.of(this.b($$0));
         }

         @Override
         public je.c<T> b(awt<T> $$0) {
            return jn.this.a($$0);
         }
      };
   }
}
