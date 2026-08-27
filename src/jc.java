import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface jc<T> extends jb<T> {
   Stream<ja.c<T>> b();

   default Stream<aks<T>> c() {
      return this.b().map(ja.c::h);
   }

   Stream<je.c<T>> d();

   default Stream<awt<T>> e() {
      return this.d().map(je.c::g);
   }

   public interface a {
      Stream<aks<? extends jn<?>>> a();

      <T> Optional<jc.b<T>> a(aks<? extends jn<? extends T>> var1);

      default <T> jc.b<T> b(aks<? extends jn<? extends T>> $$0) {
         return this.a($$0).orElseThrow(() -> new IllegalStateException("Registry " + $$0.a() + " not found"));
      }

      default <V> akr<V> a(DynamicOps<V> $$0) {
         return akr.a((DynamicOps<T>)$$0, this);
      }

      default jb.a b() {
         return new jb.a() {
            @Override
            public <T> Optional<jb<T>> a(aks<? extends jn<? extends T>> $$0) {
               return a.this.a($$0).map($$0x -> $$0x);
            }
         };
      }

      static jc.a a(Stream<jc.b<?>> $$0) {
         final Map<aks<? extends jn<?>>, jc.b<?>> $$1 = $$0.collect(Collectors.toUnmodifiableMap(jc.b::f, $$0x -> $$0x));
         return new jc.a() {
            @Override
            public Stream<aks<? extends jn<?>>> a() {
               return $$1.keySet().stream();
            }

            @Override
            public <T> Optional<jc.b<T>> a(aks<? extends jn<? extends T>> $$0) {
               return Optional.ofNullable((jc.b<T>)$$1.get($$0));
            }
         };
      }
   }

   public interface b<T> extends jc<T>, jd<T> {
      aks<? extends jn<? extends T>> f();

      Lifecycle g();

      default jc.b<T> a(cop $$0) {
         return col.bI.contains(this.f()) ? this.a($$1 -> ((col)$$1).a($$0)) : this;
      }

      default jc.b<T> a(final Predicate<T> $$0) {
         return new jc.b.a<T>() {
            @Override
            public jc.b<T> a() {
               return b.this;
            }

            @Override
            public Optional<ja.c<T>> a(aks<T> $$0x) {
               return this.a().a($$0).filter($$1 -> $$0.test($$1.a()));
            }

            @Override
            public Stream<ja.c<T>> b() {
               return this.a().b().filter($$1 -> $$0.test($$1.a()));
            }
         };
      }

      public interface a<T> extends jc.b<T> {
         jc.b<T> a();

         @Override
         default aks<? extends jn<? extends T>> f() {
            return this.a().f();
         }

         @Override
         default Lifecycle g() {
            return this.a().g();
         }

         @Override
         default Optional<ja.c<T>> a(aks<T> $$0) {
            return this.a().a($$0);
         }

         @Override
         default Stream<ja.c<T>> b() {
            return this.a().b();
         }

         @Override
         default Optional<je.c<T>> a(awt<T> $$0) {
            return this.a().a($$0);
         }

         @Override
         default Stream<je.c<T>> d() {
            return this.a().d();
         }
      }
   }
}
