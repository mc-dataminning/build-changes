import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface jq<T> extends jp<T> {
   Stream<jo.c<T>> c();

   default Stream<ald<T>> c_() {
      return this.c().map(jo.c::h);
   }

   Stream<js.c<T>> e();

   default Stream<axl<T>> f() {
      return this.e().map(js.c::h);
   }

   public interface a extends jp.a {
      Stream<ald<? extends kb<?>>> a();

      default Stream<jq.b<?>> b() {
         return this.a().map(this::d);
      }

      @Override
      <T> Optional<? extends jq.b<T>> a(ald<? extends kb<? extends T>> var1);

      default <T> jq.b<T> d(ald<? extends kb<? extends T>> $$0) {
         return this.a($$0).orElseThrow(() -> new IllegalStateException("Registry " + $$0.a() + " not found"));
      }

      default <V> alc<V> a(DynamicOps<V> $$0) {
         return alc.a((DynamicOps<T>)$$0, this);
      }

      static jq.a a(Stream<jq.b<?>> $$0) {
         final Map<ald<? extends kb<?>>, jq.b<?>> $$1 = $$0.collect(Collectors.toUnmodifiableMap(jq.b::g, $$0x -> $$0x));
         return new jq.a() {
            @Override
            public Stream<ald<? extends kb<?>>> a() {
               return $$1.keySet().stream();
            }

            @Override
            public <T> Optional<jq.b<T>> a(ald<? extends kb<? extends T>> $$0) {
               return Optional.ofNullable((jq.b<T>)$$1.get($$0));
            }
         };
      }

      default Lifecycle c() {
         return this.b().map(jq.b::h).reduce(Lifecycle.stable(), Lifecycle::add);
      }
   }

   public interface b<T> extends jq<T>, jr<T> {
      ald<? extends kb<? extends T>> g();

      Lifecycle h();

      default jq.b<T> a(cqq $$0) {
         return cqn.bA.contains(this.g()) ? this.a($$1 -> ((cqn)$$1).a($$0)) : this;
      }

      default jq.b<T> a(final Predicate<T> $$0) {
         return new jq.b.a<T>() {
            @Override
            public jq.b<T> a() {
               return b.this;
            }

            @Override
            public Optional<jo.c<T>> a(ald<T> $$0x) {
               return this.a().a($$0).filter($$1 -> $$0.test($$1.a()));
            }

            @Override
            public Stream<jo.c<T>> c() {
               return this.a().c().filter($$1 -> $$0.test($$1.a()));
            }
         };
      }

      public interface a<T> extends jq.b<T> {
         jq.b<T> a();

         @Override
         default ald<? extends kb<? extends T>> g() {
            return this.a().g();
         }

         @Override
         default Lifecycle h() {
            return this.a().h();
         }

         @Override
         default Optional<jo.c<T>> a(ald<T> $$0) {
            return this.a().a($$0);
         }

         @Override
         default Stream<jo.c<T>> c() {
            return this.a().c();
         }

         @Override
         default Optional<js.c<T>> a(axl<T> $$0) {
            return this.a().a($$0);
         }

         @Override
         default Stream<js.c<T>> e() {
            return this.a().e();
         }
      }
   }
}
