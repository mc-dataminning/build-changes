public class gbj extends fzs<cel, fmi<cel>> {
   private static final ahg a = new ahg("textures/entity/warden/warden.png");
   private static final ahg i = new ahg("textures/entity/warden/warden_bioluminescent_layer.png");
   private static final ahg j = new ahg("textures/entity/warden/warden_heart.png");
   private static final ahg k = new ahg("textures/entity/warden/warden_pulsating_spots_1.png");
   private static final ahg l = new ahg("textures/entity/warden/warden_pulsating_spots_2.png");

   public gbj(fym.a $$0) {
      super($$0, new fmi<>($$0.a(fmv.bO)), 0.9F);
      this.a(new gdj<>(this, i, ($$0x, $$1, $$2) -> 1.0F, fmi::e));
      this.a(new gdj<>(this, k, ($$0x, $$1, $$2) -> Math.max(0.0F, aun.b($$2 * 0.045F) * 0.25F), fmi::f));
      this.a(new gdj<>(this, l, ($$0x, $$1, $$2) -> Math.max(0.0F, aun.b($$2 * 0.045F + (float) Math.PI) * 0.25F), fmi::f));
      this.a(new gdj<>(this, a, ($$0x, $$1, $$2) -> $$0x.E($$1), fmi::c));
      this.a(new gdj<>(this, j, ($$0x, $$1, $$2) -> $$0x.F($$1), fmi::d));
   }

   public ahg a(cel $$0) {
      return a;
   }
}
