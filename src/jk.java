import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface jk<T> extends jj<T> {
   Stream<ji.c<T>> b();

   default Stream<ale<T>> c() {
      return this.b().map(ji.c::h);
   }

   Stream<jm.c<T>> d();

   default Stream<axf<T>> e() {
      return this.d().map(jm.c::g);
   }

   public interface a {
      Stream<ale<? extends jv<?>>> a();

      <T> Optional<jk.b<T>> a(ale<? extends jv<? extends T>> var1);

      default <T> jk.b<T> b(ale<? extends jv<? extends T>> $$0) {
         return this.a($$0).orElseThrow(() -> new IllegalStateException("Registry " + $$0.a() + " not found"));
      }

      default <V> ald<V> a(DynamicOps<V> $$0) {
         return ald.a((DynamicOps<T>)$$0, this);
      }

      default jj.a b() {
         return new jj.a() {
            @Override
            public <T> Optional<jj<T>> a(ale<? extends jv<? extends T>> $$0) {
               return a.this.a($$0).map($$0x -> $$0x);
            }
         };
      }

      static jk.a a(Stream<jk.b<?>> $$0) {
         final Map<ale<? extends jv<?>>, jk.b<?>> $$1 = $$0.collect(Collectors.toUnmodifiableMap(jk.b::f, $$0x -> $$0x));
         return new jk.a() {
            @Override
            public Stream<ale<? extends jv<?>>> a() {
               return $$1.keySet().stream();
            }

            @Override
            public <T> Optional<jk.b<T>> a(ale<? extends jv<? extends T>> $$0) {
               return Optional.ofNullable((jk.b<T>)$$1.get($$0));
            }
         };
      }
   }

   public interface b<T> extends jk<T>, jl<T> {
      ale<? extends jv<? extends T>> f();

      Lifecycle g();

      default jk.b<T> a(cpl $$0) {
         return cpi.bA.contains(this.f()) ? this.a($$1 -> ((cpi)$$1).a($$0)) : this;
      }

      default jk.b<T> a(final Predicate<T> $$0) {
         return new jk.b.a<T>() {
            @Override
            public jk.b<T> a() {
               return b.this;
            }

            @Override
            public Optional<ji.c<T>> a(ale<T> $$0x) {
               return this.a().a($$0).filter($$1 -> $$0.test($$1.a()));
            }

            @Override
            public Stream<ji.c<T>> b() {
               return this.a().b().filter($$1 -> $$0.test($$1.a()));
            }
         };
      }

      public interface a<T> extends jk.b<T> {
         jk.b<T> a();

         @Override
         default ale<? extends jv<? extends T>> f() {
            return this.a().f();
         }

         @Override
         default Lifecycle g() {
            return this.a().g();
         }

         @Override
         default Optional<ji.c<T>> a(ale<T> $$0) {
            return this.a().a($$0);
         }

         @Override
         default Stream<ji.c<T>> b() {
            return this.a().b();
         }

         @Override
         default Optional<jm.c<T>> a(axf<T> $$0) {
            return this.a().a($$0);
         }

         @Override
         default Stream<jm.c<T>> d() {
            return this.a().d();
         }
      }
   }
}
