public class fvh extends fvj<cak, fgn<cak>> {
   private static final afw a = new afw("textures/entity/slime/magmacube.png");

   public fvh(fud.a $$0) {
      super($$0, new fgn<>($$0.a(fiv.au)), 0.25F);
   }

   protected int a(cak $$0, ht $$1) {
      return 15;
   }

   public afw a(cak $$0) {
      return a;
   }

   public void a(cak $$0, float $$1, float $$2, emh $$3, fpb $$4, int $$5) {
      this.d = 0.25F * (float)$$0.gf();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(cak $$0, emh $$1, float $$2) {
      int $$3 = $$0.gf();
      float $$4 = asy.i($$2, $$0.bS, $$0.e) / ((float)$$3 * 0.5F + 1.0F);
      float $$5 = 1.0F / ($$4 + 1.0F);
      $$1.b($$5 * (float)$$3, 1.0F / $$5 * (float)$$3, $$5 * (float)$$3);
   }
}
