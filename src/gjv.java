public class gjv extends giy<cjp, fva<cjp>> {
   private static final akq a = akq.b("textures/entity/zombie/drowned.png");

   public gjv(gkd.a $$0) {
      super($$0, new fva<>($$0.a(fyd.S)), new fva<>($$0.a(fyd.T)), new fva<>($$0.a(fyd.U)));
      this.a(new gnx<>(this, $$0.f()));
   }

   @Override
   public akq a(cku $$0) {
      return a;
   }

   protected void a(cjp $$0, fbc $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = $$0.a($$4);
      if ($$6 > 0.0F) {
         float $$7 = -10.0F - $$0.dI();
         float $$8 = ayn.i($$6, 0.0F, $$7);
         $$1.a(a.b.rotationDegrees($$8), 0.0F, $$0.dl() / 2.0F / $$5, 0.0F);
      }
   }
}
