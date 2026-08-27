public class glw extends glz<cjb, fwg<cjb>> {
   private static final akt a = new akt("textures/entity/slime/magmacube.png");

   public glw(gkq.a $$0) {
      super($$0, new fwg<>($$0.a(fyr.aE)), 0.25F);
   }

   protected int a(cjb $$0, ir $$1) {
      return 15;
   }

   public akt a(cjb $$0) {
      return a;
   }

   public void a(cjb $$0, float $$1, float $$2, fbc $$3, gfg $$4, int $$5) {
      this.e = 0.25F * (float)$$0.gz();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(cjb $$0, fbc $$1, float $$2) {
      int $$3 = $$0.gz();
      float $$4 = aym.i($$2, $$0.cg, $$0.e) / ((float)$$3 * 0.5F + 1.0F);
      float $$5 = 1.0F / ($$4 + 1.0F);
      $$1.b($$5 * (float)$$3, 1.0F / $$5 * (float)$$3, $$5 * (float)$$3);
   }
}
