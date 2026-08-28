public class fux extends fus {
   private static final xl a = xl.c("controls.title");

   private static fka<?>[] a(fkb $$0) {
      return new fka[]{$$0.ae(), $$0.af(), $$0.I(), $$0.K()};
   }

   public fux(frp $$0, fkb $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      this.d
         .a(
            flw.a(xl.c("options.mouse_settings"), $$0 -> this.m.a(new fup(this, this.c))).a(),
            flw.a(xl.c("controls.keybinds"), $$0 -> this.m.a(new fuz(this, this.c))).a()
         );
      this.d.a(a(this.c));
   }
}
