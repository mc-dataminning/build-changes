import com.mojang.serialization.Lifecycle;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface ii<T> extends ih<T> {
   Stream<ig.c<T>> b();

   default Stream<agl<T>> c() {
      return this.b().map(ig.c::g);
   }

   Stream<ik.c<T>> d();

   default Stream<arz<T>> e() {
      return this.d().map(ik.c::f);
   }

   default ii<T> a(final Predicate<T> $$0) {
      return new ii.a<T>(this) {
         @Override
         public Optional<ig.c<T>> a(agl<T> $$0x) {
            return this.c.a($$0).filter($$1 -> $$0.test($$1.a()));
         }

         @Override
         public Stream<ig.c<T>> b() {
            return this.c.b().filter($$1 -> $$0.test($$1.a()));
         }
      };
   }

   public static class a<T> implements ii<T> {
      protected final ii<T> c;

      public a(ii<T> $$0) {
         this.c = $$0;
      }

      @Override
      public Optional<ig.c<T>> a(agl<T> $$0) {
         return this.c.a($$0);
      }

      @Override
      public Stream<ig.c<T>> b() {
         return this.c.b();
      }

      @Override
      public Optional<ik.c<T>> a(arz<T> $$0) {
         return this.c.a($$0);
      }

      @Override
      public Stream<ik.c<T>> d() {
         return this.c.d();
      }
   }

   public interface b {
      <T> Optional<ii.c<T>> a(agl<? extends is<? extends T>> var1);

      default <T> ii.c<T> b(agl<? extends is<? extends T>> $$0) {
         return this.a($$0).orElseThrow(() -> new IllegalStateException("Registry " + $$0.a() + " not found"));
      }

      default ih.a a() {
         return new ih.a() {
            @Override
            public <T> Optional<ih<T>> a(agl<? extends is<? extends T>> $$0) {
               return b.this.a($$0).map($$0x -> $$0x);
            }
         };
      }

      static ii.b a(Stream<ii.c<?>> $$0) {
         final Map<agl<? extends is<?>>, ii.c<?>> $$1 = $$0.collect(Collectors.toUnmodifiableMap(ii.c::f, $$0x -> $$0x));
         return new ii.b() {
            @Override
            public <T> Optional<ii.c<T>> a(agl<? extends is<? extends T>> $$0) {
               return Optional.ofNullable((ii.c<T>)$$1.get($$0));
            }
         };
      }
   }

   public interface c<T> extends ii<T>, ij<T> {
      agl<? extends is<? extends T>> f();

      Lifecycle g();

      default ii<T> a(cgi $$0) {
         return (ii<T>)(cgf.bv.contains(this.f()) ? this.a($$1 -> ((cgf)$$1).a($$0)) : this);
      }

      public abstract static class a<T> implements ii.c<T> {
         protected abstract ii.c<T> a();

         @Override
         public agl<? extends is<? extends T>> f() {
            return this.a().f();
         }

         @Override
         public Lifecycle g() {
            return this.a().g();
         }

         @Override
         public Optional<ig.c<T>> a(agl<T> $$0) {
            return this.a().a($$0);
         }

         @Override
         public Stream<ig.c<T>> b() {
            return this.a().b();
         }

         @Override
         public Optional<ik.c<T>> a(arz<T> $$0) {
            return this.a().a($$0);
         }

         @Override
         public Stream<ik.c<T>> d() {
            return this.a().d();
         }
      }
   }
}
