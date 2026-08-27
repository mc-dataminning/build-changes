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

public interface ji<T> extends Keyable, ja<T> {
   ake<? extends ji<T>> c();

   default Codec<T> q() {
      return this.a().flatComapMap(iv.c::a, $$0 -> this.a(this.e((T)$$0)));
   }

   default Codec<iv<T>> r() {
      return this.a().flatComapMap($$0 -> $$0, this::a);
   }

   private Codec<iv.c<T>> a() {
      Codec<iv.c<T>> $$0 = akf.a
         .comapFlatMap(
            $$0x -> this.c($$0x)
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Unknown registry key in " + this.c() + ": " + $$0x)),
            $$0x -> $$0x.h().a()
         );
      return axe.a($$0, (Function<iv.c<T>, Lifecycle>)($$0x -> this.c($$0x.h()).map(jh::b).orElse(Lifecycle.experimental())));
   }

   private DataResult<iv.c<T>> a(iv<T> $$0) {
      return $$0 instanceof iv.c<T> $$1 ? DataResult.success($$1) : DataResult.error(() -> "Unregistered holder in " + this.c() + ": " + $$0);
   }

   default <U> Stream<U> keys(DynamicOps<U> $$0) {
      return this.e().stream().map($$1 -> (U)$$0.createString($$1.toString()));
   }

   @Nullable
   akf b(T var1);

   Optional<ake<T>> d(T var1);

   @Override
   int a(@Nullable T var1);

   @Nullable
   T a(@Nullable ake<T> var1);

   @Nullable
   T a(@Nullable akf var1);

   Optional<jh> c(ake<T> var1);

   Lifecycle d();

   default Optional<T> b(@Nullable akf $$0) {
      return Optional.ofNullable(this.a($$0));
   }

   default Optional<T> e(@Nullable ake<T> $$0) {
      return Optional.ofNullable(this.a($$0));
   }

   default T f(ake<T> $$0) {
      T $$1 = this.a($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Missing key in " + this.c() + ": " + $$0);
      } else {
         return $$1;
      }
   }

   Set<akf> e();

   Set<Entry<ake<T>, T>> g();

   Set<ake<T>> f();

   Optional<iv.c<T>> a(ayd var1);

   default Stream<T> s() {
      return StreamSupport.stream(this.spliterator(), false);
   }

   boolean d(akf var1);

   boolean d(ake<T> var1);

   static <T> T a(ji<? super T> $$0, String $$1, T $$2) {
      return a($$0, new akf($$1), $$2);
   }

   static <V, T extends V> T a(ji<V> $$0, akf $$1, T $$2) {
      return a($$0, ake.a($$0.c(), $$1), $$2);
   }

   static <V, T extends V> T a(ji<V> $$0, ake<V> $$1, T $$2) {
      ((jr)$$0).a($$1, (V)$$2, jh.a);
      return $$2;
   }

   static <T> iv.c<T> b(ji<T> $$0, ake<T> $$1, T $$2) {
      return ((jr)$$0).a($$1, $$2, jh.a);
   }

   static <T> iv.c<T> b(ji<T> $$0, akf $$1, T $$2) {
      return b($$0, ake.a($$0.c(), $$1), $$2);
   }

   ji<T> l();

   iv.c<T> f(T var1);

   Optional<iv.c<T>> c(int var1);

   Optional<iv.c<T>> c(akf var1);

   Optional<iv.c<T>> b(ake<T> var1);

   iv<T> e(T var1);

   default iv.c<T> g(ake<T> $$0) {
      return this.b($$0).orElseThrow(() -> new IllegalStateException("Missing key in " + this.c() + ": " + $$0));
   }

   Stream<iv.c<T>> h();

   Optional<iz.c<T>> b(awd<T> var1);

   default Iterable<iv<T>> c(awd<T> $$0) {
      return (Iterable<iv<T>>)DataFixUtils.orElse(this.b($$0), List.of());
   }

   default Optional<iv<T>> a(awd<T> $$0, ayd $$1) {
      return this.b($$0).flatMap($$1x -> $$1x.a($$1));
   }

   iz.c<T> a(awd<T> var1);

   Stream<Pair<awd<T>, iz.c<T>>> i();

   Stream<awd<T>> j();

   void m();

   void a(Map<awd<T>, List<iv<T>>> var1);

   default ja<iv<T>> t() {
      return new ja<iv<T>>() {
         public int a(iv<T> $$0) {
            return ji.this.a($$0.a());
         }

         @Nullable
         public iv<T> c(int $$0) {
            return (iv<T>)ji.this.c($$0).orElse(null);
         }

         @Override
         public int b() {
            return ji.this.b();
         }

         @Override
         public Iterator<iv<T>> iterator() {
            return ji.this.h().map($$0 -> (iv<T>)$$0).iterator();
         }
      };
   }

   iy<T> o();

   ix.b<T> p();

   default ix.b<T> u() {
      return new ix.b.a<T>() {
         @Override
         public ix.b<T> a() {
            return ji.this.p();
         }

         @Override
         public Optional<iz.c<T>> a(awd<T> $$0) {
            return Optional.of(this.b($$0));
         }

         @Override
         public iz.c<T> b(awd<T> $$0) {
            return ji.this.a($$0);
         }
      };
   }
}
