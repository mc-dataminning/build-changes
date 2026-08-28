import java.util.Optional;

public interface jt<T> {
   Optional<js.c<T>> a(alc<T> var1);

   default js.c<T> b(alc<T> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing element " + $$0));
   }

   Optional<jw.c<T>> a(axp<T> var1);

   default jw.c<T> b(axp<T> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing tag " + $$0));
   }

   public interface a {
      <T> Optional<? extends jt<T>> a(alc<? extends kf<? extends T>> var1);

      default <T> jt<T> b(alc<? extends kf<? extends T>> $$0) {
         return (jt<T>)this.a($$0).orElseThrow(() -> new IllegalStateException("Registry " + $$0.a() + " not found"));
      }

      default <T> Optional<js.c<T>> c(alc<T> $$0) {
         return this.a($$0.c()).flatMap($$1 -> $$1.a($$0));
      }

      default <T> js.c<T> d(alc<T> $$0) {
         return this.a($$0.c()).flatMap($$1 -> $$1.a($$0)).orElseThrow(() -> new IllegalStateException("Missing element " + $$0));
      }
   }
}
