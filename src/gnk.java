public class gnk extends gpf<cgs, gva, fxp> {
   private static final alh a = alh.b("textures/entity/fish/cod.png");

   public gnk(gnz.a $$0) {
      super($$0, new fxp($$0.a(gba.O)), 0.3F);
   }

   @Override
   public alh b(gva $$0) {
      return a;
   }

   public gva a() {
      return new gva();
   }

   @Override
   protected void a(gva $$0, fdt $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 4.3F * azj.a(0.6F * $$0.p);
      $$1.a(a.d.rotationDegrees($$4));
      if (!$$0.af) {
         $$1.a(0.1F, 0.1F, -0.1F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
