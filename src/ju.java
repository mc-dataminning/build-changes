import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface ju<T> extends jt<T> {
   Stream<js.c<T>> c();

   default Stream<alc<T>> c_() {
      return this.c().map(js.c::h);
   }

   Stream<jw.c<T>> e();

   default Stream<axp<T>> f() {
      return this.e().map(jw.c::h);
   }

   public interface a extends jt.a {
      Stream<alc<? extends kf<?>>> b();

      default Stream<ju.b<?>> c() {
         return this.b().map(this::e);
      }

      @Override
      <T> Optional<? extends ju.b<T>> a(alc<? extends kf<? extends T>> var1);

      default <T> ju.b<T> e(alc<? extends kf<? extends T>> $$0) {
         return this.a($$0).orElseThrow(() -> new IllegalStateException("Registry " + $$0.a() + " not found"));
      }

      default <V> alb<V> a(DynamicOps<V> $$0) {
         return alb.a((DynamicOps<T>)$$0, this);
      }

      static ju.a a(Stream<ju.b<?>> $$0) {
         final Map<alc<? extends kf<?>>, ju.b<?>> $$1 = $$0.collect(Collectors.toUnmodifiableMap(ju.b::g, $$0x -> $$0x));
         return new ju.a() {
            @Override
            public Stream<alc<? extends kf<?>>> b() {
               return $$1.keySet().stream();
            }

            @Override
            public <T> Optional<ju.b<T>> a(alc<? extends kf<? extends T>> $$0) {
               return Optional.ofNullable((ju.b<T>)$$1.get($$0));
            }
         };
      }

      default Lifecycle d() {
         return this.c().map(ju.b::h).reduce(Lifecycle.stable(), Lifecycle::add);
      }
   }

   public interface b<T> extends ju<T>, jv<T> {
      alc<? extends kf<? extends T>> g();

      Lifecycle h();

      default ju.b<T> a(cte $$0) {
         return ctb.bT.contains(this.g()) ? this.a($$1 -> ((ctb)$$1).a($$0)) : this;
      }

      default ju.b<T> a(final Predicate<T> $$0) {
         return new ju.b.a<T>() {
            @Override
            public ju.b<T> a() {
               return b.this;
            }

            @Override
            public Optional<js.c<T>> a(alc<T> $$0x) {
               return this.a().a($$0).filter($$1 -> $$0.test($$1.a()));
            }

            @Override
            public Stream<js.c<T>> c() {
               return this.a().c().filter($$1 -> $$0.test($$1.a()));
            }
         };
      }

      public interface a<T> extends ju.b<T> {
         ju.b<T> a();

         @Override
         default alc<? extends kf<? extends T>> g() {
            return this.a().g();
         }

         @Override
         default Lifecycle h() {
            return this.a().h();
         }

         @Override
         default Optional<js.c<T>> a(alc<T> $$0) {
            return this.a().a($$0);
         }

         @Override
         default Stream<js.c<T>> c() {
            return this.a().c();
         }

         @Override
         default Optional<jw.c<T>> a(axp<T> $$0) {
            return this.a().a($$0);
         }

         @Override
         default Stream<jw.c<T>> e() {
            return this.a().e();
         }
      }
   }
}
