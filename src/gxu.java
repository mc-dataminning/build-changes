public class gxu extends gzq<cjv, hfr, gho> {
   private static final alk a = alk.b("textures/entity/fish/cod.png");

   public gxu(gyk.a $$0) {
      super($$0, new gho($$0.a(glf.ab)), 0.3F);
   }

   @Override
   public alk b(hfr $$0) {
      return a;
   }

   public hfr a() {
      return new hfr();
   }

   @Override
   protected void a(hfr $$0, flq $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 4.3F * azq.a(0.6F * $$0.u);
      $$1.a(a.d.rotationDegrees($$4));
      if (!$$0.ak) {
         $$1.a(0.1F, 0.1F, -0.1F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
