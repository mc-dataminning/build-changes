import javax.annotation.Nullable;

public final class gbw implements AutoCloseable {
   private final fcu a;
   private final ewp b;

   public gbw(fcu $$0) {
      this.a = $$0;
      this.b = new ewp(ewm::new);
   }

   public ewr a(ewe $$0, @Nullable String $$1, String $$2) {
      return new ewr(this.a, this.b, $$0, $$1, $$2);
   }

   @Override
   public void close() {
      this.b.a();
   }
}
