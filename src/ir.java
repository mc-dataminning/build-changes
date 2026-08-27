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

public interface ir<T> extends Keyable, ik<T> {
   ags<? extends ir<T>> c();

   default Codec<T> q() {
      Codec<T> $$0 = agt.a
         .flatXmap(
            $$0x -> Optional.ofNullable(this.a($$0x))
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Unknown registry key in " + this.c() + ": " + $$0x)),
            $$0x -> this.c((T)$$0x)
                  .map(ags::a)
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Unknown registry element in " + this.c() + ":" + $$0x))
         );
      Codec<T> $$1 = atg.a($$0x -> this.c((T)$$0x).isPresent() ? this.a((T)$$0x) : -1, this::a, -1);
      return atg.a(atg.b($$0, $$1), this::e, this::e);
   }

   default Codec<ie<T>> r() {
      Codec<ie<T>> $$0 = agt.a
         .flatXmap(
            $$0x -> this.b(ags.a(this.c(), $$0x))
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Unknown registry key in " + this.c() + ": " + $$0x)),
            $$0x -> $$0x.e()
                  .map(ags::a)
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Unknown registry element in " + this.c() + ":" + $$0x))
         );
      return atg.a($$0, (Function<ie<T>, Lifecycle>)($$0x -> this.e((T)$$0x.a())), $$0x -> this.e((T)$$0x.a()));
   }

   default <U> Stream<U> keys(DynamicOps<U> $$0) {
      return this.e().stream().map($$1 -> (U)$$0.createString($$1.toString()));
   }

   @Nullable
   agt b(T var1);

   Optional<ags<T>> c(T var1);

   @Override
   int a(@Nullable T var1);

   @Nullable
   T a(@Nullable ags<T> var1);

   @Nullable
   T a(@Nullable agt var1);

   Lifecycle e(T var1);

   Lifecycle d();

   default Optional<T> b(@Nullable agt $$0) {
      return Optional.ofNullable(this.a($$0));
   }

   default Optional<T> d(@Nullable ags<T> $$0) {
      return Optional.ofNullable(this.a($$0));
   }

   default T e(ags<T> $$0) {
      T $$1 = this.a($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Missing key in " + this.c() + ": " + $$0);
      } else {
         return $$1;
      }
   }

   Set<agt> e();

   Set<Entry<ags<T>, T>> g();

   Set<ags<T>> f();

   Optional<ie.c<T>> a(auf var1);

   default Stream<T> s() {
      return StreamSupport.stream(this.spliterator(), false);
   }

   boolean c(agt var1);

   boolean c(ags<T> var1);

   static <T> T a(ir<? super T> $$0, String $$1, T $$2) {
      return a($$0, new agt($$1), $$2);
   }

   static <V, T extends V> T a(ir<V> $$0, agt $$1, T $$2) {
      return a($$0, ags.a($$0.c(), $$1), $$2);
   }

   static <V, T extends V> T a(ir<V> $$0, ags<V> $$1, T $$2) {
      ((ja)$$0).a($$1, (V)$$2, Lifecycle.stable());
      return $$2;
   }

   static <T> ie.c<T> b(ir<T> $$0, ags<T> $$1, T $$2) {
      return ((ja)$$0).a($$1, $$2, Lifecycle.stable());
   }

   static <T> ie.c<T> b(ir<T> $$0, agt $$1, T $$2) {
      return b($$0, ags.a($$0.c(), $$1), $$2);
   }

   ir<T> l();

   ie.c<T> f(T var1);

   Optional<ie.c<T>> c(int var1);

   Optional<ie.c<T>> b(ags<T> var1);

   ie<T> d(T var1);

   default ie.c<T> f(ags<T> $$0) {
      return this.b($$0).orElseThrow(() -> new IllegalStateException("Missing key in " + this.c() + ": " + $$0));
   }

   Stream<ie.c<T>> h();

   Optional<ij.c<T>> b(asg<T> var1);

   default Iterable<ie<T>> c(asg<T> $$0) {
      return (Iterable<ie<T>>)DataFixUtils.orElse(this.b($$0), List.of());
   }

   ij.c<T> a(asg<T> var1);

   Stream<Pair<asg<T>, ij.c<T>>> i();

   Stream<asg<T>> j();

   void m();

   void a(Map<asg<T>, List<ie<T>>> var1);

   default ik<ie<T>> t() {
      return new ik<ie<T>>() {
         public int a(ie<T> $$0) {
            return ir.this.a($$0.a());
         }

         @Nullable
         public ie<T> c(int $$0) {
            return (ie<T>)ir.this.c($$0).orElse(null);
         }

         @Override
         public int b() {
            return ir.this.b();
         }

         @Override
         public Iterator<ie<T>> iterator() {
            return ir.this.h().map($$0 -> (ie<T>)$$0).iterator();
         }
      };
   }

   ii<T> o();

   ih.c<T> p();

   default ih.c<T> u() {
      return new ih.c.a<T>() {
         @Override
         protected ih.c<T> a() {
            return ir.this.p();
         }

         @Override
         public Optional<ij.c<T>> a(asg<T> $$0) {
            return Optional.of(this.b($$0));
         }

         @Override
         public ij.c<T> b(asg<T> $$0) {
            return ir.this.a($$0);
         }
      };
   }
}
