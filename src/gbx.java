public class gbx extends gag<ceu, fmv<ceu>> {
   private static final ahh a = new ahh("textures/entity/warden/warden.png");
   private static final ahh i = new ahh("textures/entity/warden/warden_bioluminescent_layer.png");
   private static final ahh j = new ahh("textures/entity/warden/warden_heart.png");
   private static final ahh k = new ahh("textures/entity/warden/warden_pulsating_spots_1.png");
   private static final ahh l = new ahh("textures/entity/warden/warden_pulsating_spots_2.png");

   public gbx(fza.a $$0) {
      super($$0, new fmv<>($$0.a(fni.bN)), 0.9F);
      this.a(new gdx<>(this, i, ($$0x, $$1, $$2) -> 1.0F, fmv::e));
      this.a(new gdx<>(this, k, ($$0x, $$1, $$2) -> Math.max(0.0F, aup.b($$2 * 0.045F) * 0.25F), fmv::f));
      this.a(new gdx<>(this, l, ($$0x, $$1, $$2) -> Math.max(0.0F, aup.b($$2 * 0.045F + (float) Math.PI) * 0.25F), fmv::f));
      this.a(new gdx<>(this, a, ($$0x, $$1, $$2) -> $$0x.D($$1), fmv::c));
      this.a(new gdx<>(this, j, ($$0x, $$1, $$2) -> $$0x.E($$1), fmv::d));
   }

   public ahh a(ceu $$0) {
      return a;
   }
}
