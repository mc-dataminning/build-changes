import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface jr<T> extends jq<T> {
   Stream<jp.c<T>> c();

   default Stream<alg<T>> c_() {
      return this.c().map(jp.c::h);
   }

   Stream<jt.c<T>> e();

   default Stream<axp<T>> f() {
      return this.e().map(jt.c::h);
   }

   public interface a extends jq.a {
      Stream<alg<? extends kc<?>>> a();

      default Stream<jr.b<?>> b() {
         return this.a().map(this::d);
      }

      @Override
      <T> Optional<? extends jr.b<T>> a(alg<? extends kc<? extends T>> var1);

      default <T> jr.b<T> d(alg<? extends kc<? extends T>> $$0) {
         return this.a($$0).orElseThrow(() -> new IllegalStateException("Registry " + $$0.a() + " not found"));
      }

      default <V> alf<V> a(DynamicOps<V> $$0) {
         return alf.a((DynamicOps<T>)$$0, this);
      }

      static jr.a a(Stream<jr.b<?>> $$0) {
         final Map<alg<? extends kc<?>>, jr.b<?>> $$1 = $$0.collect(Collectors.toUnmodifiableMap(jr.b::g, $$0x -> $$0x));
         return new jr.a() {
            @Override
            public Stream<alg<? extends kc<?>>> a() {
               return $$1.keySet().stream();
            }

            @Override
            public <T> Optional<jr.b<T>> a(alg<? extends kc<? extends T>> $$0) {
               return Optional.ofNullable((jr.b<T>)$$1.get($$0));
            }
         };
      }

      default Lifecycle c() {
         return this.b().map(jr.b::h).reduce(Lifecycle.stable(), Lifecycle::add);
      }
   }

   public interface b<T> extends jr<T>, js<T> {
      alg<? extends kc<? extends T>> g();

      Lifecycle h();

      default jr.b<T> a(cra $$0) {
         return cqx.bA.contains(this.g()) ? this.a($$1 -> ((cqx)$$1).a($$0)) : this;
      }

      default jr.b<T> a(final Predicate<T> $$0) {
         return new jr.b.a<T>() {
            @Override
            public jr.b<T> a() {
               return b.this;
            }

            @Override
            public Optional<jp.c<T>> a(alg<T> $$0x) {
               return this.a().a($$0).filter($$1 -> $$0.test($$1.a()));
            }

            @Override
            public Stream<jp.c<T>> c() {
               return this.a().c().filter($$1 -> $$0.test($$1.a()));
            }
         };
      }

      public interface a<T> extends jr.b<T> {
         jr.b<T> a();

         @Override
         default alg<? extends kc<? extends T>> g() {
            return this.a().g();
         }

         @Override
         default Lifecycle h() {
            return this.a().h();
         }

         @Override
         default Optional<jp.c<T>> a(alg<T> $$0) {
            return this.a().a($$0);
         }

         @Override
         default Stream<jp.c<T>> c() {
            return this.a().c();
         }

         @Override
         default Optional<jt.c<T>> a(axp<T> $$0) {
            return this.a().a($$0);
         }

         @Override
         default Stream<jt.c<T>> e() {
            return this.a().e();
         }
      }
   }
}
