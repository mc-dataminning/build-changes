public class gsn extends guj<chv, haj, gco> {
   private static final aku a = aku.b("textures/entity/fish/cod.png");

   public gsn(gtd.a $$0) {
      super($$0, new gco($$0.a(ggb.Z)), 0.3F);
   }

   @Override
   public aku b(haj $$0) {
      return a;
   }

   public haj a() {
      return new haj();
   }

   @Override
   protected void a(haj $$0, fgr $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 4.3F * ayz.a(0.6F * $$0.u);
      $$1.a(a.d.rotationDegrees($$4));
      if (!$$0.ak) {
         $$1.a(0.1F, 0.1F, -0.1F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
