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

public interface jt<T> extends Keyable, ji.b<T>, jl<T> {
   @Override
   alj<? extends jt<T>> g();

   default Codec<T> q() {
      return this.b().flatComapMap(jg.c::a, $$0 -> this.a(this.e((T)$$0)));
   }

   default Codec<jg<T>> r() {
      return this.b().flatComapMap($$0 -> $$0, this::a);
   }

   private Codec<jg.c<T>> b() {
      Codec<jg.c<T>> $$0 = alk.a
         .comapFlatMap(
            $$0x -> this.c($$0x)
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Unknown registry key in " + this.g() + ": " + $$0x)),
            $$0x -> $$0x.h().a()
         );
      return ayy.a($$0, (Function<jg.c<T>, Lifecycle>)($$0x -> this.d($$0x.h()).map(js::b).orElse(Lifecycle.experimental())));
   }

   private DataResult<jg.c<T>> a(jg<T> $$0) {
      return $$0 instanceof jg.c<T> $$1 ? DataResult.success($$1) : DataResult.error(() -> "Unregistered holder in " + this.g() + ": " + $$0);
   }

   default <U> Stream<U> keys(DynamicOps<U> $$0) {
      return this.i().stream().map($$1 -> (U)$$0.createString($$1.toString()));
   }

   @Nullable
   alk b(T var1);

   Optional<alj<T>> d(T var1);

   @Override
   int a(@Nullable T var1);

   @Nullable
   T c(@Nullable alj<T> var1);

   @Nullable
   T a(@Nullable alk var1);

   Optional<js> d(alj<T> var1);

   default Optional<T> b(@Nullable alk $$0) {
      return Optional.ofNullable(this.a($$0));
   }

   default Optional<T> f(@Nullable alj<T> $$0) {
      return Optional.ofNullable(this.c($$0));
   }

   Optional<jg.c<T>> a();

   default T g(alj<T> $$0) {
      T $$1 = this.c($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Missing key in " + this.g() + ": " + $$0);
      } else {
         return $$1;
      }
   }

   Set<alk> i();

   Set<Entry<alj<T>, T>> k();

   Set<alj<T>> j();

   Optional<jg.c<T>> a(azz var1);

   default Stream<T> s() {
      return StreamSupport.stream(this.spliterator(), false);
   }

   boolean d(alk var1);

   boolean e(alj<T> var1);

   static <T> T a(jt<? super T> $$0, String $$1, T $$2) {
      return a($$0, alk.a($$1), $$2);
   }

   static <V, T extends V> T a(jt<V> $$0, alk $$1, T $$2) {
      return a($$0, alj.a($$0.g(), $$1), $$2);
   }

   static <V, T extends V> T a(jt<V> $$0, alj<V> $$1, T $$2) {
      ((kc)$$0).a($$1, (V)$$2, js.a);
      return $$2;
   }

   static <T> jg.c<T> b(jt<T> $$0, alj<T> $$1, T $$2) {
      return ((kc)$$0).a($$1, $$2, js.a);
   }

   static <T> jg.c<T> b(jt<T> $$0, alk $$1, T $$2) {
      return b($$0, alj.a($$0.g(), $$1), $$2);
   }

   jt<T> n();

   jg.c<T> f(T var1);

   Optional<jg.c<T>> c(int var1);

   Optional<jg.c<T>> c(alk var1);

   jg<T> e(T var1);

   default Iterable<jg<T>> c(axv<T> $$0) {
      return (Iterable<jg<T>>)DataFixUtils.orElse(this.a($$0), List.of());
   }

   default Optional<jg<T>> a(axv<T> $$0, azz $$1) {
      return this.a($$0).flatMap($$1x -> $$1x.a($$1));
   }

   Stream<jk.c<T>> l();

   default jl<jg<T>> t() {
      return new jl<jg<T>>() {
         public int a(jg<T> $$0) {
            return jt.this.a($$0.a());
         }

         @Nullable
         public jg<T> c(int $$0) {
            return (jg<T>)jt.this.c($$0).orElse(null);
         }

         @Override
         public int d() {
            return jt.this.d();
         }

         @Override
         public Iterator<jg<T>> iterator() {
            return jt.this.c().map($$0 -> (jg<T>)$$0).iterator();
         }
      };
   }

   jt.a<T> a(axw.c<T> var1);

   public interface a<T> {
      alj<? extends jt<? extends T>> a();

      ji.b<T> c();

      void d();

      int b();
   }
}
