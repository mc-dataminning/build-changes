import java.util.Arrays;

public class fxc extends fxa {
   private static final xv a = xv.c("options.sounds.title");

   private static fmh<?>[] a(fmi $$0) {
      return new fmh[]{$$0.Z(), $$0.aa()};
   }

   public fxc(ftw $$0, fmi $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void l() {
      this.d.a(this.c.b(axg.a));
      this.d.a(this.J());
      this.d.a(this.c.aw());
      this.d.a(a(this.c));
   }

   private fmh<?>[] J() {
      return Arrays.stream(axg.values()).filter($$0 -> $$0 != axg.a).map($$0 -> this.c.b($$0)).toArray(fmh[]::new);
   }
}
