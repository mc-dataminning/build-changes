import javax.annotation.Nullable;

public final class fxi implements AutoCloseable {
   private final eyk a;
   private final esf b;

   public fxi(eyk $$0) {
      this.a = $$0;
      this.b = new esf(esc::new);
   }

   public esh a(eru $$0, @Nullable String $$1, String $$2) {
      return new esh(this.a, this.b, $$0, $$1, $$2);
   }

   @Override
   public void close() {
      this.b.a();
   }
}
