public class fyr extends fym {
   private static final wp a = wp.c("controls.title");

   private static fmj<?>[] a(fmk $$0) {
      return new fmj[]{$$0.af(), $$0.ag(), $$0.J(), $$0.L()};
   }

   public fyr(fvi $$0, fmk $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      this.d
         .a(
            fpq.a(wp.c("options.mouse_settings"), $$0 -> this.m.a(new fyj(this, this.c))).a(),
            fpq.a(wp.c("controls.keybinds"), $$0 -> this.m.a(new fyt(this, this.c))).a()
         );
      this.d.a(a(this.c));
   }
}
