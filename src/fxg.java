public class fxg extends fxi<cbm, fik<cbm>> {
   private static final agm a = new agm("textures/entity/slime/magmacube.png");

   public fxg(fwc.a $$0) {
      super($$0, new fik<>($$0.a(fks.au)), 0.25F);
   }

   protected int a(cbm $$0, hx $$1) {
      return 15;
   }

   public agm a(cbm $$0) {
      return a;
   }

   public void a(cbm $$0, float $$1, float $$2, eob $$3, fqz $$4, int $$5) {
      this.d = 0.25F * (float)$$0.gg();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(cbm $$0, eob $$1, float $$2) {
      int $$3 = $$0.gg();
      float $$4 = atq.i($$2, $$0.bS, $$0.e) / ((float)$$3 * 0.5F + 1.0F);
      float $$5 = 1.0F / ($$4 + 1.0F);
      $$1.b($$5 * (float)$$3, 1.0F / $$5 * (float)$$3, $$5 * (float)$$3);
   }
}
