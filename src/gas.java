public class gas extends fzw<cef, fme<cef>> {
   private static final aiy a = new aiy("textures/entity/zombie/drowned.png");

   public gas(gba.a $$0) {
      super($$0, new fme<>($$0.a(fpi.N)), new fme<>($$0.a(fpi.O)), new fme<>($$0.a(fpi.P)));
      this.a(new get<>(this, $$0.f()));
   }

   @Override
   public aiy a(cfk $$0) {
      return a;
   }

   protected void a(cef $$0, esh $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = $$0.a($$4);
      if ($$6 > 0.0F) {
         float $$7 = -10.0F - $$0.dE();
         float $$8 = awi.i($$6, 0.0F, $$7);
         $$1.a(a.b.rotationDegrees($$8), 0.0F, $$0.dh() / 2.0F / $$5, 0.0F);
      }
   }
}
