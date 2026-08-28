public class gil extends gkd<cjp, ftu<cjp>> {
   private static final alf a = new alf("textures/entity/creeper/creeper.png");

   public gil(gix.a $$0) {
      super($$0, new ftu<>($$0.a(fwz.H)), 0.5F);
      this.a(new gmm(this, $$0.f()));
   }

   protected void a(cjp $$0, ezy $$1, float $$2) {
      float $$3 = $$0.G($$2);
      float $$4 = 1.0F + ayz.a($$3 * 100.0F) * $$3 * 0.01F;
      $$3 = ayz.a($$3, 0.0F, 1.0F);
      $$3 *= $$3;
      $$3 *= $$3;
      float $$5 = (1.0F + $$3 * 0.4F) * $$4;
      float $$6 = (1.0F + $$3 * 0.1F) / $$4;
      $$1.b($$5, $$6, $$5);
   }

   protected float a(cjp $$0, float $$1) {
      float $$2 = $$0.G($$1);
      return (int)($$2 * 10.0F) % 2 == 0 ? 0.0F : ayz.a($$2, 0.5F, 1.0F);
   }

   public alf a(cjp $$0) {
      return a;
   }
}
