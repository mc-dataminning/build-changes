public class fxa extends fwv {
   private static final xv a = xv.c("controls.title");

   private static fmc<?>[] a(fmd $$0) {
      return new fmc[]{$$0.af(), $$0.ag(), $$0.J(), $$0.L()};
   }

   public fxa(ftr $$0, fmd $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void l() {
      this.d
         .a(
            fny.a(xv.c("options.mouse_settings"), $$0 -> this.m.a(new fws(this, this.c))).a(),
            fny.a(xv.c("controls.keybinds"), $$0 -> this.m.a(new fxc(this, this.c))).a()
         );
      this.d.a(a(this.c));
   }
}
