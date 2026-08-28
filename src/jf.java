import java.util.Optional;

public interface jf<T> {
   Optional<je.c<T>> a(alf<T> var1);

   default je.c<T> b(alf<T> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing element " + $$0));
   }

   Optional<ji.c<T>> a(axr<T> var1);

   default ji.c<T> b(axr<T> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing tag " + $$0));
   }

   public interface a {
      <T> Optional<? extends jf<T>> a(alf<? extends jr<? extends T>> var1);

      default <T> jf<T> b(alf<? extends jr<? extends T>> $$0) {
         return (jf<T>)this.a($$0).orElseThrow(() -> new IllegalStateException("Registry " + $$0.a() + " not found"));
      }

      default <T> Optional<je.c<T>> c(alf<T> $$0) {
         return this.a($$0.c()).flatMap($$1 -> $$1.a($$0));
      }

      default <T> je.c<T> d(alf<T> $$0) {
         return this.a($$0.c()).flatMap($$1 -> $$1.a($$0)).orElseThrow(() -> new IllegalStateException("Missing element " + $$0));
      }
   }
}
