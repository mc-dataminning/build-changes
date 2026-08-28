import javax.annotation.Nullable;

public final class geh implements AutoCloseable {
   private final ffg a;
   private final ezb b;

   public geh(ffg $$0) {
      this.a = $$0;
      this.b = new ezb(eyy::new);
   }

   public ezd a(eyq $$0, @Nullable String $$1, String $$2) {
      return new ezd(this.a, this.b, $$0, $$1, $$2);
   }

   @Override
   public void close() {
      this.b.a();
   }
}
