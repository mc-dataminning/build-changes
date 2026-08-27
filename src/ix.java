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

public interface ix<T> extends Keyable, iq<T> {
   ajb<? extends ix<T>> c();

   default Codec<T> q() {
      Codec<T> $$0 = ajc.a
         .flatXmap(
            $$0x -> Optional.ofNullable(this.a($$0x))
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Unknown registry key in " + this.c() + ": " + $$0x)),
            $$0x -> this.d((T)$$0x)
                  .map(ajb::a)
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Unknown registry element in " + this.c() + ":" + $$0x))
         );
      Codec<T> $$1 = avu.a($$0x -> this.d((T)$$0x).isPresent() ? this.a((T)$$0x) : -1, this::a, -1);
      return avu.a(avu.b($$0, $$1), this::f, this::f);
   }

   default Codec<il<T>> r() {
      Codec<il<T>> $$0 = ajc.a
         .flatXmap(
            $$0x -> this.c($$0x)
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Unknown registry key in " + this.c() + ": " + $$0x)),
            $$0x -> $$0x.e()
                  .map(ajb::a)
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Unknown registry element in " + this.c() + ":" + $$0x))
         );
      return avu.a($$0, (Function<il<T>, Lifecycle>)($$0x -> this.f((T)$$0x.a())), $$0x -> this.f((T)$$0x.a()));
   }

   default <U> Stream<U> keys(DynamicOps<U> $$0) {
      return this.e().stream().map($$1 -> (U)$$0.createString($$1.toString()));
   }

   @Nullable
   ajc b(T var1);

   Optional<ajb<T>> d(T var1);

   @Override
   int a(@Nullable T var1);

   @Nullable
   T a(@Nullable ajb<T> var1);

   @Nullable
   T a(@Nullable ajc var1);

   Lifecycle f(T var1);

   Lifecycle d();

   default Optional<T> b(@Nullable ajc $$0) {
      return Optional.ofNullable(this.a($$0));
   }

   default Optional<T> d(@Nullable ajb<T> $$0) {
      return Optional.ofNullable(this.a($$0));
   }

   default T e(ajb<T> $$0) {
      T $$1 = this.a($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Missing key in " + this.c() + ": " + $$0);
      } else {
         return $$1;
      }
   }

   Set<ajc> e();

   Set<Entry<ajb<T>, T>> g();

   Set<ajb<T>> f();

   Optional<il.c<T>> a(awt var1);

   default Stream<T> s() {
      return StreamSupport.stream(this.spliterator(), false);
   }

   boolean d(ajc var1);

   boolean c(ajb<T> var1);

   static <T> T a(ix<? super T> $$0, String $$1, T $$2) {
      return a($$0, new ajc($$1), $$2);
   }

   static <V, T extends V> T a(ix<V> $$0, ajc $$1, T $$2) {
      return a($$0, ajb.a($$0.c(), $$1), $$2);
   }

   static <V, T extends V> T a(ix<V> $$0, ajb<V> $$1, T $$2) {
      ((jg)$$0).a($$1, (V)$$2, Lifecycle.stable());
      return $$2;
   }

   static <T> il.c<T> b(ix<T> $$0, ajb<T> $$1, T $$2) {
      return ((jg)$$0).a($$1, $$2, Lifecycle.stable());
   }

   static <T> il.c<T> b(ix<T> $$0, ajc $$1, T $$2) {
      return b($$0, ajb.a($$0.c(), $$1), $$2);
   }

   ix<T> l();

   il.c<T> g(T var1);

   Optional<il.c<T>> c(int var1);

   Optional<il.c<T>> c(ajc var1);

   Optional<il.c<T>> b(ajb<T> var1);

   il<T> e(T var1);

   default il.c<T> f(ajb<T> $$0) {
      return this.b($$0).orElseThrow(() -> new IllegalStateException("Missing key in " + this.c() + ": " + $$0));
   }

   Stream<il.c<T>> h();

   Optional<ip.c<T>> b(aut<T> var1);

   default Iterable<il<T>> c(aut<T> $$0) {
      return (Iterable<il<T>>)DataFixUtils.orElse(this.b($$0), List.of());
   }

   default Optional<il<T>> a(aut<T> $$0, awt $$1) {
      return this.b($$0).flatMap($$1x -> $$1x.a($$1));
   }

   ip.c<T> a(aut<T> var1);

   Stream<Pair<aut<T>, ip.c<T>>> i();

   Stream<aut<T>> j();

   void m();

   void a(Map<aut<T>, List<il<T>>> var1);

   default iq<il<T>> t() {
      return new iq<il<T>>() {
         public int a(il<T> $$0) {
            return ix.this.a($$0.a());
         }

         @Nullable
         public il<T> c(int $$0) {
            return (il<T>)ix.this.c($$0).orElse(null);
         }

         @Override
         public int b() {
            return ix.this.b();
         }

         @Override
         public Iterator<il<T>> iterator() {
            return ix.this.h().map($$0 -> (il<T>)$$0).iterator();
         }
      };
   }

   io<T> o();

   in.b<T> p();

   default in.b<T> u() {
      return new in.b.a<T>() {
         @Override
         protected in.b<T> a() {
            return ix.this.p();
         }

         @Override
         public Optional<ip.c<T>> a(aut<T> $$0) {
            return Optional.of(this.b($$0));
         }

         @Override
         public ip.c<T> b(aut<T> $$0) {
            return ix.this.a($$0);
         }
      };
   }
}
