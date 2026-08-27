import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface ix<T> extends iw<T> {
   Stream<iv.c<T>> b();

   default Stream<ake<T>> c() {
      return this.b().map(iv.c::h);
   }

   Stream<iz.c<T>> d();

   default Stream<awd<T>> e() {
      return this.d().map(iz.c::f);
   }

   public interface a {
      Stream<ake<? extends ji<?>>> a();

      <T> Optional<ix.b<T>> a(ake<? extends ji<? extends T>> var1);

      default <T> ix.b<T> b(ake<? extends ji<? extends T>> $$0) {
         return this.a($$0).orElseThrow(() -> new IllegalStateException("Registry " + $$0.a() + " not found"));
      }

      default <V> akd<V> a(DynamicOps<V> $$0) {
         return akd.a((DynamicOps<T>)$$0, this);
      }

      default iw.a b() {
         return new iw.a() {
            @Override
            public <T> Optional<iw<T>> a(ake<? extends ji<? extends T>> $$0) {
               return a.this.a($$0).map($$0x -> $$0x);
            }
         };
      }

      static ix.a a(Stream<ix.b<?>> $$0) {
         final Map<ake<? extends ji<?>>, ix.b<?>> $$1 = $$0.collect(Collectors.toUnmodifiableMap(ix.b::f, $$0x -> $$0x));
         return new ix.a() {
            @Override
            public Stream<ake<? extends ji<?>>> a() {
               return $$1.keySet().stream();
            }

            @Override
            public <T> Optional<ix.b<T>> a(ake<? extends ji<? extends T>> $$0) {
               return Optional.ofNullable((ix.b<T>)$$1.get($$0));
            }
         };
      }
   }

   public interface b<T> extends ix<T>, iy<T> {
      ake<? extends ji<? extends T>> f();

      Lifecycle g();

      default ix.b<T> a(cmy $$0) {
         return cmv.bz.contains(this.f()) ? this.a($$1 -> ((cmv)$$1).a($$0)) : this;
      }

      default ix.b<T> a(final Predicate<T> $$0) {
         return new ix.b.a<T>() {
            @Override
            public ix.b<T> a() {
               return b.this;
            }

            @Override
            public Optional<iv.c<T>> a(ake<T> $$0x) {
               return this.a().a($$0).filter($$1 -> $$0.test($$1.a()));
            }

            @Override
            public Stream<iv.c<T>> b() {
               return this.a().b().filter($$1 -> $$0.test($$1.a()));
            }
         };
      }

      public interface a<T> extends ix.b<T> {
         ix.b<T> a();

         @Override
         default ake<? extends ji<? extends T>> f() {
            return this.a().f();
         }

         @Override
         default Lifecycle g() {
            return this.a().g();
         }

         @Override
         default Optional<iv.c<T>> a(ake<T> $$0) {
            return this.a().a($$0);
         }

         @Override
         default Stream<iv.c<T>> b() {
            return this.a().b();
         }

         @Override
         default Optional<iz.c<T>> a(awd<T> $$0) {
            return this.a().a($$0);
         }

         @Override
         default Stream<iz.c<T>> d() {
            return this.a().d();
         }
      }
   }
}
