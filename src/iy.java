import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface iy<T> extends ix<T> {
   Stream<iw.c<T>> b();

   default Stream<akg<T>> c() {
      return this.b().map(iw.c::h);
   }

   Stream<ja.c<T>> d();

   default Stream<awg<T>> e() {
      return this.d().map(ja.c::g);
   }

   public interface a {
      Stream<akg<? extends jj<?>>> a();

      <T> Optional<iy.b<T>> a(akg<? extends jj<? extends T>> var1);

      default <T> iy.b<T> b(akg<? extends jj<? extends T>> $$0) {
         return this.a($$0).orElseThrow(() -> new IllegalStateException("Registry " + $$0.a() + " not found"));
      }

      default <V> akf<V> a(DynamicOps<V> $$0) {
         return akf.a((DynamicOps<T>)$$0, this);
      }

      default ix.a b() {
         return new ix.a() {
            @Override
            public <T> Optional<ix<T>> a(akg<? extends jj<? extends T>> $$0) {
               return a.this.a($$0).map($$0x -> $$0x);
            }
         };
      }

      static iy.a a(Stream<iy.b<?>> $$0) {
         final Map<akg<? extends jj<?>>, iy.b<?>> $$1 = $$0.collect(Collectors.toUnmodifiableMap(iy.b::f, $$0x -> $$0x));
         return new iy.a() {
            @Override
            public Stream<akg<? extends jj<?>>> a() {
               return $$1.keySet().stream();
            }

            @Override
            public <T> Optional<iy.b<T>> a(akg<? extends jj<? extends T>> $$0) {
               return Optional.ofNullable((iy.b<T>)$$1.get($$0));
            }
         };
      }
   }

   public interface b<T> extends iy<T>, iz<T> {
      akg<? extends jj<? extends T>> f();

      Lifecycle g();

      default iy.b<T> a(cnu $$0) {
         return cnr.bz.contains(this.f()) ? this.a($$1 -> ((cnr)$$1).a($$0)) : this;
      }

      default iy.b<T> a(final Predicate<T> $$0) {
         return new iy.b.a<T>() {
            @Override
            public iy.b<T> a() {
               return b.this;
            }

            @Override
            public Optional<iw.c<T>> a(akg<T> $$0x) {
               return this.a().a($$0).filter($$1 -> $$0.test($$1.a()));
            }

            @Override
            public Stream<iw.c<T>> b() {
               return this.a().b().filter($$1 -> $$0.test($$1.a()));
            }
         };
      }

      public interface a<T> extends iy.b<T> {
         iy.b<T> a();

         @Override
         default akg<? extends jj<? extends T>> f() {
            return this.a().f();
         }

         @Override
         default Lifecycle g() {
            return this.a().g();
         }

         @Override
         default Optional<iw.c<T>> a(akg<T> $$0) {
            return this.a().a($$0);
         }

         @Override
         default Stream<iw.c<T>> b() {
            return this.a().b();
         }

         @Override
         default Optional<ja.c<T>> a(awg<T> $$0) {
            return this.a().a($$0);
         }

         @Override
         default Stream<ja.c<T>> d() {
            return this.a().d();
         }
      }
   }
}
