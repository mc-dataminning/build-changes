import java.util.Optional;

public interface im<T> {
   Optional<il.c<T>> a(ajb<T> var1);

   default il.c<T> b(ajb<T> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing element " + $$0));
   }

   Optional<ip.c<T>> a(aut<T> var1);

   default ip.c<T> b(aut<T> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing tag " + $$0));
   }

   public interface a {
      <T> Optional<im<T>> a(ajb<? extends ix<? extends T>> var1);

      default <T> im<T> b(ajb<? extends ix<? extends T>> $$0) {
         return this.a($$0).orElseThrow(() -> new IllegalStateException("Registry " + $$0.a() + " not found"));
      }
   }
}
