public class gvd extends gtk<cnz, haw, geo> {
   private static final akv a = akv.b("textures/entity/warden/warden.png");
   private static final akv b = akv.b("textures/entity/warden/warden_bioluminescent_layer.png");
   private static final akv k = akv.b("textures/entity/warden/warden_heart.png");
   private static final akv l = akv.b("textures/entity/warden/warden_pulsating_spots_1.png");
   private static final akv m = akv.b("textures/entity/warden/warden_pulsating_spots_2.png");

   public gvd(gse.a $$0) {
      super($$0, new geo($$0.a(gfc.dx)), 0.9F);
      this.a(new gwm<>(this, b, ($$0x, $$1) -> 1.0F, geo::d, gmi::k, false));
      this.a(new gwm<>(this, l, ($$0x, $$1) -> Math.max(0.0F, ayz.b($$1 * 0.045F) * 0.25F), geo::e, gmi::k, false));
      this.a(new gwm<>(this, m, ($$0x, $$1) -> Math.max(0.0F, ayz.b($$1 * 0.045F + (float) Math.PI) * 0.25F), geo::e, gmi::k, false));
      this.a(new gwm<>(this, a, ($$0x, $$1) -> $$0x.a, geo::b, gmi::k, false));
      this.a(new gwm<>(this, k, ($$0x, $$1) -> $$0x.b, geo::c, gmi::k, false));
   }

   public akv a(haw $$0) {
      return a;
   }

   public haw b() {
      return new haw();
   }

   public void a(cnz $$0, haw $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.b = $$0.K($$2);
      $$1.c.a($$0.a);
      $$1.d.a($$0.b);
      $$1.e.a($$0.c);
      $$1.f.a($$0.d);
      $$1.g.a($$0.bY);
      $$1.h.a($$0.bZ);
   }
}
