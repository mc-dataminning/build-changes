import javax.annotation.Nullable;

public final class fyi implements AutoCloseable {
   private final ezg a;
   private final etb b;

   public fyi(ezg $$0) {
      this.a = $$0;
      this.b = new etb(esy::new);
   }

   public etd a(esq $$0, @Nullable String $$1, String $$2) {
      return new etd(this.a, this.b, $$0, $$1, $$2);
   }

   @Override
   public void close() {
      this.b.a();
   }
}
