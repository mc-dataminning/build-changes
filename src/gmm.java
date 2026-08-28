public class gmm extends gku<clp, fxc<clp>> {
   private static final akk a = new akk("textures/entity/warden/warden.png");
   private static final akk i = new akk("textures/entity/warden/warden_bioluminescent_layer.png");
   private static final akk j = new akk("textures/entity/warden/warden_heart.png");
   private static final akk k = new akk("textures/entity/warden/warden_pulsating_spots_1.png");
   private static final akk l = new akk("textures/entity/warden/warden_pulsating_spots_2.png");

   public gmm(gjo.a $$0) {
      super($$0, new fxc<>($$0.a(fxp.bR)), 0.9F);
      this.a(new gom<>(this, i, ($$0x, $$1, $$2) -> 1.0F, fxc::e));
      this.a(new gom<>(this, k, ($$0x, $$1, $$2) -> Math.max(0.0F, ayg.b($$2 * 0.045F) * 0.25F), fxc::f));
      this.a(new gom<>(this, l, ($$0x, $$1, $$2) -> Math.max(0.0F, ayg.b($$2 * 0.045F + (float) Math.PI) * 0.25F), fxc::f));
      this.a(new gom<>(this, a, ($$0x, $$1, $$2) -> $$0x.H($$1), fxc::c));
      this.a(new gom<>(this, j, ($$0x, $$1, $$2) -> $$0x.I($$1), fxc::d));
   }

   public akk a(clp $$0) {
      return a;
   }
}
