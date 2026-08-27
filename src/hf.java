import java.util.Optional;

public interface hf<T> {
   Optional<he.c<T>> a(aev<T> var1);

   default he.c<T> b(aev<T> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing element " + $$0));
   }

   Optional<hi.c<T>> a(aqh<T> var1);

   default hi.c<T> b(aqh<T> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing tag " + $$0));
   }

   public interface a {
      <T> Optional<hf<T>> a(aev<? extends hq<? extends T>> var1);

      default <T> hf<T> b(aev<? extends hq<? extends T>> $$0) {
         return this.a($$0).orElseThrow(() -> new IllegalStateException("Registry " + $$0.a() + " not found"));
      }
   }
}
