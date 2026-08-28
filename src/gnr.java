public class gnr extends gmt<cla, gwr, fxu> {
   private static final alh a = alh.b("textures/entity/zombie/drowned.png");

   public gnr(gnz.a $$0) {
      super($$0, new fxu($$0.a(gba.ai)), new fxu($$0.a(gba.am)), new fxu($$0.a(gba.aj)), new fxu($$0.a(gba.ak)), new fxu($$0.a(gba.an)), new fxu($$0.a(gba.ao)));
      this.a(new gru(this, $$0.f()));
   }

   public gwr a() {
      return new gwr();
   }

   @Override
   public alh a(gwr $$0) {
      return a;
   }

   protected void a(gwr $$0, fdt $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = $$0.B;
      if ($$4 > 0.0F) {
         float $$5 = -10.0F - $$0.V;
         float $$6 = azj.h($$4, 0.0F, $$5);
         $$1.a(a.b.rotationDegrees($$6), 0.0F, $$0.r / 2.0F / $$3, 0.0F);
      }
   }
}
