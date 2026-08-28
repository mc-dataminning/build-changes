import java.util.Optional;

public interface jr<T> {
   Optional<jq.c<T>> a(aly<T> var1);

   default jq.c<T> b(aly<T> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing element " + $$0));
   }

   Optional<ju.c<T>> a(ayk<T> var1);

   default ju.c<T> b(ayk<T> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing tag " + $$0));
   }

   public interface a {
      <T> Optional<? extends jr<T>> a(aly<? extends kd<? extends T>> var1);

      default <T> jr<T> b(aly<? extends kd<? extends T>> $$0) {
         return (jr<T>)this.a($$0).orElseThrow(() -> new IllegalStateException("Registry " + $$0.a() + " not found"));
      }

      default <T> Optional<jq.c<T>> c(aly<T> $$0) {
         return this.a($$0.c()).flatMap($$1 -> $$1.a($$0));
      }
   }
}
