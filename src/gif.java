import javax.annotation.Nullable;

public final class gif implements AutoCloseable {
   private final fil a;
   private final fcf b;

   public gif(fil $$0) {
      this.a = $$0;
      this.b = new fcf(fcc::new);
   }

   public fch a(fbu $$0, @Nullable String $$1, String $$2) {
      return new fch(this.a, this.b, $$0, $$1, $$2);
   }

   @Override
   public void close() {
      this.b.a();
   }
}
