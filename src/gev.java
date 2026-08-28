import javax.annotation.Nullable;

public final class gev implements AutoCloseable {
   private final fft a;
   private final ezo b;

   public gev(fft $$0) {
      this.a = $$0;
      this.b = new ezo(ezl::new);
   }

   public ezq a(ezd $$0, @Nullable String $$1, String $$2) {
      return new ezq(this.a, this.b, $$0, $$1, $$2);
   }

   @Override
   public void close() {
      this.b.a();
   }
}
