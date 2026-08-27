import javax.annotation.Nullable;

public final class fwl implements AutoCloseable {
   private final exo a;
   private final erj b;

   public fwl(exo $$0) {
      this.a = $$0;
      this.b = new erj(erg::new);
   }

   public erl a(eqy $$0, @Nullable String $$1, String $$2) {
      return new erl(this.a, this.b, $$0, $$1, $$2);
   }

   @Override
   public void close() {
      this.b.a();
   }
}
