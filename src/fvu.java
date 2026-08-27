public class fvu extends fud<caq, fhf<caq>> {
   private static final aer a = new aer("textures/entity/warden/warden.png");
   private static final aer i = new aer("textures/entity/warden/warden_bioluminescent_layer.png");
   private static final aer j = new aer("textures/entity/warden/warden_heart.png");
   private static final aer k = new aer("textures/entity/warden/warden_pulsating_spots_1.png");
   private static final aer l = new aer("textures/entity/warden/warden_pulsating_spots_2.png");

   public fvu(fsx.a $$0) {
      super($$0, new fhf<>($$0.a(fhr.bL)), 0.9F);
      this.a(new fxr<>(this, i, ($$0x, $$1, $$2) -> 1.0F, fhf::e));
      this.a(new fxr<>(this, k, ($$0x, $$1, $$2) -> Math.max(0.0F, arp.b($$2 * 0.045F) * 0.25F), fhf::f));
      this.a(new fxr<>(this, l, ($$0x, $$1, $$2) -> Math.max(0.0F, arp.b($$2 * 0.045F + (float) Math.PI) * 0.25F), fhf::f));
      this.a(new fxr<>(this, a, ($$0x, $$1, $$2) -> $$0x.E($$1), fhf::c));
      this.a(new fxr<>(this, j, ($$0x, $$1, $$2) -> $$0x.F($$1), fhf::d));
   }

   public aer a(caq $$0) {
      return a;
   }
}
