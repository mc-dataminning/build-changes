public class gib extends gid<cim, fsr<cim>> {
   private static final akh a = new akh("textures/entity/slime/magmacube.png");

   public gib(ggx.a $$0) {
      super($$0, new fsr<>($$0.a(fva.aA)), 0.25F);
   }

   protected int a(cim $$0, in $$1) {
      return 15;
   }

   public akh a(cim $$0) {
      return a;
   }

   public void a(cim $$0, float $$1, float $$2, exx $$3, gbo $$4, int $$5) {
      this.d = 0.25F * (float)$$0.gq();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(cim $$0, exx $$1, float $$2) {
      int $$3 = $$0.gq();
      float $$4 = axz.i($$2, $$0.bX, $$0.e) / ((float)$$3 * 0.5F + 1.0F);
      float $$5 = 1.0F / ($$4 + 1.0F);
      $$1.b($$5 * (float)$$3, 1.0F / $$5 * (float)$$3, $$5 * (float)$$3);
   }
}
