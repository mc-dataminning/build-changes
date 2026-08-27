import java.util.Optional;

public interface io<T> {
   Optional<in.c<T>> a(aju<T> var1);

   default in.c<T> b(aju<T> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing element " + $$0));
   }

   Optional<ir.c<T>> a(avt<T> var1);

   default ir.c<T> b(avt<T> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing tag " + $$0));
   }

   public interface a {
      <T> Optional<io<T>> a(aju<? extends ja<? extends T>> var1);

      default <T> io<T> b(aju<? extends ja<? extends T>> $$0) {
         return this.a($$0).orElseThrow(() -> new IllegalStateException("Registry " + $$0.a() + " not found"));
      }
   }
}
