import java.util.Optional;

public interface jj<T> {
   Optional<ji.c<T>> a(ala<T> var1);

   default ji.c<T> b(ala<T> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing element " + $$0));
   }

   Optional<jm.c<T>> a(axb<T> var1);

   default jm.c<T> b(axb<T> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing tag " + $$0));
   }

   public interface a {
      <T> Optional<jj<T>> a(ala<? extends jv<? extends T>> var1);

      default <T> jj<T> b(ala<? extends jv<? extends T>> $$0) {
         return this.a($$0).orElseThrow(() -> new IllegalStateException("Registry " + $$0.a() + " not found"));
      }

      default <T> Optional<ji.c<T>> a(ala<? extends jv<? extends T>> $$0, ala<T> $$1) {
         return this.a($$0).flatMap($$1x -> $$1x.a($$1));
      }
   }
}
