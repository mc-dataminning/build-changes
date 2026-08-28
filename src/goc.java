public class goc extends gne<clf, gxc, fyf> {
   private static final ali a = ali.b("textures/entity/zombie/drowned.png");

   public goc(gok.a $$0) {
      super($$0, new fyf($$0.a(gbl.ai)), new fyf($$0.a(gbl.am)), new fyf($$0.a(gbl.aj)), new fyf($$0.a(gbl.ak)), new fyf($$0.a(gbl.an)), new fyf($$0.a(gbl.ao)));
      this.a(new gsf(this, $$0.f()));
   }

   public gxc a() {
      return new gxc();
   }

   @Override
   public ali a(gxc $$0) {
      return a;
   }

   protected void a(gxc $$0, feb $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = $$0.B;
      if ($$4 > 0.0F) {
         float $$5 = -10.0F - $$0.V;
         float $$6 = azk.h($$4, 0.0F, $$5);
         $$1.a(a.b.rotationDegrees($$6), 0.0F, $$0.r / 2.0F / $$3, 0.0F);
      }
   }
}
