public class gdc extends gde<cff, fnu<cff>> {
   private static final ajc a = new ajc("textures/entity/slime/magmacube.png");

   public gdc(gby.a $$0) {
      super($$0, new fnu<>($$0.a(fqe.aw)), 0.25F);
   }

   protected int a(cff $$0, ib $$1) {
      return 15;
   }

   public ajc a(cff $$0) {
      return a;
   }

   public void a(cff $$0, float $$1, float $$2, etd $$3, fwq $$4, int $$5) {
      this.d = 0.25F * (float)$$0.gm();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(cff $$0, etd $$1, float $$2) {
      int $$3 = $$0.gm();
      float $$4 = awm.i($$2, $$0.bU, $$0.e) / ((float)$$3 * 0.5F + 1.0F);
      float $$5 = 1.0F / ($$4 + 1.0F);
      $$1.b($$5 * (float)$$3, 1.0F / $$5 * (float)$$3, $$5 * (float)$$3);
   }
}
