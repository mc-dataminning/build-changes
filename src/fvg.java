public class fvg extends ftp<cap, fgw<cap>> {
   private static final aep a = new aep("textures/entity/warden/warden.png");
   private static final aep i = new aep("textures/entity/warden/warden_bioluminescent_layer.png");
   private static final aep j = new aep("textures/entity/warden/warden_heart.png");
   private static final aep k = new aep("textures/entity/warden/warden_pulsating_spots_1.png");
   private static final aep l = new aep("textures/entity/warden/warden_pulsating_spots_2.png");

   public fvg(fsj.a $$0) {
      super($$0, new fgw<>($$0.a(fhi.bL)), 0.9F);
      this.a(new fxd<>(this, i, ($$0x, $$1, $$2) -> 1.0F, fgw::e));
      this.a(new fxd<>(this, k, ($$0x, $$1, $$2) -> Math.max(0.0F, aro.b($$2 * 0.045F) * 0.25F), fgw::f));
      this.a(new fxd<>(this, l, ($$0x, $$1, $$2) -> Math.max(0.0F, aro.b($$2 * 0.045F + (float) Math.PI) * 0.25F), fgw::f));
      this.a(new fxd<>(this, a, ($$0x, $$1, $$2) -> $$0x.E($$1), fgw::c));
      this.a(new fxd<>(this, j, ($$0x, $$1, $$2) -> $$0x.F($$1), fgw::d));
   }

   public aep a(cap $$0) {
      return a;
   }
}
