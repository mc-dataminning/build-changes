import javax.annotation.Nullable;

public final class geg implements AutoCloseable {
   private final fff a;
   private final eza b;

   public geg(fff $$0) {
      this.a = $$0;
      this.b = new eza(eyx::new);
   }

   public ezc a(eyp $$0, @Nullable String $$1, String $$2) {
      return new ezc(this.a, this.b, $$0, $$1, $$2);
   }

   @Override
   public void close() {
      this.b.a();
   }
}
