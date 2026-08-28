public class gnb extends gmd<cko, gwa, fxf> {
   private static final alc a = alc.b("textures/entity/zombie/drowned.png");

   public gnb(gnj.a $$0) {
      super($$0, new fxf($$0.a(gak.ai)), new fxf($$0.a(gak.am)), new fxf($$0.a(gak.aj)), new fxf($$0.a(gak.ak)), new fxf($$0.a(gak.an)), new fxf($$0.a(gak.ao)));
      this.a(new gre(this, $$0.f()));
   }

   public gwa a() {
      return new gwa();
   }

   @Override
   public alc a(gwa $$0) {
      return a;
   }

   protected void a(gwa $$0, fde $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = $$0.B;
      if ($$4 > 0.0F) {
         float $$5 = -10.0F - $$0.V;
         float $$6 = azd.h($$4, 0.0F, $$5);
         $$1.a(a.b.rotationDegrees($$6), 0.0F, $$0.r / 2.0F / $$3, 0.0F);
      }
   }
}
