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

public interface kb<T> extends Keyable, jq.b<T>, jt<T> {
   @Override
   ald<? extends kb<T>> g();

   default Codec<T> q() {
      return this.b().flatComapMap(jo.c::a, $$0 -> this.a(this.e((T)$$0)));
   }

   default Codec<jo<T>> r() {
      return this.b().flatComapMap($$0 -> $$0, this::a);
   }

   private Codec<jo.c<T>> b() {
      Codec<jo.c<T>> $$0 = ale.a
         .comapFlatMap(
            $$0x -> this.c($$0x)
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Unknown registry key in " + this.g() + ": " + $$0x)),
            $$0x -> $$0x.h().a()
         );
      return ayo.a($$0, (Function<jo.c<T>, Lifecycle>)($$0x -> this.d($$0x.h()).map(ka::b).orElse(Lifecycle.experimental())));
   }

   private DataResult<jo.c<T>> a(jo<T> $$0) {
      return $$0 instanceof jo.c<T> $$1 ? DataResult.success($$1) : DataResult.error(() -> "Unregistered holder in " + this.g() + ": " + $$0);
   }

   default <U> Stream<U> keys(DynamicOps<U> $$0) {
      return this.i().stream().map($$1 -> (U)$$0.createString($$1.toString()));
   }

   @Nullable
   ale b(T var1);

   Optional<ald<T>> d(T var1);

   @Override
   int a(@Nullable T var1);

   @Nullable
   T c(@Nullable ald<T> var1);

   @Nullable
   T a(@Nullable ale var1);

   Optional<ka> d(ald<T> var1);

   default Optional<T> b(@Nullable ale $$0) {
      return Optional.ofNullable(this.a($$0));
   }

   default Optional<T> f(@Nullable ald<T> $$0) {
      return Optional.ofNullable(this.c($$0));
   }

   Optional<jo.c<T>> a();

   default T g(ald<T> $$0) {
      T $$1 = this.c($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Missing key in " + this.g() + ": " + $$0);
      } else {
         return $$1;
      }
   }

   Set<ale> i();

   Set<Entry<ald<T>, T>> k();

   Set<ald<T>> j();

   Optional<jo.c<T>> a(azn var1);

   default Stream<T> s() {
      return StreamSupport.stream(this.spliterator(), false);
   }

   boolean d(ale var1);

   boolean e(ald<T> var1);

   static <T> T a(kb<? super T> $$0, String $$1, T $$2) {
      return a($$0, ale.a($$1), $$2);
   }

   static <V, T extends V> T a(kb<V> $$0, ale $$1, T $$2) {
      return a($$0, ald.a($$0.g(), $$1), $$2);
   }

   static <V, T extends V> T a(kb<V> $$0, ald<V> $$1, T $$2) {
      ((kk)$$0).a($$1, (V)$$2, ka.a);
      return $$2;
   }

   static <T> jo.c<T> b(kb<T> $$0, ald<T> $$1, T $$2) {
      return ((kk)$$0).a($$1, $$2, ka.a);
   }

   static <T> jo.c<T> b(kb<T> $$0, ale $$1, T $$2) {
      return b($$0, ald.a($$0.g(), $$1), $$2);
   }

   kb<T> n();

   jo.c<T> f(T var1);

   Optional<jo.c<T>> c(int var1);

   Optional<jo.c<T>> c(ale var1);

   jo<T> e(T var1);

   default Iterable<jo<T>> c(axl<T> $$0) {
      return (Iterable<jo<T>>)DataFixUtils.orElse(this.a($$0), List.of());
   }

   default Optional<jo<T>> a(axl<T> $$0, azn $$1) {
      return this.a($$0).flatMap($$1x -> $$1x.a($$1));
   }

   Stream<js.c<T>> l();

   default jt<jo<T>> t() {
      return new jt<jo<T>>() {
         public int a(jo<T> $$0) {
            return kb.this.a($$0.a());
         }

         @Nullable
         public jo<T> c(int $$0) {
            return (jo<T>)kb.this.c($$0).orElse(null);
         }

         @Override
         public int d() {
            return kb.this.d();
         }

         @Override
         public Iterator<jo<T>> iterator() {
            return kb.this.c().map($$0 -> (jo<T>)$$0).iterator();
         }
      };
   }

   kb.a<T> a(axm.b<T> var1);

   public interface a<T> {
      ald<? extends kb<? extends T>> a();

      jq.b<T> b();

      void c();
   }
}
