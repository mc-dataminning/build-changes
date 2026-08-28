public class gkc extends gke<ckd, fur<ckd>> {
   private static final alf a = new alf("textures/entity/slime/magmacube.png");

   public gkc(giy.a $$0) {
      super($$0, new fur<>($$0.a(fxa.aA)), 0.25F);
   }

   protected int a(ckd $$0, iz $$1) {
      return 15;
   }

   public alf a(ckd $$0) {
      return a;
   }

   public void a(ckd $$0, float $$1, float $$2, ezz $$3, gdp $$4, int $$5) {
      this.d = 0.25F * (float)$$0.gr();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(ckd $$0, ezz $$1, float $$2) {
      int $$3 = $$0.gr();
      float $$4 = ayz.i($$2, $$0.bY, $$0.bX) / ((float)$$3 * 0.5F + 1.0F);
      float $$5 = 1.0F / ($$4 + 1.0F);
      $$1.b($$5 * (float)$$3, 1.0F / $$5 * (float)$$3, $$5 * (float)$$3);
   }
}
