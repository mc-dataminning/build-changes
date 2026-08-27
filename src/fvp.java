public class fvp extends fuv<caw, fhl<caw>> {
   private static final agi a = new agi("textures/entity/zombie/drowned.png");

   public fvp(fvx.a $$0) {
      super($$0, new fhl<>($$0.a(fkn.L)), new fhl<>($$0.a(fkn.M)), new fhl<>($$0.a(fkn.N)));
      this.a(new fzn<>(this, $$0.f()));
   }

   @Override
   public agi a(ccb $$0) {
      return a;
   }

   protected void a(caw $$0, enw $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      float $$5 = $$0.a($$4);
      if ($$5 > 0.0F) {
         float $$6 = -10.0F - $$0.dF();
         float $$7 = atm.i($$5, 0.0F, $$6);
         $$1.a(a.b.rotationDegrees($$7), 0.0F, $$0.di() / 2.0F, 0.0F);
      }
   }
}
