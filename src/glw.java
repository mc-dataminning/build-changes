public class glw extends gke<cmc, fwn<cmc>> {
   private static final alf a = new alf("textures/entity/warden/warden.png");
   private static final alf i = new alf("textures/entity/warden/warden_bioluminescent_layer.png");
   private static final alf j = new alf("textures/entity/warden/warden_heart.png");
   private static final alf k = new alf("textures/entity/warden/warden_pulsating_spots_1.png");
   private static final alf l = new alf("textures/entity/warden/warden_pulsating_spots_2.png");

   public glw(giy.a $$0) {
      super($$0, new fwn<>($$0.a(fxa.bR)), 0.9F);
      this.a(new gnw<>(this, i, ($$0x, $$1, $$2) -> 1.0F, fwn::e));
      this.a(new gnw<>(this, k, ($$0x, $$1, $$2) -> Math.max(0.0F, ayz.b($$2 * 0.045F) * 0.25F), fwn::f));
      this.a(new gnw<>(this, l, ($$0x, $$1, $$2) -> Math.max(0.0F, ayz.b($$2 * 0.045F + (float) Math.PI) * 0.25F), fwn::f));
      this.a(new gnw<>(this, a, ($$0x, $$1, $$2) -> $$0x.G($$1), fwn::c));
      this.a(new gnw<>(this, j, ($$0x, $$1, $$2) -> $$0x.H($$1), fwn::d));
   }

   public alf a(cmc $$0) {
      return a;
   }
}
