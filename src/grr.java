public class grr extends gtk<clk, gyd, gbt> {
   private static final akv a = akv.b("textures/entity/creeper/creeper.png");

   public grr(gse.a $$0) {
      super($$0, new gbt($$0.a(gfc.ai)), 0.5F);
      this.a(new gvv(this, $$0.f()));
   }

   protected void a(gyd $$0, ffu $$1) {
      float $$2 = $$0.a;
      float $$3 = 1.0F + ayz.a($$2 * 100.0F) * $$2 * 0.01F;
      $$2 = ayz.a($$2, 0.0F, 1.0F);
      $$2 *= $$2;
      $$2 *= $$2;
      float $$4 = (1.0F + $$2 * 0.4F) * $$3;
      float $$5 = (1.0F + $$2 * 0.1F) / $$3;
      $$1.b($$4, $$5, $$4);
   }

   protected float a(gyd $$0) {
      float $$1 = $$0.a;
      return (int)($$1 * 10.0F) % 2 == 0 ? 0.0F : ayz.a($$1, 0.5F, 1.0F);
   }

   public akv b(gyd $$0) {
      return a;
   }

   public gyd a() {
      return new gyd();
   }

   public void a(clk $$0, gyd $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.b = $$0.p();
   }
}
