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

public interface ka<T> extends Keyable, js<T> {
   alb<? extends ka<T>> d();

   default Codec<T> q() {
      return this.b().flatComapMap(jn.c::a, $$0 -> this.a(this.e((T)$$0)));
   }

   default Codec<jn<T>> r() {
      return this.b().flatComapMap($$0 -> $$0, this::a);
   }

   private Codec<jn.c<T>> b() {
      Codec<jn.c<T>> $$0 = alc.a
         .comapFlatMap(
            $$0x -> this.c($$0x)
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Unknown registry key in " + this.d() + ": " + $$0x)),
            $$0x -> $$0x.h().a()
         );
      return aym.a($$0, (Function<jn.c<T>, Lifecycle>)($$0x -> this.c($$0x.h()).map(jz::b).orElse(Lifecycle.experimental())));
   }

   private DataResult<jn.c<T>> a(jn<T> $$0) {
      return $$0 instanceof jn.c<T> $$1 ? DataResult.success($$1) : DataResult.error(() -> "Unregistered holder in " + this.d() + ": " + $$0);
   }

   default <U> Stream<U> keys(DynamicOps<U> $$0) {
      return this.f().stream().map($$1 -> (U)$$0.createString($$1.toString()));
   }

   @Nullable
   alc b(T var1);

   Optional<alb<T>> d(T var1);

   @Override
   int a(@Nullable T var1);

   @Nullable
   T a(@Nullable alb<T> var1);

   @Nullable
   T a(@Nullable alc var1);

   Optional<jz> c(alb<T> var1);

   Lifecycle e();

   default Optional<T> b(@Nullable alc $$0) {
      return Optional.ofNullable(this.a($$0));
   }

   default Optional<T> e(@Nullable alb<T> $$0) {
      return Optional.ofNullable(this.a($$0));
   }

   Optional<jn.c<T>> a();

   default T f(alb<T> $$0) {
      T $$1 = this.a($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Missing key in " + this.d() + ": " + $$0);
      } else {
         return $$1;
      }
   }

   Set<alc> f();

   Set<Entry<alb<T>, T>> h();

   Set<alb<T>> g();

   Optional<jn.c<T>> a(azl var1);

   default Stream<T> s() {
      return StreamSupport.stream(this.spliterator(), false);
   }

   boolean d(alc var1);

   boolean d(alb<T> var1);

   static <T> T a(ka<? super T> $$0, String $$1, T $$2) {
      return a($$0, alc.a($$1), $$2);
   }

   static <V, T extends V> T a(ka<V> $$0, alc $$1, T $$2) {
      return a($$0, alb.a($$0.d(), $$1), $$2);
   }

   static <V, T extends V> T a(ka<V> $$0, alb<V> $$1, T $$2) {
      ((kj)$$0).a($$1, (V)$$2, jz.a);
      return $$2;
   }

   static <T> jn.c<T> b(ka<T> $$0, alb<T> $$1, T $$2) {
      return ((kj)$$0).a($$1, $$2, jz.a);
   }

   static <T> jn.c<T> b(ka<T> $$0, alc $$1, T $$2) {
      return b($$0, alb.a($$0.d(), $$1), $$2);
   }

   ka<T> l();

   jn.c<T> f(T var1);

   Optional<jn.c<T>> c(int var1);

   Optional<jn.c<T>> c(alc var1);

   Optional<jn.c<T>> b(alb<T> var1);

   jn<T> e(T var1);

   default jn.c<T> g(alb<T> $$0) {
      return this.b($$0).orElseThrow(() -> new IllegalStateException("Missing key in " + this.d() + ": " + $$0));
   }

   Stream<jn.c<T>> i();

   Optional<jr.c<T>> a(axj<T> var1);

   default Iterable<jn<T>> b(axj<T> $$0) {
      return (Iterable<jn<T>>)DataFixUtils.orElse(this.a($$0), List.of());
   }

   default Optional<jn<T>> a(axj<T> $$0, azl $$1) {
      return this.a($$0).flatMap($$1x -> $$1x.a($$1));
   }

   Stream<jr.c<T>> j();

   default js<jn<T>> t() {
      return new js<jn<T>>() {
         public int a(jn<T> $$0) {
            return ka.this.a($$0.a());
         }

         @Nullable
         public jn<T> c(int $$0) {
            return (jn<T>)ka.this.c($$0).orElse(null);
         }

         @Override
         public int c() {
            return ka.this.c();
         }

         @Override
         public Iterator<jn<T>> iterator() {
            return ka.this.i().map($$0 -> (jn<T>)$$0).iterator();
         }
      };
   }

   jq<T> o();

   jp.b<T> p();

   ka.a<T> a(axk.b<T> var1);

   public interface a<T> {
      alb<? extends ka<? extends T>> a();

      jp.b<T> b();

      void c();
   }
}
