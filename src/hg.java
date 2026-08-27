import com.mojang.serialization.Lifecycle;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface hg<T> extends hf<T> {
   Stream<he.c<T>> b();

   default Stream<aey<T>> c() {
      return this.b().map(he.c::g);
   }

   Stream<hi.c<T>> d();

   default Stream<aqk<T>> e() {
      return this.d().map(hi.c::f);
   }

   default hg<T> a(final Predicate<T> $$0) {
      return new hg.a<T>(this) {
         @Override
         public Optional<he.c<T>> a(aey<T> $$0x) {
            return this.c.a($$0).filter($$1 -> $$0.test($$1.a()));
         }

         @Override
         public Stream<he.c<T>> b() {
            return this.c.b().filter($$1 -> $$0.test($$1.a()));
         }
      };
   }

   public static class a<T> implements hg<T> {
      protected final hg<T> c;

      public a(hg<T> $$0) {
         this.c = $$0;
      }

      @Override
      public Optional<he.c<T>> a(aey<T> $$0) {
         return this.c.a($$0);
      }

      @Override
      public Stream<he.c<T>> b() {
         return this.c.b();
      }

      @Override
      public Optional<hi.c<T>> a(aqk<T> $$0) {
         return this.c.a($$0);
      }

      @Override
      public Stream<hi.c<T>> d() {
         return this.c.d();
      }
   }

   public interface b {
      <T> Optional<hg.c<T>> a(aey<? extends hq<? extends T>> var1);

      default <T> hg.c<T> b(aey<? extends hq<? extends T>> $$0) {
         return this.a($$0).orElseThrow(() -> new IllegalStateException("Registry " + $$0.a() + " not found"));
      }

      default hf.a a() {
         return new hf.a() {
            @Override
            public <T> Optional<hf<T>> a(aey<? extends hq<? extends T>> $$0) {
               return b.this.a($$0).map($$0x -> $$0x);
            }
         };
      }

      static hg.b a(Stream<hg.c<?>> $$0) {
         final Map<aey<? extends hq<?>>, hg.c<?>> $$1 = $$0.collect(Collectors.toUnmodifiableMap(hg.c::f, $$0x -> $$0x));
         return new hg.b() {
            @Override
            public <T> Optional<hg.c<T>> a(aey<? extends hq<? extends T>> $$0) {
               return Optional.ofNullable((hg.c<T>)$$1.get($$0));
            }
         };
      }
   }

   public interface c<T> extends hg<T>, hh<T> {
      aey<? extends hq<? extends T>> f();

      Lifecycle g();

      default hg<T> a(cei $$0) {
         return (hg<T>)(cef.bv.contains(this.f()) ? this.a($$1 -> ((cef)$$1).a($$0)) : this);
      }

      public abstract static class a<T> implements hg.c<T> {
         protected abstract hg.c<T> a();

         @Override
         public aey<? extends hq<? extends T>> f() {
            return this.a().f();
         }

         @Override
         public Lifecycle g() {
            return this.a().g();
         }

         @Override
         public Optional<he.c<T>> a(aey<T> $$0) {
            return this.a().a($$0);
         }

         @Override
         public Stream<he.c<T>> b() {
            return this.a().b();
         }

         @Override
         public Optional<hi.c<T>> a(aqk<T> $$0) {
            return this.a().a($$0);
         }

         @Override
         public Stream<hi.c<T>> d() {
            return this.a().d();
         }
      }
   }
}
