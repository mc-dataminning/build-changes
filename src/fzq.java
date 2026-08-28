public class fzq extends fzl {
   private static final wv a = wv.c("controls.title");

   private static fng<?>[] a(fnh $$0) {
      return new fng[]{$$0.af(), $$0.ag(), $$0.J(), $$0.L()};
   }

   public fzq(fwf $$0, fnh $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      this.d
         .a(
            fqn.a(wv.c("options.mouse_settings"), $$0 -> this.m.a(new fzi(this, this.c))).a(),
            fqn.a(wv.c("controls.keybinds"), $$0 -> this.m.a(new fzs(this, this.c))).a()
         );
      this.d.a(a(this.c));
   }
}
