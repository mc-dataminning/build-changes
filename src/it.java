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

public interface it<T> extends Keyable, im<T> {
   ahf<? extends it<T>> c();

   default Codec<T> q() {
      Codec<T> $$0 = ahg.a
         .flatXmap(
            $$0x -> Optional.ofNullable(this.a($$0x))
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Unknown registry key in " + this.c() + ": " + $$0x)),
            $$0x -> this.c((T)$$0x)
                  .map(ahf::a)
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Unknown registry element in " + this.c() + ":" + $$0x))
         );
      Codec<T> $$1 = atv.a($$0x -> this.c((T)$$0x).isPresent() ? this.a((T)$$0x) : -1, this::a, -1);
      return atv.a(atv.b($$0, $$1), this::e, this::e);
   }

   default Codec<ih<T>> r() {
      Codec<ih<T>> $$0 = ahg.a
         .flatXmap(
            $$0x -> this.b(ahf.a(this.c(), $$0x))
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Unknown registry key in " + this.c() + ": " + $$0x)),
            $$0x -> $$0x.e()
                  .map(ahf::a)
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Unknown registry element in " + this.c() + ":" + $$0x))
         );
      return atv.a($$0, (Function<ih<T>, Lifecycle>)($$0x -> this.e((T)$$0x.a())), $$0x -> this.e((T)$$0x.a()));
   }

   default <U> Stream<U> keys(DynamicOps<U> $$0) {
      return this.e().stream().map($$1 -> (U)$$0.createString($$1.toString()));
   }

   @Nullable
   ahg b(T var1);

   Optional<ahf<T>> c(T var1);

   @Override
   int a(@Nullable T var1);

   @Nullable
   T a(@Nullable ahf<T> var1);

   @Nullable
   T a(@Nullable ahg var1);

   Lifecycle e(T var1);

   Lifecycle d();

   default Optional<T> b(@Nullable ahg $$0) {
      return Optional.ofNullable(this.a($$0));
   }

   default Optional<T> d(@Nullable ahf<T> $$0) {
      return Optional.ofNullable(this.a($$0));
   }

   default T e(ahf<T> $$0) {
      T $$1 = this.a($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Missing key in " + this.c() + ": " + $$0);
      } else {
         return $$1;
      }
   }

   Set<ahg> e();

   Set<Entry<ahf<T>, T>> g();

   Set<ahf<T>> f();

   Optional<ih.c<T>> a(auu var1);

   default Stream<T> s() {
      return StreamSupport.stream(this.spliterator(), false);
   }

   boolean c(ahg var1);

   boolean c(ahf<T> var1);

   static <T> T a(it<? super T> $$0, String $$1, T $$2) {
      return a($$0, new ahg($$1), $$2);
   }

   static <V, T extends V> T a(it<V> $$0, ahg $$1, T $$2) {
      return a($$0, ahf.a($$0.c(), $$1), $$2);
   }

   static <V, T extends V> T a(it<V> $$0, ahf<V> $$1, T $$2) {
      ((jc)$$0).a($$1, (V)$$2, Lifecycle.stable());
      return $$2;
   }

   static <T> ih.c<T> b(it<T> $$0, ahf<T> $$1, T $$2) {
      return ((jc)$$0).a($$1, $$2, Lifecycle.stable());
   }

   static <T> ih.c<T> b(it<T> $$0, ahg $$1, T $$2) {
      return b($$0, ahf.a($$0.c(), $$1), $$2);
   }

   it<T> l();

   ih.c<T> f(T var1);

   Optional<ih.c<T>> c(int var1);

   Optional<ih.c<T>> b(ahf<T> var1);

   ih<T> d(T var1);

   default ih.c<T> f(ahf<T> $$0) {
      return this.b($$0).orElseThrow(() -> new IllegalStateException("Missing key in " + this.c() + ": " + $$0));
   }

   Stream<ih.c<T>> h();

   Optional<il.c<T>> b(asv<T> var1);

   default Iterable<ih<T>> c(asv<T> $$0) {
      return (Iterable<ih<T>>)DataFixUtils.orElse(this.b($$0), List.of());
   }

   il.c<T> a(asv<T> var1);

   Stream<Pair<asv<T>, il.c<T>>> i();

   Stream<asv<T>> j();

   void m();

   void a(Map<asv<T>, List<ih<T>>> var1);

   default im<ih<T>> t() {
      return new im<ih<T>>() {
         public int a(ih<T> $$0) {
            return it.this.a($$0.a());
         }

         @Nullable
         public ih<T> c(int $$0) {
            return (ih<T>)it.this.c($$0).orElse(null);
         }

         @Override
         public int b() {
            return it.this.b();
         }

         @Override
         public Iterator<ih<T>> iterator() {
            return it.this.h().map($$0 -> (ih<T>)$$0).iterator();
         }
      };
   }

   ik<T> o();

   ij.c<T> p();

   default ij.c<T> u() {
      return new ij.c.a<T>() {
         @Override
         protected ij.c<T> a() {
            return it.this.p();
         }

         @Override
         public Optional<il.c<T>> a(asv<T> $$0) {
            return Optional.of(this.b($$0));
         }

         @Override
         public il.c<T> b(asv<T> $$0) {
            return it.this.a($$0);
         }
      };
   }
}
