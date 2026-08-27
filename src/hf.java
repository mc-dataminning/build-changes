import java.util.Optional;

public interface hf<T> {
   Optional<he.c<T>> a(aeq<T> var1);

   default he.c<T> b(aeq<T> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing element " + $$0));
   }

   Optional<hi.c<T>> a(aqa<T> var1);

   default hi.c<T> b(aqa<T> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing tag " + $$0));
   }

   public interface a {
      <T> Optional<hf<T>> a(aeq<? extends hr<? extends T>> var1);

      default <T> hf<T> b(aeq<? extends hr<? extends T>> $$0) {
         return this.a($$0).orElseThrow(() -> new IllegalStateException("Registry " + $$0.a() + " not found"));
      }
   }
}
