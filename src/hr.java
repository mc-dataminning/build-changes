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

public interface hr<T> extends Keyable, hj<T> {
   aeq<? extends hr<T>> c();

   default Codec<T> q() {
      Codec<T> $$0 = aer.a
         .flatXmap(
            $$0x -> Optional.ofNullable(this.a($$0x))
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Unknown registry key in " + this.c() + ": " + $$0x)),
            $$0x -> this.c((T)$$0x)
                  .map(aeq::a)
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Unknown registry element in " + this.c() + ":" + $$0x))
         );
      Codec<T> $$1 = aqy.a($$0x -> this.c((T)$$0x).isPresent() ? this.a((T)$$0x) : -1, this::a, -1);
      return aqy.a(aqy.b($$0, $$1), this::e, this::e);
   }

   default Codec<he<T>> r() {
      Codec<he<T>> $$0 = aer.a
         .flatXmap(
            $$0x -> this.b(aeq.a(this.c(), $$0x))
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Unknown registry key in " + this.c() + ": " + $$0x)),
            $$0x -> $$0x.e()
                  .map(aeq::a)
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Unknown registry element in " + this.c() + ":" + $$0x))
         );
      return aqy.a($$0, (Function<he<T>, Lifecycle>)($$0x -> this.e((T)$$0x.a())), $$0x -> this.e((T)$$0x.a()));
   }

   default <U> Stream<U> keys(DynamicOps<U> $$0) {
      return this.e().stream().map($$1 -> (U)$$0.createString($$1.toString()));
   }

   @Nullable
   aer b(T var1);

   Optional<aeq<T>> c(T var1);

   @Override
   int a(@Nullable T var1);

   @Nullable
   T a(@Nullable aeq<T> var1);

   @Nullable
   T a(@Nullable aer var1);

   Lifecycle e(T var1);

   Lifecycle d();

   default Optional<T> b(@Nullable aer $$0) {
      return Optional.ofNullable(this.a($$0));
   }

   default Optional<T> d(@Nullable aeq<T> $$0) {
      return Optional.ofNullable(this.a($$0));
   }

   default T e(aeq<T> $$0) {
      T $$1 = this.a($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Missing key in " + this.c() + ": " + $$0);
      } else {
         return $$1;
      }
   }

   Set<aer> e();

   Set<Entry<aeq<T>, T>> g();

   Set<aeq<T>> f();

   Optional<he.c<T>> a(aru var1);

   default Stream<T> s() {
      return StreamSupport.stream(this.spliterator(), false);
   }

   boolean c(aer var1);

   boolean c(aeq<T> var1);

   static <T> T a(hr<? super T> $$0, String $$1, T $$2) {
      return a($$0, new aer($$1), $$2);
   }

   static <V, T extends V> T a(hr<V> $$0, aer $$1, T $$2) {
      return a($$0, aeq.a($$0.c(), $$1), $$2);
   }

   static <V, T extends V> T a(hr<V> $$0, aeq<V> $$1, T $$2) {
      ((ia)$$0).a($$1, (V)$$2, Lifecycle.stable());
      return $$2;
   }

   static <T> he.c<T> b(hr<T> $$0, aeq<T> $$1, T $$2) {
      return ((ia)$$0).a($$1, $$2, Lifecycle.stable());
   }

   static <T> he.c<T> b(hr<T> $$0, aer $$1, T $$2) {
      return b($$0, aeq.a($$0.c(), $$1), $$2);
   }

   hr<T> l();

   he.c<T> f(T var1);

   Optional<he.c<T>> c(int var1);

   Optional<he.c<T>> b(aeq<T> var1);

   he<T> d(T var1);

   default he.c<T> f(aeq<T> $$0) {
      return this.b($$0).orElseThrow(() -> new IllegalStateException("Missing key in " + this.c() + ": " + $$0));
   }

   Stream<he.c<T>> h();

   Optional<hi.c<T>> b(aqa<T> var1);

   default Iterable<he<T>> c(aqa<T> $$0) {
      return (Iterable<he<T>>)DataFixUtils.orElse(this.b($$0), List.of());
   }

   hi.c<T> a(aqa<T> var1);

   Stream<Pair<aqa<T>, hi.c<T>>> i();

   Stream<aqa<T>> j();

   void m();

   void a(Map<aqa<T>, List<he<T>>> var1);

   default hj<he<T>> t() {
      return new hj<he<T>>() {
         public int a(he<T> $$0) {
            return hr.this.a($$0.a());
         }

         @Nullable
         public he<T> c(int $$0) {
            return (he<T>)hr.this.c($$0).orElse(null);
         }

         @Override
         public int b() {
            return hr.this.b();
         }

         @Override
         public Iterator<he<T>> iterator() {
            return hr.this.h().map($$0 -> (he<T>)$$0).iterator();
         }
      };
   }

   hh<T> o();

   hg.c<T> p();

   default hg.c<T> u() {
      return new hg.c.a<T>() {
         @Override
         protected hg.c<T> a() {
            return hr.this.p();
         }

         @Override
         public Optional<hi.c<T>> a(aqa<T> $$0) {
            return Optional.of(this.b($$0));
         }

         @Override
         public hi.c<T> b(aqa<T> $$0) {
            return hr.this.a($$0);
         }
      };
   }
}
