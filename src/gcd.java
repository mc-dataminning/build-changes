public class gcd extends gby {
   private static final wy a = wy.c("controls.title");

   private static fpw<?>[] a(fpx $$0) {
      return new fpw[]{$$0.af(), $$0.ag(), $$0.J(), $$0.L()};
   }

   public gcd(fys $$0, fpx $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      this.d
         .a(
            fta.a(wy.c("options.mouse_settings"), $$0 -> this.m.a(new gbv(this, this.c))).a(),
            fta.a(wy.c("controls.keybinds"), $$0 -> this.m.a(new gcf(this, this.c))).a()
         );
      this.d.a(a(this.c));
   }
}
