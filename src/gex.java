import javax.annotation.Nullable;

public final class gex implements AutoCloseable {
   private final ffw a;
   private final ezq b;

   public gex(ffw $$0) {
      this.a = $$0;
      this.b = new ezq(ezn::new);
   }

   public ezs a(ezf $$0, @Nullable String $$1, String $$2) {
      return new ezs(this.a, this.b, $$0, $$1, $$2);
   }

   @Override
   public void close() {
      this.b.a();
   }
}
