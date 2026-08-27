public class fxz extends fxd<cbr, fjn<cbr>> {
   private static final agi a = new agi("textures/entity/slime/slime.png");

   public fxz(fvx.a $$0) {
      super($$0, new fjn<>($$0.a(fkn.bm)), 0.25F);
      this.a(new gaj<>(this, $$0.f()));
   }

   public void a(cbr $$0, float $$1, float $$2, enw $$3, fqu $$4, int $$5) {
      this.d = 0.25F * (float)$$0.gg();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(cbr $$0, enw $$1, float $$2) {
      float $$3 = 0.999F;
      $$1.b(0.999F, 0.999F, 0.999F);
      $$1.a(0.0F, 0.001F, 0.0F);
      float $$4 = (float)$$0.gg();
      float $$5 = atm.i($$2, $$0.bS, $$0.e) / ($$4 * 0.5F + 1.0F);
      float $$6 = 1.0F / ($$5 + 1.0F);
      $$1.b($$6 * $$4, 1.0F / $$6 * $$4, $$6 * $$4);
   }

   public agi a(cbr $$0) {
      return a;
   }
}
