import com.mojang.serialization.Lifecycle;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface in<T> extends im<T> {
   Stream<il.c<T>> b();

   default Stream<ajg<T>> c() {
      return this.b().map(il.c::h);
   }

   Stream<ip.c<T>> d();

   default Stream<avd<T>> e() {
      return this.d().map(ip.c::f);
   }

   public interface a {
      Stream<ajg<? extends iy<?>>> a();

      <T> Optional<in.b<T>> a(ajg<? extends iy<? extends T>> var1);

      default <T> in.b<T> b(ajg<? extends iy<? extends T>> $$0) {
         return this.a($$0).orElseThrow(() -> new IllegalStateException("Registry " + $$0.a() + " not found"));
      }

      default im.a b() {
         return new im.a() {
            @Override
            public <T> Optional<im<T>> a(ajg<? extends iy<? extends T>> $$0) {
               return a.this.a($$0).map($$0x -> $$0x);
            }
         };
      }

      static in.a a(Stream<in.b<?>> $$0) {
         final Map<ajg<? extends iy<?>>, in.b<?>> $$1 = $$0.collect(Collectors.toUnmodifiableMap(in.b::f, $$0x -> $$0x));
         return new in.a() {
            @Override
            public Stream<ajg<? extends iy<?>>> a() {
               return $$1.keySet().stream();
            }

            @Override
            public <T> Optional<in.b<T>> a(ajg<? extends iy<? extends T>> $$0) {
               return Optional.ofNullable((in.b<T>)$$1.get($$0));
            }
         };
      }
   }

   public interface b<T> extends in<T>, io<T> {
      ajg<? extends iy<? extends T>> f();

      Lifecycle g();

      default in.b<T> a(clf $$0) {
         return clc.bz.contains(this.f()) ? this.a($$1 -> ((clc)$$1).a($$0)) : this;
      }

      default in.b<T> a(final Predicate<T> $$0) {
         return new in.b.a<T>() {
            @Override
            protected in.b<T> a() {
               return b.this;
            }

            @Override
            public Optional<il.c<T>> a(ajg<T> $$0x) {
               return this.a().a($$0).filter($$1 -> $$0.test($$1.a()));
            }

            @Override
            public Stream<il.c<T>> b() {
               return this.a().b().filter($$1 -> $$0.test($$1.a()));
            }
         };
      }

      public abstract static class a<T> implements in.b<T> {
         protected abstract in.b<T> a();

         @Override
         public ajg<? extends iy<? extends T>> f() {
            return this.a().f();
         }

         @Override
         public Lifecycle g() {
            return this.a().g();
         }

         @Override
         public Optional<il.c<T>> a(ajg<T> $$0) {
            return this.a().a($$0);
         }

         @Override
         public Stream<il.c<T>> b() {
            return this.a().b();
         }

         @Override
         public Optional<ip.c<T>> a(avd<T> $$0) {
            return this.a().a($$0);
         }

         @Override
         public Stream<ip.c<T>> d() {
            return this.a().d();
         }
      }
   }
}
