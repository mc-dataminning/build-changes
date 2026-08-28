import javax.annotation.Nullable;

public final class gmx implements AutoCloseable {
   private final flj a;
   private final fev b;

   public gmx(flj $$0) {
      this.a = $$0;
      this.b = new fev(fes::new);
   }

   public fex a(fek $$0, @Nullable String $$1, String $$2) {
      return new fex(this.a, this.b, $$0, $$1, $$2);
   }

   @Override
   public void close() {
      this.b.a();
   }
}
