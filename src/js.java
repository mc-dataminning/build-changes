import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface js<T> extends jr<T> {
   Stream<jq.c<T>> c();

   default Stream<alo<T>> c_() {
      return this.c().map(jq.c::h);
   }

   Stream<ju.c<T>> e();

   default Stream<aya<T>> f() {
      return this.e().map(ju.c::h);
   }

   public interface a extends jr.a {
      Stream<alo<? extends kd<?>>> b();

      default Stream<js.b<?>> c() {
         return this.b().map(this::d);
      }

      @Override
      <T> Optional<? extends js.b<T>> a(alo<? extends kd<? extends T>> var1);

      default <T> js.b<T> d(alo<? extends kd<? extends T>> $$0) {
         return this.a($$0).orElseThrow(() -> new IllegalStateException("Registry " + $$0.a() + " not found"));
      }

      default <V> aln<V> a(DynamicOps<V> $$0) {
         return aln.a((DynamicOps<T>)$$0, this);
      }

      static js.a a(Stream<js.b<?>> $$0) {
         final Map<alo<? extends kd<?>>, js.b<?>> $$1 = $$0.collect(Collectors.toUnmodifiableMap(js.b::g, $$0x -> $$0x));
         return new js.a() {
            @Override
            public Stream<alo<? extends kd<?>>> b() {
               return $$1.keySet().stream();
            }

            @Override
            public <T> Optional<js.b<T>> a(alo<? extends kd<? extends T>> $$0) {
               return Optional.ofNullable((js.b<T>)$$1.get($$0));
            }
         };
      }

      default Lifecycle d() {
         return this.c().map(js.b::h).reduce(Lifecycle.stable(), Lifecycle::add);
      }
   }

   public interface b<T> extends js<T>, jt<T> {
      alo<? extends kd<? extends T>> g();

      Lifecycle h();

      default js.b<T> a(csk $$0) {
         return csh.bU.contains(this.g()) ? this.a($$1 -> ((csh)$$1).a($$0)) : this;
      }

      default js.b<T> a(final Predicate<T> $$0) {
         return new js.b.a<T>() {
            @Override
            public js.b<T> a() {
               return b.this;
            }

            @Override
            public Optional<jq.c<T>> a(alo<T> $$0x) {
               return this.a().a($$0).filter($$1 -> $$0.test($$1.a()));
            }

            @Override
            public Stream<jq.c<T>> c() {
               return this.a().c().filter($$1 -> $$0.test($$1.a()));
            }
         };
      }

      public interface a<T> extends js.b<T> {
         js.b<T> a();

         @Override
         default alo<? extends kd<? extends T>> g() {
            return this.a().g();
         }

         @Override
         default Lifecycle h() {
            return this.a().h();
         }

         @Override
         default Optional<jq.c<T>> a(alo<T> $$0) {
            return this.a().a($$0);
         }

         @Override
         default Stream<jq.c<T>> c() {
            return this.a().c();
         }

         @Override
         default Optional<ju.c<T>> a(aya<T> $$0) {
            return this.a().a($$0);
         }

         @Override
         default Stream<ju.c<T>> e() {
            return this.a().e();
         }
      }
   }
}
