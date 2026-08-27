public class gix extends giz<cjb, ftm<cjb>> {
   private static final akm a = new akm("textures/entity/slime/magmacube.png");

   public gix(ght.a $$0) {
      super($$0, new ftm<>($$0.a(fvv.aA)), 0.25F);
   }

   protected int a(cjb $$0, io $$1) {
      return 15;
   }

   public akm a(cjb $$0) {
      return a;
   }

   public void a(cjb $$0, float $$1, float $$2, eys $$3, gck $$4, int $$5) {
      this.d = 0.25F * (float)$$0.gq();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(cjb $$0, eys $$1, float $$2) {
      int $$3 = $$0.gq();
      float $$4 = ayd.i($$2, $$0.bY, $$0.bX) / ((float)$$3 * 0.5F + 1.0F);
      float $$5 = 1.0F / ($$4 + 1.0F);
      $$1.b($$5 * (float)$$3, 1.0F / $$5 * (float)$$3, $$5 * (float)$$3);
   }
}
