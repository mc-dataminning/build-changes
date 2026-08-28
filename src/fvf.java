public class fvf extends fva {
   private static final xj a = xj.c("controls.title");

   private static fkh<?>[] a(fki $$0) {
      return new fkh[]{$$0.ae(), $$0.af(), $$0.I(), $$0.K()};
   }

   public fvf(frw $$0, fki $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      this.d
         .a(
            fmd.a(xj.c("options.mouse_settings"), $$0 -> this.m.a(new fux(this, this.c))).a(),
            fmd.a(xj.c("controls.keybinds"), $$0 -> this.m.a(new fvh(this, this.c))).a()
         );
      this.d.a(a(this.c));
   }
}
