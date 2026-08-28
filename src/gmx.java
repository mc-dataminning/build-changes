import javax.annotation.Nullable;

public final class gmx implements AutoCloseable {
   private final fli a;
   private final feu b;

   public gmx(fli $$0) {
      this.a = $$0;
      this.b = new feu(fer::new);
   }

   public few a(fej $$0, @Nullable String $$1, String $$2) {
      return new few(this.a, this.b, $$0, $$1, $$2);
   }

   @Override
   public void close() {
      this.b.a();
   }
}
