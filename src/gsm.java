import javax.annotation.Nullable;

public final class gsm implements AutoCloseable {
   private final fqq a;
   private final fkg b;

   public gsm(fqq $$0) {
      this.a = $$0;
      this.b = new fkg(fkd::new);
   }

   public fki a(fjx $$0, @Nullable String $$1, String $$2) {
      return new fki(this.a, this.b, $$0, $$1, $$2);
   }

   @Override
   public void close() {
      this.b.a();
   }
}
