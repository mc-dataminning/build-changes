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

public interface iy<T> extends Keyable, iq<T> {
   ajg<? extends iy<T>> c();

   default Codec<T> q() {
      return this.a().flatComapMap(il.c::a, $$0 -> this.a(this.e((T)$$0)));
   }

   default Codec<il<T>> r() {
      return this.a().flatComapMap($$0 -> $$0, this::a);
   }

   private Codec<il.c<T>> a() {
      Codec<il.c<T>> $$0 = ajh.a
         .comapFlatMap(
            $$0x -> this.c($$0x)
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Unknown registry key in " + this.c() + ": " + $$0x)),
            $$0x -> $$0x.h().a()
         );
      return awe.a($$0, (Function<il.c<T>, Lifecycle>)($$0x -> this.c($$0x.h()).map(ix::b).orElse(Lifecycle.experimental())));
   }

   private DataResult<il.c<T>> a(il<T> $$0) {
      return $$0 instanceof il.c<T> $$1 ? DataResult.success($$1) : DataResult.error(() -> "Unregistered holder in " + this.c() + ": " + $$0);
   }

   default <U> Stream<U> keys(DynamicOps<U> $$0) {
      return this.e().stream().map($$1 -> (U)$$0.createString($$1.toString()));
   }

   @Nullable
   ajh b(T var1);

   Optional<ajg<T>> d(T var1);

   @Override
   int a(@Nullable T var1);

   @Nullable
   T a(@Nullable ajg<T> var1);

   @Nullable
   T a(@Nullable ajh var1);

   Optional<ix> c(ajg<T> var1);

   Lifecycle d();

   default Optional<T> b(@Nullable ajh $$0) {
      return Optional.ofNullable(this.a($$0));
   }

   default Optional<T> e(@Nullable ajg<T> $$0) {
      return Optional.ofNullable(this.a($$0));
   }

   default T f(ajg<T> $$0) {
      T $$1 = this.a($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Missing key in " + this.c() + ": " + $$0);
      } else {
         return $$1;
      }
   }

   Set<ajh> e();

   Set<Entry<ajg<T>, T>> g();

   Set<ajg<T>> f();

   Optional<il.c<T>> a(axd var1);

   default Stream<T> s() {
      return StreamSupport.stream(this.spliterator(), false);
   }

   boolean d(ajh var1);

   boolean d(ajg<T> var1);

   static <T> T a(iy<? super T> $$0, String $$1, T $$2) {
      return a($$0, new ajh($$1), $$2);
   }

   static <V, T extends V> T a(iy<V> $$0, ajh $$1, T $$2) {
      return a($$0, ajg.a($$0.c(), $$1), $$2);
   }

   static <V, T extends V> T a(iy<V> $$0, ajg<V> $$1, T $$2) {
      ((jh)$$0).a($$1, (V)$$2, ix.a);
      return $$2;
   }

   static <T> il.c<T> b(iy<T> $$0, ajg<T> $$1, T $$2) {
      return ((jh)$$0).a($$1, $$2, ix.a);
   }

   static <T> il.c<T> b(iy<T> $$0, ajh $$1, T $$2) {
      return b($$0, ajg.a($$0.c(), $$1), $$2);
   }

   iy<T> l();

   il.c<T> f(T var1);

   Optional<il.c<T>> c(int var1);

   Optional<il.c<T>> c(ajh var1);

   Optional<il.c<T>> b(ajg<T> var1);

   il<T> e(T var1);

   default il.c<T> g(ajg<T> $$0) {
      return this.b($$0).orElseThrow(() -> new IllegalStateException("Missing key in " + this.c() + ": " + $$0));
   }

   Stream<il.c<T>> h();

   Optional<ip.c<T>> b(avd<T> var1);

   default Iterable<il<T>> c(avd<T> $$0) {
      return (Iterable<il<T>>)DataFixUtils.orElse(this.b($$0), List.of());
   }

   default Optional<il<T>> a(avd<T> $$0, axd $$1) {
      return this.b($$0).flatMap($$1x -> $$1x.a($$1));
   }

   ip.c<T> a(avd<T> var1);

   Stream<Pair<avd<T>, ip.c<T>>> i();

   Stream<avd<T>> j();

   void m();

   void a(Map<avd<T>, List<il<T>>> var1);

   default iq<il<T>> t() {
      return new iq<il<T>>() {
         public int a(il<T> $$0) {
            return iy.this.a($$0.a());
         }

         @Nullable
         public il<T> c(int $$0) {
            return (il<T>)iy.this.c($$0).orElse(null);
         }

         @Override
         public int b() {
            return iy.this.b();
         }

         @Override
         public Iterator<il<T>> iterator() {
            return iy.this.h().map($$0 -> (il<T>)$$0).iterator();
         }
      };
   }

   io<T> o();

   in.b<T> p();

   default in.b<T> u() {
      return new in.b.a<T>() {
         @Override
         protected in.b<T> a() {
            return iy.this.p();
         }

         @Override
         public Optional<ip.c<T>> a(avd<T> $$0) {
            return Optional.of(this.b($$0));
         }

         @Override
         public ip.c<T> b(avd<T> $$0) {
            return iy.this.a($$0);
         }
      };
   }
}
