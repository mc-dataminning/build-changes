public class gkq extends gks<cjp, fve<cjp>> {
   private static final akk a = new akk("textures/entity/slime/magmacube.png");

   public gkq(gjm.a $$0) {
      super($$0, new fve<>($$0.a(fxn.aA)), 0.25F);
   }

   protected int a(cjp $$0, ja $$1) {
      return 15;
   }

   public akk a(cjp $$0) {
      return a;
   }

   public void a(cjp $$0, float $$1, float $$2, fam $$3, ged $$4, int $$5) {
      this.d = 0.25F * (float)$$0.gp();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(cjp $$0, fam $$1, float $$2) {
      int $$3 = $$0.gp();
      float $$4 = ayg.i($$2, $$0.ca, $$0.bZ) / ((float)$$3 * 0.5F + 1.0F);
      float $$5 = 1.0F / ($$4 + 1.0F);
      $$1.b($$5 * (float)$$3, 1.0F / $$5 * (float)$$3, $$5 * (float)$$3);
   }
}
