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

public interface kf<T> extends Keyable, ju.b<T>, jx<T> {
   @Override
   alc<? extends kf<T>> g();

   default Codec<T> q() {
      return this.b().flatComapMap(js.c::a, $$0 -> this.a(this.e((T)$$0)));
   }

   default Codec<js<T>> r() {
      return this.b().flatComapMap($$0 -> $$0, this::a);
   }

   private Codec<js.c<T>> b() {
      Codec<js.c<T>> $$0 = ald.a
         .comapFlatMap(
            $$0x -> this.c($$0x)
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Unknown registry key in " + this.g() + ": " + $$0x)),
            $$0x -> $$0x.h().a()
         );
      return ays.a($$0, (Function<js.c<T>, Lifecycle>)($$0x -> this.d($$0x.h()).map(ke::b).orElse(Lifecycle.experimental())));
   }

   private DataResult<js.c<T>> a(js<T> $$0) {
      return $$0 instanceof js.c<T> $$1 ? DataResult.success($$1) : DataResult.error(() -> "Unregistered holder in " + this.g() + ": " + $$0);
   }

   default <U> Stream<U> keys(DynamicOps<U> $$0) {
      return this.i().stream().map($$1 -> (U)$$0.createString($$1.toString()));
   }

   @Nullable
   ald b(T var1);

   Optional<alc<T>> d(T var1);

   @Override
   int a(@Nullable T var1);

   @Nullable
   T c(@Nullable alc<T> var1);

   @Nullable
   T a(@Nullable ald var1);

   Optional<ke> d(alc<T> var1);

   default Optional<T> b(@Nullable ald $$0) {
      return Optional.ofNullable(this.a($$0));
   }

   default Optional<T> f(@Nullable alc<T> $$0) {
      return Optional.ofNullable(this.c($$0));
   }

   Optional<js.c<T>> a();

   default T g(alc<T> $$0) {
      T $$1 = this.c($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Missing key in " + this.g() + ": " + $$0);
      } else {
         return $$1;
      }
   }

   Set<ald> i();

   Set<Entry<alc<T>, T>> k();

   Set<alc<T>> j();

   Optional<js.c<T>> a(azs var1);

   default Stream<T> s() {
      return StreamSupport.stream(this.spliterator(), false);
   }

   boolean d(ald var1);

   boolean e(alc<T> var1);

   static <T> T a(kf<? super T> $$0, String $$1, T $$2) {
      return a($$0, ald.a($$1), $$2);
   }

   static <V, T extends V> T a(kf<V> $$0, ald $$1, T $$2) {
      return a($$0, alc.a($$0.g(), $$1), $$2);
   }

   static <V, T extends V> T a(kf<V> $$0, alc<V> $$1, T $$2) {
      ((ko)$$0).a($$1, (V)$$2, ke.a);
      return $$2;
   }

   static <T> js.c<T> b(kf<T> $$0, alc<T> $$1, T $$2) {
      return ((ko)$$0).a($$1, $$2, ke.a);
   }

   static <T> js.c<T> b(kf<T> $$0, ald $$1, T $$2) {
      return b($$0, alc.a($$0.g(), $$1), $$2);
   }

   kf<T> n();

   js.c<T> f(T var1);

   Optional<js.c<T>> c(int var1);

   Optional<js.c<T>> c(ald var1);

   js<T> e(T var1);

   default Iterable<js<T>> c(axp<T> $$0) {
      return (Iterable<js<T>>)DataFixUtils.orElse(this.a($$0), List.of());
   }

   default Optional<js<T>> a(axp<T> $$0, azs $$1) {
      return this.a($$0).flatMap($$1x -> $$1x.a($$1));
   }

   Stream<jw.c<T>> l();

   default jx<js<T>> t() {
      return new jx<js<T>>() {
         public int a(js<T> $$0) {
            return kf.this.a($$0.a());
         }

         @Nullable
         public js<T> c(int $$0) {
            return (js<T>)kf.this.c($$0).orElse(null);
         }

         @Override
         public int d() {
            return kf.this.d();
         }

         @Override
         public Iterator<js<T>> iterator() {
            return kf.this.c().map($$0 -> (js<T>)$$0).iterator();
         }
      };
   }

   kf.a<T> a(axq.c<T> var1);

   public interface a<T> {
      alc<? extends kf<? extends T>> a();

      ju.b<T> c();

      void d();

      int b();
   }
}
