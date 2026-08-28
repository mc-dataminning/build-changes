import java.util.Optional;

public interface jf<T> {
   Optional<je.c<T>> a(ald<T> var1);

   default je.c<T> b(ald<T> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing element " + $$0));
   }

   Optional<ji.c<T>> a(axp<T> var1);

   default ji.c<T> b(axp<T> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing tag " + $$0));
   }

   public interface a {
      <T> Optional<? extends jf<T>> a(ald<? extends jr<? extends T>> var1);

      default <T> jf<T> b(ald<? extends jr<? extends T>> $$0) {
         return (jf<T>)this.a($$0).orElseThrow(() -> new IllegalStateException("Registry " + $$0.a() + " not found"));
      }

      default <T> Optional<je.c<T>> c(ald<T> $$0) {
         return this.a($$0.c()).flatMap($$1 -> $$1.a($$0));
      }

      default <T> je.c<T> d(ald<T> $$0) {
         return this.a($$0.c()).flatMap($$1 -> $$1.a($$0)).orElseThrow(() -> new IllegalStateException("Missing element " + $$0));
      }
   }
}
