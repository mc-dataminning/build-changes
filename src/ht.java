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
   aet<? extends ht<T>> c();

   default Codec<T> q() {
      Codec<T> $$0 = aeu.a
         .flatXmap(
            $$0x -> Optional.ofNullable(this.a($$0x))
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Unknown registry key in " + this.c() + ": " + $$0x)),
            $$0x -> this.c((T)$$0x)
                  .map(aet::a)
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Unknown registry element in " + this.c() + ":" + $$0x))
         );
      Codec<T> $$1 = arb.a($$0x -> this.c((T)$$0x).isPresent() ? this.a((T)$$0x) : -1, this::a, -1);
      return arb.a(arb.b($$0, $$1), this::e, this::e);
   }

   default Codec<hg<T>> r() {
      Codec<hg<T>> $$0 = aeu.a
         .flatXmap(
            $$0x -> this.b(aet.a(this.c(), $$0x))
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Unknown registry key in " + this.c() + ": " + $$0x)),
            $$0x -> $$0x.e()
                  .map(aet::a)
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Unknown registry element in " + this.c() + ":" + $$0x))
         );
      return arb.a($$0, (Function<hg<T>, Lifecycle>)($$0x -> this.e((T)$$0x.a())), $$0x -> this.e((T)$$0x.a()));
   }

   default <U> Stream<U> keys(DynamicOps<U> $$0) {
      return this.e().stream().map($$1 -> (U)$$0.createString($$1.toString()));
   }

   @Nullable
   aeu b(T var1);

   Optional<aet<T>> c(T var1);

   @Override
   int a(@Nullable T var1);

   @Nullable
   T a(@Nullable aet<T> var1);

   @Nullable
   T a(@Nullable aeu var1);

   Lifecycle e(T var1);

   Lifecycle d();

   default Optional<T> b(@Nullable aeu $$0) {
      return Optional.ofNullable(this.a($$0));
   }

   default Optional<T> d(@Nullable aet<T> $$0) {
      return Optional.ofNullable(this.a($$0));
   }

   default T e(aet<T> $$0) {
      T $$1 = this.a($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Missing key in " + this.c() + ": " + $$0);
      } else {
         return $$1;
      }
   }

   Set<aeu> e();

   Set<Entry<aet<T>, T>> g();

   Set<aet<T>> f();

   Optional<hg.c<T>> a(arx var1);

   default Stream<T> s() {
      return StreamSupport.stream(this.spliterator(), false);
   }

   boolean c(aeu var1);

   boolean c(aet<T> var1);

   static <T> T a(ht<? super T> $$0, String $$1, T $$2) {
      return a($$0, new aeu($$1), $$2);
   }

   static <V, T extends V> T a(ht<V> $$0, aeu $$1, T $$2) {
      return a($$0, aet.a($$0.c(), $$1), $$2);
   }

   static <V, T extends V> T a(ht<V> $$0, aet<V> $$1, T $$2) {
      ((ic)$$0).a($$1, (V)$$2, Lifecycle.stable());
      return $$2;
   }

   static <T> hg.c<T> b(ht<T> $$0, aet<T> $$1, T $$2) {
      return ((ic)$$0).a($$1, $$2, Lifecycle.stable());
   }

   static <T> hg.c<T> b(ht<T> $$0, aeu $$1, T $$2) {
      return b($$0, aet.a($$0.c(), $$1), $$2);
   }

   ht<T> l();

   hg.c<T> f(T var1);

   Optional<hg.c<T>> c(int var1);

   Optional<hg.c<T>> b(aet<T> var1);

   hg<T> d(T var1);

   default hg.c<T> f(aet<T> $$0) {
      return this.b($$0).orElseThrow(() -> new IllegalStateException("Missing key in " + this.c() + ": " + $$0));
   }

   Stream<hg.c<T>> h();

   Optional<hk.c<T>> b(aqd<T> var1);

   default Iterable<hg<T>> c(aqd<T> $$0) {
      return (Iterable<hg<T>>)DataFixUtils.orElse(this.b($$0), List.of());
   }

   hk.c<T> a(aqd<T> var1);

   Stream<Pair<aqd<T>, hk.c<T>>> i();

   Stream<aqd<T>> j();

   void m();

   void a(Map<aqd<T>, List<hg<T>>> var1);

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
         public Optional<hk.c<T>> a(aqd<T> $$0) {
            return Optional.of(this.b($$0));
         }

         @Override
         public hk.c<T> b(aqd<T> $$0) {
            return ht.this.a($$0);
         }
      };
   }
}
