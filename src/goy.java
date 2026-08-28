import javax.annotation.Nullable;

public final class goy implements AutoCloseable {
   private final fnd a;
   private final fgp b;

   public goy(fnd $$0) {
      this.a = $$0;
      this.b = new fgp(fgm::new);
   }

   public fgr a(fge $$0, @Nullable String $$1, String $$2) {
      return new fgr(this.a, this.b, $$0, $$1, $$2);
   }

   @Override
   public void close() {
      this.b.a();
   }
}
