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

public interface jz<T> extends Keyable, jr<T> {
   akq<? extends jz<T>> d();

   default Codec<T> r() {
      return this.b().flatComapMap(jm.c::a, $$0 -> this.a(this.e((T)$$0)));
   }

   default Codec<jm<T>> s() {
      return this.b().flatComapMap($$0 -> $$0, this::a);
   }

   private Codec<jm.c<T>> b() {
      Codec<jm.c<T>> $$0 = akr.a
         .comapFlatMap(
            $$0x -> this.c($$0x)
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Unknown registry key in " + this.d() + ": " + $$0x)),
            $$0x -> $$0x.h().a()
         );
      return axw.a($$0, (Function<jm.c<T>, Lifecycle>)($$0x -> this.c($$0x.h()).map(jy::b).orElse(Lifecycle.experimental())));
   }

   private DataResult<jm.c<T>> a(jm<T> $$0) {
      return $$0 instanceof jm.c<T> $$1 ? DataResult.success($$1) : DataResult.error(() -> "Unregistered holder in " + this.d() + ": " + $$0);
   }

   default <U> Stream<U> keys(DynamicOps<U> $$0) {
      return this.f().stream().map($$1 -> (U)$$0.createString($$1.toString()));
   }

   @Nullable
   akr b(T var1);

   Optional<akq<T>> d(T var1);

   @Override
   int a(@Nullable T var1);

   @Nullable
   T a(@Nullable akq<T> var1);

   @Nullable
   T a(@Nullable akr var1);

   Optional<jy> c(akq<T> var1);

   Lifecycle e();

   default Optional<T> b(@Nullable akr $$0) {
      return Optional.ofNullable(this.a($$0));
   }

   default Optional<T> e(@Nullable akq<T> $$0) {
      return Optional.ofNullable(this.a($$0));
   }

   Optional<jm.c<T>> a();

   default T f(akq<T> $$0) {
      T $$1 = this.a($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Missing key in " + this.d() + ": " + $$0);
      } else {
         return $$1;
      }
   }

   Set<akr> f();

   Set<Entry<akq<T>, T>> h();

   Set<akq<T>> g();

   Optional<jm.c<T>> a(ayw var1);

   default Stream<T> t() {
      return StreamSupport.stream(this.spliterator(), false);
   }

   boolean d(akr var1);

   boolean d(akq<T> var1);

   static <T> T a(jz<? super T> $$0, String $$1, T $$2) {
      return a($$0, akr.a($$1), $$2);
   }

   static <V, T extends V> T a(jz<V> $$0, akr $$1, T $$2) {
      return a($$0, akq.a($$0.d(), $$1), $$2);
   }

   static <V, T extends V> T a(jz<V> $$0, akq<V> $$1, T $$2) {
      ((ki)$$0).a($$1, (V)$$2, jy.a);
      return $$2;
   }

   static <T> jm.c<T> b(jz<T> $$0, akq<T> $$1, T $$2) {
      return ((ki)$$0).a($$1, $$2, jy.a);
   }

   static <T> jm.c<T> b(jz<T> $$0, akr $$1, T $$2) {
      return b($$0, akq.a($$0.d(), $$1), $$2);
   }

   jz<T> m();

   jm.c<T> f(T var1);

   Optional<jm.c<T>> c(int var1);

   Optional<jm.c<T>> c(akr var1);

   Optional<jm.c<T>> b(akq<T> var1);

   jm<T> e(T var1);

   default jm.c<T> g(akq<T> $$0) {
      return this.b($$0).orElseThrow(() -> new IllegalStateException("Missing key in " + this.d() + ": " + $$0));
   }

   Stream<jm.c<T>> i();

   Optional<jq.c<T>> b(awu<T> var1);

   default Iterable<jm<T>> c(awu<T> $$0) {
      return (Iterable<jm<T>>)DataFixUtils.orElse(this.b($$0), List.of());
   }

   default Optional<jm<T>> a(awu<T> $$0, ayw $$1) {
      return this.b($$0).flatMap($$1x -> $$1x.a($$1));
   }

   jq.c<T> a(awu<T> var1);

   Stream<Pair<awu<T>, jq.c<T>>> j();

   Stream<awu<T>> k();

   void n();

   void a(Map<awu<T>, List<jm<T>>> var1);

   default jr<jm<T>> u() {
      return new jr<jm<T>>() {
         public int a(jm<T> $$0) {
            return jz.this.a($$0.a());
         }

         @Nullable
         public jm<T> c(int $$0) {
            return (jm<T>)jz.this.c($$0).orElse(null);
         }

         @Override
         public int c() {
            return jz.this.c();
         }

         @Override
         public Iterator<jm<T>> iterator() {
            return jz.this.i().map($$0 -> (jm<T>)$$0).iterator();
         }
      };
   }

   jp<T> p();

   jo.b<T> q();

   default jo.b<T> v() {
      return new jo.b.a<T>() {
         @Override
         public jo.b<T> a() {
            return jz.this.q();
         }

         @Override
         public Optional<jq.c<T>> a(awu<T> $$0) {
            return Optional.of(this.b($$0));
         }

         @Override
         public jq.c<T> b(awu<T> $$0) {
            return jz.this.a($$0);
         }
      };
   }
}
