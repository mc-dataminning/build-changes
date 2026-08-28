import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface jh<T> extends jg<T> {
   Stream<jf.c<T>> c();

   default Stream<alf<T>> c_() {
      return this.c().map(jf.c::h);
   }

   Stream<jj.c<T>> e();

   default Stream<axr<T>> f() {
      return this.e().map(jj.c::h);
   }

   public interface a extends jg.a {
      Stream<alf<? extends js<?>>> b();

      default Stream<jh.b<?>> c() {
         return this.b().map(this::e);
      }

      @Override
      <T> Optional<? extends jh.b<T>> a(alf<? extends js<? extends T>> var1);

      default <T> jh.b<T> e(alf<? extends js<? extends T>> $$0) {
         return this.a($$0).orElseThrow(() -> new IllegalStateException("Registry " + $$0.a() + " not found"));
      }

      default <V> ale<V> a(DynamicOps<V> $$0) {
         return ale.a((DynamicOps<T>)$$0, this);
      }

      static jh.a a(Stream<jh.b<?>> $$0) {
         final Map<alf<? extends js<?>>, jh.b<?>> $$1 = $$0.collect(Collectors.toUnmodifiableMap(jh.b::g, $$0x -> $$0x));
         return new jh.a() {
            @Override
            public Stream<alf<? extends js<?>>> b() {
               return $$1.keySet().stream();
            }

            @Override
            public <T> Optional<jh.b<T>> a(alf<? extends js<? extends T>> $$0) {
               return Optional.ofNullable((jh.b<T>)$$1.get($$0));
            }
         };
      }

      default Lifecycle d() {
         return this.c().map(jh.b::h).reduce(Lifecycle.stable(), Lifecycle::add);
      }
   }

   public interface b<T> extends jh<T>, ji<T> {
      alf<? extends js<? extends T>> g();

      Lifecycle h();

      default jh.b<T> a(cut $$0) {
         return cuq.bU.contains(this.g()) ? this.a($$1 -> ((cuq)$$1).a($$0)) : this;
      }

      default jh.b<T> a(final Predicate<T> $$0) {
         return new jh.b.a<T>() {
            @Override
            public jh.b<T> a() {
               return b.this;
            }

            @Override
            public Optional<jf.c<T>> a(alf<T> $$0x) {
               return this.a().a($$0).filter($$1 -> $$0.test($$1.a()));
            }

            @Override
            public Stream<jf.c<T>> c() {
               return this.a().c().filter($$1 -> $$0.test($$1.a()));
            }
         };
      }

      public interface a<T> extends jh.b<T> {
         jh.b<T> a();

         @Override
         default alf<? extends js<? extends T>> g() {
            return this.a().g();
         }

         @Override
         default Lifecycle h() {
            return this.a().h();
         }

         @Override
         default Optional<jf.c<T>> a(alf<T> $$0) {
            return this.a().a($$0);
         }

         @Override
         default Stream<jf.c<T>> c() {
            return this.a().c();
         }

         @Override
         default Optional<jj.c<T>> a(axr<T> $$0) {
            return this.a().a($$0);
         }

         @Override
         default Stream<jj.c<T>> e() {
            return this.a().e();
         }
      }
   }
}
