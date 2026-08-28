public class grv extends gqw<cll, hba, gbv> {
   private static final akv a = akv.b("textures/entity/zombie/drowned.png");

   public grv(gsd.a $$0) {
      super($$0, new gbv($$0.a(gfb.aw)), new gbv($$0.a(gfb.ax)), new gbv($$0.a(gfb.aB)), new gbv($$0.a(gfb.aC)), new gbv($$0.a(gfb.ay)), new gbv($$0.a(gfb.az)));
      this.a(new gvz(this, $$0.f()));
   }

   public hba a() {
      return new hba();
   }

   @Override
   public akv a(hba $$0) {
      return a;
   }

   protected void a(hba $$0, fft $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = $$0.G;
      if ($$4 > 0.0F) {
         float $$5 = -10.0F - $$0.ab;
         float $$6 = ayz.h($$4, 0.0F, $$5);
         $$1.a(a.b.rotationDegrees($$6), 0.0F, $$0.w / 2.0F / $$3, 0.0F);
      }
   }

   protected gcn.a a(cll $$0, bva $$1) {
      cwo $$2 = $$0.a($$1);
      return $$0.fy() == $$1 && $$0.gh() && $$2.a(cws.wS) ? gcn.a.e : gcn.a.a;
   }
}
