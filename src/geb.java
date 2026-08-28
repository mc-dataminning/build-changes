import javax.annotation.Nullable;

public final class geb implements AutoCloseable {
   private final ffa a;
   private final eyv b;

   public geb(ffa $$0) {
      this.a = $$0;
      this.b = new eyv(eys::new);
   }

   public eyx a(eyk $$0, @Nullable String $$1, String $$2) {
      return new eyx(this.a, this.b, $$0, $$1, $$2);
   }

   @Override
   public void close() {
      this.b.a();
   }
}
