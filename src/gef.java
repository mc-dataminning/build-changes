import javax.annotation.Nullable;

public final class gef implements AutoCloseable {
   private final ffe a;
   private final eyz b;

   public gef(ffe $$0) {
      this.a = $$0;
      this.b = new eyz(eyw::new);
   }

   public ezb a(eyo $$0, @Nullable String $$1, String $$2) {
      return new ezb(this.a, this.b, $$0, $$1, $$2);
   }

   @Override
   public void close() {
      this.b.a();
   }
}
