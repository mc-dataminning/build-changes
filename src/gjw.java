import javax.annotation.Nullable;

public final class gjw implements AutoCloseable {
   private final fjx a;
   private final fdl b;

   public gjw(fjx $$0) {
      this.a = $$0;
      this.b = new fdl(fdi::new);
   }

   public fdn a(fda $$0, @Nullable String $$1, String $$2) {
      return new fdn(this.a, this.b, $$0, $$1, $$2);
   }

   @Override
   public void close() {
      this.b.a();
   }
}
