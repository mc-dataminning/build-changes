public class gik extends ghn<cjm, ftr<cjm>> {
   private static final alb a = new alb("textures/entity/zombie/drowned.png");

   public gik(gis.a $$0) {
      super($$0, new ftr<>($$0.a(fwu.R)), new ftr<>($$0.a(fwu.S)), new ftr<>($$0.a(fwu.T)));
      this.a(new gmm<>(this, $$0.f()));
   }

   @Override
   public alb a(ckr $$0) {
      return a;
   }

   protected void a(cjm $$0, ezt $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = $$0.a($$4);
      if ($$6 > 0.0F) {
         float $$7 = -10.0F - $$0.dH();
         float $$8 = ayu.i($$6, 0.0F, $$7);
         $$1.a(a.b.rotationDegrees($$8), 0.0F, $$0.dk() / 2.0F / $$5, 0.0F);
      }
   }
}
