import javax.annotation.Nullable;

public final class gik implements AutoCloseable {
   private final fip a;
   private final fcj b;

   public gik(fip $$0) {
      this.a = $$0;
      this.b = new fcj(fcg::new);
   }

   public fcl a(fby $$0, @Nullable String $$1, String $$2) {
      return new fcl(this.a, this.b, $$0, $$1, $$2);
   }

   @Override
   public void close() {
      this.b.a();
   }
}
