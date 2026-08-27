import java.util.Optional;

public interface ix<T> {
   Optional<iw.c<T>> a(akg<T> var1);

   default iw.c<T> b(akg<T> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing element " + $$0));
   }

   Optional<ja.c<T>> a(awg<T> var1);

   default ja.c<T> b(awg<T> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing tag " + $$0));
   }

   public interface a {
      <T> Optional<ix<T>> a(akg<? extends jj<? extends T>> var1);

      default <T> ix<T> b(akg<? extends jj<? extends T>> $$0) {
         return this.a($$0).orElseThrow(() -> new IllegalStateException("Registry " + $$0.a() + " not found"));
      }

      default <T> Optional<iw.c<T>> a(akg<? extends jj<? extends T>> $$0, akg<T> $$1) {
         return this.a($$0).flatMap($$1x -> $$1x.a($$1));
      }
   }
}
