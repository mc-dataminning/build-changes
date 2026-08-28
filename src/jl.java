import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface jl<T> extends jk<T> {
   Stream<jj.c<T>> b();

   default Stream<akj<T>> c() {
      return this.b().map(jj.c::h);
   }

   Stream<jn.c<T>> d();

   default Stream<awm<T>> e() {
      return this.d().map(jn.c::g);
   }

   public interface a {
      Stream<akj<? extends jw<?>>> a();

      <T> Optional<jl.b<T>> a(akj<? extends jw<? extends T>> var1);

      default <T> jl.b<T> b(akj<? extends jw<? extends T>> $$0) {
         return this.a($$0).orElseThrow(() -> new IllegalStateException("Registry " + $$0.a() + " not found"));
      }

      default <V> aki<V> a(DynamicOps<V> $$0) {
         return aki.a((DynamicOps<T>)$$0, this);
      }

      default jk.a b() {
         return new jk.a() {
            @Override
            public <T> Optional<jk<T>> a(akj<? extends jw<? extends T>> $$0) {
               return a.this.a($$0).map($$0x -> $$0x);
            }
         };
      }

      static jl.a a(Stream<jl.b<?>> $$0) {
         final Map<akj<? extends jw<?>>, jl.b<?>> $$1 = $$0.collect(Collectors.toUnmodifiableMap(jl.b::f, $$0x -> $$0x));
         return new jl.a() {
            @Override
            public Stream<akj<? extends jw<?>>> a() {
               return $$1.keySet().stream();
            }

            @Override
            public <T> Optional<jl.b<T>> a(akj<? extends jw<? extends T>> $$0) {
               return Optional.ofNullable((jl.b<T>)$$1.get($$0));
            }
         };
      }
   }

   public interface b<T> extends jl<T>, jm<T> {
      akj<? extends jw<? extends T>> f();

      Lifecycle g();

      default jl.b<T> a(coy $$0) {
         return cov.bA.contains(this.f()) ? this.a($$1 -> ((cov)$$1).a($$0)) : this;
      }

      default jl.b<T> a(final Predicate<T> $$0) {
         return new jl.b.a<T>() {
            @Override
            public jl.b<T> a() {
               return b.this;
            }

            @Override
            public Optional<jj.c<T>> a(akj<T> $$0x) {
               return this.a().a($$0).filter($$1 -> $$0.test($$1.a()));
            }

            @Override
            public Stream<jj.c<T>> b() {
               return this.a().b().filter($$1 -> $$0.test($$1.a()));
            }
         };
      }

      public interface a<T> extends jl.b<T> {
         jl.b<T> a();

         @Override
         default akj<? extends jw<? extends T>> f() {
            return this.a().f();
         }

         @Override
         default Lifecycle g() {
            return this.a().g();
         }

         @Override
         default Optional<jj.c<T>> a(akj<T> $$0) {
            return this.a().a($$0);
         }

         @Override
         default Stream<jj.c<T>> b() {
            return this.a().b();
         }

         @Override
         default Optional<jn.c<T>> a(awm<T> $$0) {
            return this.a().a($$0);
         }

         @Override
         default Stream<jn.c<T>> d() {
            return this.a().d();
         }
      }
   }
}
