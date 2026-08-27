import java.util.Optional;

public interface im<T> {
   Optional<il.c<T>> a(ajg<T> var1);

   default il.c<T> b(ajg<T> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing element " + $$0));
   }

   Optional<ip.c<T>> a(avd<T> var1);

   default ip.c<T> b(avd<T> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing tag " + $$0));
   }

   public interface a {
      <T> Optional<im<T>> a(ajg<? extends iy<? extends T>> var1);

      default <T> im<T> b(ajg<? extends iy<? extends T>> $$0) {
         return this.a($$0).orElseThrow(() -> new IllegalStateException("Registry " + $$0.a() + " not found"));
      }
   }
}
