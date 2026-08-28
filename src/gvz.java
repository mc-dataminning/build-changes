public class gvz extends gva<cnr, hfd, gft> {
   private static final alg a = alg.b("textures/entity/zombie/drowned.png");

   public gvz(gwh.a $$0) {
      super($$0, new gft($$0.a(gjb.aG)), new gft($$0.a(gjb.aH)), new gft($$0.a(gjb.aL)), new gft($$0.a(gjb.aM)), new gft($$0.a(gjb.aI)), new gft($$0.a(gjb.aJ)));
      this.a(new had(this, $$0.f()));
   }

   public hfd a() {
      return new hfd();
   }

   @Override
   public alg a(hfd $$0) {
      return a;
   }

   protected void a(hfd $$0, fjj $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = $$0.G;
      if ($$4 > 0.0F) {
         float $$5 = -10.0F - $$0.ab;
         float $$6 = azm.h($$4, 0.0F, $$5);
         $$1.a(a.b.rotationDegrees($$6), 0.0F, $$0.w / 2.0F / $$3, 0.0F);
      }
   }

   protected ggm.a a(cnr $$0, bwx $$1) {
      czd $$2 = $$0.a($$1);
      return $$0.fy() == $$1 && $$0.gi() && $$2.a(czh.xd) ? ggm.a.e : ggm.a.a;
   }
}
