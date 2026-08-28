public class glc extends gkf<cko, fwa<cko>> {
   private static final alf a = new alf("textures/entity/slime/slime.png");

   public glc(giz.a $$0) {
      super($$0, new fwa<>($$0.a(fxb.bs)), 0.25F);
      this.a(new gnq<>(this, $$0.f()));
   }

   public void a(cko $$0, float $$1, float $$2, faa $$3, gdq $$4, int $$5) {
      this.d = 0.25F * (float)$$0.gr();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(cko $$0, faa $$1, float $$2) {
      float $$3 = 0.999F;
      $$1.b(0.999F, 0.999F, 0.999F);
      $$1.a(0.0F, 0.001F, 0.0F);
      float $$4 = (float)$$0.gr();
      float $$5 = ayz.i($$2, $$0.bY, $$0.bX) / ($$4 * 0.5F + 1.0F);
      float $$6 = 1.0F / ($$5 + 1.0F);
      $$1.b($$6 * $$4, 1.0F / $$6 * $$4, $$6 * $$4);
   }

   public alf a(cko $$0) {
      return a;
   }
}
