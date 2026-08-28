public class gyj extends gwq<cpv, hea, ghr> {
   private static final ale a = ale.b("textures/entity/warden/warden.png");
   private static final ale j = ale.b("textures/entity/warden/warden_bioluminescent_layer.png");
   private static final ale k = ale.b("textures/entity/warden/warden_heart.png");
   private static final ale l = ale.b("textures/entity/warden/warden_pulsating_spots_1.png");
   private static final ale m = ale.b("textures/entity/warden/warden_pulsating_spots_2.png");

   public gyj(gvk.a $$0) {
      super($$0, new ghr($$0.a(gif.dJ)), 0.9F);
      this.a(new gzr<>(this, j, ($$0x, $$1) -> 1.0F, ghr::d, gpn::k, false));
      this.a(new gzr<>(this, l, ($$0x, $$1) -> Math.max(0.0F, azk.b($$1 * 0.045F) * 0.25F), ghr::e, gpn::k, false));
      this.a(new gzr<>(this, m, ($$0x, $$1) -> Math.max(0.0F, azk.b($$1 * 0.045F + (float) Math.PI) * 0.25F), ghr::e, gpn::k, false));
      this.a(new gzr<>(this, a, ($$0x, $$1) -> $$0x.a, ghr::b, gpn::k, false));
      this.a(new gzr<>(this, k, ($$0x, $$1) -> $$0x.b, ghr::c, gpn::k, false));
   }

   public ale a(hea $$0) {
      return a;
   }

   public hea b() {
      return new hea();
   }

   public void a(cpv $$0, hea $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.b = $$0.K($$2);
      $$1.c.a($$0.a);
      $$1.d.a($$0.b);
      $$1.e.a($$0.c);
      $$1.f.a($$0.d);
      $$1.g.a($$0.bF);
      $$1.h.a($$0.bG);
   }
}
