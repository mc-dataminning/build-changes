public class gat extends gao {
   private static final ww a = ww.c("controls.title");

   private static foi<?>[] a(foj $$0) {
      return new foi[]{$$0.af(), $$0.ag(), $$0.J(), $$0.L()};
   }

   public gat(fxi $$0, foj $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      this.d
         .a(
            frq.a(ww.c("options.mouse_settings"), $$0 -> this.m.a(new gal(this, this.c))).a(),
            frq.a(ww.c("controls.keybinds"), $$0 -> this.m.a(new gav(this, this.c))).a()
         );
      this.d.a(a(this.c));
   }
}
