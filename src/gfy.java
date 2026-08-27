public class gfy extends geh<chy, fqr<chy>> {
   private static final ajh a = new ajh("textures/entity/warden/warden.png");
   private static final ajh i = new ajh("textures/entity/warden/warden_bioluminescent_layer.png");
   private static final ajh j = new ajh("textures/entity/warden/warden_heart.png");
   private static final ajh k = new ajh("textures/entity/warden/warden_pulsating_spots_1.png");
   private static final ajh l = new ajh("textures/entity/warden/warden_pulsating_spots_2.png");

   public gfy(gdb.a $$0) {
      super($$0, new fqr<>($$0.a(fre.bR)), 0.9F);
      this.a(new ghy<>(this, i, ($$0x, $$1, $$2) -> 1.0F, fqr::e));
      this.a(new ghy<>(this, k, ($$0x, $$1, $$2) -> Math.max(0.0F, aww.b($$2 * 0.045F) * 0.25F), fqr::f));
      this.a(new ghy<>(this, l, ($$0x, $$1, $$2) -> Math.max(0.0F, aww.b($$2 * 0.045F + (float) Math.PI) * 0.25F), fqr::f));
      this.a(new ghy<>(this, a, ($$0x, $$1, $$2) -> $$0x.G($$1), fqr::c));
      this.a(new ghy<>(this, j, ($$0x, $$1, $$2) -> $$0x.H($$1), fqr::d));
   }

   public ajh a(chy $$0) {
      return a;
   }
}
