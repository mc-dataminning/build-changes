public class fvz extends fui<cat, fhk<cat>> {
   private static final aeu a = new aeu("textures/entity/warden/warden.png");
   private static final aeu i = new aeu("textures/entity/warden/warden_bioluminescent_layer.png");
   private static final aeu j = new aeu("textures/entity/warden/warden_heart.png");
   private static final aeu k = new aeu("textures/entity/warden/warden_pulsating_spots_1.png");
   private static final aeu l = new aeu("textures/entity/warden/warden_pulsating_spots_2.png");

   public fvz(ftc.a $$0) {
      super($$0, new fhk<>($$0.a(fhw.bL)), 0.9F);
      this.a(new fxw<>(this, i, ($$0x, $$1, $$2) -> 1.0F, fhk::e));
      this.a(new fxw<>(this, k, ($$0x, $$1, $$2) -> Math.max(0.0F, ars.b($$2 * 0.045F) * 0.25F), fhk::f));
      this.a(new fxw<>(this, l, ($$0x, $$1, $$2) -> Math.max(0.0F, ars.b($$2 * 0.045F + (float) Math.PI) * 0.25F), fhk::f));
      this.a(new fxw<>(this, a, ($$0x, $$1, $$2) -> $$0x.E($$1), fhk::c));
      this.a(new fxw<>(this, j, ($$0x, $$1, $$2) -> $$0x.F($$1), fhk::d));
   }

   public aeu a(cat $$0) {
      return a;
   }
}
