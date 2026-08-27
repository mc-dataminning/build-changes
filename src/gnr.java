public class gnr extends glz<clc, fye<clc>> {
   private static final akt a = new akt("textures/entity/warden/warden.png");
   private static final akt b = new akt("textures/entity/warden/warden_bioluminescent_layer.png");
   private static final akt g = new akt("textures/entity/warden/warden_heart.png");
   private static final akt k = new akt("textures/entity/warden/warden_pulsating_spots_1.png");
   private static final akt l = new akt("textures/entity/warden/warden_pulsating_spots_2.png");

   public gnr(gkq.a $$0) {
      super($$0, new fye<>($$0.a(fyr.bX)), 0.9F);
      this.a(new gpu<>(this, b, ($$0x, $$1, $$2) -> 1.0F, fye::e));
      this.a(new gpu<>(this, k, ($$0x, $$1, $$2) -> Math.max(0.0F, aym.b($$2 * 0.045F) * 0.25F), fye::f));
      this.a(new gpu<>(this, l, ($$0x, $$1, $$2) -> Math.max(0.0F, aym.b($$2 * 0.045F + (float) Math.PI) * 0.25F), fye::f));
      this.a(new gpu<>(this, a, ($$0x, $$1, $$2) -> $$0x.G($$1), fye::c));
      this.a(new gpu<>(this, g, ($$0x, $$1, $$2) -> $$0x.H($$1), fye::d));
   }

   public akt a(clc $$0) {
      return a;
   }
}
