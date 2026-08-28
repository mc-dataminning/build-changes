public class gxs extends gzo<cjt, hfp, ghm> {
   private static final ali a = ali.b("textures/entity/fish/cod.png");

   public gxs(gyi.a $$0) {
      super($$0, new ghm($$0.a(gld.ab)), 0.3F);
   }

   @Override
   public ali b(hfp $$0) {
      return a;
   }

   public hfp a() {
      return new hfp();
   }

   @Override
   protected void a(hfp $$0, flo $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 4.3F * azo.a(0.6F * $$0.u);
      $$1.a(a.d.rotationDegrees($$4));
      if (!$$0.ak) {
         $$1.a(0.1F, 0.1F, -0.1F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
