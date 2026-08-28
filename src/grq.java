import javax.annotation.Nullable;

public final class grq implements AutoCloseable {
   private final fpt a;
   private final fja b;

   public grq(fpt $$0) {
      this.a = $$0;
      this.b = new fja(fix::new);
   }

   public fjc a(fip $$0, @Nullable String $$1, String $$2) {
      return new fjc(this.a, this.b, $$0, $$1, $$2);
   }

   @Override
   public void close() {
      this.b.a();
   }
}
