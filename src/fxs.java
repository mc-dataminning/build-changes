import java.util.Arrays;

public class fxs extends fxq {
   private static final wp a = wp.c("options.sounds.title");

   private static fln<?>[] a(flo $$0) {
      return new fln[]{$$0.Z(), $$0.aa()};
   }

   public fxs(fum $$0, flo $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      this.d.a(this.c.b(awb.a));
      this.d.a(this.H());
      this.d.a(this.c.aw());
      this.d.a(a(this.c));
   }

   private fln<?>[] H() {
      return Arrays.stream(awb.values()).filter($$0 -> $$0 != awb.a).map($$0 -> this.c.b($$0)).toArray(fln[]::new);
   }
}
