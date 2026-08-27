import java.util.Optional;

public interface hh<T> {
   Optional<hg.c<T>> a(aet<T> var1);

   default hg.c<T> b(aet<T> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing element " + $$0));
   }

   Optional<hk.c<T>> a(aqd<T> var1);

   default hk.c<T> b(aqd<T> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing tag " + $$0));
   }

   public interface a {
      <T> Optional<hh<T>> a(aet<? extends ht<? extends T>> var1);

      default <T> hh<T> b(aet<? extends ht<? extends T>> $$0) {
         return this.a($$0).orElseThrow(() -> new IllegalStateException("Registry " + $$0.a() + " not found"));
      }
   }
}
