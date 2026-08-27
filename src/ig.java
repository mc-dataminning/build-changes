import java.util.Optional;

public interface ig<T> {
   Optional<ie.c<T>> a(ags<T> var1);

   default ie.c<T> b(ags<T> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing element " + $$0));
   }

   Optional<ij.c<T>> a(asg<T> var1);

   default ij.c<T> b(asg<T> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing tag " + $$0));
   }

   public interface a {
      <T> Optional<ig<T>> a(ags<? extends ir<? extends T>> var1);

      default <T> ig<T> b(ags<? extends ir<? extends T>> $$0) {
         return this.a($$0).orElseThrow(() -> new IllegalStateException("Registry " + $$0.a() + " not found"));
      }
   }
}
