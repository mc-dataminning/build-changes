public class gbi extends fzr<cel, fmh<cel>> {
   private static final ahg a = new ahg("textures/entity/warden/warden.png");
   private static final ahg i = new ahg("textures/entity/warden/warden_bioluminescent_layer.png");
   private static final ahg j = new ahg("textures/entity/warden/warden_heart.png");
   private static final ahg k = new ahg("textures/entity/warden/warden_pulsating_spots_1.png");
   private static final ahg l = new ahg("textures/entity/warden/warden_pulsating_spots_2.png");

   public gbi(fyl.a $$0) {
      super($$0, new fmh<>($$0.a(fmu.bO)), 0.9F);
      this.a(new gdi<>(this, i, ($$0x, $$1, $$2) -> 1.0F, fmh::e));
      this.a(new gdi<>(this, k, ($$0x, $$1, $$2) -> Math.max(0.0F, aun.b($$2 * 0.045F) * 0.25F), fmh::f));
      this.a(new gdi<>(this, l, ($$0x, $$1, $$2) -> Math.max(0.0F, aun.b($$2 * 0.045F + (float) Math.PI) * 0.25F), fmh::f));
      this.a(new gdi<>(this, a, ($$0x, $$1, $$2) -> $$0x.E($$1), fmh::c));
      this.a(new gdi<>(this, j, ($$0x, $$1, $$2) -> $$0x.F($$1), fmh::d));
   }

   public ahg a(cel $$0) {
      return a;
   }
}
