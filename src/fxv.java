public class fxv extends fxq {
   private static final wp a = wp.c("controls.title");

   private static fln<?>[] a(flo $$0) {
      return new fln[]{$$0.af(), $$0.ag(), $$0.J(), $$0.L()};
   }

   public fxv(fum $$0, flo $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      this.d
         .a(
            fou.a(wp.c("options.mouse_settings"), $$0 -> this.m.a(new fxn(this, this.c))).a(),
            fou.a(wp.c("controls.keybinds"), $$0 -> this.m.a(new fxx(this, this.c))).a()
         );
      this.d.a(a(this.c));
   }
}
