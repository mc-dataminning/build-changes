public class gxf extends gzb<cke, hfe, ggz> {
   private static final alr a = alr.b("textures/entity/fish/cod.png");

   public gxf(gxv.a $$0) {
      super($$0, new ggz($$0.a(gkq.ab)), 0.3F);
   }

   @Override
   public alr b(hfe $$0) {
      return a;
   }

   public hfe a() {
      return new hfe();
   }

   @Override
   protected void a(hfe $$0, fld $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 4.3F * azz.a(0.6F * $$0.v);
      $$1.a(a.d.rotationDegrees($$4));
      if (!$$0.an) {
         $$1.a(0.1F, 0.1F, -0.1F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
