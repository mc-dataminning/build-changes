public class fuw extends fwq<bwp, fgs<bwp>> {
   private static final agg a = new agg("textures/entity/fish/cod.png");

   public fuw(fvk.a $$0) {
      super($$0, new fgs<>($$0.a(fka.u)), 0.3F);
   }

   public agg a(bwp $$0) {
      return a;
   }

   protected void a(bwp $$0, enk $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      float $$5 = 4.3F * ati.a(0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$5));
      if (!$$0.aX()) {
         $$1.a(0.1F, 0.1F, -0.1F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
