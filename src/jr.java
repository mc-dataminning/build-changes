import java.util.Optional;

public interface jr<T> {
   Optional<jq.c<T>> a(alh<T> var1);

   default jq.c<T> b(alh<T> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing element " + $$0));
   }

   Optional<ju.c<T>> a(axq<T> var1);

   default ju.c<T> b(axq<T> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing tag " + $$0));
   }

   public interface a {
      <T> Optional<? extends jr<T>> a(alh<? extends kd<? extends T>> var1);

      default <T> jr<T> b(alh<? extends kd<? extends T>> $$0) {
         return (jr<T>)this.a($$0).orElseThrow(() -> new IllegalStateException("Registry " + $$0.a() + " not found"));
      }

      default <T> Optional<jq.c<T>> c(alh<T> $$0) {
         return this.a($$0.c()).flatMap($$1 -> $$1.a($$0));
      }
   }
}
