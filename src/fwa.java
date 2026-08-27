public class fwa extends fuj<cbe, fhk<cbe>> {
   private static final aez a = new aez("textures/entity/warden/warden.png");
   private static final aez i = new aez("textures/entity/warden/warden_bioluminescent_layer.png");
   private static final aez j = new aez("textures/entity/warden/warden_heart.png");
   private static final aez k = new aez("textures/entity/warden/warden_pulsating_spots_1.png");
   private static final aez l = new aez("textures/entity/warden/warden_pulsating_spots_2.png");

   public fwa(ftd.a $$0) {
      super($$0, new fhk<>($$0.a(fhw.bL)), 0.9F);
      this.a(new fxx<>(this, i, ($$0x, $$1, $$2) -> 1.0F, fhk::e));
      this.a(new fxx<>(this, k, ($$0x, $$1, $$2) -> Math.max(0.0F, asb.b($$2 * 0.045F) * 0.25F), fhk::f));
      this.a(new fxx<>(this, l, ($$0x, $$1, $$2) -> Math.max(0.0F, asb.b($$2 * 0.045F + (float) Math.PI) * 0.25F), fhk::f));
      this.a(new fxx<>(this, a, ($$0x, $$1, $$2) -> $$0x.E($$1), fhk::c));
      this.a(new fxx<>(this, j, ($$0x, $$1, $$2) -> $$0x.F($$1), fhk::d));
   }

   public aez a(cbe $$0) {
      return a;
   }
}
