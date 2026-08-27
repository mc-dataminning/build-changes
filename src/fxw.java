public class fxw extends fyu<bxs, fja<bxs>> {
   private static final agt a = new agt("textures/entity/fox/fox.png");
   private static final agt i = new agt("textures/entity/fox/fox_sleep.png");
   private static final agt j = new agt("textures/entity/fox/snow_fox.png");
   private static final agt k = new agt("textures/entity/fox/snow_fox_sleep.png");

   public fxw(fxo.a $$0) {
      super($$0, new fja<>($$0.a(flx.aa)), 0.4F);
      this.a(new gbm(this, $$0.d()));
   }

   protected void a(bxs $$0, epd $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$0.gk() || $$0.ge()) {
         float $$5 = -aty.i($$4, $$0.O, $$0.dE());
         $$1.a(a.b.rotationDegrees($$5));
      }
   }

   public agt a(bxs $$0) {
      if ($$0.w() == bxs.v.a) {
         return $$0.fD() ? i : a;
      } else {
         return $$0.fD() ? k : j;
      }
   }
}
