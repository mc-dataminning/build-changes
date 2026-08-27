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

public interface ht<T> extends Keyable, hl<T> {
   aew<? extends ht<T>> c();

   default Codec<T> q() {
      Codec<T> $$0 = aex.a
         .flatXmap(
            $$0x -> Optional.ofNullable(this.a($$0x))
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Unknown registry key in " + this.c() + ": " + $$0x)),
            $$0x -> this.c((T)$$0x)
                  .map(aew::a)
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Unknown registry element in " + this.c() + ":" + $$0x))
         );
      Codec<T> $$1 = arg.a($$0x -> this.c((T)$$0x).isPresent() ? this.a((T)$$0x) : -1, this::a, -1);
      return arg.a(arg.b($$0, $$1), this::e, this::e);
   }

   default Codec<hg<T>> r() {
      Codec<hg<T>> $$0 = aex.a
         .flatXmap(
            $$0x -> this.b(aew.a(this.c(), $$0x))
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Unknown registry key in " + this.c() + ": " + $$0x)),
            $$0x -> $$0x.e()
                  .map(aew::a)
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Unknown registry element in " + this.c() + ":" + $$0x))
         );
      return arg.a($$0, (Function<hg<T>, Lifecycle>)($$0x -> this.e((T)$$0x.a())), $$0x -> this.e((T)$$0x.a()));
   }

   default <U> Stream<U> keys(DynamicOps<U> $$0) {
      return this.e().stream().map($$1 -> (U)$$0.createString($$1.toString()));
   }

   @Nullable
   aex b(T var1);

   Optional<aew<T>> c(T var1);

   @Override
   int a(@Nullable T var1);

   @Nullable
   T a(@Nullable aew<T> var1);

   @Nullable
   T a(@Nullable aex var1);

   Lifecycle e(T var1);

   Lifecycle d();

   default Optional<T> b(@Nullable aex $$0) {
      return Optional.ofNullable(this.a($$0));
   }

   default Optional<T> d(@Nullable aew<T> $$0) {
      return Optional.ofNullable(this.a($$0));
   }

   default T e(aew<T> $$0) {
      T $$1 = this.a($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Missing key in " + this.c() + ": " + $$0);
      } else {
         return $$1;
      }
   }

   Set<aex> e();

   Set<Entry<aew<T>, T>> g();

   Set<aew<T>> f();

   Optional<hg.c<T>> a(asc var1);

   default Stream<T> s() {
      return StreamSupport.stream(this.spliterator(), false);
   }

   boolean c(aex var1);

   boolean c(aew<T> var1);

   static <T> T a(ht<? super T> $$0, String $$1, T $$2) {
      return a($$0, new aex($$1), $$2);
   }

   static <V, T extends V> T a(ht<V> $$0, aex $$1, T $$2) {
      return a($$0, aew.a($$0.c(), $$1), $$2);
   }

   static <V, T extends V> T a(ht<V> $$0, aew<V> $$1, T $$2) {
      ((ic)$$0).a($$1, (V)$$2, Lifecycle.stable());
      return $$2;
   }

   static <T> hg.c<T> b(ht<T> $$0, aew<T> $$1, T $$2) {
      return ((ic)$$0).a($$1, $$2, Lifecycle.stable());
   }

   static <T> hg.c<T> b(ht<T> $$0, aex $$1, T $$2) {
      return b($$0, aew.a($$0.c(), $$1), $$2);
   }

   ht<T> l();

   hg.c<T> f(T var1);

   Optional<hg.c<T>> c(int var1);

   Optional<hg.c<T>> b(aew<T> var1);

   hg<T> d(T var1);

   default hg.c<T> f(aew<T> $$0) {
      return this.b($$0).orElseThrow(() -> new IllegalStateException("Missing key in " + this.c() + ": " + $$0));
   }

   Stream<hg.c<T>> h();

   Optional<hk.c<T>> b(aqi<T> var1);

   default Iterable<hg<T>> c(aqi<T> $$0) {
      return (Iterable<hg<T>>)DataFixUtils.orElse(this.b($$0), List.of());
   }

   hk.c<T> a(aqi<T> var1);

   Stream<Pair<aqi<T>, hk.c<T>>> i();

   Stream<aqi<T>> j();

   void m();

   void a(Map<aqi<T>, List<hg<T>>> var1);

   default hl<hg<T>> t() {
      return new hl<hg<T>>() {
         public int a(hg<T> $$0) {
            return ht.this.a($$0.a());
         }

         @Nullable
         public hg<T> c(int $$0) {
            return (hg<T>)ht.this.c($$0).orElse(null);
         }

         @Override
         public int b() {
            return ht.this.b();
         }

         @Override
         public Iterator<hg<T>> iterator() {
            return ht.this.h().map($$0 -> (hg<T>)$$0).iterator();
         }
      };
   }

   hj<T> o();

   hi.c<T> p();

   default hi.c<T> u() {
      return new hi.c.a<T>() {
         @Override
         protected hi.c<T> a() {
            return ht.this.p();
         }

         @Override
         public Optional<hk.c<T>> a(aqi<T> $$0) {
            return Optional.of(this.b($$0));
         }

         @Override
         public hk.c<T> b(aqi<T> $$0) {
            return ht.this.a($$0);
         }
      };
   }
}
