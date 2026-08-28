import javax.annotation.Nullable;

public final class gfr implements AutoCloseable {
   private final fgo a;
   private final fak b;

   public gfr(fgo $$0) {
      this.a = $$0;
      this.b = new fak(fah::new);
   }

   public fam a(faa $$0, @Nullable String $$1, String $$2) {
      return new fam(this.a, this.b, $$0, $$1, $$2);
   }

   @Override
   public void close() {
      this.b.a();
   }
}
