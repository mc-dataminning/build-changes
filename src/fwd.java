import javax.annotation.Nullable;

public final class fwd implements AutoCloseable {
   private final exh a;
   private final erc b;

   public fwd(exh $$0) {
      this.a = $$0;
      this.b = new erc(eqz::new);
   }

   public ere a(eqr $$0, @Nullable String $$1, String $$2) {
      return new ere(this.a, this.b, $$0, $$1, $$2);
   }

   @Override
   public void close() {
      this.b.a();
   }
}
