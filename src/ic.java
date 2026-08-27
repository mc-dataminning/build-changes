import java.util.Optional;

public interface ic<T> {
   Optional<ib.c<T>> a(agh<T> var1);

   default ib.c<T> b(agh<T> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing element " + $$0));
   }

   Optional<ig.c<T>> a(arv<T> var1);

   default ig.c<T> b(arv<T> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing tag " + $$0));
   }

   public interface a {
      <T> Optional<ic<T>> a(agh<? extends io<? extends T>> var1);

      default <T> ic<T> b(agh<? extends io<? extends T>> $$0) {
         return this.a($$0).orElseThrow(() -> new IllegalStateException("Registry " + $$0.a() + " not found"));
      }
   }
}
