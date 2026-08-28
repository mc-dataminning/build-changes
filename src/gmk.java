import javax.annotation.Nullable;

public final class gmk implements AutoCloseable {
   private final fmg a;
   private final fft b;

   public gmk(fmg $$0) {
      this.a = $$0;
      this.b = new fft(ffq::new);
   }

   public ffv a(ffi $$0, @Nullable String $$1, String $$2) {
      return new ffv(this.a, this.b, $$0, $$1, $$2);
   }

   @Override
   public void close() {
      this.b.a();
   }
}
