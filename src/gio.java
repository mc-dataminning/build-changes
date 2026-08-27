public class gio extends ggx<cje, fth<cje>> {
   private static final ajv a = new ajv("textures/entity/warden/warden.png");
   private static final ajv i = new ajv("textures/entity/warden/warden_bioluminescent_layer.png");
   private static final ajv j = new ajv("textures/entity/warden/warden_heart.png");
   private static final ajv k = new ajv("textures/entity/warden/warden_pulsating_spots_1.png");
   private static final ajv l = new ajv("textures/entity/warden/warden_pulsating_spots_2.png");

   public gio(gfr.a $$0) {
      super($$0, new fth<>($$0.a(ftu.bR)), 0.9F);
      this.a(new gko<>(this, i, ($$0x, $$1, $$2) -> 1.0F, fth::e));
      this.a(new gko<>(this, k, ($$0x, $$1, $$2) -> Math.max(0.0F, axm.b($$2 * 0.045F) * 0.25F), fth::f));
      this.a(new gko<>(this, l, ($$0x, $$1, $$2) -> Math.max(0.0F, axm.b($$2 * 0.045F + (float) Math.PI) * 0.25F), fth::f));
      this.a(new gko<>(this, a, ($$0x, $$1, $$2) -> $$0x.G($$1), fth::c));
      this.a(new gko<>(this, j, ($$0x, $$1, $$2) -> $$0x.H($$1), fth::d));
   }

   public ajv a(cje $$0) {
      return a;
   }
}
