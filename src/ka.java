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
   ala<? extends ka<T>> d();

   default Codec<T> q() {
      return this.b().flatComapMap(jn.c::a, $$0 -> this.a(this.e((T)$$0)));
   }

   default Codec<jn<T>> r() {
      return this.b().flatComapMap($$0 -> $$0, this::a);
   }

   private Codec<jn.c<T>> b() {
      Codec<jn.c<T>> $$0 = alb.a
         .comapFlatMap(
            $$0x -> this.c($$0x)
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Unknown registry key in " + this.d() + ": " + $$0x)),
            $$0x -> $$0x.h().a()
         );
      return ayl.a($$0, (Function<jn.c<T>, Lifecycle>)($$0x -> this.c($$0x.h()).map(jz::b).orElse(Lifecycle.experimental())));
   }

   private DataResult<jn.c<T>> a(jn<T> $$0) {
      return $$0 instanceof jn.c<T> $$1 ? DataResult.success($$1) : DataResult.error(() -> "Unregistered holder in " + this.d() + ": " + $$0);
   }

   default <U> Stream<U> keys(DynamicOps<U> $$0) {
      return this.f().stream().map($$1 -> (U)$$0.createString($$1.toString()));
   }

   @Nullable
   alb b(T var1);

   Optional<ala<T>> d(T var1);

   @Override
   int a(@Nullable T var1);

   @Nullable
   T a(@Nullable ala<T> var1);

   @Nullable
   T a(@Nullable alb var1);

   Optional<jz> c(ala<T> var1);

   Lifecycle e();

   default Optional<T> b(@Nullable alb $$0) {
      return Optional.ofNullable(this.a($$0));
   }

   default Optional<T> e(@Nullable ala<T> $$0) {
      return Optional.ofNullable(this.a($$0));
   }

   Optional<jn.c<T>> a();

   default T f(ala<T> $$0) {
      T $$1 = this.a($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Missing key in " + this.d() + ": " + $$0);
      } else {
         return $$1;
      }
   }

   Set<alb> f();

   Set<Entry<ala<T>, T>> h();

   Set<ala<T>> g();

   Optional<jn.c<T>> a(azk var1);

   default Stream<T> s() {
      return StreamSupport.stream(this.spliterator(), false);
   }

   boolean d(alb var1);

   boolean d(ala<T> var1);

   static <T> T a(ka<? super T> $$0, String $$1, T $$2) {
      return a($$0, alb.a($$1), $$2);
   }

   static <V, T extends V> T a(ka<V> $$0, alb $$1, T $$2) {
      return a($$0, ala.a($$0.d(), $$1), $$2);
   }

   static <V, T extends V> T a(ka<V> $$0, ala<V> $$1, T $$2) {
      ((kj)$$0).a($$1, (V)$$2, jz.a);
      return $$2;
   }

   static <T> jn.c<T> b(ka<T> $$0, ala<T> $$1, T $$2) {
      return ((kj)$$0).a($$1, $$2, jz.a);
   }

   static <T> jn.c<T> b(ka<T> $$0, alb $$1, T $$2) {
      return b($$0, ala.a($$0.d(), $$1), $$2);
   }

   ka<T> l();

   jn.c<T> f(T var1);

   Optional<jn.c<T>> c(int var1);

   Optional<jn.c<T>> c(alb var1);

   Optional<jn.c<T>> b(ala<T> var1);

   jn<T> e(T var1);

   default jn.c<T> g(ala<T> $$0) {
      return this.b($$0).orElseThrow(() -> new IllegalStateException("Missing key in " + this.d() + ": " + $$0));
   }

   Stream<jn.c<T>> i();

   Optional<jr.c<T>> a(axi<T> var1);

   default Iterable<jn<T>> b(axi<T> $$0) {
      return (Iterable<jn<T>>)DataFixUtils.orElse(this.a($$0), List.of());
   }

   default Optional<jn<T>> a(axi<T> $$0, azk $$1) {
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

   ka.a<T> a(axj.b<T> var1);

   public interface a<T> {
      ala<? extends ka<? extends T>> a();

      jp.b<T> b();

      void c();
   }
}
