public class gnz extends gnf<cgz, gui, fyd> {
   private static final ali a = ali.b("textures/entity/dolphin.png");

   public gnz(gok.a $$0) {
      super($$0, new fyd($$0.a(gbl.ab)), new fyd($$0.a(gbl.ac)), 0.7F);
      this.a(new gse(this, $$0.b()));
   }

   public ali a(gui $$0) {
      return a;
   }

   public gui a() {
      return new gui();
   }

   public void a(cgz $$0, gui $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.dA().j() > 1.0E-7;
   }
}
