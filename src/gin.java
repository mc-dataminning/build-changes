public class gin extends ghq<cjp, ftu<cjp>> {
   private static final ale a = new ale("textures/entity/zombie/drowned.png");

   public gin(giv.a $$0) {
      super($$0, new ftu<>($$0.a(fwx.R)), new ftu<>($$0.a(fwx.S)), new ftu<>($$0.a(fwx.T)));
      this.a(new gmp<>(this, $$0.f()));
   }

   @Override
   public ale a(cku $$0) {
      return a;
   }

   protected void a(cjp $$0, ezw $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = $$0.a($$4);
      if ($$6 > 0.0F) {
         float $$7 = -10.0F - $$0.dH();
         float $$8 = ayx.i($$6, 0.0F, $$7);
         $$1.a(a.b.rotationDegrees($$8), 0.0F, $$0.dk() / 2.0F / $$5, 0.0F);
      }
   }
}
