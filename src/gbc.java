public class gbc extends fzl<cef, fmb<cef>> {
   private static final ahd a = new ahd("textures/entity/warden/warden.png");
   private static final ahd i = new ahd("textures/entity/warden/warden_bioluminescent_layer.png");
   private static final ahd j = new ahd("textures/entity/warden/warden_heart.png");
   private static final ahd k = new ahd("textures/entity/warden/warden_pulsating_spots_1.png");
   private static final ahd l = new ahd("textures/entity/warden/warden_pulsating_spots_2.png");

   public gbc(fyf.a $$0) {
      super($$0, new fmb<>($$0.a(fmo.bO)), 0.9F);
      this.a(new gdc<>(this, i, ($$0x, $$1, $$2) -> 1.0F, fmb::e));
      this.a(new gdc<>(this, k, ($$0x, $$1, $$2) -> Math.max(0.0F, aui.b($$2 * 0.045F) * 0.25F), fmb::f));
      this.a(new gdc<>(this, l, ($$0x, $$1, $$2) -> Math.max(0.0F, aui.b($$2 * 0.045F + (float) Math.PI) * 0.25F), fmb::f));
      this.a(new gdc<>(this, a, ($$0x, $$1, $$2) -> $$0x.E($$1), fmb::c));
      this.a(new gdc<>(this, j, ($$0x, $$1, $$2) -> $$0x.F($$1), fmb::d));
   }

   public ahd a(cef $$0) {
      return a;
   }
}
