public class gwl extends gvm<cny, hfp, ggf> {
   private static final alg a = alg.b("textures/entity/zombie/drowned.png");

   public gwl(gwt.a $$0) {
      super($$0, new ggf($$0.a(gjn.aG)), new ggf($$0.a(gjn.aH)), new ggf($$0.a(gjn.aL)), new ggf($$0.a(gjn.aM)), new ggf($$0.a(gjn.aI)), new ggf($$0.a(gjn.aJ)));
      this.a(new hap(this, $$0.f()));
   }

   public hfp a() {
      return new hfp();
   }

   @Override
   public alg a(hfp $$0) {
      return a;
   }

   protected void a(hfp $$0, fjy $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = $$0.G;
      if ($$4 > 0.0F) {
         float $$5 = -10.0F - $$0.ab;
         float $$6 = azm.h($$4, 0.0F, $$5);
         $$1.a(a.b.rotationDegrees($$6), 0.0F, $$0.w / 2.0F / $$3, 0.0F);
      }
   }

   protected ggy.a a(cny $$0, bxa $$1) {
      czk $$2 = $$0.a($$1);
      return $$0.fx() == $$1 && $$0.gk() && $$2.a(czo.xd) ? ggy.a.e : ggy.a.a;
   }
}
