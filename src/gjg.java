public class gjg extends gij<cjf, fum<cjf>> {
   private static final akk a = new akk("textures/entity/zombie/drowned.png");

   public gjg(gjo.a $$0) {
      super($$0, new fum<>($$0.a(fxp.R)), new fum<>($$0.a(fxp.S)), new fum<>($$0.a(fxp.T)));
      this.a(new gni<>(this, $$0.f()));
   }

   @Override
   public akk a(ckk $$0) {
      return a;
   }

   protected void a(cjf $$0, fao $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = $$0.a($$4);
      if ($$6 > 0.0F) {
         float $$7 = -10.0F - $$0.dJ();
         float $$8 = ayg.i($$6, 0.0F, $$7);
         $$1.a(a.b.rotationDegrees($$8), 0.0F, $$0.dm() / 2.0F / $$5, 0.0F);
      }
   }
}
