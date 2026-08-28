public class gro extends gtk<che, gzk, gbq> {
   private static final akv a = akv.b("textures/entity/fish/cod.png");

   public gro(gse.a $$0) {
      super($$0, new gbq($$0.a(gfc.Z)), 0.3F);
   }

   @Override
   public akv b(gzk $$0) {
      return a;
   }

   public gzk a() {
      return new gzk();
   }

   @Override
   protected void a(gzk $$0, ffu $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 4.3F * ayz.a(0.6F * $$0.u);
      $$1.a(a.d.rotationDegrees($$4));
      if (!$$0.ak) {
         $$1.a(0.1F, 0.1F, -0.1F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
