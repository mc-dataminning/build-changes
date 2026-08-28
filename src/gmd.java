import javax.annotation.Nullable;

public final class gmd implements AutoCloseable {
   private final flz a;
   private final ffm b;

   public gmd(flz $$0) {
      this.a = $$0;
      this.b = new ffm(ffj::new);
   }

   public ffo a(ffb $$0, @Nullable String $$1, String $$2) {
      return new ffo(this.a, this.b, $$0, $$1, $$2);
   }

   @Override
   public void close() {
      this.b.a();
   }
}
