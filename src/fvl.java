public class fvl extends ftu<car, fha<car>> {
   private static final aer a = new aer("textures/entity/warden/warden.png");
   private static final aer i = new aer("textures/entity/warden/warden_bioluminescent_layer.png");
   private static final aer j = new aer("textures/entity/warden/warden_heart.png");
   private static final aer k = new aer("textures/entity/warden/warden_pulsating_spots_1.png");
   private static final aer l = new aer("textures/entity/warden/warden_pulsating_spots_2.png");

   public fvl(fso.a $$0) {
      super($$0, new fha<>($$0.a(fhm.bL)), 0.9F);
      this.a(new fxi<>(this, i, ($$0x, $$1, $$2) -> 1.0F, fha::e));
      this.a(new fxi<>(this, k, ($$0x, $$1, $$2) -> Math.max(0.0F, arp.b($$2 * 0.045F) * 0.25F), fha::f));
      this.a(new fxi<>(this, l, ($$0x, $$1, $$2) -> Math.max(0.0F, arp.b($$2 * 0.045F + (float) Math.PI) * 0.25F), fha::f));
      this.a(new fxi<>(this, a, ($$0x, $$1, $$2) -> $$0x.E($$1), fha::c));
      this.a(new fxi<>(this, j, ($$0x, $$1, $$2) -> $$0x.F($$1), fha::d));
   }

   public aer a(car $$0) {
      return a;
   }
}
