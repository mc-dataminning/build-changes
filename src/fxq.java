import java.util.Arrays;

public class fxq extends fxo {
   private static final wp a = wp.c("options.sounds.title");

   private static fll<?>[] a(flm $$0) {
      return new fll[]{$$0.Z(), $$0.aa()};
   }

   public fxq(fuk $$0, flm $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      this.d.a(this.c.b(awb.a));
      this.d.a(this.H());
      this.d.a(this.c.aw());
      this.d.a(a(this.c));
   }

   private fll<?>[] H() {
      return Arrays.stream(awb.values()).filter($$0 -> $$0 != awb.a).map($$0 -> this.c.b($$0)).toArray(fll[]::new);
   }
}
