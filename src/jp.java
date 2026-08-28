import java.util.Optional;

public interface jp<T> {
   Optional<jo.c<T>> a(ald<T> var1);

   default jo.c<T> b(ald<T> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing element " + $$0));
   }

   Optional<js.c<T>> a(axl<T> var1);

   default js.c<T> b(axl<T> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing tag " + $$0));
   }

   public interface a {
      <T> Optional<? extends jp<T>> a(ald<? extends kb<? extends T>> var1);

      default <T> jp<T> b(ald<? extends kb<? extends T>> $$0) {
         return (jp<T>)this.a($$0).orElseThrow(() -> new IllegalStateException("Registry " + $$0.a() + " not found"));
      }

      default <T> Optional<jo.c<T>> c(ald<T> $$0) {
         return this.a($$0.c()).flatMap($$1 -> $$1.a($$0));
      }
   }
}
