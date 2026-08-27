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

public interface is<T> extends Keyable, il<T> {
   agl<? extends is<T>> c();

   default Codec<T> q() {
      Codec<T> $$0 = agm.a
         .flatXmap(
            $$0x -> Optional.ofNullable(this.a($$0x))
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Unknown registry key in " + this.c() + ": " + $$0x)),
            $$0x -> this.c((T)$$0x)
                  .map(agl::a)
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Unknown registry element in " + this.c() + ":" + $$0x))
         );
      Codec<T> $$1 = asy.a($$0x -> this.c((T)$$0x).isPresent() ? this.a((T)$$0x) : -1, this::a, -1);
      return asy.a(asy.b($$0, $$1), this::e, this::e);
   }

   default Codec<ig<T>> r() {
      Codec<ig<T>> $$0 = agm.a
         .flatXmap(
            $$0x -> this.b(agl.a(this.c(), $$0x))
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Unknown registry key in " + this.c() + ": " + $$0x)),
            $$0x -> $$0x.e()
                  .map(agl::a)
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Unknown registry element in " + this.c() + ":" + $$0x))
         );
      return asy.a($$0, (Function<ig<T>, Lifecycle>)($$0x -> this.e((T)$$0x.a())), $$0x -> this.e((T)$$0x.a()));
   }

   default <U> Stream<U> keys(DynamicOps<U> $$0) {
      return this.e().stream().map($$1 -> (U)$$0.createString($$1.toString()));
   }

   @Nullable
   agm b(T var1);

   Optional<agl<T>> c(T var1);

   @Override
   int a(@Nullable T var1);

   @Nullable
   T a(@Nullable agl<T> var1);

   @Nullable
   T a(@Nullable agm var1);

   Lifecycle e(T var1);

   Lifecycle d();

   default Optional<T> b(@Nullable agm $$0) {
      return Optional.ofNullable(this.a($$0));
   }

   default Optional<T> d(@Nullable agl<T> $$0) {
      return Optional.ofNullable(this.a($$0));
   }

   default T e(agl<T> $$0) {
      T $$1 = this.a($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Missing key in " + this.c() + ": " + $$0);
      } else {
         return $$1;
      }
   }

   Set<agm> e();

   Set<Entry<agl<T>, T>> g();

   Set<agl<T>> f();

   Optional<ig.c<T>> a(atw var1);

   default Stream<T> s() {
      return StreamSupport.stream(this.spliterator(), false);
   }

   boolean c(agm var1);

   boolean c(agl<T> var1);

   static <T> T a(is<? super T> $$0, String $$1, T $$2) {
      return a($$0, new agm($$1), $$2);
   }

   static <V, T extends V> T a(is<V> $$0, agm $$1, T $$2) {
      return a($$0, agl.a($$0.c(), $$1), $$2);
   }

   static <V, T extends V> T a(is<V> $$0, agl<V> $$1, T $$2) {
      ((jb)$$0).a($$1, (V)$$2, Lifecycle.stable());
      return $$2;
   }

   static <T> ig.c<T> b(is<T> $$0, agl<T> $$1, T $$2) {
      return ((jb)$$0).a($$1, $$2, Lifecycle.stable());
   }

   static <T> ig.c<T> b(is<T> $$0, agm $$1, T $$2) {
      return b($$0, agl.a($$0.c(), $$1), $$2);
   }

   is<T> l();

   ig.c<T> f(T var1);

   Optional<ig.c<T>> c(int var1);

   Optional<ig.c<T>> b(agl<T> var1);

   ig<T> d(T var1);

   default ig.c<T> f(agl<T> $$0) {
      return this.b($$0).orElseThrow(() -> new IllegalStateException("Missing key in " + this.c() + ": " + $$0));
   }

   Stream<ig.c<T>> h();

   Optional<ik.c<T>> b(arz<T> var1);

   default Iterable<ig<T>> c(arz<T> $$0) {
      return (Iterable<ig<T>>)DataFixUtils.orElse(this.b($$0), List.of());
   }

   ik.c<T> a(arz<T> var1);

   Stream<Pair<arz<T>, ik.c<T>>> i();

   Stream<arz<T>> j();

   void m();

   void a(Map<arz<T>, List<ig<T>>> var1);

   default il<ig<T>> t() {
      return new il<ig<T>>() {
         public int a(ig<T> $$0) {
            return is.this.a($$0.a());
         }

         @Nullable
         public ig<T> c(int $$0) {
            return (ig<T>)is.this.c($$0).orElse(null);
         }

         @Override
         public int b() {
            return is.this.b();
         }

         @Override
         public Iterator<ig<T>> iterator() {
            return is.this.h().map($$0 -> (ig<T>)$$0).iterator();
         }
      };
   }

   ij<T> o();

   ii.c<T> p();

   default ii.c<T> u() {
      return new ii.c.a<T>() {
         @Override
         protected ii.c<T> a() {
            return is.this.p();
         }

         @Override
         public Optional<ik.c<T>> a(arz<T> $$0) {
            return Optional.of(this.b($$0));
         }

         @Override
         public ik.c<T> b(arz<T> $$0) {
            return is.this.a($$0);
         }
      };
   }
}
