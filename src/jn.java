import java.util.Optional;

public interface jn<T> {
   Optional<jm.c<T>> a(akp<T> var1);

   default jm.c<T> b(akp<T> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing element " + $$0));
   }

   Optional<jq.c<T>> a(awt<T> var1);

   default jq.c<T> b(awt<T> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing tag " + $$0));
   }

   public interface a {
      <T> Optional<jn<T>> a(akp<? extends jz<? extends T>> var1);

      default <T> jn<T> b(akp<? extends jz<? extends T>> $$0) {
         return this.a($$0).orElseThrow(() -> new IllegalStateException("Registry " + $$0.a() + " not found"));
      }

      default <T> Optional<jm.c<T>> a(akp<? extends jz<? extends T>> $$0, akp<T> $$1) {
         return this.a($$0).flatMap($$1x -> $$1x.a($$1));
      }
   }
}
