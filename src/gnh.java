public class gnh extends glp<cmb, fxw<cmb>> {
   private static final akr a = akr.b("textures/entity/warden/warden.png");
   private static final akr i = akr.b("textures/entity/warden/warden_bioluminescent_layer.png");
   private static final akr j = akr.b("textures/entity/warden/warden_heart.png");
   private static final akr k = akr.b("textures/entity/warden/warden_pulsating_spots_1.png");
   private static final akr l = akr.b("textures/entity/warden/warden_pulsating_spots_2.png");

   public gnh(gkj.a $$0) {
      super($$0, new fxw<>($$0.a(fyj.bS)), 0.9F);
      this.a(new gph<>(this, i, ($$0x, $$1, $$2) -> 1.0F, fxw::e));
      this.a(new gph<>(this, k, ($$0x, $$1, $$2) -> Math.max(0.0F, ayo.b($$2 * 0.045F) * 0.25F), fxw::f));
      this.a(new gph<>(this, l, ($$0x, $$1, $$2) -> Math.max(0.0F, ayo.b($$2 * 0.045F + (float) Math.PI) * 0.25F), fxw::f));
      this.a(new gph<>(this, a, ($$0x, $$1, $$2) -> $$0x.H($$1), fxw::c));
      this.a(new gph<>(this, j, ($$0x, $$1, $$2) -> $$0x.I($$1), fxw::d));
   }

   public akr a(cmb $$0) {
      return a;
   }
}
