public class gdx extends gcg<cgp, fov<cgp>> {
   private static final aiy a = new aiy("textures/entity/warden/warden.png");
   private static final aiy i = new aiy("textures/entity/warden/warden_bioluminescent_layer.png");
   private static final aiy j = new aiy("textures/entity/warden/warden_heart.png");
   private static final aiy k = new aiy("textures/entity/warden/warden_pulsating_spots_1.png");
   private static final aiy l = new aiy("textures/entity/warden/warden_pulsating_spots_2.png");

   public gdx(gba.a $$0) {
      super($$0, new fov<>($$0.a(fpi.bN)), 0.9F);
      this.a(new gfx<>(this, i, ($$0x, $$1, $$2) -> 1.0F, fov::e));
      this.a(new gfx<>(this, k, ($$0x, $$1, $$2) -> Math.max(0.0F, awi.b($$2 * 0.045F) * 0.25F), fov::f));
      this.a(new gfx<>(this, l, ($$0x, $$1, $$2) -> Math.max(0.0F, awi.b($$2 * 0.045F + (float) Math.PI) * 0.25F), fov::f));
      this.a(new gfx<>(this, a, ($$0x, $$1, $$2) -> $$0x.E($$1), fov::c));
      this.a(new gfx<>(this, j, ($$0x, $$1, $$2) -> $$0x.F($$1), fov::d));
   }

   public aiy a(cgp $$0) {
      return a;
   }
}
