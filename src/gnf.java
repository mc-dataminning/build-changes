public class gnf extends gln<cmb, fxu<cmb>> {
   private static final akr a = akr.b("textures/entity/warden/warden.png");
   private static final akr i = akr.b("textures/entity/warden/warden_bioluminescent_layer.png");
   private static final akr j = akr.b("textures/entity/warden/warden_heart.png");
   private static final akr k = akr.b("textures/entity/warden/warden_pulsating_spots_1.png");
   private static final akr l = akr.b("textures/entity/warden/warden_pulsating_spots_2.png");

   public gnf(gkh.a $$0) {
      super($$0, new fxu<>($$0.a(fyh.bS)), 0.9F);
      this.a(new gpf<>(this, i, ($$0x, $$1, $$2) -> 1.0F, fxu::e));
      this.a(new gpf<>(this, k, ($$0x, $$1, $$2) -> Math.max(0.0F, ayo.b($$2 * 0.045F) * 0.25F), fxu::f));
      this.a(new gpf<>(this, l, ($$0x, $$1, $$2) -> Math.max(0.0F, ayo.b($$2 * 0.045F + (float) Math.PI) * 0.25F), fxu::f));
      this.a(new gpf<>(this, a, ($$0x, $$1, $$2) -> $$0x.H($$1), fxu::c));
      this.a(new gpf<>(this, j, ($$0x, $$1, $$2) -> $$0x.I($$1), fxu::d));
   }

   public akr a(cmb $$0) {
      return a;
   }
}
