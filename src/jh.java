import java.util.Optional;

public interface jh<T> {
   Optional<jg.c<T>> a(alq<T> var1);

   default jg.c<T> b(alq<T> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing element " + $$0));
   }

   Optional<jk.c<T>> a(ayc<T> var1);

   default jk.c<T> b(ayc<T> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing tag " + $$0));
   }

   public interface a {
      <T> Optional<? extends jh<T>> a(alq<? extends jt<? extends T>> var1);

      default <T> jh<T> b(alq<? extends jt<? extends T>> $$0) {
         return (jh<T>)this.a($$0).orElseThrow(() -> new IllegalStateException("Registry " + $$0.a() + " not found"));
      }

      default <T> Optional<jg.c<T>> c(alq<T> $$0) {
         return this.a($$0.c()).flatMap($$1 -> $$1.a($$0));
      }

      default <T> jg.c<T> d(alq<T> $$0) {
         return this.a($$0.c()).flatMap($$1 -> $$1.a($$0)).orElseThrow(() -> new IllegalStateException("Missing element " + $$0));
      }
   }
}
