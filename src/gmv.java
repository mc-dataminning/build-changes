import javax.annotation.Nullable;

public final class gmv implements AutoCloseable {
   private final flh a;
   private final fet b;

   public gmv(flh $$0) {
      this.a = $$0;
      this.b = new fet(feq::new);
   }

   public fev a(fei $$0, @Nullable String $$1, String $$2) {
      return new fev(this.a, this.b, $$0, $$1, $$2);
   }

   @Override
   public void close() {
      this.b.a();
   }
}
