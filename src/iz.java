import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface iz<T> extends iy<T> {
   Stream<ix.c<T>> b();

   default Stream<akl<T>> c() {
      return this.b().map(ix.c::h);
   }

   Stream<jb.c<T>> d();

   default Stream<awl<T>> e() {
      return this.d().map(jb.c::g);
   }

   public interface a {
      Stream<akl<? extends jk<?>>> a();

      <T> Optional<iz.b<T>> a(akl<? extends jk<? extends T>> var1);

      default <T> iz.b<T> b(akl<? extends jk<? extends T>> $$0) {
         return this.a($$0).orElseThrow(() -> new IllegalStateException("Registry " + $$0.a() + " not found"));
      }

      default <V> akk<V> a(DynamicOps<V> $$0) {
         return akk.a((DynamicOps<T>)$$0, this);
      }

      default iy.a b() {
         return new iy.a() {
            @Override
            public <T> Optional<iy<T>> a(akl<? extends jk<? extends T>> $$0) {
               return a.this.a($$0).map($$0x -> $$0x);
            }
         };
      }

      static iz.a a(Stream<iz.b<?>> $$0) {
         final Map<akl<? extends jk<?>>, iz.b<?>> $$1 = $$0.collect(Collectors.toUnmodifiableMap(iz.b::f, $$0x -> $$0x));
         return new iz.a() {
            @Override
            public Stream<akl<? extends jk<?>>> a() {
               return $$1.keySet().stream();
            }

            @Override
            public <T> Optional<iz.b<T>> a(akl<? extends jk<? extends T>> $$0) {
               return Optional.ofNullable((iz.b<T>)$$1.get($$0));
            }
         };
      }
   }

   public interface b<T> extends iz<T>, ja<T> {
      akl<? extends jk<? extends T>> f();

      Lifecycle g();

      default iz.b<T> a(coj $$0) {
         return cog.bA.contains(this.f()) ? this.a($$1 -> ((cog)$$1).a($$0)) : this;
      }

      default iz.b<T> a(final Predicate<T> $$0) {
         return new iz.b.a<T>() {
            @Override
            public iz.b<T> a() {
               return b.this;
            }

            @Override
            public Optional<ix.c<T>> a(akl<T> $$0x) {
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
         default akl<? extends jk<? extends T>> f() {
            return this.a().f();
         }

         @Override
         default Lifecycle g() {
            return this.a().g();
         }

         @Override
         default Optional<ix.c<T>> a(akl<T> $$0) {
            return this.a().a($$0);
         }

         @Override
         default Stream<ix.c<T>> b() {
            return this.a().b();
         }

         @Override
         default Optional<jb.c<T>> a(awl<T> $$0) {
            return this.a().a($$0);
         }

         @Override
         default Stream<jb.c<T>> d() {
            return this.a().d();
         }
      }
   }
}
