public class fys extends fxw<cck, fkf<cck>> {
   private static final ahh a = new ahh("textures/entity/zombie/drowned.png");

   public fys(fza.a $$0) {
      super($$0, new fkf<>($$0.a(fni.N)), new fkf<>($$0.a(fni.O)), new fkf<>($$0.a(fni.P)));
      this.a(new gct<>(this, $$0.f()));
   }

   @Override
   public ahh a(cdp $$0) {
      return a;
   }

   protected void a(cck $$0, eqk $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      float $$5 = $$0.a($$4);
      if ($$5 > 0.0F) {
         float $$6 = -10.0F - $$0.dD();
         float $$7 = aup.i($$5, 0.0F, $$6);
         $$1.a(a.b.rotationDegrees($$7), 0.0F, $$0.dh() / 2.0F, 0.0F);
      }
   }
}
