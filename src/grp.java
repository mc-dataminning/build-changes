public class grp extends gtl<chf, gzl, gbr> {
   private static final akv a = akv.b("textures/entity/fish/cod.png");

   public grp(gsf.a $$0) {
      super($$0, new gbr($$0.a(gfd.Z)), 0.3F);
   }

   @Override
   public akv b(gzl $$0) {
      return a;
   }

   public gzl a() {
      return new gzl();
   }

   @Override
   protected void a(gzl $$0, ffv $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 4.3F * ayz.a(0.6F * $$0.u);
      $$1.a(a.d.rotationDegrees($$4));
      if (!$$0.ak) {
         $$1.a(0.1F, 0.1F, -0.1F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
