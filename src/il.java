import com.mojang.serialization.Lifecycle;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface il<T> extends ik<T> {
   Stream<ij.c<T>> b();

   default Stream<aix<T>> c() {
      return this.b().map(ij.c::h);
   }

   Stream<in.c<T>> d();

   default Stream<aup<T>> e() {
      return this.d().map(in.c::f);
   }

   default il<T> a(final Predicate<T> $$0) {
      return new il.a<T>(this) {
         @Override
         public Optional<ij.c<T>> a(aix<T> $$0x) {
            return this.c.a($$0).filter($$1 -> $$0.test($$1.a()));
         }

         @Override
         public Stream<ij.c<T>> b() {
            return this.c.b().filter($$1 -> $$0.test($$1.a()));
         }
      };
   }

   public static class a<T> implements il<T> {
      protected final il<T> c;

      public a(il<T> $$0) {
         this.c = $$0;
      }

      @Override
      public Optional<ij.c<T>> a(aix<T> $$0) {
         return this.c.a($$0);
      }

      @Override
      public Stream<ij.c<T>> b() {
         return this.c.b();
      }

      @Override
      public Optional<in.c<T>> a(aup<T> $$0) {
         return this.c.a($$0);
      }

      @Override
      public Stream<in.c<T>> d() {
         return this.c.d();
      }
   }

   public interface b {
      Stream<aix<? extends iv<?>>> a();

      <T> Optional<il.c<T>> a(aix<? extends iv<? extends T>> var1);

      default <T> il.c<T> b(aix<? extends iv<? extends T>> $$0) {
         return this.a($$0).orElseThrow(() -> new IllegalStateException("Registry " + $$0.a() + " not found"));
      }

      default ik.a b() {
         return new ik.a() {
            @Override
            public <T> Optional<ik<T>> a(aix<? extends iv<? extends T>> $$0) {
               return b.this.a($$0).map($$0x -> $$0x);
            }
         };
      }

      static il.b a(Stream<il.c<?>> $$0) {
         final Map<aix<? extends iv<?>>, il.c<?>> $$1 = $$0.collect(Collectors.toUnmodifiableMap(il.c::f, $$0x -> $$0x));
         return new il.b() {
            @Override
            public Stream<aix<? extends iv<?>>> a() {
               return $$1.keySet().stream();
            }

            @Override
            public <T> Optional<il.c<T>> a(aix<? extends iv<? extends T>> $$0) {
               return Optional.ofNullable((il.c<T>)$$1.get($$0));
            }
         };
      }
   }

   public interface c<T> extends il<T>, im<T> {
      aix<? extends iv<? extends T>> f();

      Lifecycle g();

      default il<T> a(cjw $$0) {
         return (il<T>)(cjt.by.contains(this.f()) ? this.a($$1 -> ((cjt)$$1).a($$0)) : this);
      }

      public abstract static class a<T> implements il.c<T> {
         protected abstract il.c<T> a();

         @Override
         public aix<? extends iv<? extends T>> f() {
            return this.a().f();
         }

         @Override
         public Lifecycle g() {
            return this.a().g();
         }

         @Override
         public Optional<ij.c<T>> a(aix<T> $$0) {
            return this.a().a($$0);
         }

         @Override
         public Stream<ij.c<T>> b() {
            return this.a().b();
         }

         @Override
         public Optional<in.c<T>> a(aup<T> $$0) {
            return this.a().a($$0);
         }

         @Override
         public Stream<in.c<T>> d() {
            return this.a().d();
         }
      }
   }
}
