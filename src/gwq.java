public class gwq extends gvr<cob, hfv, ggk> {
   private static final alg a = alg.b("textures/entity/zombie/drowned.png");

   public gwq(gwy.a $$0) {
      super($$0, new ggk($$0.a(gjs.aG)), new ggk($$0.a(gjs.aH)), new ggk($$0.a(gjs.aL)), new ggk($$0.a(gjs.aM)), new ggk($$0.a(gjs.aI)), new ggk($$0.a(gjs.aJ)));
      this.a(new hau(this, $$0.f()));
   }

   public hfv a() {
      return new hfv();
   }

   @Override
   public alg a(hfv $$0) {
      return a;
   }

   protected void a(hfv $$0, fkd $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = $$0.G;
      if ($$4 > 0.0F) {
         float $$5 = -10.0F - $$0.ab;
         float $$6 = azm.h($$4, 0.0F, $$5);
         $$1.a(a.b.rotationDegrees($$6), 0.0F, $$0.w / 2.0F / $$3, 0.0F);
      }
   }

   protected ghd.a a(cob $$0, bxa $$1) {
      czn $$2 = $$0.a($$1);
      return $$0.fx() == $$1 && $$0.gk() && $$2.a(czr.xd) ? ghd.a.e : ghd.a.a;
   }
}
