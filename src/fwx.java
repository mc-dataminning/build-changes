import java.util.Arrays;

public class fwx extends fwv {
   private static final xv a = xv.c("options.sounds.title");

   private static fmc<?>[] a(fmd $$0) {
      return new fmc[]{$$0.Z(), $$0.aa()};
   }

   public fwx(ftr $$0, fmd $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void l() {
      this.d.a(this.c.b(axg.a));
      this.d.a(this.J());
      this.d.a(this.c.aw());
      this.d.a(a(this.c));
   }

   private fmc<?>[] J() {
      return Arrays.stream(axg.values()).filter($$0 -> $$0 != axg.a).map($$0 -> this.c.b($$0)).toArray(fmc[]::new);
   }
}
