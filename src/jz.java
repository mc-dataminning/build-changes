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
   akp<? extends jz<T>> d();

   default Codec<T> r() {
      return this.b().flatComapMap(jm.c::a, $$0 -> this.a(this.e((T)$$0)));
   }

   default Codec<jm<T>> s() {
      return this.b().flatComapMap($$0 -> $$0, this::a);
   }

   private Codec<jm.c<T>> b() {
      Codec<jm.c<T>> $$0 = akq.a
         .comapFlatMap(
            $$0x -> this.c($$0x)
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Unknown registry key in " + this.d() + ": " + $$0x)),
            $$0x -> $$0x.h().a()
         );
      return axv.a($$0, (Function<jm.c<T>, Lifecycle>)($$0x -> this.c($$0x.h()).map(jy::b).orElse(Lifecycle.experimental())));
   }

   private DataResult<jm.c<T>> a(jm<T> $$0) {
      return $$0 instanceof jm.c<T> $$1 ? DataResult.success($$1) : DataResult.error(() -> "Unregistered holder in " + this.d() + ": " + $$0);
   }

   default <U> Stream<U> keys(DynamicOps<U> $$0) {
      return this.f().stream().map($$1 -> (U)$$0.createString($$1.toString()));
   }

   @Nullable
   akq b(T var1);

   Optional<akp<T>> d(T var1);

   @Override
   int a(@Nullable T var1);

   @Nullable
   T a(@Nullable akp<T> var1);

   @Nullable
   T a(@Nullable akq var1);

   Optional<jy> c(akp<T> var1);

   Lifecycle e();

   default Optional<T> b(@Nullable akq $$0) {
      return Optional.ofNullable(this.a($$0));
   }

   default Optional<T> e(@Nullable akp<T> $$0) {
      return Optional.ofNullable(this.a($$0));
   }

   Optional<jm.c<T>> a();

   default T f(akp<T> $$0) {
      T $$1 = this.a($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Missing key in " + this.d() + ": " + $$0);
      } else {
         return $$1;
      }
   }

   Set<akq> f();

   Set<Entry<akp<T>, T>> h();

   Set<akp<T>> g();

   Optional<jm.c<T>> a(ayv var1);

   default Stream<T> t() {
      return StreamSupport.stream(this.spliterator(), false);
   }

   boolean d(akq var1);

   boolean d(akp<T> var1);

   static <T> T a(jz<? super T> $$0, String $$1, T $$2) {
      return a($$0, akq.a($$1), $$2);
   }

   static <V, T extends V> T a(jz<V> $$0, akq $$1, T $$2) {
      return a($$0, akp.a($$0.d(), $$1), $$2);
   }

   static <V, T extends V> T a(jz<V> $$0, akp<V> $$1, T $$2) {
      ((ki)$$0).a($$1, (V)$$2, jy.a);
      return $$2;
   }

   static <T> jm.c<T> b(jz<T> $$0, akp<T> $$1, T $$2) {
      return ((ki)$$0).a($$1, $$2, jy.a);
   }

   static <T> jm.c<T> b(jz<T> $$0, akq $$1, T $$2) {
      return b($$0, akp.a($$0.d(), $$1), $$2);
   }

   jz<T> m();

   jm.c<T> f(T var1);

   Optional<jm.c<T>> c(int var1);

   Optional<jm.c<T>> c(akq var1);

   Optional<jm.c<T>> b(akp<T> var1);

   jm<T> e(T var1);

   default jm.c<T> g(akp<T> $$0) {
      return this.b($$0).orElseThrow(() -> new IllegalStateException("Missing key in " + this.d() + ": " + $$0));
   }

   Stream<jm.c<T>> i();

   Optional<jq.c<T>> b(awt<T> var1);

   default Iterable<jm<T>> c(awt<T> $$0) {
      return (Iterable<jm<T>>)DataFixUtils.orElse(this.b($$0), List.of());
   }

   default Optional<jm<T>> a(awt<T> $$0, ayv $$1) {
      return this.b($$0).flatMap($$1x -> $$1x.a($$1));
   }

   jq.c<T> a(awt<T> var1);

   Stream<Pair<awt<T>, jq.c<T>>> j();

   Stream<awt<T>> k();

   void n();

   void a(Map<awt<T>, List<jm<T>>> var1);

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
         public Optional<jq.c<T>> a(awt<T> $$0) {
            return Optional.of(this.b($$0));
         }

         @Override
         public jq.c<T> b(awt<T> $$0) {
            return jz.this.a($$0);
         }
      };
   }
}
