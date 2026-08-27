import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface ip<T> extends io<T> {
   Stream<in.c<T>> b();

   default Stream<aju<T>> c() {
      return this.b().map(in.c::h);
   }

   Stream<ir.c<T>> d();

   default Stream<avt<T>> e() {
      return this.d().map(ir.c::f);
   }

   public interface a {
      Stream<aju<? extends ja<?>>> a();

      <T> Optional<ip.b<T>> a(aju<? extends ja<? extends T>> var1);

      default <T> ip.b<T> b(aju<? extends ja<? extends T>> $$0) {
         return this.a($$0).orElseThrow(() -> new IllegalStateException("Registry " + $$0.a() + " not found"));
      }

      default <V> ajt<V> a(DynamicOps<V> $$0) {
         return ajt.a((DynamicOps<T>)$$0, this);
      }

      default io.a b() {
         return new io.a() {
            @Override
            public <T> Optional<io<T>> a(aju<? extends ja<? extends T>> $$0) {
               return a.this.a($$0).map($$0x -> $$0x);
            }
         };
      }

      static ip.a a(Stream<ip.b<?>> $$0) {
         final Map<aju<? extends ja<?>>, ip.b<?>> $$1 = $$0.collect(Collectors.toUnmodifiableMap(ip.b::f, $$0x -> $$0x));
         return new ip.a() {
            @Override
            public Stream<aju<? extends ja<?>>> a() {
               return $$1.keySet().stream();
            }

            @Override
            public <T> Optional<ip.b<T>> a(aju<? extends ja<? extends T>> $$0) {
               return Optional.ofNullable((ip.b<T>)$$1.get($$0));
            }
         };
      }
   }

   public interface b<T> extends ip<T>, iq<T> {
      aju<? extends ja<? extends T>> f();

      Lifecycle g();

      default ip.b<T> a(cmn $$0) {
         return cmk.bz.contains(this.f()) ? this.a($$1 -> ((cmk)$$1).a($$0)) : this;
      }

      default ip.b<T> a(final Predicate<T> $$0) {
         return new ip.b.a<T>() {
            @Override
            public ip.b<T> a() {
               return b.this;
            }

            @Override
            public Optional<in.c<T>> a(aju<T> $$0x) {
               return this.a().a($$0).filter($$1 -> $$0.test($$1.a()));
            }

            @Override
            public Stream<in.c<T>> b() {
               return this.a().b().filter($$1 -> $$0.test($$1.a()));
            }
         };
      }

      public interface a<T> extends ip.b<T> {
         ip.b<T> a();

         @Override
         default aju<? extends ja<? extends T>> f() {
            return this.a().f();
         }

         @Override
         default Lifecycle g() {
            return this.a().g();
         }

         @Override
         default Optional<in.c<T>> a(aju<T> $$0) {
            return this.a().a($$0);
         }

         @Override
         default Stream<in.c<T>> b() {
            return this.a().b();
         }

         @Override
         default Optional<ir.c<T>> a(avt<T> $$0) {
            return this.a().a($$0);
         }

         @Override
         default Stream<ir.c<T>> d() {
            return this.a().d();
         }
      }
   }
}
