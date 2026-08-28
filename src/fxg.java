public class fxg extends fxb {
   private static final xv a = xv.c("controls.title");

   private static fmi<?>[] a(fmj $$0) {
      return new fmi[]{$$0.af(), $$0.ag(), $$0.J(), $$0.L()};
   }

   public fxg(ftx $$0, fmj $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void l() {
      this.d
         .a(
            foe.a(xv.c("options.mouse_settings"), $$0 -> this.m.a(new fwy(this, this.c))).a(),
            foe.a(xv.c("controls.keybinds"), $$0 -> this.m.a(new fxi(this, this.c))).a()
         );
      this.d.a(a(this.c));
   }
}
