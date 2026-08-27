import com.mojang.serialization.Lifecycle;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface hi<T> extends hh<T> {
   Stream<hg.c<T>> b();

   default Stream<aew<T>> c() {
      return this.b().map(hg.c::g);
   }

   Stream<hk.c<T>> d();

   default Stream<aqi<T>> e() {
      return this.d().map(hk.c::f);
   }

   default hi<T> a(final Predicate<T> $$0) {
      return new hi.a<T>(this) {
         @Override
         public Optional<hg.c<T>> a(aew<T> $$0x) {
            return this.c.a($$0).filter($$1 -> $$0.test($$1.a()));
         }

         @Override
         public Stream<hg.c<T>> b() {
            return this.c.b().filter($$1 -> $$0.test($$1.a()));
         }
      };
   }

   public static class a<T> implements hi<T> {
      protected final hi<T> c;

      public a(hi<T> $$0) {
         this.c = $$0;
      }

      @Override
      public Optional<hg.c<T>> a(aew<T> $$0) {
         return this.c.a($$0);
      }

      @Override
      public Stream<hg.c<T>> b() {
         return this.c.b();
      }

      @Override
      public Optional<hk.c<T>> a(aqi<T> $$0) {
         return this.c.a($$0);
      }

      @Override
      public Stream<hk.c<T>> d() {
         return this.c.d();
      }
   }

   public interface b {
      <T> Optional<hi.c<T>> a(aew<? extends ht<? extends T>> var1);

      default <T> hi.c<T> b(aew<? extends ht<? extends T>> $$0) {
         return this.a($$0).orElseThrow(() -> new IllegalStateException("Registry " + $$0.a() + " not found"));
      }

      default hh.a a() {
         return new hh.a() {
            @Override
            public <T> Optional<hh<T>> a(aew<? extends ht<? extends T>> $$0) {
               return b.this.a($$0).map($$0x -> $$0x);
            }
         };
      }

      static hi.b a(Stream<hi.c<?>> $$0) {
         final Map<aew<? extends ht<?>>, hi.c<?>> $$1 = $$0.collect(Collectors.toUnmodifiableMap(hi.c::f, $$0x -> $$0x));
         return new hi.b() {
            @Override
            public <T> Optional<hi.c<T>> a(aew<? extends ht<? extends T>> $$0) {
               return Optional.ofNullable((hi.c<T>)$$1.get($$0));
            }
         };
      }
   }

   public interface c<T> extends hi<T>, hj<T> {
      aew<? extends ht<? extends T>> f();

      Lifecycle g();

      default hi<T> a(cec $$0) {
         return (hi<T>)(cdz.bv.contains(this.f()) ? this.a($$1 -> ((cdz)$$1).a($$0)) : this);
      }

      public abstract static class a<T> implements hi.c<T> {
         protected abstract hi.c<T> a();

         @Override
         public aew<? extends ht<? extends T>> f() {
            return this.a().f();
         }

         @Override
         public Lifecycle g() {
            return this.a().g();
         }

         @Override
         public Optional<hg.c<T>> a(aew<T> $$0) {
            return this.a().a($$0);
         }

         @Override
         public Stream<hg.c<T>> b() {
            return this.a().b();
         }

         @Override
         public Optional<hk.c<T>> a(aqi<T> $$0) {
            return this.a().a($$0);
         }

         @Override
         public Stream<hk.c<T>> d() {
            return this.a().d();
         }
      }
   }
}
