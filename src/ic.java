import java.util.Optional;

public interface ic<T> {
   Optional<ib.c<T>> a(afv<T> var1);

   default ib.c<T> b(afv<T> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing element " + $$0));
   }

   Optional<ig.c<T>> a(arh<T> var1);

   default ig.c<T> b(arh<T> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing tag " + $$0));
   }

   public interface a {
      <T> Optional<ic<T>> a(afv<? extends io<? extends T>> var1);

      default <T> ic<T> b(afv<? extends io<? extends T>> $$0) {
         return this.a($$0).orElseThrow(() -> new IllegalStateException("Registry " + $$0.a() + " not found"));
      }
   }
}
