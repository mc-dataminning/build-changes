public class fvl extends fxd<cau, fhj<cau>> {
   private static final agi a = new agi("textures/entity/creeper/creeper.png");

   public fvl(fvx.a $$0) {
      super($$0, new fhj<>($$0.a(fkn.B)), 0.5F);
      this.a(new fzi(this, $$0.f()));
   }

   protected void a(cau $$0, enw $$1, float $$2) {
      float $$3 = $$0.E($$2);
      float $$4 = 1.0F + atm.a($$3 * 100.0F) * $$3 * 0.01F;
      $$3 = atm.a($$3, 0.0F, 1.0F);
      $$3 *= $$3;
      $$3 *= $$3;
      float $$5 = (1.0F + $$3 * 0.4F) * $$4;
      float $$6 = (1.0F + $$3 * 0.1F) / $$4;
      $$1.b($$5, $$6, $$5);
   }

   protected float a(cau $$0, float $$1) {
      float $$2 = $$0.E($$1);
      return (int)($$2 * 10.0F) % 2 == 0 ? 0.0F : atm.a($$2, 0.5F, 1.0F);
   }

   public agi a(cau $$0) {
      return a;
   }
}
