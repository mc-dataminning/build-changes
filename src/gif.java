public class gif extends ggo<cix, fsy<cix>> {
   private static final ajt a = new ajt("textures/entity/warden/warden.png");
   private static final ajt i = new ajt("textures/entity/warden/warden_bioluminescent_layer.png");
   private static final ajt j = new ajt("textures/entity/warden/warden_heart.png");
   private static final ajt k = new ajt("textures/entity/warden/warden_pulsating_spots_1.png");
   private static final ajt l = new ajt("textures/entity/warden/warden_pulsating_spots_2.png");

   public gif(gfi.a $$0) {
      super($$0, new fsy<>($$0.a(ftl.bR)), 0.9F);
      this.a(new gkf<>(this, i, ($$0x, $$1, $$2) -> 1.0F, fsy::e));
      this.a(new gkf<>(this, k, ($$0x, $$1, $$2) -> Math.max(0.0F, axk.b($$2 * 0.045F) * 0.25F), fsy::f));
      this.a(new gkf<>(this, l, ($$0x, $$1, $$2) -> Math.max(0.0F, axk.b($$2 * 0.045F + (float) Math.PI) * 0.25F), fsy::f));
      this.a(new gkf<>(this, a, ($$0x, $$1, $$2) -> $$0x.G($$1), fsy::c));
      this.a(new gkf<>(this, j, ($$0x, $$1, $$2) -> $$0x.H($$1), fsy::d));
   }

   public ajt a(cix $$0) {
      return a;
   }
}
