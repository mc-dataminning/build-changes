public class gij extends gkd<cfl, ftq<cfl>> {
   private static final alf a = new alf("textures/entity/fish/cod.png");

   public gij(gix.a $$0) {
      super($$0, new ftq<>($$0.a(fwz.A)), 0.3F);
   }

   public alf a(cfl $$0) {
      return a;
   }

   protected void a(cfl $$0, ezy $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = 4.3F * ayz.a(0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$6));
      if (!$$0.be()) {
         $$1.a(0.1F, 0.1F, -0.1F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
