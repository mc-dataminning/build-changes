import javax.annotation.Nullable;

public final class gjg implements AutoCloseable {
   private final fji a;
   private final fdc b;

   public gjg(fji $$0) {
      this.a = $$0;
      this.b = new fdc(fcz::new);
   }

   public fde a(fcr $$0, @Nullable String $$1, String $$2) {
      return new fde(this.a, this.b, $$0, $$1, $$2);
   }

   @Override
   public void close() {
      this.b.a();
   }
}
