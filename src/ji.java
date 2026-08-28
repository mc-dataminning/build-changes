import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface ji<T> extends jh<T> {
   Stream<jg.c<T>> c();

   default Stream<alq<T>> c_() {
      return this.c().map(jg.c::h);
   }

   Stream<jk.c<T>> e();

   default Stream<ayc<T>> f() {
      return this.e().map(jk.c::h);
   }

   public interface a extends jh.a {
      Stream<alq<? extends jt<?>>> b();

      default Stream<ji.b<?>> c() {
         return this.b().map(this::e);
      }

      @Override
      <T> Optional<? extends ji.b<T>> a(alq<? extends jt<? extends T>> var1);

      default <T> ji.b<T> e(alq<? extends jt<? extends T>> $$0) {
         return this.a($$0).orElseThrow(() -> new IllegalStateException("Registry " + $$0.a() + " not found"));
      }

      default <V> alp<V> a(DynamicOps<V> $$0) {
         return alp.a((DynamicOps<T>)$$0, this);
      }

      static ji.a a(Stream<ji.b<?>> $$0) {
         final Map<alq<? extends jt<?>>, ji.b<?>> $$1 = $$0.collect(Collectors.toUnmodifiableMap(ji.b::g, $$0x -> $$0x));
         return new ji.a() {
            @Override
            public Stream<alq<? extends jt<?>>> b() {
               return $$1.keySet().stream();
            }

            @Override
            public <T> Optional<ji.b<T>> a(alq<? extends jt<? extends T>> $$0) {
               return Optional.ofNullable((ji.b<T>)$$1.get($$0));
            }
         };
      }

      default Lifecycle d() {
         return this.c().map(ji.b::h).reduce(Lifecycle.stable(), Lifecycle::add);
      }
   }

   public interface b<T> extends ji<T>, jj<T> {
      alq<? extends jt<? extends T>> g();

      Lifecycle h();

      default ji.b<T> a(cvs $$0) {
         return cvp.bV.contains(this.g()) ? this.a($$1 -> ((cvp)$$1).a($$0)) : this;
      }

      default ji.b<T> a(final Predicate<T> $$0) {
         return new ji.b.a<T>() {
            @Override
            public ji.b<T> a() {
               return b.this;
            }

            @Override
            public Optional<jg.c<T>> a(alq<T> $$0x) {
               return this.a().a($$0).filter($$1 -> $$0.test($$1.a()));
            }

            @Override
            public Stream<jg.c<T>> c() {
               return this.a().c().filter($$1 -> $$0.test($$1.a()));
            }
         };
      }

      public interface a<T> extends ji.b<T> {
         ji.b<T> a();

         @Override
         default alq<? extends jt<? extends T>> g() {
            return this.a().g();
         }

         @Override
         default Lifecycle h() {
            return this.a().h();
         }

         @Override
         default Optional<jg.c<T>> a(alq<T> $$0) {
            return this.a().a($$0);
         }

         @Override
         default Stream<jg.c<T>> c() {
            return this.a().c();
         }

         @Override
         default Optional<jk.c<T>> a(ayc<T> $$0) {
            return this.a().a($$0);
         }

         @Override
         default Stream<jk.c<T>> e() {
            return this.a().e();
         }
      }
   }
}
