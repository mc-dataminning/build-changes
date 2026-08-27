public class fyz extends fxi<cdd, fkg<cdd>> {
   private static final agm a = new agm("textures/entity/warden/warden.png");
   private static final agm i = new agm("textures/entity/warden/warden_bioluminescent_layer.png");
   private static final agm j = new agm("textures/entity/warden/warden_heart.png");
   private static final agm k = new agm("textures/entity/warden/warden_pulsating_spots_1.png");
   private static final agm l = new agm("textures/entity/warden/warden_pulsating_spots_2.png");

   public fyz(fwc.a $$0) {
      super($$0, new fkg<>($$0.a(fks.bL)), 0.9F);
      this.a(new gaw<>(this, i, ($$0x, $$1, $$2) -> 1.0F, fkg::e));
      this.a(new gaw<>(this, k, ($$0x, $$1, $$2) -> Math.max(0.0F, atq.b($$2 * 0.045F) * 0.25F), fkg::f));
      this.a(new gaw<>(this, l, ($$0x, $$1, $$2) -> Math.max(0.0F, atq.b($$2 * 0.045F + (float) Math.PI) * 0.25F), fkg::f));
      this.a(new gaw<>(this, a, ($$0x, $$1, $$2) -> $$0x.E($$1), fkg::c));
      this.a(new gaw<>(this, j, ($$0x, $$1, $$2) -> $$0x.F($$1), fkg::d));
   }

   public agm a(cdd $$0) {
      return a;
   }
}
