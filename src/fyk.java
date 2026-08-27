import javax.annotation.Nullable;

public final class fyk implements AutoCloseable {
   private final ezi a;
   private final etd b;

   public fyk(ezi $$0) {
      this.a = $$0;
      this.b = new etd(eta::new);
   }

   public etf a(ess $$0, @Nullable String $$1, String $$2) {
      return new etf(this.a, this.b, $$0, $$1, $$2);
   }

   @Override
   public void close() {
      this.b.a();
   }
}
