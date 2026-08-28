public class gwd extends gxz<cji, hdz, gfw> {
   private static final alg a = alg.b("textures/entity/fish/cod.png");

   public gwd(gwt.a $$0) {
      super($$0, new gfw($$0.a(gjn.ab)), 0.3F);
   }

   @Override
   public alg b(hdz $$0) {
      return a;
   }

   public hdz a() {
      return new hdz();
   }

   @Override
   protected void a(hdz $$0, fjy $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 4.3F * azm.a(0.6F * $$0.u);
      $$1.a(a.d.rotationDegrees($$4));
      if (!$$0.ak) {
         $$1.a(0.1F, 0.1F, -0.1F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
