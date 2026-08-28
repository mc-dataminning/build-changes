public class fxt extends fxo {
   private static final wp a = wp.c("controls.title");

   private static fll<?>[] a(flm $$0) {
      return new fll[]{$$0.af(), $$0.ag(), $$0.J(), $$0.L()};
   }

   public fxt(fuk $$0, flm $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      this.d
         .a(
            fos.a(wp.c("options.mouse_settings"), $$0 -> this.m.a(new fxl(this, this.c))).a(),
            fos.a(wp.c("controls.keybinds"), $$0 -> this.m.a(new fxv(this, this.c))).a()
         );
      this.d.a(a(this.c));
   }
}
