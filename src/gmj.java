import javax.annotation.Nullable;

public final class gmj implements AutoCloseable {
   private final fmf a;
   private final ffs b;

   public gmj(fmf $$0) {
      this.a = $$0;
      this.b = new ffs(ffp::new);
   }

   public ffu a(ffh $$0, @Nullable String $$1, String $$2) {
      return new ffu(this.a, this.b, $$0, $$1, $$2);
   }

   @Override
   public void close() {
      this.b.a();
   }
}
