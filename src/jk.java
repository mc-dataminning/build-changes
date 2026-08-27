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

public interface jk<T> extends Keyable, jc<T> {
   akl<? extends jk<T>> c();

   default Codec<T> q() {
      return this.a().flatComapMap(ix.c::a, $$0 -> this.a(this.e((T)$$0)));
   }

   default Codec<ix<T>> r() {
      return this.a().flatComapMap($$0 -> $$0, this::a);
   }

   private Codec<ix.c<T>> a() {
      Codec<ix.c<T>> $$0 = akm.a
         .comapFlatMap(
            $$0x -> this.c($$0x)
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Unknown registry key in " + this.c() + ": " + $$0x)),
            $$0x -> $$0x.h().a()
         );
      return axm.a($$0, (Function<ix.c<T>, Lifecycle>)($$0x -> this.c($$0x.h()).map(jj::b).orElse(Lifecycle.experimental())));
   }

   private DataResult<ix.c<T>> a(ix<T> $$0) {
      return $$0 instanceof ix.c<T> $$1 ? DataResult.success($$1) : DataResult.error(() -> "Unregistered holder in " + this.c() + ": " + $$0);
   }

   default <U> Stream<U> keys(DynamicOps<U> $$0) {
      return this.e().stream().map($$1 -> (U)$$0.createString($$1.toString()));
   }

   @Nullable
   akm b(T var1);

   Optional<akl<T>> d(T var1);

   @Override
   int a(@Nullable T var1);

   @Nullable
   T a(@Nullable akl<T> var1);

   @Nullable
   T a(@Nullable akm var1);

   Optional<jj> c(akl<T> var1);

   Lifecycle d();

   default Optional<T> b(@Nullable akm $$0) {
      return Optional.ofNullable(this.a($$0));
   }

   default Optional<T> e(@Nullable akl<T> $$0) {
      return Optional.ofNullable(this.a($$0));
   }

   default T f(akl<T> $$0) {
      T $$1 = this.a($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Missing key in " + this.c() + ": " + $$0);
      } else {
         return $$1;
      }
   }

   Set<akm> e();

   Set<Entry<akl<T>, T>> g();

   Set<akl<T>> f();

   Optional<ix.c<T>> a(ayk var1);

   default Stream<T> s() {
      return StreamSupport.stream(this.spliterator(), false);
   }

   boolean d(akm var1);

   boolean d(akl<T> var1);

   static <T> T a(jk<? super T> $$0, String $$1, T $$2) {
      return a($$0, new akm($$1), $$2);
   }

   static <V, T extends V> T a(jk<V> $$0, akm $$1, T $$2) {
      return a($$0, akl.a($$0.c(), $$1), $$2);
   }

   static <V, T extends V> T a(jk<V> $$0, akl<V> $$1, T $$2) {
      ((jt)$$0).a($$1, (V)$$2, jj.a);
      return $$2;
   }

   static <T> ix.c<T> b(jk<T> $$0, akl<T> $$1, T $$2) {
      return ((jt)$$0).a($$1, $$2, jj.a);
   }

   static <T> ix.c<T> b(jk<T> $$0, akm $$1, T $$2) {
      return b($$0, akl.a($$0.c(), $$1), $$2);
   }

   jk<T> l();

   ix.c<T> f(T var1);

   Optional<ix.c<T>> c(int var1);

   Optional<ix.c<T>> c(akm var1);

   Optional<ix.c<T>> b(akl<T> var1);

   ix<T> e(T var1);

   default ix.c<T> g(akl<T> $$0) {
      return this.b($$0).orElseThrow(() -> new IllegalStateException("Missing key in " + this.c() + ": " + $$0));
   }

   Stream<ix.c<T>> h();

   Optional<jb.c<T>> b(awl<T> var1);

   default Iterable<ix<T>> c(awl<T> $$0) {
      return (Iterable<ix<T>>)DataFixUtils.orElse(this.b($$0), List.of());
   }

   default Optional<ix<T>> a(awl<T> $$0, ayk $$1) {
      return this.b($$0).flatMap($$1x -> $$1x.a($$1));
   }

   jb.c<T> a(awl<T> var1);

   Stream<Pair<awl<T>, jb.c<T>>> i();

   Stream<awl<T>> j();

   void m();

   void a(Map<awl<T>, List<ix<T>>> var1);

   default jc<ix<T>> t() {
      return new jc<ix<T>>() {
         public int a(ix<T> $$0) {
            return jk.this.a($$0.a());
         }

         @Nullable
         public ix<T> c(int $$0) {
            return (ix<T>)jk.this.c($$0).orElse(null);
         }

         @Override
         public int b() {
            return jk.this.b();
         }

         @Override
         public Iterator<ix<T>> iterator() {
            return jk.this.h().map($$0 -> (ix<T>)$$0).iterator();
         }
      };
   }

   ja<T> o();

   iz.b<T> p();

   default iz.b<T> u() {
      return new iz.b.a<T>() {
         @Override
         public iz.b<T> a() {
            return jk.this.p();
         }

         @Override
         public Optional<jb.c<T>> a(awl<T> $$0) {
            return Optional.of(this.b($$0));
         }

         @Override
         public jb.c<T> b(awl<T> $$0) {
            return jk.this.a($$0);
         }
      };
   }
}
