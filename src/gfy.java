import javax.annotation.Nullable;

public final class gfy implements AutoCloseable {
   private final fgj a;
   private final fae b;

   public gfy(fgj $$0) {
      this.a = $$0;
      this.b = new fae(fab::new);
   }

   public fag a(ezt $$0, @Nullable String $$1, String $$2) {
      return new fag(this.a, this.b, $$0, $$1, $$2);
   }

   @Override
   public void close() {
      this.b.a();
   }
}
