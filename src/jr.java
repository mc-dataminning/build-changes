import java.util.Optional;

public interface jr<T> {
   Optional<jq.c<T>> a(alo<T> var1);

   default jq.c<T> b(alo<T> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing element " + $$0));
   }

   Optional<ju.c<T>> a(aya<T> var1);

   default ju.c<T> b(aya<T> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing tag " + $$0));
   }

   public interface a {
      <T> Optional<? extends jr<T>> a(alo<? extends kd<? extends T>> var1);

      default <T> jr<T> b(alo<? extends kd<? extends T>> $$0) {
         return (jr<T>)this.a($$0).orElseThrow(() -> new IllegalStateException("Registry " + $$0.a() + " not found"));
      }

      default <T> Optional<jq.c<T>> c(alo<T> $$0) {
         return this.a($$0.c()).flatMap($$1 -> $$1.a($$0));
      }
   }
}
