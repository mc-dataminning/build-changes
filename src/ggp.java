public class ggp extends gfs<cib, frx<cib>> {
   private static final akh a = new akh("textures/entity/zombie/drowned.png");

   public ggp(ggx.a $$0) {
      super($$0, new frx<>($$0.a(fva.R)), new frx<>($$0.a(fva.S)), new frx<>($$0.a(fva.T)));
      this.a(new gkq<>(this, $$0.f()));
   }

   @Override
   public akh a(cjg $$0) {
      return a;
   }

   protected void a(cib $$0, exx $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = $$0.a($$4);
      if ($$6 > 0.0F) {
         float $$7 = -10.0F - $$0.dF();
         float $$8 = axz.i($$6, 0.0F, $$7);
         $$1.a(a.b.rotationDegrees($$8), 0.0F, $$0.di() / 2.0F / $$5, 0.0F);
      }
   }
}
