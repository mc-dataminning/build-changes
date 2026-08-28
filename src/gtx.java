public class gtx extends gsy<cmx, hda, gdv> {
   private static final ald a = ald.b("textures/entity/zombie/drowned.png");

   public gtx(guf.a $$0) {
      super($$0, new gdv($$0.a(ghc.aC)), new gdv($$0.a(ghc.aD)), new gdv($$0.a(ghc.aH)), new gdv($$0.a(ghc.aI)), new gdv($$0.a(ghc.aE)), new gdv($$0.a(ghc.aF)));
      this.a(new gyb(this, $$0.f()));
   }

   public hda a() {
      return new hda();
   }

   @Override
   public ald a(hda $$0) {
      return a;
   }

   protected void a(hda $$0, fho $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = $$0.G;
      if ($$4 > 0.0F) {
         float $$5 = -10.0F - $$0.ab;
         float $$6 = azk.h($$4, 0.0F, $$5);
         $$1.a(a.b.rotationDegrees($$6), 0.0F, $$0.w / 2.0F / $$3, 0.0F);
      }
   }

   protected geo.a a(cmx $$0, bwk $$1) {
      cxy $$2 = $$0.a($$1);
      return $$0.fx() == $$1 && $$0.gh() && $$2.a(cyc.wW) ? geo.a.e : geo.a.a;
   }
}
