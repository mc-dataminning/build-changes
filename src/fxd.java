import java.util.Arrays;

public class fxd extends fxb {
   private static final xv a = xv.c("options.sounds.title");

   private static fmi<?>[] a(fmj $$0) {
      return new fmi[]{$$0.Z(), $$0.aa()};
   }

   public fxd(ftx $$0, fmj $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void l() {
      this.d.a(this.c.b(axg.a));
      this.d.a(this.J());
      this.d.a(this.c.aw());
      this.d.a(a(this.c));
   }

   private fmi<?>[] J() {
      return Arrays.stream(axg.values()).filter($$0 -> $$0 != axg.a).map($$0 -> this.c.b($$0)).toArray(fmi[]::new);
   }
}
