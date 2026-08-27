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

public interface io<T> extends Keyable, ih<T> {
   afv<? extends io<T>> c();

   default Codec<T> q() {
      Codec<T> $$0 = afw.a
         .flatXmap(
            $$0x -> Optional.ofNullable(this.a($$0x))
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Unknown registry key in " + this.c() + ": " + $$0x)),
            $$0x -> this.c((T)$$0x)
                  .map(afv::a)
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Unknown registry element in " + this.c() + ":" + $$0x))
         );
      Codec<T> $$1 = asg.a($$0x -> this.c((T)$$0x).isPresent() ? this.a((T)$$0x) : -1, this::a, -1);
      return asg.a(asg.b($$0, $$1), this::e, this::e);
   }

   default Codec<ib<T>> r() {
      Codec<ib<T>> $$0 = afw.a
         .flatXmap(
            $$0x -> this.b(afv.a(this.c(), $$0x))
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Unknown registry key in " + this.c() + ": " + $$0x)),
            $$0x -> $$0x.e()
                  .map(afv::a)
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Unknown registry element in " + this.c() + ":" + $$0x))
         );
      return asg.a($$0, (Function<ib<T>, Lifecycle>)($$0x -> this.e((T)$$0x.a())), $$0x -> this.e((T)$$0x.a()));
   }

   default <U> Stream<U> keys(DynamicOps<U> $$0) {
      return this.e().stream().map($$1 -> (U)$$0.createString($$1.toString()));
   }

   @Nullable
   afw b(T var1);

   Optional<afv<T>> c(T var1);

   @Override
   int a(@Nullable T var1);

   @Nullable
   T a(@Nullable afv<T> var1);

   @Nullable
   T a(@Nullable afw var1);

   Lifecycle e(T var1);

   Lifecycle d();

   default Optional<T> b(@Nullable afw $$0) {
      return Optional.ofNullable(this.a($$0));
   }

   default Optional<T> d(@Nullable afv<T> $$0) {
      return Optional.ofNullable(this.a($$0));
   }

   default T e(afv<T> $$0) {
      T $$1 = this.a($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Missing key in " + this.c() + ": " + $$0);
      } else {
         return $$1;
      }
   }

   Set<afw> e();

   Set<Entry<afv<T>, T>> g();

   Set<afv<T>> f();

   Optional<ib.c<T>> a(ate var1);

   default Stream<T> s() {
      return StreamSupport.stream(this.spliterator(), false);
   }

   boolean c(afw var1);

   boolean c(afv<T> var1);

   static <T> T a(io<? super T> $$0, String $$1, T $$2) {
      return a($$0, new afw($$1), $$2);
   }

   static <V, T extends V> T a(io<V> $$0, afw $$1, T $$2) {
      return a($$0, afv.a($$0.c(), $$1), $$2);
   }

   static <V, T extends V> T a(io<V> $$0, afv<V> $$1, T $$2) {
      ((ix)$$0).a($$1, (V)$$2, Lifecycle.stable());
      return $$2;
   }

   static <T> ib.c<T> b(io<T> $$0, afv<T> $$1, T $$2) {
      return ((ix)$$0).a($$1, $$2, Lifecycle.stable());
   }

   static <T> ib.c<T> b(io<T> $$0, afw $$1, T $$2) {
      return b($$0, afv.a($$0.c(), $$1), $$2);
   }

   io<T> l();

   ib.c<T> f(T var1);

   Optional<ib.c<T>> c(int var1);

   Optional<ib.c<T>> b(afv<T> var1);

   ib<T> d(T var1);

   default ib.c<T> f(afv<T> $$0) {
      return this.b($$0).orElseThrow(() -> new IllegalStateException("Missing key in " + this.c() + ": " + $$0));
   }

   Stream<ib.c<T>> h();

   Optional<ig.c<T>> b(arh<T> var1);

   default Iterable<ib<T>> c(arh<T> $$0) {
      return (Iterable<ib<T>>)DataFixUtils.orElse(this.b($$0), List.of());
   }

   ig.c<T> a(arh<T> var1);

   Stream<Pair<arh<T>, ig.c<T>>> i();

   Stream<arh<T>> j();

   void m();

   void a(Map<arh<T>, List<ib<T>>> var1);

   default ih<ib<T>> t() {
      return new ih<ib<T>>() {
         public int a(ib<T> $$0) {
            return io.this.a($$0.a());
         }

         @Nullable
         public ib<T> c(int $$0) {
            return (ib<T>)io.this.c($$0).orElse(null);
         }

         @Override
         public int b() {
            return io.this.b();
         }

         @Override
         public Iterator<ib<T>> iterator() {
            return io.this.h().map($$0 -> (ib<T>)$$0).iterator();
         }
      };
   }

   ie<T> o();

   id.c<T> p();

   default id.c<T> u() {
      return new id.c.a<T>() {
         @Override
         protected id.c<T> a() {
            return io.this.p();
         }

         @Override
         public Optional<ig.c<T>> a(arh<T> $$0) {
            return Optional.of(this.b($$0));
         }

         @Override
         public ig.c<T> b(arh<T> $$0) {
            return io.this.a($$0);
         }
      };
   }
}
