import com.mojang.serialization.Lifecycle;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface ij<T> extends ii<T> {
   Stream<ih.c<T>> b();

   default Stream<ahg<T>> c() {
      return this.b().map(ih.c::h);
   }

   Stream<il.c<T>> d();

   default Stream<asx<T>> e() {
      return this.d().map(il.c::f);
   }

   default ij<T> a(final Predicate<T> $$0) {
      return new ij.a<T>(this) {
         @Override
         public Optional<ih.c<T>> a(ahg<T> $$0x) {
            return this.c.a($$0).filter($$1 -> $$0.test($$1.a()));
         }

         @Override
         public Stream<ih.c<T>> b() {
            return this.c.b().filter($$1 -> $$0.test($$1.a()));
         }
      };
   }

   public static class a<T> implements ij<T> {
      protected final ij<T> c;

      public a(ij<T> $$0) {
         this.c = $$0;
      }

      @Override
      public Optional<ih.c<T>> a(ahg<T> $$0) {
         return this.c.a($$0);
      }

      @Override
      public Stream<ih.c<T>> b() {
         return this.c.b();
      }

      @Override
      public Optional<il.c<T>> a(asx<T> $$0) {
         return this.c.a($$0);
      }

      @Override
      public Stream<il.c<T>> d() {
         return this.c.d();
      }
   }

   public interface b {
      Stream<ahg<? extends it<?>>> a();

      <T> Optional<ij.c<T>> a(ahg<? extends it<? extends T>> var1);

      default <T> ij.c<T> b(ahg<? extends it<? extends T>> $$0) {
         return this.a($$0).orElseThrow(() -> new IllegalStateException("Registry " + $$0.a() + " not found"));
      }

      default ii.a b() {
         return new ii.a() {
            @Override
            public <T> Optional<ii<T>> a(ahg<? extends it<? extends T>> $$0) {
               return b.this.a($$0).map($$0x -> $$0x);
            }
         };
      }

      static ij.b a(Stream<ij.c<?>> $$0) {
         final Map<ahg<? extends it<?>>, ij.c<?>> $$1 = $$0.collect(Collectors.toUnmodifiableMap(ij.c::f, $$0x -> $$0x));
         return new ij.b() {
            @Override
            public Stream<ahg<? extends it<?>>> a() {
               return $$1.keySet().stream();
            }

            @Override
            public <T> Optional<ij.c<T>> a(ahg<? extends it<? extends T>> $$0) {
               return Optional.ofNullable((ij.c<T>)$$1.get($$0));
            }
         };
      }
   }

   public interface c<T> extends ij<T>, ik<T> {
      ahg<? extends it<? extends T>> f();

      Lifecycle g();

      default ij<T> a(cia $$0) {
         return (ij<T>)(chx.by.contains(this.f()) ? this.a($$1 -> ((chx)$$1).a($$0)) : this);
      }

      public abstract static class a<T> implements ij.c<T> {
         protected abstract ij.c<T> a();

         @Override
         public ahg<? extends it<? extends T>> f() {
            return this.a().f();
         }

         @Override
         public Lifecycle g() {
            return this.a().g();
         }

         @Override
         public Optional<ih.c<T>> a(ahg<T> $$0) {
            return this.a().a($$0);
         }

         @Override
         public Stream<ih.c<T>> b() {
            return this.a().b();
         }

         @Override
         public Optional<il.c<T>> a(asx<T> $$0) {
            return this.a().a($$0);
         }

         @Override
         public Stream<il.c<T>> d() {
            return this.a().d();
         }
      }
   }
}
