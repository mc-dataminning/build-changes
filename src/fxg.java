public class fxg extends fwl<cbn, fiu<cbn>> {
   private static final agt a = new agt("textures/entity/zombie/drowned.png");

   public fxg(fxo.a $$0) {
      super($$0, new fiu<>($$0.a(flx.O)), new fiu<>($$0.a(flx.P)), new fiu<>($$0.a(flx.Q)));
      this.a(new gbh<>(this, $$0.f()));
   }

   @Override
   public agt a(ccs $$0) {
      return a;
   }

   protected void a(cbn $$0, epd $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      float $$5 = $$0.a($$4);
      if ($$5 > 0.0F) {
         float $$6 = -10.0F - $$0.dE();
         float $$7 = aty.i($$5, 0.0F, $$6);
         $$1.a(a.b.rotationDegrees($$7), 0.0F, $$0.dh() / 2.0F, 0.0F);
      }
   }
}
