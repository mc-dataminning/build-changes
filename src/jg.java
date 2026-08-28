import java.util.Optional;

public interface jg<T> {
   Optional<jf.c<T>> a(alf<T> var1);

   default jf.c<T> b(alf<T> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing element " + $$0));
   }

   Optional<jj.c<T>> a(axr<T> var1);

   default jj.c<T> b(axr<T> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing tag " + $$0));
   }

   public interface a {
      <T> Optional<? extends jg<T>> a(alf<? extends js<? extends T>> var1);

      default <T> jg<T> b(alf<? extends js<? extends T>> $$0) {
         return (jg<T>)this.a($$0).orElseThrow(() -> new IllegalStateException("Registry " + $$0.a() + " not found"));
      }

      default <T> Optional<jf.c<T>> c(alf<T> $$0) {
         return this.a($$0.c()).flatMap($$1 -> $$1.a($$0));
      }

      default <T> jf.c<T> d(alf<T> $$0) {
         return this.a($$0.c()).flatMap($$1 -> $$1.a($$0)).orElseThrow(() -> new IllegalStateException("Missing element " + $$0));
      }
   }
}
