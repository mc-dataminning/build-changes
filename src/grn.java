public class grn extends gtj<chd, gzj, gbp> {
   private static final akv a = akv.b("textures/entity/fish/cod.png");

   public grn(gsd.a $$0) {
      super($$0, new gbp($$0.a(gfb.Z)), 0.3F);
   }

   @Override
   public akv b(gzj $$0) {
      return a;
   }

   public gzj a() {
      return new gzj();
   }

   @Override
   protected void a(gzj $$0, fft $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 4.3F * ayz.a(0.6F * $$0.u);
      $$1.a(a.d.rotationDegrees($$4));
      if (!$$0.ak) {
         $$1.a(0.1F, 0.1F, -0.1F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
