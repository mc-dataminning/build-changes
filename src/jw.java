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

public interface jw<T> extends Keyable, jo<T> {
   akj<? extends jw<T>> d();

   default Codec<T> r() {
      return this.b().flatComapMap(jj.c::a, $$0 -> this.a(this.e((T)$$0)));
   }

   default Codec<jj<T>> s() {
      return this.b().flatComapMap($$0 -> $$0, this::a);
   }

   private Codec<jj.c<T>> b() {
      Codec<jj.c<T>> $$0 = akk.a
         .comapFlatMap(
            $$0x -> this.c($$0x)
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Unknown registry key in " + this.d() + ": " + $$0x)),
            $$0x -> $$0x.h().a()
         );
      return axo.a($$0, (Function<jj.c<T>, Lifecycle>)($$0x -> this.c($$0x.h()).map(jv::b).orElse(Lifecycle.experimental())));
   }

   private DataResult<jj.c<T>> a(jj<T> $$0) {
      return $$0 instanceof jj.c<T> $$1 ? DataResult.success($$1) : DataResult.error(() -> "Unregistered holder in " + this.d() + ": " + $$0);
   }

   default <U> Stream<U> keys(DynamicOps<U> $$0) {
      return this.f().stream().map($$1 -> (U)$$0.createString($$1.toString()));
   }

   @Nullable
   akk b(T var1);

   Optional<akj<T>> d(T var1);

   @Override
   int a(@Nullable T var1);

   @Nullable
   T a(@Nullable akj<T> var1);

   @Nullable
   T a(@Nullable akk var1);

   Optional<jv> c(akj<T> var1);

   Lifecycle e();

   default Optional<T> b(@Nullable akk $$0) {
      return Optional.ofNullable(this.a($$0));
   }

   default Optional<T> e(@Nullable akj<T> $$0) {
      return Optional.ofNullable(this.a($$0));
   }

   Optional<jj.c<T>> a();

   default T f(akj<T> $$0) {
      T $$1 = this.a($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Missing key in " + this.d() + ": " + $$0);
      } else {
         return $$1;
      }
   }

   Set<akk> f();

   Set<Entry<akj<T>, T>> h();

   Set<akj<T>> g();

   Optional<jj.c<T>> a(ayo var1);

   default Stream<T> t() {
      return StreamSupport.stream(this.spliterator(), false);
   }

   boolean d(akk var1);

   boolean d(akj<T> var1);

   static <T> T a(jw<? super T> $$0, String $$1, T $$2) {
      return a($$0, new akk($$1), $$2);
   }

   static <V, T extends V> T a(jw<V> $$0, akk $$1, T $$2) {
      return a($$0, akj.a($$0.d(), $$1), $$2);
   }

   static <V, T extends V> T a(jw<V> $$0, akj<V> $$1, T $$2) {
      ((kf)$$0).a($$1, (V)$$2, jv.a);
      return $$2;
   }

   static <T> jj.c<T> b(jw<T> $$0, akj<T> $$1, T $$2) {
      return ((kf)$$0).a($$1, $$2, jv.a);
   }

   static <T> jj.c<T> b(jw<T> $$0, akk $$1, T $$2) {
      return b($$0, akj.a($$0.d(), $$1), $$2);
   }

   jw<T> m();

   jj.c<T> f(T var1);

   Optional<jj.c<T>> c(int var1);

   Optional<jj.c<T>> c(akk var1);

   Optional<jj.c<T>> b(akj<T> var1);

   jj<T> e(T var1);

   default jj.c<T> g(akj<T> $$0) {
      return this.b($$0).orElseThrow(() -> new IllegalStateException("Missing key in " + this.d() + ": " + $$0));
   }

   Stream<jj.c<T>> i();

   Optional<jn.c<T>> b(awm<T> var1);

   default Iterable<jj<T>> c(awm<T> $$0) {
      return (Iterable<jj<T>>)DataFixUtils.orElse(this.b($$0), List.of());
   }

   default Optional<jj<T>> a(awm<T> $$0, ayo $$1) {
      return this.b($$0).flatMap($$1x -> $$1x.a($$1));
   }

   jn.c<T> a(awm<T> var1);

   Stream<Pair<awm<T>, jn.c<T>>> j();

   Stream<awm<T>> k();

   void n();

   void a(Map<awm<T>, List<jj<T>>> var1);

   default jo<jj<T>> u() {
      return new jo<jj<T>>() {
         public int a(jj<T> $$0) {
            return jw.this.a($$0.a());
         }

         @Nullable
         public jj<T> c(int $$0) {
            return (jj<T>)jw.this.c($$0).orElse(null);
         }

         @Override
         public int c() {
            return jw.this.c();
         }

         @Override
         public Iterator<jj<T>> iterator() {
            return jw.this.i().map($$0 -> (jj<T>)$$0).iterator();
         }
      };
   }

   jm<T> p();

   jl.b<T> q();

   default jl.b<T> v() {
      return new jl.b.a<T>() {
         @Override
         public jl.b<T> a() {
            return jw.this.q();
         }

         @Override
         public Optional<jn.c<T>> a(awm<T> $$0) {
            return Optional.of(this.b($$0));
         }

         @Override
         public jn.c<T> b(awm<T> $$0) {
            return jw.this.a($$0);
         }
      };
   }
}
