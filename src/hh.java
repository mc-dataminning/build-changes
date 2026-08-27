import com.mojang.serialization.Lifecycle;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface hh<T> extends hg<T> {
   Stream<hf.c<T>> b();

   default Stream<aeo<T>> c() {
      return this.b().map(hf.c::g);
   }

   Stream<hj.c<T>> d();

   default Stream<apy<T>> e() {
      return this.d().map(hj.c::f);
   }

   default hh<T> a(final Predicate<T> $$0) {
      return new hh.a<T>(this) {
         @Override
         public Optional<hf.c<T>> a(aeo<T> $$0x) {
            return this.c.a($$0).filter($$1 -> $$0.test($$1.a()));
         }

         @Override
         public Stream<hf.c<T>> b() {
            return this.c.b().filter($$1 -> $$0.test($$1.a()));
         }
      };
   }

   public static class a<T> implements hh<T> {
      protected final hh<T> c;

      public a(hh<T> $$0) {
         this.c = $$0;
      }

      @Override
      public Optional<hf.c<T>> a(aeo<T> $$0) {
         return this.c.a($$0);
      }

      @Override
      public Stream<hf.c<T>> b() {
         return this.c.b();
      }

      @Override
      public Optional<hj.c<T>> a(apy<T> $$0) {
         return this.c.a($$0);
      }

      @Override
      public Stream<hj.c<T>> d() {
         return this.c.d();
      }
   }

   public interface b {
      <T> Optional<hh.c<T>> a(aeo<? extends hs<? extends T>> var1);

      default <T> hh.c<T> b(aeo<? extends hs<? extends T>> $$0) {
         return this.a($$0).orElseThrow(() -> new IllegalStateException("Registry " + $$0.a() + " not found"));
      }

      default hg.a a() {
         return new hg.a() {
            @Override
            public <T> Optional<hg<T>> a(aeo<? extends hs<? extends T>> $$0) {
               return b.this.a($$0).map($$0x -> $$0x);
            }
         };
      }

      static hh.b a(Stream<hh.c<?>> $$0) {
         final Map<aeo<? extends hs<?>>, hh.c<?>> $$1 = $$0.collect(Collectors.toUnmodifiableMap(hh.c::f, $$0x -> $$0x));
         return new hh.b() {
            @Override
            public <T> Optional<hh.c<T>> a(aeo<? extends hs<? extends T>> $$0) {
               return Optional.ofNullable((hh.c<T>)$$1.get($$0));
            }
         };
      }
   }

   public interface c<T> extends hh<T>, hi<T> {
      aeo<? extends hs<? extends T>> f();

      Lifecycle g();

      default hh<T> a(cdt $$0) {
         return (hh<T>)(cdq.bv.contains(this.f()) ? this.a($$1 -> ((cdq)$$1).a($$0)) : this);
      }

      public abstract static class a<T> implements hh.c<T> {
         protected abstract hh.c<T> a();

         @Override
         public aeo<? extends hs<? extends T>> f() {
            return this.a().f();
         }

         @Override
         public Lifecycle g() {
            return this.a().g();
         }

         @Override
         public Optional<hf.c<T>> a(aeo<T> $$0) {
            return this.a().a($$0);
         }

         @Override
         public Stream<hf.c<T>> b() {
            return this.a().b();
         }

         @Override
         public Optional<hj.c<T>> a(apy<T> $$0) {
            return this.a().a($$0);
         }

         @Override
         public Stream<hj.c<T>> d() {
            return this.a().d();
         }
      }
   }
}
