public class fxr extends fxm {
   private static final wo a = wo.c("controls.title");

   private static flk<?>[] a(fll $$0) {
      return new flk[]{$$0.af(), $$0.ag(), $$0.J(), $$0.L()};
   }

   public fxr(fui $$0, fll $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      this.d
         .a(
            fop.a(wo.c("options.mouse_settings"), $$0 -> this.m.a(new fxj(this, this.c))).a(),
            fop.a(wo.c("controls.keybinds"), $$0 -> this.m.a(new fxt(this, this.c))).a()
         );
      this.d.a(a(this.c));
   }
}
