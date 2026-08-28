public class fui extends fud {
   private static final xi a = xi.c("controls.title");

   private static fjl<?>[] a(fjm $$0) {
      return new fjl[]{$$0.ae(), $$0.af(), $$0.I(), $$0.K()};
   }

   public fui(fra $$0, fjm $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      this.d
         .a(
            flh.a(xi.c("options.mouse_settings"), $$0 -> this.m.a(new fua(this, this.c))).a(),
            flh.a(xi.c("controls.keybinds"), $$0 -> this.m.a(new fuk(this, this.c))).a()
         );
      this.d.a(a(this.c));
   }
}
