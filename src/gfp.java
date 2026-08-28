import javax.annotation.Nullable;

public final class gfp implements AutoCloseable {
   private final fgm a;
   private final fai b;

   public gfp(fgm $$0) {
      this.a = $$0;
      this.b = new fai(faf::new);
   }

   public fak a(ezy $$0, @Nullable String $$1, String $$2) {
      return new fak(this.a, this.b, $$0, $$1, $$2);
   }

   @Override
   public void close() {
      this.b.a();
   }
}
