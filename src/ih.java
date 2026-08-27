import java.util.Optional;

public interface ih<T> {
   Optional<ig.c<T>> a(agl<T> var1);

   default ig.c<T> b(agl<T> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing element " + $$0));
   }

   Optional<ik.c<T>> a(arz<T> var1);

   default ik.c<T> b(arz<T> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing tag " + $$0));
   }

   public interface a {
      <T> Optional<ih<T>> a(agl<? extends is<? extends T>> var1);

      default <T> ih<T> b(agl<? extends is<? extends T>> $$0) {
         return this.a($$0).orElseThrow(() -> new IllegalStateException("Registry " + $$0.a() + " not found"));
      }
   }
}
