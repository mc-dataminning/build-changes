import java.util.Optional;

public interface jk<T> {
   Optional<jj.c<T>> a(akj<T> var1);

   default jj.c<T> b(akj<T> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing element " + $$0));
   }

   Optional<jn.c<T>> a(awm<T> var1);

   default jn.c<T> b(awm<T> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing tag " + $$0));
   }

   public interface a {
      <T> Optional<jk<T>> a(akj<? extends jw<? extends T>> var1);

      default <T> jk<T> b(akj<? extends jw<? extends T>> $$0) {
         return this.a($$0).orElseThrow(() -> new IllegalStateException("Registry " + $$0.a() + " not found"));
      }

      default <T> Optional<jj.c<T>> a(akj<? extends jw<? extends T>> $$0, akj<T> $$1) {
         return this.a($$0).flatMap($$1x -> $$1x.a($$1));
      }
   }
}
