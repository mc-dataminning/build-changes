public class gbm extends gbh {
   private static final wy a = wy.c("controls.title");

   private static fpc<?>[] a(fpd $$0) {
      return new fpc[]{$$0.af(), $$0.ag(), $$0.J(), $$0.L()};
   }

   public gbm(fyb $$0, fpd $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      this.d
         .a(
            fsj.a(wy.c("options.mouse_settings"), $$0 -> this.m.a(new gbe(this, this.c))).a(),
            fsj.a(wy.c("controls.keybinds"), $$0 -> this.m.a(new gbo(this, this.c))).a()
         );
      this.d.a(a(this.c));
   }
}
