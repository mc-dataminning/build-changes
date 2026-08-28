public class gks extends gku<cjq, fvg<cjq>> {
   private static final akk a = new akk("textures/entity/slime/magmacube.png");

   public gks(gjo.a $$0) {
      super($$0, new fvg<>($$0.a(fxp.aA)), 0.25F);
   }

   protected int a(cjq $$0, ja $$1) {
      return 15;
   }

   public akk a(cjq $$0) {
      return a;
   }

   public void a(cjq $$0, float $$1, float $$2, fao $$3, gef $$4, int $$5) {
      this.d = 0.25F * (float)$$0.go();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(cjq $$0, fao $$1, float $$2) {
      int $$3 = $$0.go();
      float $$4 = ayg.i($$2, $$0.ca, $$0.bZ) / ((float)$$3 * 0.5F + 1.0F);
      float $$5 = 1.0F / ($$4 + 1.0F);
      $$1.b($$5 * (float)$$3, 1.0F / $$5 * (float)$$3, $$5 * (float)$$3);
   }
}
