import java.util.Optional;

public interface js<T> {
   Optional<jr.c<T>> a(aku<T> var1);

   default jr.c<T> b(aku<T> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing element " + $$0));
   }

   Optional<jv.c<T>> a(axf<T> var1);

   default jv.c<T> b(axf<T> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing tag " + $$0));
   }

   public interface a {
      <T> Optional<? extends js<T>> a(aku<? extends ke<? extends T>> var1);

      default <T> js<T> b(aku<? extends ke<? extends T>> $$0) {
         return (js<T>)this.a($$0).orElseThrow(() -> new IllegalStateException("Registry " + $$0.a() + " not found"));
      }

      default <T> Optional<jr.c<T>> c(aku<T> $$0) {
         return this.a($$0.c()).flatMap($$1 -> $$1.a($$0));
      }
   }
}
