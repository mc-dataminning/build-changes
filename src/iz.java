import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface iz<T> extends iy<T> {
   Stream<ix.c<T>> b();

   default Stream<akm<T>> c() {
      return this.b().map(ix.c::h);
   }

   Stream<jb.c<T>> d();

   default Stream<awm<T>> e() {
      return this.d().map(jb.c::g);
   }

   public interface a {
      Stream<akm<? extends jk<?>>> a();

      <T> Optional<iz.b<T>> a(akm<? extends jk<? extends T>> var1);

      default <T> iz.b<T> b(akm<? extends jk<? extends T>> $$0) {
         return this.a($$0).orElseThrow(() -> new IllegalStateException("Registry " + $$0.a() + " not found"));
      }

      default <V> akl<V> a(DynamicOps<V> $$0) {
         return akl.a((DynamicOps<T>)$$0, this);
      }

      default iy.a b() {
         return new iy.a() {
            @Override
            public <T> Optional<iy<T>> a(akm<? extends jk<? extends T>> $$0) {
               return a.this.a($$0).map($$0x -> $$0x);
            }
         };
      }

      static iz.a a(Stream<iz.b<?>> $$0) {
         final Map<akm<? extends jk<?>>, iz.b<?>> $$1 = $$0.collect(Collectors.toUnmodifiableMap(iz.b::f, $$0x -> $$0x));
         return new iz.a() {
            @Override
            public Stream<akm<? extends jk<?>>> a() {
               return $$1.keySet().stream();
            }

            @Override
            public <T> Optional<iz.b<T>> a(akm<? extends jk<? extends T>> $$0) {
               return Optional.ofNullable((iz.b<T>)$$1.get($$0));
            }
         };
      }
   }

   public interface b<T> extends iz<T>, ja<T> {
      akm<? extends jk<? extends T>> f();

      Lifecycle g();

      default iz.b<T> a(col $$0) {
         return coi.bA.contains(this.f()) ? this.a($$1 -> ((coi)$$1).a($$0)) : this;
      }

      default iz.b<T> a(final Predicate<T> $$0) {
         return new iz.b.a<T>() {
            @Override
            public iz.b<T> a() {
               return b.this;
            }

            @Override
            public Optional<ix.c<T>> a(akm<T> $$0x) {
               return this.a().a($$0).filter($$1 -> $$0.test($$1.a()));
            }

            @Override
            public Stream<ix.c<T>> b() {
               return this.a().b().filter($$1 -> $$0.test($$1.a()));
            }
         };
      }

      public interface a<T> extends iz.b<T> {
         iz.b<T> a();

         @Override
         default akm<? extends jk<? extends T>> f() {
            return this.a().f();
         }

         @Override
         default Lifecycle g() {
            return this.a().g();
         }

         @Override
         default Optional<ix.c<T>> a(akm<T> $$0) {
            return this.a().a($$0);
         }

         @Override
         default Stream<ix.c<T>> b() {
            return this.a().b();
         }

         @Override
         default Optional<jb.c<T>> a(awm<T> $$0) {
            return this.a().a($$0);
         }

         @Override
         default Stream<jb.c<T>> d() {
            return this.a().d();
         }
      }
   }
}
