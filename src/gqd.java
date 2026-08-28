import javax.annotation.Nullable;

public final class gqd implements AutoCloseable {
   private final fof a;
   private final fhr b;

   public gqd(fof $$0) {
      this.a = $$0;
      this.b = new fhr(fho::new);
   }

   public fht a(fhg $$0, @Nullable String $$1, String $$2) {
      return new fht(this.a, this.b, $$0, $$1, $$2);
   }

   @Override
   public void close() {
      this.b.a();
   }
}
