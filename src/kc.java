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

public interface kc<T> extends Keyable, jr.b<T>, ju<T> {
   @Override
   alg<? extends kc<T>> g();

   default Codec<T> q() {
      return this.b().flatComapMap(jp.c::a, $$0 -> this.a(this.e((T)$$0)));
   }

   default Codec<jp<T>> r() {
      return this.b().flatComapMap($$0 -> $$0, this::a);
   }

   private Codec<jp.c<T>> b() {
      Codec<jp.c<T>> $$0 = alh.a
         .comapFlatMap(
            $$0x -> this.c($$0x)
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Unknown registry key in " + this.g() + ": " + $$0x)),
            $$0x -> $$0x.h().a()
         );
      return ays.a($$0, (Function<jp.c<T>, Lifecycle>)($$0x -> this.d($$0x.h()).map(kb::b).orElse(Lifecycle.experimental())));
   }

   private DataResult<jp.c<T>> a(jp<T> $$0) {
      return $$0 instanceof jp.c<T> $$1 ? DataResult.success($$1) : DataResult.error(() -> "Unregistered holder in " + this.g() + ": " + $$0);
   }

   default <U> Stream<U> keys(DynamicOps<U> $$0) {
      return this.i().stream().map($$1 -> (U)$$0.createString($$1.toString()));
   }

   @Nullable
   alh b(T var1);

   Optional<alg<T>> d(T var1);

   @Override
   int a(@Nullable T var1);

   @Nullable
   T c(@Nullable alg<T> var1);

   @Nullable
   T a(@Nullable alh var1);

   Optional<kb> d(alg<T> var1);

   default Optional<T> b(@Nullable alh $$0) {
      return Optional.ofNullable(this.a($$0));
   }

   default Optional<T> f(@Nullable alg<T> $$0) {
      return Optional.ofNullable(this.c($$0));
   }

   Optional<jp.c<T>> a();

   default T g(alg<T> $$0) {
      T $$1 = this.c($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Missing key in " + this.g() + ": " + $$0);
      } else {
         return $$1;
      }
   }

   Set<alh> i();

   Set<Entry<alg<T>, T>> k();

   Set<alg<T>> j();

   Optional<jp.c<T>> a(azr var1);

   default Stream<T> s() {
      return StreamSupport.stream(this.spliterator(), false);
   }

   boolean d(alh var1);

   boolean e(alg<T> var1);

   static <T> T a(kc<? super T> $$0, String $$1, T $$2) {
      return a($$0, alh.a($$1), $$2);
   }

   static <V, T extends V> T a(kc<V> $$0, alh $$1, T $$2) {
      return a($$0, alg.a($$0.g(), $$1), $$2);
   }

   static <V, T extends V> T a(kc<V> $$0, alg<V> $$1, T $$2) {
      ((kl)$$0).a($$1, (V)$$2, kb.a);
      return $$2;
   }

   static <T> jp.c<T> b(kc<T> $$0, alg<T> $$1, T $$2) {
      return ((kl)$$0).a($$1, $$2, kb.a);
   }

   static <T> jp.c<T> b(kc<T> $$0, alh $$1, T $$2) {
      return b($$0, alg.a($$0.g(), $$1), $$2);
   }

   kc<T> n();

   jp.c<T> f(T var1);

   Optional<jp.c<T>> c(int var1);

   Optional<jp.c<T>> c(alh var1);

   jp<T> e(T var1);

   default Iterable<jp<T>> c(axp<T> $$0) {
      return (Iterable<jp<T>>)DataFixUtils.orElse(this.a($$0), List.of());
   }

   default Optional<jp<T>> a(axp<T> $$0, azr $$1) {
      return this.a($$0).flatMap($$1x -> $$1x.a($$1));
   }

   Stream<jt.c<T>> l();

   default ju<jp<T>> t() {
      return new ju<jp<T>>() {
         public int a(jp<T> $$0) {
            return kc.this.a($$0.a());
         }

         @Nullable
         public jp<T> c(int $$0) {
            return (jp<T>)kc.this.c($$0).orElse(null);
         }

         @Override
         public int d() {
            return kc.this.d();
         }

         @Override
         public Iterator<jp<T>> iterator() {
            return kc.this.c().map($$0 -> (jp<T>)$$0).iterator();
         }
      };
   }

   kc.a<T> a(axq.b<T> var1);

   public interface a<T> {
      alg<? extends kc<? extends T>> a();

      jr.b<T> b();

      void c();
   }
}
