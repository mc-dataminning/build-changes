import com.mojang.serialization.Lifecycle;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface ih<T> extends ig<T> {
   Stream<ie.c<T>> b();

   default Stream<ags<T>> c() {
      return this.b().map(ie.c::g);
   }

   Stream<ij.c<T>> d();

   default Stream<asg<T>> e() {
      return this.d().map(ij.c::f);
   }

   default ih<T> a(final Predicate<T> $$0) {
      return new ih.a<T>(this) {
         @Override
         public Optional<ie.c<T>> a(ags<T> $$0x) {
            return this.c.a($$0).filter($$1 -> $$0.test($$1.a()));
         }

         @Override
         public Stream<ie.c<T>> b() {
            return this.c.b().filter($$1 -> $$0.test($$1.a()));
         }
      };
   }

   public static class a<T> implements ih<T> {
      protected final ih<T> c;

      public a(ih<T> $$0) {
         this.c = $$0;
      }

      @Override
      public Optional<ie.c<T>> a(ags<T> $$0) {
         return this.c.a($$0);
      }

      @Override
      public Stream<ie.c<T>> b() {
         return this.c.b();
      }

      @Override
      public Optional<ij.c<T>> a(asg<T> $$0) {
         return this.c.a($$0);
      }

      @Override
      public Stream<ij.c<T>> d() {
         return this.c.d();
      }
   }

   public interface b {
      Stream<ags<? extends ir<?>>> a();

      <T> Optional<ih.c<T>> a(ags<? extends ir<? extends T>> var1);

      default <T> ih.c<T> b(ags<? extends ir<? extends T>> $$0) {
         return this.a($$0).orElseThrow(() -> new IllegalStateException("Registry " + $$0.a() + " not found"));
      }

      default ig.a b() {
         return new ig.a() {
            @Override
            public <T> Optional<ig<T>> a(ags<? extends ir<? extends T>> $$0) {
               return b.this.a($$0).map($$0x -> $$0x);
            }
         };
      }

      static ih.b a(Stream<ih.c<?>> $$0) {
         final Map<ags<? extends ir<?>>, ih.c<?>> $$1 = $$0.collect(Collectors.toUnmodifiableMap(ih.c::f, $$0x -> $$0x));
         return new ih.b() {
            @Override
            public Stream<ags<? extends ir<?>>> a() {
               return $$1.keySet().stream();
            }

            @Override
            public <T> Optional<ih.c<T>> a(ags<? extends ir<? extends T>> $$0) {
               return Optional.ofNullable((ih.c<T>)$$1.get($$0));
            }
         };
      }
   }

   public interface c<T> extends ih<T>, ii<T> {
      ags<? extends ir<? extends T>> f();

      Lifecycle g();

      default ih<T> a(chb $$0) {
         return (ih<T>)(cgy.bx.contains(this.f()) ? this.a($$1 -> ((cgy)$$1).a($$0)) : this);
      }

      public abstract static class a<T> implements ih.c<T> {
         protected abstract ih.c<T> a();

         @Override
         public ags<? extends ir<? extends T>> f() {
            return this.a().f();
         }

         @Override
         public Lifecycle g() {
            return this.a().g();
         }

         @Override
         public Optional<ie.c<T>> a(ags<T> $$0) {
            return this.a().a($$0);
         }

         @Override
         public Stream<ie.c<T>> b() {
            return this.a().b();
         }

         @Override
         public Optional<ij.c<T>> a(asg<T> $$0) {
            return this.a().a($$0);
         }

         @Override
         public Stream<ij.c<T>> d() {
            return this.a().d();
         }
      }
   }
}
