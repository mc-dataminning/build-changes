import java.util.Optional;

public interface ii<T> {
   Optional<ih.c<T>> a(ahc<T> var1);

   default ih.c<T> b(ahc<T> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing element " + $$0));
   }

   Optional<il.c<T>> a(asq<T> var1);

   default il.c<T> b(asq<T> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing tag " + $$0));
   }

   public interface a {
      <T> Optional<ii<T>> a(ahc<? extends it<? extends T>> var1);

      default <T> ii<T> b(ahc<? extends it<? extends T>> $$0) {
         return this.a($$0).orElseThrow(() -> new IllegalStateException("Registry " + $$0.a() + " not found"));
      }
   }
}
