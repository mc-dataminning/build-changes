public class gmu extends gop<cgg, guj, fxa> {
   private static final alc a = alc.b("textures/entity/fish/cod.png");

   public gmu(gnj.a $$0) {
      super($$0, new fxa($$0.a(gak.O)), 0.3F);
   }

   public alc b(guj $$0) {
      return a;
   }

   public guj a() {
      return new guj();
   }

   @Override
   protected void a(guj $$0, fde $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 4.3F * azd.a(0.6F * $$0.p);
      $$1.a(a.d.rotationDegrees($$4));
      if (!$$0.af) {
         $$1.a(0.1F, 0.1F, -0.1F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
