public class gik extends gke<cfm, ftr<cfm>> {
   private static final alf a = new alf("textures/entity/fish/cod.png");

   public gik(giy.a $$0) {
      super($$0, new ftr<>($$0.a(fxa.A)), 0.3F);
   }

   public alf a(cfm $$0) {
      return a;
   }

   protected void a(cfm $$0, ezz $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = 4.3F * ayz.a(0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$6));
      if (!$$0.be()) {
         $$1.a(0.1F, 0.1F, -0.1F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
