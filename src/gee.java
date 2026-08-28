import javax.annotation.Nullable;

public final class gee implements AutoCloseable {
   private final ffd a;
   private final eyy b;

   public gee(ffd $$0) {
      this.a = $$0;
      this.b = new eyy(eyv::new);
   }

   public eza a(eyn $$0, @Nullable String $$1, String $$2) {
      return new eza(this.a, this.b, $$0, $$1, $$2);
   }

   @Override
   public void close() {
      this.b.a();
   }
}
