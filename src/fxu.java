public class fxu extends fxp {
   private static final wp a = wp.c("controls.title");

   private static flm<?>[] a(fln $$0) {
      return new flm[]{$$0.af(), $$0.ag(), $$0.J(), $$0.L()};
   }

   public fxu(ful $$0, fln $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      this.d
         .a(
            fot.a(wp.c("options.mouse_settings"), $$0 -> this.m.a(new fxm(this, this.c))).a(),
            fot.a(wp.c("controls.keybinds"), $$0 -> this.m.a(new fxw(this, this.c))).a()
         );
      this.d.a(a(this.c));
   }
}
