public class gev extends gde<che, fpr<che>> {
   private static final ajc a = new ajc("textures/entity/warden/warden.png");
   private static final ajc i = new ajc("textures/entity/warden/warden_bioluminescent_layer.png");
   private static final ajc j = new ajc("textures/entity/warden/warden_heart.png");
   private static final ajc k = new ajc("textures/entity/warden/warden_pulsating_spots_1.png");
   private static final ajc l = new ajc("textures/entity/warden/warden_pulsating_spots_2.png");

   public gev(gby.a $$0) {
      super($$0, new fpr<>($$0.a(fqe.bN)), 0.9F);
      this.a(new ggv<>(this, i, ($$0x, $$1, $$2) -> 1.0F, fpr::e));
      this.a(new ggv<>(this, k, ($$0x, $$1, $$2) -> Math.max(0.0F, awm.b($$2 * 0.045F) * 0.25F), fpr::f));
      this.a(new ggv<>(this, l, ($$0x, $$1, $$2) -> Math.max(0.0F, awm.b($$2 * 0.045F + (float) Math.PI) * 0.25F), fpr::f));
      this.a(new ggv<>(this, a, ($$0x, $$1, $$2) -> $$0x.E($$1), fpr::c));
      this.a(new ggv<>(this, j, ($$0x, $$1, $$2) -> $$0x.F($$1), fpr::d));
   }

   public ajc a(che $$0) {
      return a;
   }
}
