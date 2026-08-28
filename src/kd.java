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
   alh<? extends kd<T>> g();

   default Codec<T> q() {
      return this.b().flatComapMap(jq.c::a, $$0 -> this.a(this.e((T)$$0)));
   }

   default Codec<jq<T>> r() {
      return this.b().flatComapMap($$0 -> $$0, this::a);
   }

   private Codec<jq.c<T>> b() {
      Codec<jq.c<T>> $$0 = ali.a
         .comapFlatMap(
            $$0x -> this.c($$0x)
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Unknown registry key in " + this.g() + ": " + $$0x)),
            $$0x -> $$0x.h().a()
         );
      return ayt.a($$0, (Function<jq.c<T>, Lifecycle>)($$0x -> this.d($$0x.h()).map(kc::b).orElse(Lifecycle.experimental())));
   }

   private DataResult<jq.c<T>> a(jq<T> $$0) {
      return $$0 instanceof jq.c<T> $$1 ? DataResult.success($$1) : DataResult.error(() -> "Unregistered holder in " + this.g() + ": " + $$0);
   }

   default <U> Stream<U> keys(DynamicOps<U> $$0) {
      return this.i().stream().map($$1 -> (U)$$0.createString($$1.toString()));
   }

   @Nullable
   ali b(T var1);

   Optional<alh<T>> d(T var1);

   @Override
   int a(@Nullable T var1);

   @Nullable
   T c(@Nullable alh<T> var1);

   @Nullable
   T a(@Nullable ali var1);

   Optional<kc> d(alh<T> var1);

   default Optional<T> b(@Nullable ali $$0) {
      return Optional.ofNullable(this.a($$0));
   }

   default Optional<T> f(@Nullable alh<T> $$0) {
      return Optional.ofNullable(this.c($$0));
   }

   Optional<jq.c<T>> a();

   default T g(alh<T> $$0) {
      T $$1 = this.c($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Missing key in " + this.g() + ": " + $$0);
      } else {
         return $$1;
      }
   }

   Set<ali> i();

   Set<Entry<alh<T>, T>> k();

   Set<alh<T>> j();

   Optional<jq.c<T>> a(azs var1);

   default Stream<T> s() {
      return StreamSupport.stream(this.spliterator(), false);
   }

   boolean d(ali var1);

   boolean e(alh<T> var1);

   static <T> T a(kd<? super T> $$0, String $$1, T $$2) {
      return a($$0, ali.a($$1), $$2);
   }

   static <V, T extends V> T a(kd<V> $$0, ali $$1, T $$2) {
      return a($$0, alh.a($$0.g(), $$1), $$2);
   }

   static <V, T extends V> T a(kd<V> $$0, alh<V> $$1, T $$2) {
      ((km)$$0).a($$1, (V)$$2, kc.a);
      return $$2;
   }

   static <T> jq.c<T> b(kd<T> $$0, alh<T> $$1, T $$2) {
      return ((km)$$0).a($$1, $$2, kc.a);
   }

   static <T> jq.c<T> b(kd<T> $$0, ali $$1, T $$2) {
      return b($$0, alh.a($$0.g(), $$1), $$2);
   }

   kd<T> n();

   jq.c<T> f(T var1);

   Optional<jq.c<T>> c(int var1);

   Optional<jq.c<T>> c(ali var1);

   jq<T> e(T var1);

   default Iterable<jq<T>> c(axq<T> $$0) {
      return (Iterable<jq<T>>)DataFixUtils.orElse(this.a($$0), List.of());
   }

   default Optional<jq<T>> a(axq<T> $$0, azs $$1) {
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

   kd.a<T> a(axr.b<T> var1);

   public interface a<T> {
      alh<? extends kd<? extends T>> a();

      js.b<T> b();

      void c();
   }
}
