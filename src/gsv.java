public class gsv extends grw<cmg, hca, gcv> {
   private static final aku a = aku.b("textures/entity/zombie/drowned.png");

   public gsv(gtd.a $$0) {
      super($$0, new gcv($$0.a(ggb.ay)), new gcv($$0.a(ggb.az)), new gcv($$0.a(ggb.aD)), new gcv($$0.a(ggb.aE)), new gcv($$0.a(ggb.aA)), new gcv($$0.a(ggb.aB)));
      this.a(new gwz(this, $$0.f()));
   }

   public hca a() {
      return new hca();
   }

   @Override
   public aku a(hca $$0) {
      return a;
   }

   protected void a(hca $$0, fgr $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = $$0.G;
      if ($$4 > 0.0F) {
         float $$5 = -10.0F - $$0.ab;
         float $$6 = ayz.h($$4, 0.0F, $$5);
         $$1.a(a.b.rotationDegrees($$6), 0.0F, $$0.w / 2.0F / $$3, 0.0F);
      }
   }

   protected gdn.a a(cmg $$0, bvr $$1) {
      cxh $$2 = $$0.a($$1);
      return $$0.fA() == $$1 && $$0.gj() && $$2.a(cxl.wU) ? gdn.a.e : gdn.a.a;
   }
}
