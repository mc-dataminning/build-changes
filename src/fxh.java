public class fxh extends fxc {
   private static final xv a = xv.c("controls.title");

   private static fmj<?>[] a(fmk $$0) {
      return new fmj[]{$$0.af(), $$0.ag(), $$0.J(), $$0.L()};
   }

   public fxh(fty $$0, fmk $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void l() {
      this.d
         .a(
            fof.a(xv.c("options.mouse_settings"), $$0 -> this.m.a(new fwz(this, this.c))).a(),
            fof.a(xv.c("controls.keybinds"), $$0 -> this.m.a(new fxj(this, this.c))).a()
         );
      this.d.a(a(this.c));
   }
}
