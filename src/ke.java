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

public interface ke<T> extends Keyable, jt.b<T>, jw<T> {
   @Override
   akt<? extends ke<T>> g();

   default Codec<T> q() {
      return this.b().flatComapMap(jr.c::a, $$0 -> this.a(this.e((T)$$0)));
   }

   default Codec<jr<T>> r() {
      return this.b().flatComapMap($$0 -> $$0, this::a);
   }

   private Codec<jr.c<T>> b() {
      Codec<jr.c<T>> $$0 = aku.a
         .comapFlatMap(
            $$0x -> this.c($$0x)
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Unknown registry key in " + this.g() + ": " + $$0x)),
            $$0x -> $$0x.h().a()
         );
      return ayi.a($$0, (Function<jr.c<T>, Lifecycle>)($$0x -> this.d($$0x.h()).map(kd::b).orElse(Lifecycle.experimental())));
   }

   private DataResult<jr.c<T>> a(jr<T> $$0) {
      return $$0 instanceof jr.c<T> $$1 ? DataResult.success($$1) : DataResult.error(() -> "Unregistered holder in " + this.g() + ": " + $$0);
   }

   default <U> Stream<U> keys(DynamicOps<U> $$0) {
      return this.i().stream().map($$1 -> (U)$$0.createString($$1.toString()));
   }

   @Nullable
   aku b(T var1);

   Optional<akt<T>> d(T var1);

   @Override
   int a(@Nullable T var1);

   @Nullable
   T c(@Nullable akt<T> var1);

   @Nullable
   T a(@Nullable aku var1);

   Optional<kd> d(akt<T> var1);

   default Optional<T> b(@Nullable aku $$0) {
      return Optional.ofNullable(this.a($$0));
   }

   default Optional<T> f(@Nullable akt<T> $$0) {
      return Optional.ofNullable(this.c($$0));
   }

   Optional<jr.c<T>> a();

   default T g(akt<T> $$0) {
      T $$1 = this.c($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Missing key in " + this.g() + ": " + $$0);
      } else {
         return $$1;
      }
   }

   Set<aku> i();

   Set<Entry<akt<T>, T>> k();

   Set<akt<T>> j();

   Optional<jr.c<T>> a(azh var1);

   default Stream<T> s() {
      return StreamSupport.stream(this.spliterator(), false);
   }

   boolean d(aku var1);

   boolean e(akt<T> var1);

   static <T> T a(ke<? super T> $$0, String $$1, T $$2) {
      return a($$0, aku.a($$1), $$2);
   }

   static <V, T extends V> T a(ke<V> $$0, aku $$1, T $$2) {
      return a($$0, akt.a($$0.g(), $$1), $$2);
   }

   static <V, T extends V> T a(ke<V> $$0, akt<V> $$1, T $$2) {
      ((kn)$$0).a($$1, (V)$$2, kd.a);
      return $$2;
   }

   static <T> jr.c<T> b(ke<T> $$0, akt<T> $$1, T $$2) {
      return ((kn)$$0).a($$1, $$2, kd.a);
   }

   static <T> jr.c<T> b(ke<T> $$0, aku $$1, T $$2) {
      return b($$0, akt.a($$0.g(), $$1), $$2);
   }

   ke<T> n();

   jr.c<T> f(T var1);

   Optional<jr.c<T>> c(int var1);

   Optional<jr.c<T>> c(aku var1);

   jr<T> e(T var1);

   default Iterable<jr<T>> c(axf<T> $$0) {
      return (Iterable<jr<T>>)DataFixUtils.orElse(this.a($$0), List.of());
   }

   default Optional<jr<T>> a(axf<T> $$0, azh $$1) {
      return this.a($$0).flatMap($$1x -> $$1x.a($$1));
   }

   Stream<jv.c<T>> l();

   default jw<jr<T>> t() {
      return new jw<jr<T>>() {
         public int a(jr<T> $$0) {
            return ke.this.a($$0.a());
         }

         @Nullable
         public jr<T> c(int $$0) {
            return (jr<T>)ke.this.c($$0).orElse(null);
         }

         @Override
         public int d() {
            return ke.this.d();
         }

         @Override
         public Iterator<jr<T>> iterator() {
            return ke.this.c().map($$0 -> (jr<T>)$$0).iterator();
         }
      };
   }

   ke.a<T> a(axg.c<T> var1);

   public interface a<T> {
      akt<? extends ke<? extends T>> a();

      jt.b<T> c();

      void d();

      int b();
   }
}
