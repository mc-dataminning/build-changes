public class gnv extends gpq<cgx, gvl, fya> {
   private static final ali a = ali.b("textures/entity/fish/cod.png");

   public gnv(gok.a $$0) {
      super($$0, new fya($$0.a(gbl.O)), 0.3F);
   }

   @Override
   public ali b(gvl $$0) {
      return a;
   }

   public gvl a() {
      return new gvl();
   }

   @Override
   protected void a(gvl $$0, feb $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 4.3F * azk.a(0.6F * $$0.p);
      $$1.a(a.d.rotationDegrees($$4));
      if (!$$0.af) {
         $$1.a(0.1F, 0.1F, -0.1F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
