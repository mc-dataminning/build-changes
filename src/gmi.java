import javax.annotation.Nullable;

public final class gmi implements AutoCloseable {
   private final fme a;
   private final ffr b;

   public gmi(fme $$0) {
      this.a = $$0;
      this.b = new ffr(ffo::new);
   }

   public fft a(ffg $$0, @Nullable String $$1, String $$2) {
      return new fft(this.a, this.b, $$0, $$1, $$2);
   }

   @Override
   public void close() {
      this.b.a();
   }
}
