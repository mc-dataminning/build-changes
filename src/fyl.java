public class fyl extends fxz<cvd> {
   private static final ale G = ale.b("textures/gui/container/crafting_table.png");

   public fyl(cvd $$0, cqr $$1, ww $$2) {
      super($$0, new gbd($$0), $$1, $$2);
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.v = 29;
   }

   @Override
   protected fvw G() {
      return new fvw(this.C + 5, this.o / 2 - 49);
   }

   @Override
   protected void a(frc $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.C;
      int $$5 = (this.o - this.u) / 2;
      $$0.a(gpn::H, G, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
   }
}
