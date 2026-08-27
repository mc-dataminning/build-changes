public class gak extends fzo<ceb, flx<ceb>> {
   private static final aiy a = new aiy("textures/entity/zombie/drowned.png");

   public gak(gas.a $$0) {
      super($$0, new flx<>($$0.a(fpb.N)), new flx<>($$0.a(fpb.O)), new flx<>($$0.a(fpb.P)));
      this.a(new gel<>(this, $$0.f()));
   }

   @Override
   public aiy a(cfg $$0) {
      return a;
   }

   protected void a(ceb $$0, esa $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = $$0.a($$4);
      if ($$6 > 0.0F) {
         float $$7 = -10.0F - $$0.dE();
         float $$8 = awh.i($$6, 0.0F, $$7);
         $$1.a(a.b.rotationDegrees($$8), 0.0F, $$0.dh() / 2.0F / $$5, 0.0F);
      }
   }
}
