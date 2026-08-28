import javax.annotation.Nullable;

public final class gmz implements AutoCloseable {
   private final flk a;
   private final few b;

   public gmz(flk $$0) {
      this.a = $$0;
      this.b = new few(fet::new);
   }

   public fey a(fel $$0, @Nullable String $$1, String $$2) {
      return new fey(this.a, this.b, $$0, $$1, $$2);
   }

   @Override
   public void close() {
      this.b.a();
   }
}
