import java.util.Arrays;

public class fxe extends fxc {
   private static final xv a = xv.c("options.sounds.title");

   private static fmj<?>[] a(fmk $$0) {
      return new fmj[]{$$0.Z(), $$0.aa()};
   }

   public fxe(fty $$0, fmk $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void l() {
      this.d.a(this.c.b(axg.a));
      this.d.a(this.J());
      this.d.a(this.c.aw());
      this.d.a(a(this.c));
   }

   private fmj<?>[] J() {
      return Arrays.stream(axg.values()).filter($$0 -> $$0 != axg.a).map($$0 -> this.c.b($$0)).toArray(fmj[]::new);
   }
}
