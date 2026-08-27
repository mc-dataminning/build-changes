import javax.annotation.Nullable;

public final class gba implements AutoCloseable {
   private final fby a;
   private final evt b;

   public gba(fby $$0) {
      this.a = $$0;
      this.b = new evt(evq::new);
   }

   public evv a(evi $$0, @Nullable String $$1, String $$2) {
      return new evv(this.a, this.b, $$0, $$1, $$2);
   }

   @Override
   public void close() {
      this.b.a();
   }
}
