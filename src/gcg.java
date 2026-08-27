import javax.annotation.Nullable;

public final class gcg implements AutoCloseable {
   private final fde a;
   private final ewz b;

   public gcg(fde $$0) {
      this.a = $$0;
      this.b = new ewz(eww::new);
   }

   public exb a(ewo $$0, @Nullable String $$1, String $$2) {
      return new exb(this.a, this.b, $$0, $$1, $$2);
   }

   @Override
   public void close() {
      this.b.a();
   }
}
