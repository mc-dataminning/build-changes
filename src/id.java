import com.mojang.serialization.Lifecycle;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface id<T> extends ic<T> {
   Stream<ib.c<T>> b();

   default Stream<afv<T>> c() {
      return this.b().map(ib.c::g);
   }

   Stream<ig.c<T>> d();

   default Stream<arh<T>> e() {
      return this.d().map(ig.c::f);
   }

   default id<T> a(final Predicate<T> $$0) {
      return new id.a<T>(this) {
         @Override
         public Optional<ib.c<T>> a(afv<T> $$0x) {
            return this.c.a($$0).filter($$1 -> $$0.test($$1.a()));
         }

         @Override
         public Stream<ib.c<T>> b() {
            return this.c.b().filter($$1 -> $$0.test($$1.a()));
         }
      };
   }

   public static class a<T> implements id<T> {
      protected final id<T> c;

      public a(id<T> $$0) {
         this.c = $$0;
      }

      @Override
      public Optional<ib.c<T>> a(afv<T> $$0) {
         return this.c.a($$0);
      }

      @Override
      public Stream<ib.c<T>> b() {
         return this.c.b();
      }

      @Override
      public Optional<ig.c<T>> a(arh<T> $$0) {
         return this.c.a($$0);
      }

      @Override
      public Stream<ig.c<T>> d() {
         return this.c.d();
      }
   }

   public interface b {
      <T> Optional<id.c<T>> a(afv<? extends io<? extends T>> var1);

      default <T> id.c<T> b(afv<? extends io<? extends T>> $$0) {
         return this.a($$0).orElseThrow(() -> new IllegalStateException("Registry " + $$0.a() + " not found"));
      }

      default ic.a a() {
         return new ic.a() {
            @Override
            public <T> Optional<ic<T>> a(afv<? extends io<? extends T>> $$0) {
               return b.this.a($$0).map($$0x -> $$0x);
            }
         };
      }

      static id.b a(Stream<id.c<?>> $$0) {
         final Map<afv<? extends io<?>>, id.c<?>> $$1 = $$0.collect(Collectors.toUnmodifiableMap(id.c::f, $$0x -> $$0x));
         return new id.b() {
            @Override
            public <T> Optional<id.c<T>> a(afv<? extends io<? extends T>> $$0) {
               return Optional.ofNullable((id.c<T>)$$1.get($$0));
            }
         };
      }
   }

   public interface c<T> extends id<T>, ie<T> {
      afv<? extends io<? extends T>> f();

      Lifecycle g();

      default id<T> a(cfg $$0) {
         return (id<T>)(cfd.bv.contains(this.f()) ? this.a($$1 -> ((cfd)$$1).a($$0)) : this);
      }

      public abstract static class a<T> implements id.c<T> {
         protected abstract id.c<T> a();

         @Override
         public afv<? extends io<? extends T>> f() {
            return this.a().f();
         }

         @Override
         public Lifecycle g() {
            return this.a().g();
         }

         @Override
         public Optional<ib.c<T>> a(afv<T> $$0) {
            return this.a().a($$0);
         }

         @Override
         public Stream<ib.c<T>> b() {
            return this.a().b();
         }

         @Override
         public Optional<ig.c<T>> a(arh<T> $$0) {
            return this.a().a($$0);
         }

         @Override
         public Stream<ig.c<T>> d() {
            return this.a().d();
         }
      }
   }
}
