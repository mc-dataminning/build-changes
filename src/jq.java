import java.util.Optional;

public interface jq<T> {
   Optional<jp.c<T>> a(alg<T> var1);

   default jp.c<T> b(alg<T> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing element " + $$0));
   }

   Optional<jt.c<T>> a(axp<T> var1);

   default jt.c<T> b(axp<T> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing tag " + $$0));
   }

   public interface a {
      <T> Optional<? extends jq<T>> a(alg<? extends kc<? extends T>> var1);

      default <T> jq<T> b(alg<? extends kc<? extends T>> $$0) {
         return (jq<T>)this.a($$0).orElseThrow(() -> new IllegalStateException("Registry " + $$0.a() + " not found"));
      }

      default <T> Optional<jp.c<T>> c(alg<T> $$0) {
         return this.a($$0.c()).flatMap($$1 -> $$1.a($$0));
      }
   }
}
