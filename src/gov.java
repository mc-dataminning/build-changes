public class gov extends gqq<che, gwm, fyz> {
   private static final alj a = alj.b("textures/entity/fish/cod.png");

   public gov(gpk.a $$0) {
      super($$0, new fyz($$0.a(gck.W)), 0.3F);
   }

   @Override
   public alj b(gwm $$0) {
      return a;
   }

   public gwm a() {
      return new gwm();
   }

   @Override
   protected void a(gwm $$0, fer $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 4.3F * azm.a(0.6F * $$0.p);
      $$1.a(a.d.rotationDegrees($$4));
      if (!$$0.af) {
         $$1.a(0.1F, 0.1F, -0.1F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
