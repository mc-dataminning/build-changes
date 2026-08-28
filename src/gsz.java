import javax.annotation.Nullable;

public final class gsz implements AutoCloseable {
   private final frd a;
   private final fki b;

   public gsz(frd $$0) {
      this.a = $$0;
      this.b = new fki(fke::new);
   }

   public fkk a(fjx $$0, @Nullable String $$1, String $$2) {
      return new fkk(this.a, this.b, $$0, $$1, $$2);
   }

   @Override
   public void close() {
      this.b.a();
   }
}
