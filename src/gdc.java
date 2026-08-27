import javax.annotation.Nullable;

public final class gdc implements AutoCloseable {
   private final feb a;
   private final exw b;

   public gdc(feb $$0) {
      this.a = $$0;
      this.b = new exw(ext::new);
   }

   public exy a(exl $$0, @Nullable String $$1, String $$2) {
      return new exy(this.a, this.b, $$0, $$1, $$2);
   }

   @Override
   public void close() {
      this.b.a();
   }
}
