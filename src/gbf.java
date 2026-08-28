public class gbf extends gba {
   private static final wy a = wy.c("controls.title");

   private static fov<?>[] a(fow $$0) {
      return new fov[]{$$0.af(), $$0.ag(), $$0.J(), $$0.L()};
   }

   public gbf(fxu $$0, fow $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      this.d
         .a(
            fsc.a(wy.c("options.mouse_settings"), $$0 -> this.m.a(new gax(this, this.c))).a(),
            fsc.a(wy.c("controls.keybinds"), $$0 -> this.m.a(new gbh(this, this.c))).a()
         );
      this.d.a(a(this.c));
   }
}
