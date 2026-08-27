public class fxa extends fvj<ccb, fij<ccb>> {
   private static final afw a = new afw("textures/entity/warden/warden.png");
   private static final afw i = new afw("textures/entity/warden/warden_bioluminescent_layer.png");
   private static final afw j = new afw("textures/entity/warden/warden_heart.png");
   private static final afw k = new afw("textures/entity/warden/warden_pulsating_spots_1.png");
   private static final afw l = new afw("textures/entity/warden/warden_pulsating_spots_2.png");

   public fxa(fud.a $$0) {
      super($$0, new fij<>($$0.a(fiv.bL)), 0.9F);
      this.a(new fyx<>(this, i, ($$0x, $$1, $$2) -> 1.0F, fij::e));
      this.a(new fyx<>(this, k, ($$0x, $$1, $$2) -> Math.max(0.0F, asy.b($$2 * 0.045F) * 0.25F), fij::f));
      this.a(new fyx<>(this, l, ($$0x, $$1, $$2) -> Math.max(0.0F, asy.b($$2 * 0.045F + (float) Math.PI) * 0.25F), fij::f));
      this.a(new fyx<>(this, a, ($$0x, $$1, $$2) -> $$0x.E($$1), fij::c));
      this.a(new fyx<>(this, j, ($$0x, $$1, $$2) -> $$0x.F($$1), fij::d));
   }

   public afw a(ccb $$0) {
      return a;
   }
}
