public class grx extends gqy<cln, hbc, gbx> {
   private static final akv a = akv.b("textures/entity/zombie/drowned.png");

   public grx(gsf.a $$0) {
      super($$0, new gbx($$0.a(gfd.aw)), new gbx($$0.a(gfd.ax)), new gbx($$0.a(gfd.aB)), new gbx($$0.a(gfd.aC)), new gbx($$0.a(gfd.ay)), new gbx($$0.a(gfd.az)));
      this.a(new gwb(this, $$0.f()));
   }

   public hbc a() {
      return new hbc();
   }

   @Override
   public akv a(hbc $$0) {
      return a;
   }

   protected void a(hbc $$0, ffv $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = $$0.G;
      if ($$4 > 0.0F) {
         float $$5 = -10.0F - $$0.ab;
         float $$6 = ayz.h($$4, 0.0F, $$5);
         $$1.a(a.b.rotationDegrees($$6), 0.0F, $$0.w / 2.0F / $$3, 0.0F);
      }
   }

   protected gcp.a a(cln $$0, bvc $$1) {
      cwq $$2 = $$0.a($$1);
      return $$0.fy() == $$1 && $$0.gh() && $$2.a(cwu.wS) ? gcp.a.e : gcp.a.a;
   }
}
