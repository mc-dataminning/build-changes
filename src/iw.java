import java.util.Optional;

public interface iw<T> {
   Optional<iv.c<T>> a(ake<T> var1);

   default iv.c<T> b(ake<T> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing element " + $$0));
   }

   Optional<iz.c<T>> a(awd<T> var1);

   default iz.c<T> b(awd<T> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing tag " + $$0));
   }

   public interface a {
      <T> Optional<iw<T>> a(ake<? extends ji<? extends T>> var1);

      default <T> iw<T> b(ake<? extends ji<? extends T>> $$0) {
         return this.a($$0).orElseThrow(() -> new IllegalStateException("Registry " + $$0.a() + " not found"));
      }
   }
}
