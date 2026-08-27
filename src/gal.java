public class gal extends fyu<cdv, flk<cdv>> {
   private static final agt a = new agt("textures/entity/warden/warden.png");
   private static final agt i = new agt("textures/entity/warden/warden_bioluminescent_layer.png");
   private static final agt j = new agt("textures/entity/warden/warden_heart.png");
   private static final agt k = new agt("textures/entity/warden/warden_pulsating_spots_1.png");
   private static final agt l = new agt("textures/entity/warden/warden_pulsating_spots_2.png");

   public gal(fxo.a $$0) {
      super($$0, new flk<>($$0.a(flx.bO)), 0.9F);
      this.a(new gcl<>(this, i, ($$0x, $$1, $$2) -> 1.0F, flk::e));
      this.a(new gcl<>(this, k, ($$0x, $$1, $$2) -> Math.max(0.0F, aty.b($$2 * 0.045F) * 0.25F), flk::f));
      this.a(new gcl<>(this, l, ($$0x, $$1, $$2) -> Math.max(0.0F, aty.b($$2 * 0.045F + (float) Math.PI) * 0.25F), flk::f));
      this.a(new gcl<>(this, a, ($$0x, $$1, $$2) -> $$0x.E($$1), flk::c));
      this.a(new gcl<>(this, j, ($$0x, $$1, $$2) -> $$0x.F($$1), flk::d));
   }

   public agt a(cdv $$0) {
      return a;
   }
}
