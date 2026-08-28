public class grw extends gqx<clm, hbb, gbw> {
   private static final akv a = akv.b("textures/entity/zombie/drowned.png");

   public grw(gse.a $$0) {
      super($$0, new gbw($$0.a(gfc.aw)), new gbw($$0.a(gfc.ax)), new gbw($$0.a(gfc.aB)), new gbw($$0.a(gfc.aC)), new gbw($$0.a(gfc.ay)), new gbw($$0.a(gfc.az)));
      this.a(new gwa(this, $$0.f()));
   }

   public hbb a() {
      return new hbb();
   }

   @Override
   public akv a(hbb $$0) {
      return a;
   }

   protected void a(hbb $$0, ffu $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = $$0.G;
      if ($$4 > 0.0F) {
         float $$5 = -10.0F - $$0.ab;
         float $$6 = ayz.h($$4, 0.0F, $$5);
         $$1.a(a.b.rotationDegrees($$6), 0.0F, $$0.w / 2.0F / $$3, 0.0F);
      }
   }

   protected gco.a a(clm $$0, bvb $$1) {
      cwp $$2 = $$0.a($$1);
      return $$0.fy() == $$1 && $$0.gh() && $$2.a(cwt.wS) ? gco.a.e : gco.a.a;
   }
}
