public class glv extends gkd<cmb, fwm<cmb>> {
   private static final alf a = new alf("textures/entity/warden/warden.png");
   private static final alf i = new alf("textures/entity/warden/warden_bioluminescent_layer.png");
   private static final alf j = new alf("textures/entity/warden/warden_heart.png");
   private static final alf k = new alf("textures/entity/warden/warden_pulsating_spots_1.png");
   private static final alf l = new alf("textures/entity/warden/warden_pulsating_spots_2.png");

   public glv(gix.a $$0) {
      super($$0, new fwm<>($$0.a(fwz.bR)), 0.9F);
      this.a(new gnv<>(this, i, ($$0x, $$1, $$2) -> 1.0F, fwm::e));
      this.a(new gnv<>(this, k, ($$0x, $$1, $$2) -> Math.max(0.0F, ayz.b($$2 * 0.045F) * 0.25F), fwm::f));
      this.a(new gnv<>(this, l, ($$0x, $$1, $$2) -> Math.max(0.0F, ayz.b($$2 * 0.045F + (float) Math.PI) * 0.25F), fwm::f));
      this.a(new gnv<>(this, a, ($$0x, $$1, $$2) -> $$0x.G($$1), fwm::c));
      this.a(new gnv<>(this, j, ($$0x, $$1, $$2) -> $$0x.H($$1), fwm::d));
   }

   public alf a(cmb $$0) {
      return a;
   }
}
