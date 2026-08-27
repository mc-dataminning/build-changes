public class fyd extends fxi<ccc, fjr<ccc>> {
   private static final ahg a = new ahg("textures/entity/zombie/drowned.png");

   public fyd(fyl.a $$0) {
      super($$0, new fjr<>($$0.a(fmu.O)), new fjr<>($$0.a(fmu.P)), new fjr<>($$0.a(fmu.Q)));
      this.a(new gce<>(this, $$0.f()));
   }

   @Override
   public ahg a(cdh $$0) {
      return a;
   }

   protected void a(ccc $$0, epz $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      float $$5 = $$0.a($$4);
      if ($$5 > 0.0F) {
         float $$6 = -10.0F - $$0.dE();
         float $$7 = aun.i($$5, 0.0F, $$6);
         $$1.a(a.b.rotationDegrees($$7), 0.0F, $$0.dh() / 2.0F, 0.0F);
      }
   }
}
