public class fyu extends fxd<ccy, fkb<ccy>> {
   private static final agi a = new agi("textures/entity/warden/warden.png");
   private static final agi i = new agi("textures/entity/warden/warden_bioluminescent_layer.png");
   private static final agi j = new agi("textures/entity/warden/warden_heart.png");
   private static final agi k = new agi("textures/entity/warden/warden_pulsating_spots_1.png");
   private static final agi l = new agi("textures/entity/warden/warden_pulsating_spots_2.png");

   public fyu(fvx.a $$0) {
      super($$0, new fkb<>($$0.a(fkn.bL)), 0.9F);
      this.a(new gar<>(this, i, ($$0x, $$1, $$2) -> 1.0F, fkb::e));
      this.a(new gar<>(this, k, ($$0x, $$1, $$2) -> Math.max(0.0F, atm.b($$2 * 0.045F) * 0.25F), fkb::f));
      this.a(new gar<>(this, l, ($$0x, $$1, $$2) -> Math.max(0.0F, atm.b($$2 * 0.045F + (float) Math.PI) * 0.25F), fkb::f));
      this.a(new gar<>(this, a, ($$0x, $$1, $$2) -> $$0x.E($$1), fkb::c));
      this.a(new gar<>(this, j, ($$0x, $$1, $$2) -> $$0x.F($$1), fkb::d));
   }

   public agi a(ccy $$0) {
      return a;
   }
}
