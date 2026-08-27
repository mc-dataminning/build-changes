import java.util.Optional;

public interface hf<T> {
   Optional<he.c<T>> a(aey<T> var1);

   default he.c<T> b(aey<T> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing element " + $$0));
   }

   Optional<hi.c<T>> a(aqk<T> var1);

   default hi.c<T> b(aqk<T> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing tag " + $$0));
   }

   public interface a {
      <T> Optional<hf<T>> a(aey<? extends hq<? extends T>> var1);

      default <T> hf<T> b(aey<? extends hq<? extends T>> $$0) {
         return this.a($$0).orElseThrow(() -> new IllegalStateException("Registry " + $$0.a() + " not found"));
      }
   }
}
