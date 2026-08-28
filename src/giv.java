import javax.annotation.Nullable;

public final class giv implements AutoCloseable {
   private final fja a;
   private final fcu b;

   public giv(fja $$0) {
      this.a = $$0;
      this.b = new fcu(fcr::new);
   }

   public fcw a(fcj $$0, @Nullable String $$1, String $$2) {
      return new fcw(this.a, this.b, $$0, $$1, $$2);
   }

   @Override
   public void close() {
      this.b.a();
   }
}
