import javax.annotation.Nullable;

public final class gfl implements AutoCloseable {
   private final fgi a;
   private final fae b;

   public gfl(fgi $$0) {
      this.a = $$0;
      this.b = new fae(fab::new);
   }

   public fag a(ezu $$0, @Nullable String $$1, String $$2) {
      return new fag(this.a, this.b, $$0, $$1, $$2);
   }

   @Override
   public void close() {
      this.b.a();
   }
}
