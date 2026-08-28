public class gby extends gbt {
   private static final wy a = wy.c("controls.title");

   private static fpr<?>[] a(fps $$0) {
      return new fpr[]{$$0.af(), $$0.ag(), $$0.J(), $$0.L()};
   }

   public gby(fyn $$0, fps $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      this.d
         .a(
            fsv.a(wy.c("options.mouse_settings"), $$0 -> this.m.a(new gbq(this, this.c))).a(),
            fsv.a(wy.c("controls.keybinds"), $$0 -> this.m.a(new gca(this, this.c))).a()
         );
      this.d.a(a(this.c));
   }
}
