public class fyf extends fxk<ccd, fjt<ccd>> {
   private static final ahg a = new ahg("textures/entity/zombie/drowned.png");

   public fyf(fyn.a $$0) {
      super($$0, new fjt<>($$0.a(fmw.O)), new fjt<>($$0.a(fmw.P)), new fjt<>($$0.a(fmw.Q)));
      this.a(new gcg<>(this, $$0.f()));
   }

   @Override
   public ahg a(cdi $$0) {
      return a;
   }

   protected void a(ccd $$0, eqb $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      float $$5 = $$0.a($$4);
      if ($$5 > 0.0F) {
         float $$6 = -10.0F - $$0.dE();
         float $$7 = auo.i($$5, 0.0F, $$6);
         $$1.a(a.b.rotationDegrees($$7), 0.0F, $$0.dh() / 2.0F, 0.0F);
      }
   }
}
