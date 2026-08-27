import java.util.Optional;

public interface ii<T> {
   Optional<ih.c<T>> a(ahf<T> var1);

   default ih.c<T> b(ahf<T> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing element " + $$0));
   }

   Optional<il.c<T>> a(asw<T> var1);

   default il.c<T> b(asw<T> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing tag " + $$0));
   }

   public interface a {
      <T> Optional<ii<T>> a(ahf<? extends it<? extends T>> var1);

      default <T> ii<T> b(ahf<? extends it<? extends T>> $$0) {
         return this.a($$0).orElseThrow(() -> new IllegalStateException("Registry " + $$0.a() + " not found"));
      }
   }
}
