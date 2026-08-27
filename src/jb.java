import java.util.Optional;

public interface jb<T> {
   Optional<ja.c<T>> a(aks<T> var1);

   default ja.c<T> b(aks<T> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing element " + $$0));
   }

   Optional<je.c<T>> a(awt<T> var1);

   default je.c<T> b(awt<T> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing tag " + $$0));
   }

   public interface a {
      <T> Optional<jb<T>> a(aks<? extends jn<? extends T>> var1);

      default <T> jb<T> b(aks<? extends jn<? extends T>> $$0) {
         return this.a($$0).orElseThrow(() -> new IllegalStateException("Registry " + $$0.a() + " not found"));
      }

      default <T> Optional<ja.c<T>> a(aks<? extends jn<? extends T>> $$0, aks<T> $$1) {
         return this.a($$0).flatMap($$1x -> $$1x.a($$1));
      }
   }
}
