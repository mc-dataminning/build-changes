import javax.annotation.Nullable;

public final class gdc implements AutoCloseable {
   private final fdz a;
   private final exu b;

   public gdc(fdz $$0) {
      this.a = $$0;
      this.b = new exu(exr::new);
   }

   public exw a(exj $$0, @Nullable String $$1, String $$2) {
      return new exw(this.a, this.b, $$0, $$1, $$2);
   }

   @Override
   public void close() {
      this.b.a();
   }
}
