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

public interface ja<T> extends Keyable, is<T> {
   aju<? extends ja<T>> c();

   default Codec<T> q() {
      return this.a().flatComapMap(in.c::a, $$0 -> this.a(this.e((T)$$0)));
   }

   default Codec<in<T>> r() {
      return this.a().flatComapMap($$0 -> $$0, this::a);
   }

   private Codec<in.c<T>> a() {
      Codec<in.c<T>> $$0 = ajv.a
         .comapFlatMap(
            $$0x -> this.c($$0x)
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Unknown registry key in " + this.c() + ": " + $$0x)),
            $$0x -> $$0x.h().a()
         );
      return awu.a($$0, (Function<in.c<T>, Lifecycle>)($$0x -> this.c($$0x.h()).map(iz::b).orElse(Lifecycle.experimental())));
   }

   private DataResult<in.c<T>> a(in<T> $$0) {
      return $$0 instanceof in.c<T> $$1 ? DataResult.success($$1) : DataResult.error(() -> "Unregistered holder in " + this.c() + ": " + $$0);
   }

   default <U> Stream<U> keys(DynamicOps<U> $$0) {
      return this.e().stream().map($$1 -> (U)$$0.createString($$1.toString()));
   }

   @Nullable
   ajv b(T var1);

   Optional<aju<T>> d(T var1);

   @Override
   int a(@Nullable T var1);

   @Nullable
   T a(@Nullable aju<T> var1);

   @Nullable
   T a(@Nullable ajv var1);

   Optional<iz> c(aju<T> var1);

   Lifecycle d();

   default Optional<T> b(@Nullable ajv $$0) {
      return Optional.ofNullable(this.a($$0));
   }

   default Optional<T> e(@Nullable aju<T> $$0) {
      return Optional.ofNullable(this.a($$0));
   }

   default T f(aju<T> $$0) {
      T $$1 = this.a($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Missing key in " + this.c() + ": " + $$0);
      } else {
         return $$1;
      }
   }

   Set<ajv> e();

   Set<Entry<aju<T>, T>> g();

   Set<aju<T>> f();

   Optional<in.c<T>> a(axt var1);

   default Stream<T> s() {
      return StreamSupport.stream(this.spliterator(), false);
   }

   boolean d(ajv var1);

   boolean d(aju<T> var1);

   static <T> T a(ja<? super T> $$0, String $$1, T $$2) {
      return a($$0, new ajv($$1), $$2);
   }

   static <V, T extends V> T a(ja<V> $$0, ajv $$1, T $$2) {
      return a($$0, aju.a($$0.c(), $$1), $$2);
   }

   static <V, T extends V> T a(ja<V> $$0, aju<V> $$1, T $$2) {
      ((jj)$$0).a($$1, (V)$$2, iz.a);
      return $$2;
   }

   static <T> in.c<T> b(ja<T> $$0, aju<T> $$1, T $$2) {
      return ((jj)$$0).a($$1, $$2, iz.a);
   }

   static <T> in.c<T> b(ja<T> $$0, ajv $$1, T $$2) {
      return b($$0, aju.a($$0.c(), $$1), $$2);
   }

   ja<T> l();

   in.c<T> f(T var1);

   Optional<in.c<T>> c(int var1);

   Optional<in.c<T>> c(ajv var1);

   Optional<in.c<T>> b(aju<T> var1);

   in<T> e(T var1);

   default in.c<T> g(aju<T> $$0) {
      return this.b($$0).orElseThrow(() -> new IllegalStateException("Missing key in " + this.c() + ": " + $$0));
   }

   Stream<in.c<T>> h();

   Optional<ir.c<T>> b(avt<T> var1);

   default Iterable<in<T>> c(avt<T> $$0) {
      return (Iterable<in<T>>)DataFixUtils.orElse(this.b($$0), List.of());
   }

   default Optional<in<T>> a(avt<T> $$0, axt $$1) {
      return this.b($$0).flatMap($$1x -> $$1x.a($$1));
   }

   ir.c<T> a(avt<T> var1);

   Stream<Pair<avt<T>, ir.c<T>>> i();

   Stream<avt<T>> j();

   void m();

   void a(Map<avt<T>, List<in<T>>> var1);

   default is<in<T>> t() {
      return new is<in<T>>() {
         public int a(in<T> $$0) {
            return ja.this.a($$0.a());
         }

         @Nullable
         public in<T> c(int $$0) {
            return (in<T>)ja.this.c($$0).orElse(null);
         }

         @Override
         public int b() {
            return ja.this.b();
         }

         @Override
         public Iterator<in<T>> iterator() {
            return ja.this.h().map($$0 -> (in<T>)$$0).iterator();
         }
      };
   }

   iq<T> o();

   ip.b<T> p();

   default ip.b<T> u() {
      return new ip.b.a<T>() {
         @Override
         public ip.b<T> a() {
            return ja.this.p();
         }

         @Override
         public Optional<ir.c<T>> a(avt<T> $$0) {
            return Optional.of(this.b($$0));
         }

         @Override
         public ir.c<T> b(avt<T> $$0) {
            return ja.this.a($$0);
         }
      };
   }
}
