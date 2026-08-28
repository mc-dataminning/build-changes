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

public interface kd<T> extends Keyable, js.b<T>, jv<T> {
   @Override
   alo<? extends kd<T>> g();

   default Codec<T> q() {
      return this.b().flatComapMap(jq.c::a, $$0 -> this.a(this.e((T)$$0)));
   }

   default Codec<jq<T>> r() {
      return this.b().flatComapMap($$0 -> $$0, this::a);
   }

   private Codec<jq.c<T>> b() {
      Codec<jq.c<T>> $$0 = alp.a
         .comapFlatMap(
            $$0x -> this.c($$0x)
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Unknown registry key in " + this.g() + ": " + $$0x)),
            $$0x -> $$0x.h().a()
         );
      return azd.a($$0, (Function<jq.c<T>, Lifecycle>)($$0x -> this.d($$0x.h()).map(kc::b).orElse(Lifecycle.experimental())));
   }

   private DataResult<jq.c<T>> a(jq<T> $$0) {
      return $$0 instanceof jq.c<T> $$1 ? DataResult.success($$1) : DataResult.error(() -> "Unregistered holder in " + this.g() + ": " + $$0);
   }

   default <U> Stream<U> keys(DynamicOps<U> $$0) {
      return this.i().stream().map($$1 -> (U)$$0.createString($$1.toString()));
   }

   @Nullable
   alp b(T var1);

   Optional<alo<T>> d(T var1);

   @Override
   int a(@Nullable T var1);

   @Nullable
   T c(@Nullable alo<T> var1);

   @Nullable
   T a(@Nullable alp var1);

   Optional<kc> d(alo<T> var1);

   default Optional<T> b(@Nullable alp $$0) {
      return Optional.ofNullable(this.a($$0));
   }

   default Optional<T> f(@Nullable alo<T> $$0) {
      return Optional.ofNullable(this.c($$0));
   }

   Optional<jq.c<T>> a();

   default T g(alo<T> $$0) {
      T $$1 = this.c($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Missing key in " + this.g() + ": " + $$0);
      } else {
         return $$1;
      }
   }

   Set<alp> i();

   Set<Entry<alo<T>, T>> k();

   Set<alo<T>> j();

   Optional<jq.c<T>> a(bac var1);

   default Stream<T> s() {
      return StreamSupport.stream(this.spliterator(), false);
   }

   boolean d(alp var1);

   boolean e(alo<T> var1);

   static <T> T a(kd<? super T> $$0, String $$1, T $$2) {
      return a($$0, alp.a($$1), $$2);
   }

   static <V, T extends V> T a(kd<V> $$0, alp $$1, T $$2) {
      return a($$0, alo.a($$0.g(), $$1), $$2);
   }

   static <V, T extends V> T a(kd<V> $$0, alo<V> $$1, T $$2) {
      ((km)$$0).a($$1, (V)$$2, kc.a);
      return $$2;
   }

   static <T> jq.c<T> b(kd<T> $$0, alo<T> $$1, T $$2) {
      return ((km)$$0).a($$1, $$2, kc.a);
   }

   static <T> jq.c<T> b(kd<T> $$0, alp $$1, T $$2) {
      return b($$0, alo.a($$0.g(), $$1), $$2);
   }

   kd<T> n();

   jq.c<T> f(T var1);

   Optional<jq.c<T>> c(int var1);

   Optional<jq.c<T>> c(alp var1);

   jq<T> e(T var1);

   default Iterable<jq<T>> c(aya<T> $$0) {
      return (Iterable<jq<T>>)DataFixUtils.orElse(this.a($$0), List.of());
   }

   default Optional<jq<T>> a(aya<T> $$0, bac $$1) {
      return this.a($$0).flatMap($$1x -> $$1x.a($$1));
   }

   Stream<ju.c<T>> l();

   default jv<jq<T>> t() {
      return new jv<jq<T>>() {
         public int a(jq<T> $$0) {
            return kd.this.a($$0.a());
         }

         @Nullable
         public jq<T> c(int $$0) {
            return (jq<T>)kd.this.c($$0).orElse(null);
         }

         @Override
         public int d() {
            return kd.this.d();
         }

         @Override
         public Iterator<jq<T>> iterator() {
            return kd.this.c().map($$0 -> (jq<T>)$$0).iterator();
         }
      };
   }

   kd.a<T> a(ayb.c<T> var1);

   public interface a<T> {
      alo<? extends kd<? extends T>> a();

      js.b<T> c();

      void d();

      int b();
   }
}
