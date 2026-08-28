import javax.annotation.Nullable;

public final class gkf implements AutoCloseable {
   private final fke a;
   private final fds b;

   public gkf(fke $$0) {
      this.a = $$0;
      this.b = new fds(fdp::new);
   }

   public fdu a(fdh $$0, @Nullable String $$1, String $$2) {
      return new fdu(this.a, this.b, $$0, $$1, $$2);
   }

   @Override
   public void close() {
      this.b.a();
   }
}
