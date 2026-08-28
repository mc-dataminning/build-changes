import javax.annotation.Nullable;

public final class grl implements AutoCloseable {
   private final fpo a;
   private final fiv b;

   public grl(fpo $$0) {
      this.a = $$0;
      this.b = new fiv(fis::new);
   }

   public fix a(fik $$0, @Nullable String $$1, String $$2) {
      return new fix(this.a, this.b, $$0, $$1, $$2);
   }

   @Override
   public void close() {
      this.b.a();
   }
}
