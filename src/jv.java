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

public interface jv<T> extends Keyable, jn<T> {
   ald<? extends jv<T>> c();

   default Codec<T> q() {
      return this.a().flatComapMap(ji.c::a, $$0 -> this.a(this.e((T)$$0)));
   }

   default Codec<ji<T>> r() {
      return this.a().flatComapMap($$0 -> $$0, this::a);
   }

   private Codec<ji.c<T>> a() {
      Codec<ji.c<T>> $$0 = ale.a
         .comapFlatMap(
            $$0x -> this.c($$0x)
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Unknown registry key in " + this.c() + ": " + $$0x)),
            $$0x -> $$0x.h().a()
         );
      return ayf.a($$0, (Function<ji.c<T>, Lifecycle>)($$0x -> this.c($$0x.h()).map(ju::b).orElse(Lifecycle.experimental())));
   }

   private DataResult<ji.c<T>> a(ji<T> $$0) {
      return $$0 instanceof ji.c<T> $$1 ? DataResult.success($$1) : DataResult.error(() -> "Unregistered holder in " + this.c() + ": " + $$0);
   }

   default <U> Stream<U> keys(DynamicOps<U> $$0) {
      return this.e().stream().map($$1 -> (U)$$0.createString($$1.toString()));
   }

   @Nullable
   ale b(T var1);

   Optional<ald<T>> d(T var1);

   @Override
   int a(@Nullable T var1);

   @Nullable
   T a(@Nullable ald<T> var1);

   @Nullable
   T a(@Nullable ale var1);

   Optional<ju> c(ald<T> var1);

   Lifecycle d();

   default Optional<T> b(@Nullable ale $$0) {
      return Optional.ofNullable(this.a($$0));
   }

   default Optional<T> e(@Nullable ald<T> $$0) {
      return Optional.ofNullable(this.a($$0));
   }

   default T f(ald<T> $$0) {
      T $$1 = this.a($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Missing key in " + this.c() + ": " + $$0);
      } else {
         return $$1;
      }
   }

   Set<ale> e();

   Set<Entry<ald<T>, T>> g();

   Set<ald<T>> f();

   Optional<ji.c<T>> a(azf var1);

   default Stream<T> s() {
      return StreamSupport.stream(this.spliterator(), false);
   }

   boolean d(ale var1);

   boolean d(ald<T> var1);

   static <T> T a(jv<? super T> $$0, String $$1, T $$2) {
      return a($$0, new ale($$1), $$2);
   }

   static <V, T extends V> T a(jv<V> $$0, ale $$1, T $$2) {
      return a($$0, ald.a($$0.c(), $$1), $$2);
   }

   static <V, T extends V> T a(jv<V> $$0, ald<V> $$1, T $$2) {
      ((ke)$$0).a($$1, (V)$$2, ju.a);
      return $$2;
   }

   static <T> ji.c<T> b(jv<T> $$0, ald<T> $$1, T $$2) {
      return ((ke)$$0).a($$1, $$2, ju.a);
   }

   static <T> ji.c<T> b(jv<T> $$0, ale $$1, T $$2) {
      return b($$0, ald.a($$0.c(), $$1), $$2);
   }

   jv<T> l();

   ji.c<T> f(T var1);

   Optional<ji.c<T>> c(int var1);

   Optional<ji.c<T>> c(ale var1);

   Optional<ji.c<T>> b(ald<T> var1);

   ji<T> e(T var1);

   default ji.c<T> g(ald<T> $$0) {
      return this.b($$0).orElseThrow(() -> new IllegalStateException("Missing key in " + this.c() + ": " + $$0));
   }

   Stream<ji.c<T>> h();

   Optional<jm.c<T>> b(axe<T> var1);

   default Iterable<ji<T>> c(axe<T> $$0) {
      return (Iterable<ji<T>>)DataFixUtils.orElse(this.b($$0), List.of());
   }

   default Optional<ji<T>> a(axe<T> $$0, azf $$1) {
      return this.b($$0).flatMap($$1x -> $$1x.a($$1));
   }

   jm.c<T> a(axe<T> var1);

   Stream<Pair<axe<T>, jm.c<T>>> i();

   Stream<axe<T>> j();

   void m();

   void a(Map<axe<T>, List<ji<T>>> var1);

   default jn<ji<T>> t() {
      return new jn<ji<T>>() {
         public int a(ji<T> $$0) {
            return jv.this.a($$0.a());
         }

         @Nullable
         public ji<T> c(int $$0) {
            return (ji<T>)jv.this.c($$0).orElse(null);
         }

         @Override
         public int b() {
            return jv.this.b();
         }

         @Override
         public Iterator<ji<T>> iterator() {
            return jv.this.h().map($$0 -> (ji<T>)$$0).iterator();
         }
      };
   }

   jl<T> o();

   jk.b<T> p();

   default jk.b<T> u() {
      return new jk.b.a<T>() {
         @Override
         public jk.b<T> a() {
            return jv.this.p();
         }

         @Override
         public Optional<jm.c<T>> a(axe<T> $$0) {
            return Optional.of(this.b($$0));
         }

         @Override
         public jm.c<T> b(axe<T> $$0) {
            return jv.this.a($$0);
         }
      };
   }
}
