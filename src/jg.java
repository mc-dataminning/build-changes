import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface jg<T> extends jf<T> {
   Stream<je.c<T>> c();

   default Stream<ald<T>> c_() {
      return this.c().map(je.c::h);
   }

   Stream<ji.c<T>> e();

   default Stream<axp<T>> f() {
      return this.e().map(ji.c::h);
   }

   public interface a extends jf.a {
      Stream<ald<? extends jr<?>>> b();

      default Stream<jg.b<?>> c() {
         return this.b().map(this::e);
      }

      @Override
      <T> Optional<? extends jg.b<T>> a(ald<? extends jr<? extends T>> var1);

      default <T> jg.b<T> e(ald<? extends jr<? extends T>> $$0) {
         return this.a($$0).orElseThrow(() -> new IllegalStateException("Registry " + $$0.a() + " not found"));
      }

      default <V> alc<V> a(DynamicOps<V> $$0) {
         return alc.a((DynamicOps<T>)$$0, this);
      }

      static jg.a a(Stream<jg.b<?>> $$0) {
         final Map<ald<? extends jr<?>>, jg.b<?>> $$1 = $$0.collect(Collectors.toUnmodifiableMap(jg.b::g, $$0x -> $$0x));
         return new jg.a() {
            @Override
            public Stream<ald<? extends jr<?>>> b() {
               return $$1.keySet().stream();
            }

            @Override
            public <T> Optional<jg.b<T>> a(ald<? extends jr<? extends T>> $$0) {
               return Optional.ofNullable((jg.b<T>)$$1.get($$0));
            }
         };
      }

      default Lifecycle d() {
         return this.c().map(jg.b::h).reduce(Lifecycle.stable(), Lifecycle::add);
      }
   }

   public interface b<T> extends jg<T>, jh<T> {
      ald<? extends jr<? extends T>> g();

      Lifecycle h();

      default jg.b<T> a(cub $$0) {
         return cty.bU.contains(this.g()) ? this.a($$1 -> ((cty)$$1).a($$0)) : this;
      }

      default jg.b<T> a(final Predicate<T> $$0) {
         return new jg.b.a<T>() {
            @Override
            public jg.b<T> a() {
               return b.this;
            }

            @Override
            public Optional<je.c<T>> a(ald<T> $$0x) {
               return this.a().a($$0).filter($$1 -> $$0.test($$1.a()));
            }

            @Override
            public Stream<je.c<T>> c() {
               return this.a().c().filter($$1 -> $$0.test($$1.a()));
            }
         };
      }

      public interface a<T> extends jg.b<T> {
         jg.b<T> a();

         @Override
         default ald<? extends jr<? extends T>> g() {
            return this.a().g();
         }

         @Override
         default Lifecycle h() {
            return this.a().h();
         }

         @Override
         default Optional<je.c<T>> a(ald<T> $$0) {
            return this.a().a($$0);
         }

         @Override
         default Stream<je.c<T>> c() {
            return this.a().c();
         }

         @Override
         default Optional<ji.c<T>> a(axp<T> $$0) {
            return this.a().a($$0);
         }

         @Override
         default Stream<ji.c<T>> e() {
            return this.a().e();
         }
      }
   }
}
