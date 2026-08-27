public class gki extends gjk<ciq, fvm<ciq>> {
   private static final akt a = new akt("textures/entity/zombie/drowned.png");

   public gki(gkq.a $$0) {
      super($$0, new fvm<>($$0.a(fyr.S)), new fvm<>($$0.a(fyr.T)), new fvm<>($$0.a(fyr.U)));
      this.a(new gon<>(this, $$0.f()));
   }

   @Override
   public akt a(cjx $$0) {
      return a;
   }

   protected void a(ciq $$0, fbc $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = $$0.a($$4);
      if ($$6 > 0.0F) {
         float $$7 = -10.0F - $$0.dM();
         float $$8 = aym.i($$6, 0.0F, $$7);
         $$1.a(a.b.rotationDegrees($$8), 0.0F, $$0.dp() / 2.0F / $$5, 0.0F);
      }
   }
}
