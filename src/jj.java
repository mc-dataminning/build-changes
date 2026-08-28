import java.util.Optional;

public interface jj<T> {
   Optional<ji.c<T>> a(ale<T> var1);

   default ji.c<T> b(ale<T> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing element " + $$0));
   }

   Optional<jm.c<T>> a(axf<T> var1);

   default jm.c<T> b(axf<T> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing tag " + $$0));
   }

   public interface a {
      <T> Optional<jj<T>> a(ale<? extends jv<? extends T>> var1);

      default <T> jj<T> b(ale<? extends jv<? extends T>> $$0) {
         return this.a($$0).orElseThrow(() -> new IllegalStateException("Registry " + $$0.a() + " not found"));
      }

      default <T> Optional<ji.c<T>> a(ale<? extends jv<? extends T>> $$0, ale<T> $$1) {
         return this.a($$0).flatMap($$1x -> $$1x.a($$1));
      }
   }
}
