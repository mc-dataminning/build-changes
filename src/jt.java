import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface jt<T> extends js<T> {
   Stream<jr.c<T>> c();

   default Stream<aku<T>> c_() {
      return this.c().map(jr.c::h);
   }

   Stream<jv.c<T>> e();

   default Stream<axf<T>> f() {
      return this.e().map(jv.c::h);
   }

   public interface a extends js.a {
      Stream<aku<? extends ke<?>>> b();

      default Stream<jt.b<?>> c() {
         return this.b().map(this::d);
      }

      @Override
      <T> Optional<? extends jt.b<T>> a(aku<? extends ke<? extends T>> var1);

      default <T> jt.b<T> d(aku<? extends ke<? extends T>> $$0) {
         return this.a($$0).orElseThrow(() -> new IllegalStateException("Registry " + $$0.a() + " not found"));
      }

      default <V> akt<V> a(DynamicOps<V> $$0) {
         return akt.a((DynamicOps<T>)$$0, this);
      }

      static jt.a a(Stream<jt.b<?>> $$0) {
         final Map<aku<? extends ke<?>>, jt.b<?>> $$1 = $$0.collect(Collectors.toUnmodifiableMap(jt.b::g, $$0x -> $$0x));
         return new jt.a() {
            @Override
            public Stream<aku<? extends ke<?>>> b() {
               return $$1.keySet().stream();
            }

            @Override
            public <T> Optional<jt.b<T>> a(aku<? extends ke<? extends T>> $$0) {
               return Optional.ofNullable((jt.b<T>)$$1.get($$0));
            }
         };
      }

      default Lifecycle d() {
         return this.c().map(jt.b::h).reduce(Lifecycle.stable(), Lifecycle::add);
      }
   }

   public interface b<T> extends jt<T>, ju<T> {
      aku<? extends ke<? extends T>> g();

      Lifecycle h();

      default jt.b<T> a(cru $$0) {
         return crr.bT.contains(this.g()) ? this.a($$1 -> ((crr)$$1).a($$0)) : this;
      }

      default jt.b<T> a(final Predicate<T> $$0) {
         return new jt.b.a<T>() {
            @Override
            public jt.b<T> a() {
               return b.this;
            }

            @Override
            public Optional<jr.c<T>> a(aku<T> $$0x) {
               return this.a().a($$0).filter($$1 -> $$0.test($$1.a()));
            }

            @Override
            public Stream<jr.c<T>> c() {
               return this.a().c().filter($$1 -> $$0.test($$1.a()));
            }
         };
      }

      public interface a<T> extends jt.b<T> {
         jt.b<T> a();

         @Override
         default aku<? extends ke<? extends T>> g() {
            return this.a().g();
         }

         @Override
         default Lifecycle h() {
            return this.a().h();
         }

         @Override
         default Optional<jr.c<T>> a(aku<T> $$0) {
            return this.a().a($$0);
         }

         @Override
         default Stream<jr.c<T>> c() {
            return this.a().c();
         }

         @Override
         default Optional<jv.c<T>> a(axf<T> $$0) {
            return this.a().a($$0);
         }

         @Override
         default Stream<jv.c<T>> e() {
            return this.a().e();
         }
      }
   }
}
