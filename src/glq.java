public class glq extends gjy<clw, fwh<clw>> {
   private static final alb a = new alb("textures/entity/warden/warden.png");
   private static final alb i = new alb("textures/entity/warden/warden_bioluminescent_layer.png");
   private static final alb j = new alb("textures/entity/warden/warden_heart.png");
   private static final alb k = new alb("textures/entity/warden/warden_pulsating_spots_1.png");
   private static final alb l = new alb("textures/entity/warden/warden_pulsating_spots_2.png");

   public glq(gis.a $$0) {
      super($$0, new fwh<>($$0.a(fwu.bR)), 0.9F);
      this.a(new gnq<>(this, i, ($$0x, $$1, $$2) -> 1.0F, fwh::e));
      this.a(new gnq<>(this, k, ($$0x, $$1, $$2) -> Math.max(0.0F, ayu.b($$2 * 0.045F) * 0.25F), fwh::f));
      this.a(new gnq<>(this, l, ($$0x, $$1, $$2) -> Math.max(0.0F, ayu.b($$2 * 0.045F + (float) Math.PI) * 0.25F), fwh::f));
      this.a(new gnq<>(this, a, ($$0x, $$1, $$2) -> $$0x.G($$1), fwh::c));
      this.a(new gnq<>(this, j, ($$0x, $$1, $$2) -> $$0x.H($$1), fwh::d));
   }

   public alb a(clw $$0) {
      return a;
   }
}
