import java.util.Optional;

public interface hg<T> {
   Optional<hf.c<T>> a(aeo<T> var1);

   default hf.c<T> b(aeo<T> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing element " + $$0));
   }

   Optional<hj.c<T>> a(apy<T> var1);

   default hj.c<T> b(apy<T> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing tag " + $$0));
   }

   public interface a {
      <T> Optional<hg<T>> a(aeo<? extends hs<? extends T>> var1);

      default <T> hg<T> b(aeo<? extends hs<? extends T>> $$0) {
         return this.a($$0).orElseThrow(() -> new IllegalStateException("Registry " + $$0.a() + " not found"));
      }
   }
}
