import java.util.Arrays;

public class fuu extends fus {
   private static final xl a = xl.c("options.sounds.title");

   private static fka<?>[] a(fkb $$0) {
      return new fka[]{$$0.Y(), $$0.Z()};
   }

   public fuu(frp $$0, fkb $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      this.d.a(this.c.b(awp.a));
      this.d.a(this.G());
      this.d.a(this.c.av());
      this.d.a(a(this.c));
   }

   private fka<?>[] G() {
      return Arrays.stream(awp.values()).filter($$0 -> $$0 != awp.a).map($$0 -> this.c.b($$0)).toArray(fka[]::new);
   }
}
