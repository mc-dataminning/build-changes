public class fvj extends fxd<bwx, fhf<bwx>> {
   private static final agi a = new agi("textures/entity/fish/cod.png");

   public fvj(fvx.a $$0) {
      super($$0, new fhf<>($$0.a(fkn.u)), 0.3F);
   }

   public agi a(bwx $$0) {
      return a;
   }

   protected void a(bwx $$0, enw $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      float $$5 = 4.3F * atm.a(0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$5));
      if (!$$0.aZ()) {
         $$1.a(0.1F, 0.1F, -0.1F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
