import javax.annotation.Nullable;

public final class gtb implements AutoCloseable {
   private final frf a;
   private final fkk b;

   public gtb(frf $$0) {
      this.a = $$0;
      this.b = new fkk(fkg::new);
   }

   public fkm a(fjz $$0, @Nullable String $$1, String $$2) {
      return new fkm(this.a, this.b, $$0, $$1, $$2);
   }

   @Override
   public void close() {
      this.b.a();
   }
}
