import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface jo<T> extends jn<T> {
   Stream<jm.c<T>> b();

   default Stream<akp<T>> c() {
      return this.b().map(jm.c::h);
   }

   Stream<jq.c<T>> d();

   default Stream<awt<T>> e() {
      return this.d().map(jq.c::g);
   }

   public interface a {
      Stream<akp<? extends jz<?>>> a();

      <T> Optional<jo.b<T>> a(akp<? extends jz<? extends T>> var1);

      default <T> jo.b<T> b(akp<? extends jz<? extends T>> $$0) {
         return this.a($$0).orElseThrow(() -> new IllegalStateException("Registry " + $$0.a() + " not found"));
      }

      default <V> ako<V> a(DynamicOps<V> $$0) {
         return ako.a((DynamicOps<T>)$$0, this);
      }

      default jn.a b() {
         return new jn.a() {
            @Override
            public <T> Optional<jn<T>> a(akp<? extends jz<? extends T>> $$0) {
               return a.this.a($$0).map($$0x -> $$0x);
            }
         };
      }

      static jo.a a(Stream<jo.b<?>> $$0) {
         final Map<akp<? extends jz<?>>, jo.b<?>> $$1 = $$0.collect(Collectors.toUnmodifiableMap(jo.b::f, $$0x -> $$0x));
         return new jo.a() {
            @Override
            public Stream<akp<? extends jz<?>>> a() {
               return $$1.keySet().stream();
            }

            @Override
            public <T> Optional<jo.b<T>> a(akp<? extends jz<? extends T>> $$0) {
               return Optional.ofNullable((jo.b<T>)$$1.get($$0));
            }
         };
      }
   }

   public interface b<T> extends jo<T>, jp<T> {
      akp<? extends jz<? extends T>> f();

      Lifecycle g();

      default jo.b<T> a(cpj $$0) {
         return cpg.bA.contains(this.f()) ? this.a($$1 -> ((cpg)$$1).a($$0)) : this;
      }

      default jo.b<T> a(final Predicate<T> $$0) {
         return new jo.b.a<T>() {
            @Override
            public jo.b<T> a() {
               return b.this;
            }

            @Override
            public Optional<jm.c<T>> a(akp<T> $$0x) {
               return this.a().a($$0).filter($$1 -> $$0.test($$1.a()));
            }

            @Override
            public Stream<jm.c<T>> b() {
               return this.a().b().filter($$1 -> $$0.test($$1.a()));
            }
         };
      }

      public interface a<T> extends jo.b<T> {
         jo.b<T> a();

         @Override
         default akp<? extends jz<? extends T>> f() {
            return this.a().f();
         }

         @Override
         default Lifecycle g() {
            return this.a().g();
         }

         @Override
         default Optional<jm.c<T>> a(akp<T> $$0) {
            return this.a().a($$0);
         }

         @Override
         default Stream<jm.c<T>> b() {
            return this.a().b();
         }

         @Override
         default Optional<jq.c<T>> a(awt<T> $$0) {
            return this.a().a($$0);
         }

         @Override
         default Stream<jq.c<T>> d() {
            return this.a().d();
         }
      }
   }
}
