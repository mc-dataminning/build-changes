import java.util.Optional;

public interface jo<T> {
   Optional<jn.c<T>> a(ala<T> var1);

   default jn.c<T> b(ala<T> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing element " + $$0));
   }

   Optional<jr.c<T>> a(axi<T> var1);

   default jr.c<T> b(axi<T> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing tag " + $$0));
   }

   public interface a {
      <T> Optional<jo<T>> a(ala<? extends ka<? extends T>> var1);

      default <T> jo<T> b(ala<? extends ka<? extends T>> $$0) {
         return this.a($$0).orElseThrow(() -> new IllegalStateException("Registry " + $$0.a() + " not found"));
      }

      default <T> Optional<jn.c<T>> a(ala<? extends ka<? extends T>> $$0, ala<T> $$1) {
         return this.a($$0).flatMap($$1x -> $$1x.a($$1));
      }
   }
}
