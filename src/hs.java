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

public interface hs<T> extends Keyable, hk<T> {
   aeo<? extends hs<T>> c();

   default Codec<T> q() {
      Codec<T> $$0 = aep.a
         .flatXmap(
            $$0x -> Optional.ofNullable(this.a($$0x))
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Unknown registry key in " + this.c() + ": " + $$0x)),
            $$0x -> this.c((T)$$0x)
                  .map(aeo::a)
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Unknown registry element in " + this.c() + ":" + $$0x))
         );
      Codec<T> $$1 = aqw.a($$0x -> this.c((T)$$0x).isPresent() ? this.a((T)$$0x) : -1, this::a, -1);
      return aqw.a(aqw.b($$0, $$1), this::e, this::e);
   }

   default Codec<hf<T>> r() {
      Codec<hf<T>> $$0 = aep.a
         .flatXmap(
            $$0x -> this.b(aeo.a(this.c(), $$0x))
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Unknown registry key in " + this.c() + ": " + $$0x)),
            $$0x -> $$0x.e()
                  .map(aeo::a)
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Unknown registry element in " + this.c() + ":" + $$0x))
         );
      return aqw.a($$0, (Function<hf<T>, Lifecycle>)($$0x -> this.e((T)$$0x.a())), $$0x -> this.e((T)$$0x.a()));
   }

   default <U> Stream<U> keys(DynamicOps<U> $$0) {
      return this.e().stream().map($$1 -> (U)$$0.createString($$1.toString()));
   }

   @Nullable
   aep b(T var1);

   Optional<aeo<T>> c(T var1);

   @Override
   int a(@Nullable T var1);

   @Nullable
   T a(@Nullable aeo<T> var1);

   @Nullable
   T a(@Nullable aep var1);

   Lifecycle e(T var1);

   Lifecycle d();

   default Optional<T> b(@Nullable aep $$0) {
      return Optional.ofNullable(this.a($$0));
   }

   default Optional<T> d(@Nullable aeo<T> $$0) {
      return Optional.ofNullable(this.a($$0));
   }

   default T e(aeo<T> $$0) {
      T $$1 = this.a($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Missing key in " + this.c() + ": " + $$0);
      } else {
         return $$1;
      }
   }

   Set<aep> e();

   Set<Entry<aeo<T>, T>> g();

   Set<aeo<T>> f();

   Optional<hf.c<T>> a(art var1);

   default Stream<T> s() {
      return StreamSupport.stream(this.spliterator(), false);
   }

   boolean c(aep var1);

   boolean c(aeo<T> var1);

   static <T> T a(hs<? super T> $$0, String $$1, T $$2) {
      return a($$0, new aep($$1), $$2);
   }

   static <V, T extends V> T a(hs<V> $$0, aep $$1, T $$2) {
      return a($$0, aeo.a($$0.c(), $$1), $$2);
   }

   static <V, T extends V> T a(hs<V> $$0, aeo<V> $$1, T $$2) {
      ((ib)$$0).a($$1, (V)$$2, Lifecycle.stable());
      return $$2;
   }

   static <T> hf.c<T> b(hs<T> $$0, aeo<T> $$1, T $$2) {
      return ((ib)$$0).a($$1, $$2, Lifecycle.stable());
   }

   static <T> hf.c<T> b(hs<T> $$0, aep $$1, T $$2) {
      return b($$0, aeo.a($$0.c(), $$1), $$2);
   }

   static <V, T extends V> T a(hs<V> $$0, int $$1, String $$2, T $$3) {
      ((ib)$$0).b($$1, aeo.a($$0.c(), new aep($$2)), (V)$$3, Lifecycle.stable());
      return $$3;
   }

   hs<T> l();

   hf.c<T> f(T var1);

   Optional<hf.c<T>> c(int var1);

   Optional<hf.c<T>> b(aeo<T> var1);

   hf<T> d(T var1);

   default hf.c<T> f(aeo<T> $$0) {
      return this.b($$0).orElseThrow(() -> new IllegalStateException("Missing key in " + this.c() + ": " + $$0));
   }

   Stream<hf.c<T>> h();

   Optional<hj.c<T>> b(apy<T> var1);

   default Iterable<hf<T>> c(apy<T> $$0) {
      return (Iterable<hf<T>>)DataFixUtils.orElse(this.b($$0), List.of());
   }

   hj.c<T> a(apy<T> var1);

   Stream<Pair<apy<T>, hj.c<T>>> i();

   Stream<apy<T>> j();

   void m();

   void a(Map<apy<T>, List<hf<T>>> var1);

   default hk<hf<T>> t() {
      return new hk<hf<T>>() {
         public int a(hf<T> $$0) {
            return hs.this.a($$0.a());
         }

         @Nullable
         public hf<T> c(int $$0) {
            return (hf<T>)hs.this.c($$0).orElse(null);
         }

         @Override
         public int b() {
            return hs.this.b();
         }

         @Override
         public Iterator<hf<T>> iterator() {
            return hs.this.h().map($$0 -> (hf<T>)$$0).iterator();
         }
      };
   }

   hi<T> o();

   hh.c<T> p();

   default hh.c<T> u() {
      return new hh.c.a<T>() {
         @Override
         protected hh.c<T> a() {
            return hs.this.p();
         }

         @Override
         public Optional<hj.c<T>> a(apy<T> $$0) {
            return Optional.of(this.b($$0));
         }

         @Override
         public hj.c<T> b(apy<T> $$0) {
            return hs.this.a($$0);
         }
      };
   }
}
