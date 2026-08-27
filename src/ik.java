import java.util.Optional;

public interface ik<T> {
   Optional<ij.c<T>> a(aix<T> var1);

   default ij.c<T> b(aix<T> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing element " + $$0));
   }

   Optional<in.c<T>> a(auo<T> var1);

   default in.c<T> b(auo<T> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing tag " + $$0));
   }

   public interface a {
      <T> Optional<ik<T>> a(aix<? extends iv<? extends T>> var1);

      default <T> ik<T> b(aix<? extends iv<? extends T>> $$0) {
         return this.a($$0).orElseThrow(() -> new IllegalStateException("Registry " + $$0.a() + " not found"));
      }
   }
}
