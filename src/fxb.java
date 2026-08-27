public class fxb extends fxd<cbh, fif<cbh>> {
   private static final agi a = new agi("textures/entity/slime/magmacube.png");

   public fxb(fvx.a $$0) {
      super($$0, new fif<>($$0.a(fkn.au)), 0.25F);
   }

   protected int a(cbh $$0, ht $$1) {
      return 15;
   }

   public agi a(cbh $$0) {
      return a;
   }

   public void a(cbh $$0, float $$1, float $$2, enw $$3, fqu $$4, int $$5) {
      this.d = 0.25F * (float)$$0.gg();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(cbh $$0, enw $$1, float $$2) {
      int $$3 = $$0.gg();
      float $$4 = atm.i($$2, $$0.bS, $$0.e) / ((float)$$3 * 0.5F + 1.0F);
      float $$5 = 1.0F / ($$4 + 1.0F);
      $$1.b($$5 * (float)$$3, 1.0F / $$5 * (float)$$3, $$5 * (float)$$3);
   }
}
