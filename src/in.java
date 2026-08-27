import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface in<T> extends im<T> {
   Stream<il.c<T>> b();

   default Stream<ajs<T>> c() {
      return this.b().map(il.c::h);
   }

   Stream<ip.c<T>> d();

   default Stream<avr<T>> e() {
      return this.d().map(ip.c::f);
   }

   public interface a {
      Stream<ajs<? extends iy<?>>> a();

      <T> Optional<in.b<T>> a(ajs<? extends iy<? extends T>> var1);

      default <T> in.b<T> b(ajs<? extends iy<? extends T>> $$0) {
         return this.a($$0).orElseThrow(() -> new IllegalStateException("Registry " + $$0.a() + " not found"));
      }

      default <V> ajr<V> a(DynamicOps<V> $$0) {
         return ajr.a((DynamicOps<T>)$$0, this);
      }

      default im.a b() {
         return new im.a() {
            @Override
            public <T> Optional<im<T>> a(ajs<? extends iy<? extends T>> $$0) {
               return a.this.a($$0).map($$0x -> $$0x);
            }
         };
      }

      static in.a a(Stream<in.b<?>> $$0) {
         final Map<ajs<? extends iy<?>>, in.b<?>> $$1 = $$0.collect(Collectors.toUnmodifiableMap(in.b::f, $$0x -> $$0x));
         return new in.a() {
            @Override
            public Stream<ajs<? extends iy<?>>> a() {
               return $$1.keySet().stream();
            }

            @Override
            public <T> Optional<in.b<T>> a(ajs<? extends iy<? extends T>> $$0) {
               return Optional.ofNullable((in.b<T>)$$1.get($$0));
            }
         };
      }
   }

   public interface b<T> extends in<T>, io<T> {
      ajs<? extends iy<? extends T>> f();

      Lifecycle g();

      default in.b<T> a(cmg $$0) {
         return cmd.bz.contains(this.f()) ? this.a($$1 -> ((cmd)$$1).a($$0)) : this;
      }

      default in.b<T> a(final Predicate<T> $$0) {
         return new in.b.a<T>() {
            @Override
            public in.b<T> a() {
               return b.this;
            }

            @Override
            public Optional<il.c<T>> a(ajs<T> $$0x) {
               return this.a().a($$0).filter($$1 -> $$0.test($$1.a()));
            }

            @Override
            public Stream<il.c<T>> b() {
               return this.a().b().filter($$1 -> $$0.test($$1.a()));
            }
         };
      }

      public interface a<T> extends in.b<T> {
         in.b<T> a();

         @Override
         default ajs<? extends iy<? extends T>> f() {
            return this.a().f();
         }

         @Override
         default Lifecycle g() {
            return this.a().g();
         }

         @Override
         default Optional<il.c<T>> a(ajs<T> $$0) {
            return this.a().a($$0);
         }

         @Override
         default Stream<il.c<T>> b() {
            return this.a().b();
         }

         @Override
         default Optional<ip.c<T>> a(avr<T> $$0) {
            return this.a().a($$0);
         }

         @Override
         default Stream<ip.c<T>> d() {
            return this.a().d();
         }
      }
   }
}
