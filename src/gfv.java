public class gfv extends gee<chw, fqp<chw>> {
   private static final ajh a = new ajh("textures/entity/warden/warden.png");
   private static final ajh i = new ajh("textures/entity/warden/warden_bioluminescent_layer.png");
   private static final ajh j = new ajh("textures/entity/warden/warden_heart.png");
   private static final ajh k = new ajh("textures/entity/warden/warden_pulsating_spots_1.png");
   private static final ajh l = new ajh("textures/entity/warden/warden_pulsating_spots_2.png");

   public gfv(gcy.a $$0) {
      super($$0, new fqp<>($$0.a(frc.bN)), 0.9F);
      this.a(new ghv<>(this, i, ($$0x, $$1, $$2) -> 1.0F, fqp::e));
      this.a(new ghv<>(this, k, ($$0x, $$1, $$2) -> Math.max(0.0F, aww.b($$2 * 0.045F) * 0.25F), fqp::f));
      this.a(new ghv<>(this, l, ($$0x, $$1, $$2) -> Math.max(0.0F, aww.b($$2 * 0.045F + (float) Math.PI) * 0.25F), fqp::f));
      this.a(new ghv<>(this, a, ($$0x, $$1, $$2) -> $$0x.G($$1), fqp::c));
      this.a(new ghv<>(this, j, ($$0x, $$1, $$2) -> $$0x.H($$1), fqp::d));
   }

   public ajh a(chw $$0) {
      return a;
   }
}
