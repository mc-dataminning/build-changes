public class fuh extends fuj<bzn, ffo<bzn>> {
   private static final aez a = new aez("textures/entity/slime/magmacube.png");

   public fuh(ftd.a $$0) {
      super($$0, new ffo<>($$0.a(fhw.au)), 0.25F);
   }

   protected int a(bzn $$0, gw $$1) {
      return 15;
   }

   public aez a(bzn $$0) {
      return a;
   }

   public void a(bzn $$0, float $$1, float $$2, elj $$3, foa $$4, int $$5) {
      this.d = 0.25F * (float)$$0.gf();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(bzn $$0, elj $$1, float $$2) {
      int $$3 = $$0.gf();
      float $$4 = asb.i($$2, $$0.bS, $$0.e) / ((float)$$3 * 0.5F + 1.0F);
      float $$5 = 1.0F / ($$4 + 1.0F);
      $$1.b($$5 * (float)$$3, 1.0F / $$5 * (float)$$3, $$5 * (float)$$3);
   }
}
