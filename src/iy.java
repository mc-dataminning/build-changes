import java.util.Optional;

public interface iy<T> {
   Optional<ix.c<T>> a(akm<T> var1);

   default ix.c<T> b(akm<T> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing element " + $$0));
   }

   Optional<jb.c<T>> a(awm<T> var1);

   default jb.c<T> b(awm<T> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing tag " + $$0));
   }

   public interface a {
      <T> Optional<iy<T>> a(akm<? extends jk<? extends T>> var1);

      default <T> iy<T> b(akm<? extends jk<? extends T>> $$0) {
         return this.a($$0).orElseThrow(() -> new IllegalStateException("Registry " + $$0.a() + " not found"));
      }

      default <T> Optional<ix.c<T>> a(akm<? extends jk<? extends T>> $$0, akm<T> $$1) {
         return this.a($$0).flatMap($$1x -> $$1x.a($$1));
      }
   }
}
