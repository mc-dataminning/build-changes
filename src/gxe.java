public class gxe extends gvl<cpl, hcv, ggo> {
   private static final ald a = ald.b("textures/entity/warden/warden.png");
   private static final ald j = ald.b("textures/entity/warden/warden_bioluminescent_layer.png");
   private static final ald k = ald.b("textures/entity/warden/warden_heart.png");
   private static final ald l = ald.b("textures/entity/warden/warden_pulsating_spots_1.png");
   private static final ald m = ald.b("textures/entity/warden/warden_pulsating_spots_2.png");

   public gxe(guf.a $$0) {
      super($$0, new ggo($$0.a(ghc.dJ)), 0.9F);
      this.a(new gym<>(this, j, ($$0x, $$1) -> 1.0F, ggo::d, goi::k, false));
      this.a(new gym<>(this, l, ($$0x, $$1) -> Math.max(0.0F, azk.b($$1 * 0.045F) * 0.25F), ggo::e, goi::k, false));
      this.a(new gym<>(this, m, ($$0x, $$1) -> Math.max(0.0F, azk.b($$1 * 0.045F + (float) Math.PI) * 0.25F), ggo::e, goi::k, false));
      this.a(new gym<>(this, a, ($$0x, $$1) -> $$0x.a, ggo::b, goi::k, false));
      this.a(new gym<>(this, k, ($$0x, $$1) -> $$0x.b, ggo::c, goi::k, false));
   }

   public ald a(hcv $$0) {
      return a;
   }

   public hcv b() {
      return new hcv();
   }

   public void a(cpl $$0, hcv $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.K($$2);
      $$1.b = $$0.L($$2);
      $$1.c.a($$0.a);
      $$1.d.a($$0.b);
      $$1.e.a($$0.c);
      $$1.f.a($$0.d);
      $$1.g.a($$0.bE);
      $$1.h.a($$0.bF);
   }
}
