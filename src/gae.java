public class gae extends gag<ccv, fkz<ccv>> {
   private static final ahh a = new ahh("textures/entity/slime/magmacube.png");

   public gae(fza.a $$0) {
      super($$0, new fkz<>($$0.a(fni.aw)), 0.25F);
   }

   protected int a(ccv $$0, hx $$1) {
      return 15;
   }

   public ahh a(ccv $$0) {
      return a;
   }

   public void a(ccv $$0, float $$1, float $$2, eqk $$3, ftt $$4, int $$5) {
      this.d = 0.25F * (float)$$0.gg();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(ccv $$0, eqk $$1, float $$2) {
      int $$3 = $$0.gg();
      float $$4 = aup.i($$2, $$0.bT, $$0.e) / ((float)$$3 * 0.5F + 1.0F);
      float $$5 = 1.0F / ($$4 + 1.0F);
      $$1.b($$5 * (float)$$3, 1.0F / $$5 * (float)$$3, $$5 * (float)$$3);
   }
}
