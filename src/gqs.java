import javax.annotation.Nullable;

public final class gqs implements AutoCloseable {
   private final fos a;
   private final fid b;

   public gqs(fos $$0) {
      this.a = $$0;
      this.b = new fid(fia::new);
   }

   public fif a(fhs $$0, @Nullable String $$1, String $$2) {
      return new fif(this.a, this.b, $$0, $$1, $$2);
   }

   @Override
   public void close() {
      this.b.a();
   }
}
