import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface jp<T> extends jo<T> {
   Stream<jn.c<T>> b();

   default Stream<ala<T>> c() {
      return this.b().map(jn.c::h);
   }

   Stream<jr.c<T>> d();

   default Stream<axi<T>> e() {
      return this.d().map(jr.c::h);
   }

   public interface a {
      Stream<ala<? extends ka<?>>> a();

      default Stream<jp.b<?>> b() {
         return this.a().map(this::b);
      }

      <T> Optional<jp.b<T>> a(ala<? extends ka<? extends T>> var1);

      default <T> jp.b<T> b(ala<? extends ka<? extends T>> $$0) {
         return this.a($$0).orElseThrow(() -> new IllegalStateException("Registry " + $$0.a() + " not found"));
      }

      default <V> akz<V> a(DynamicOps<V> $$0) {
         return akz.a((DynamicOps<T>)$$0, this);
      }

      default jo.a c() {
         return new jo.a() {
            @Override
            public <T> Optional<jo<T>> a(ala<? extends ka<? extends T>> $$0) {
               return a.this.a($$0).map($$0x -> $$0x);
            }
         };
      }

      static jp.a a(Stream<jp.b<?>> $$0) {
         final Map<ala<? extends ka<?>>, jp.b<?>> $$1 = $$0.collect(Collectors.toUnmodifiableMap(jp.b::f, $$0x -> $$0x));
         return new jp.a() {
            @Override
            public Stream<ala<? extends ka<?>>> a() {
               return $$1.keySet().stream();
            }

            @Override
            public <T> Optional<jp.b<T>> a(ala<? extends ka<? extends T>> $$0) {
               return Optional.ofNullable((jp.b<T>)$$1.get($$0));
            }
         };
      }

      default Lifecycle d() {
         return this.b().map(jp.b::g).reduce(Lifecycle.stable(), Lifecycle::add);
      }
   }

   public interface b<T> extends jp<T>, jq<T> {
      ala<? extends ka<? extends T>> f();

      Lifecycle g();

      default jp.b<T> a(cqh $$0) {
         return cqe.bA.contains(this.f()) ? this.a($$1 -> ((cqe)$$1).a($$0)) : this;
      }

      default jp.b<T> a(final Predicate<T> $$0) {
         return new jp.b.a<T>() {
            @Override
            public jp.b<T> a() {
               return b.this;
            }

            @Override
            public Optional<jn.c<T>> a(ala<T> $$0x) {
               return this.a().a($$0).filter($$1 -> $$0.test($$1.a()));
            }

            @Override
            public Stream<jn.c<T>> b() {
               return this.a().b().filter($$1 -> $$0.test($$1.a()));
            }
         };
      }

      public interface a<T> extends jp.b<T> {
         jp.b<T> a();

         @Override
         default ala<? extends ka<? extends T>> f() {
            return this.a().f();
         }

         @Override
         default Lifecycle g() {
            return this.a().g();
         }

         @Override
         default Optional<jn.c<T>> a(ala<T> $$0) {
            return this.a().a($$0);
         }

         @Override
         default Stream<jn.c<T>> b() {
            return this.a().b();
         }

         @Override
         default Optional<jr.c<T>> a(axi<T> $$0) {
            return this.a().a($$0);
         }

         @Override
         default Stream<jr.c<T>> d() {
            return this.a().d();
         }
      }
   }
}
