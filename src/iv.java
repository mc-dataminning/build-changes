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

public interface iv<T> extends Keyable, io<T> {
   aix<? extends iv<T>> c();

   default Codec<T> q() {
      Codec<T> $$0 = aiy.a
         .flatXmap(
            $$0x -> Optional.ofNullable(this.a($$0x))
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Unknown registry key in " + this.c() + ": " + $$0x)),
            $$0x -> this.d((T)$$0x)
                  .map(aix::a)
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Unknown registry element in " + this.c() + ":" + $$0x))
         );
      Codec<T> $$1 = avp.a($$0x -> this.d((T)$$0x).isPresent() ? this.a((T)$$0x) : -1, this::a, -1);
      return avp.a(avp.b($$0, $$1), this::f, this::f);
   }

   default Codec<ij<T>> r() {
      Codec<ij<T>> $$0 = aiy.a
         .flatXmap(
            $$0x -> this.c($$0x)
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Unknown registry key in " + this.c() + ": " + $$0x)),
            $$0x -> $$0x.e()
                  .map(aix::a)
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Unknown registry element in " + this.c() + ":" + $$0x))
         );
      return avp.a($$0, (Function<ij<T>, Lifecycle>)($$0x -> this.f((T)$$0x.a())), $$0x -> this.f((T)$$0x.a()));
   }

   default <U> Stream<U> keys(DynamicOps<U> $$0) {
      return this.e().stream().map($$1 -> (U)$$0.createString($$1.toString()));
   }

   @Nullable
   aiy b(T var1);

   Optional<aix<T>> d(T var1);

   @Override
   int a(@Nullable T var1);

   @Nullable
   T a(@Nullable aix<T> var1);

   @Nullable
   T a(@Nullable aiy var1);

   Lifecycle f(T var1);

   Lifecycle d();

   default Optional<T> b(@Nullable aiy $$0) {
      return Optional.ofNullable(this.a($$0));
   }

   default Optional<T> d(@Nullable aix<T> $$0) {
      return Optional.ofNullable(this.a($$0));
   }

   default T e(aix<T> $$0) {
      T $$1 = this.a($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Missing key in " + this.c() + ": " + $$0);
      } else {
         return $$1;
      }
   }

   Set<aiy> e();

   Set<Entry<aix<T>, T>> g();

   Set<aix<T>> f();

   Optional<ij.c<T>> a(awo var1);

   default Stream<T> s() {
      return StreamSupport.stream(this.spliterator(), false);
   }

   boolean d(aiy var1);

   boolean c(aix<T> var1);

   static <T> T a(iv<? super T> $$0, String $$1, T $$2) {
      return a($$0, new aiy($$1), $$2);
   }

   static <V, T extends V> T a(iv<V> $$0, aiy $$1, T $$2) {
      return a($$0, aix.a($$0.c(), $$1), $$2);
   }

   static <V, T extends V> T a(iv<V> $$0, aix<V> $$1, T $$2) {
      ((je)$$0).a($$1, (V)$$2, Lifecycle.stable());
      return $$2;
   }

   static <T> ij.c<T> b(iv<T> $$0, aix<T> $$1, T $$2) {
      return ((je)$$0).a($$1, $$2, Lifecycle.stable());
   }

   static <T> ij.c<T> b(iv<T> $$0, aiy $$1, T $$2) {
      return b($$0, aix.a($$0.c(), $$1), $$2);
   }

   iv<T> l();

   ij.c<T> g(T var1);

   Optional<ij.c<T>> c(int var1);

   Optional<ij.c<T>> c(aiy var1);

   Optional<ij.c<T>> b(aix<T> var1);

   ij<T> e(T var1);

   default ij.c<T> f(aix<T> $$0) {
      return this.b($$0).orElseThrow(() -> new IllegalStateException("Missing key in " + this.c() + ": " + $$0));
   }

   Stream<ij.c<T>> h();

   Optional<in.c<T>> b(auo<T> var1);

   default Iterable<ij<T>> c(auo<T> $$0) {
      return (Iterable<ij<T>>)DataFixUtils.orElse(this.b($$0), List.of());
   }

   default Optional<ij<T>> a(auo<T> $$0, awo $$1) {
      return this.b($$0).flatMap($$1x -> $$1x.a($$1));
   }

   in.c<T> a(auo<T> var1);

   Stream<Pair<auo<T>, in.c<T>>> i();

   Stream<auo<T>> j();

   void m();

   void a(Map<auo<T>, List<ij<T>>> var1);

   default io<ij<T>> t() {
      return new io<ij<T>>() {
         public int a(ij<T> $$0) {
            return iv.this.a($$0.a());
         }

         @Nullable
         public ij<T> c(int $$0) {
            return (ij<T>)iv.this.c($$0).orElse(null);
         }

         @Override
         public int b() {
            return iv.this.b();
         }

         @Override
         public Iterator<ij<T>> iterator() {
            return iv.this.h().map($$0 -> (ij<T>)$$0).iterator();
         }
      };
   }

   im<T> o();

   il.c<T> p();

   default il.c<T> u() {
      return new il.c.a<T>() {
         @Override
         protected il.c<T> a() {
            return iv.this.p();
         }

         @Override
         public Optional<in.c<T>> a(auo<T> $$0) {
            return Optional.of(this.b($$0));
         }

         @Override
         public in.c<T> b(auo<T> $$0) {
            return iv.this.a($$0);
         }
      };
   }
}
