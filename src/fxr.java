import java.util.Arrays;

public class fxr extends fxp {
   private static final wp a = wp.c("options.sounds.title");

   private static flm<?>[] a(fln $$0) {
      return new flm[]{$$0.Z(), $$0.aa()};
   }

   public fxr(ful $$0, fln $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      this.d.a(this.c.b(awb.a));
      this.d.a(this.H());
      this.d.a(this.c.aw());
      this.d.a(a(this.c));
   }

   private flm<?>[] H() {
      return Arrays.stream(awb.values()).filter($$0 -> $$0 != awb.a).map($$0 -> this.c.b($$0)).toArray(flm[]::new);
   }
}
