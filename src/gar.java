import javax.annotation.Nullable;

public final class gar implements AutoCloseable {
   private final fbp a;
   private final evk b;

   public gar(fbp $$0) {
      this.a = $$0;
      this.b = new evk(evh::new);
   }

   public evm a(euz $$0, @Nullable String $$1, String $$2) {
      return new evm(this.a, this.b, $$0, $$1, $$2);
   }

   @Override
   public void close() {
      this.b.a();
   }
}
