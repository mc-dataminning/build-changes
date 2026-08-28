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

public interface jr<T> extends Keyable, jg.b<T>, jj<T> {
   @Override
   ald<? extends jr<T>> g();

   default Codec<T> q() {
      return this.b().flatComapMap(je.c::a, $$0 -> this.a(this.e((T)$$0)));
   }

   default Codec<je<T>> r() {
      return this.b().flatComapMap($$0 -> $$0, this::a);
   }

   private Codec<je.c<T>> b() {
      Codec<je.c<T>> $$0 = ale.a
         .comapFlatMap(
            $$0x -> this.c($$0x)
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Unknown registry key in " + this.g() + ": " + $$0x)),
            $$0x -> $$0x.h().a()
         );
      return ays.a($$0, (Function<je.c<T>, Lifecycle>)($$0x -> this.d($$0x.h()).map(jq::b).orElse(Lifecycle.experimental())));
   }

   private DataResult<je.c<T>> a(je<T> $$0) {
      return $$0 instanceof je.c<T> $$1 ? DataResult.success($$1) : DataResult.error(() -> "Unregistered holder in " + this.g() + ": " + $$0);
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

   Optional<jq> d(ald<T> var1);

   default Optional<T> b(@Nullable ale $$0) {
      return Optional.ofNullable(this.a($$0));
   }

   default Optional<T> f(@Nullable ald<T> $$0) {
      return Optional.ofNullable(this.c($$0));
   }

   Optional<je.c<T>> a();

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

   Optional<je.c<T>> a(azt var1);

   default Stream<T> s() {
      return StreamSupport.stream(this.spliterator(), false);
   }

   boolean d(ale var1);

   boolean e(ald<T> var1);

   static <T> T a(jr<? super T> $$0, String $$1, T $$2) {
      return a($$0, ale.a($$1), $$2);
   }

   static <V, T extends V> T a(jr<V> $$0, ale $$1, T $$2) {
      return a($$0, ald.a($$0.g(), $$1), $$2);
   }

   static <V, T extends V> T a(jr<V> $$0, ald<V> $$1, T $$2) {
      ((ka)$$0).a($$1, (V)$$2, jq.a);
      return $$2;
   }

   static <T> je.c<T> b(jr<T> $$0, ald<T> $$1, T $$2) {
      return ((ka)$$0).a($$1, $$2, jq.a);
   }

   static <T> je.c<T> b(jr<T> $$0, ale $$1, T $$2) {
      return b($$0, ald.a($$0.g(), $$1), $$2);
   }

   jr<T> n();

   je.c<T> f(T var1);

   Optional<je.c<T>> c(int var1);

   Optional<je.c<T>> c(ale var1);

   je<T> e(T var1);

   default Iterable<je<T>> c(axp<T> $$0) {
      return (Iterable<je<T>>)DataFixUtils.orElse(this.a($$0), List.of());
   }

   default Optional<je<T>> a(axp<T> $$0, azt $$1) {
      return this.a($$0).flatMap($$1x -> $$1x.a($$1));
   }

   Stream<ji.c<T>> l();

   default jj<je<T>> t() {
      return new jj<je<T>>() {
         public int a(je<T> $$0) {
            return jr.this.a($$0.a());
         }

         @Nullable
         public je<T> c(int $$0) {
            return (je<T>)jr.this.c($$0).orElse(null);
         }

         @Override
         public int d() {
            return jr.this.d();
         }

         @Override
         public Iterator<je<T>> iterator() {
            return jr.this.c().map($$0 -> (je<T>)$$0).iterator();
         }
      };
   }

   jr.a<T> a(axq.c<T> var1);

   public interface a<T> {
      ald<? extends jr<? extends T>> a();

      jg.b<T> c();

      void d();

      int b();
   }
}
