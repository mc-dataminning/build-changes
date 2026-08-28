public class fxf extends fxa {
   private static final xv a = xv.c("controls.title");

   private static fmh<?>[] a(fmi $$0) {
      return new fmh[]{$$0.af(), $$0.ag(), $$0.J(), $$0.L()};
   }

   public fxf(ftw $$0, fmi $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void l() {
      this.d
         .a(
            fod.a(xv.c("options.mouse_settings"), $$0 -> this.m.a(new fwx(this, this.c))).a(),
            fod.a(xv.c("controls.keybinds"), $$0 -> this.m.a(new fxh(this, this.c))).a()
         );
      this.d.a(a(this.c));
   }
}
