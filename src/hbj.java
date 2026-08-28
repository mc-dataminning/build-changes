public class hbj extends gzq<crc, hhc, gkq> {
   private static final alk a = alk.b("textures/entity/warden/warden.png");
   private static final alk j = alk.b("textures/entity/warden/warden_bioluminescent_layer.png");
   private static final alk k = alk.b("textures/entity/warden/warden_heart.png");
   private static final alk l = alk.b("textures/entity/warden/warden_pulsating_spots_1.png");
   private static final alk m = alk.b("textures/entity/warden/warden_pulsating_spots_2.png");

   public hbj(gyk.a $$0) {
      super($$0, new gkq($$0.a(glf.dP)), 0.9F);
      this.a(new hcr<>(this, j, ($$0x, $$1) -> 1.0F, gkq::d, gsn::k, false));
      this.a(new hcr<>(this, l, ($$0x, $$1) -> Math.max(0.0F, azq.b($$1 * 0.045F) * 0.25F), gkq::e, gsn::k, false));
      this.a(new hcr<>(this, m, ($$0x, $$1) -> Math.max(0.0F, azq.b($$1 * 0.045F + (float) Math.PI) * 0.25F), gkq::e, gsn::k, false));
      this.a(new hcr<>(this, a, ($$0x, $$1) -> $$0x.a, gkq::b, gsn::k, false));
      this.a(new hcr<>(this, k, ($$0x, $$1) -> $$0x.b, gkq::c, gsn::k, false));
   }

   public alk a(hhc $$0) {
      return a;
   }

   public hhc b() {
      return new hhc();
   }

   public void a(crc $$0, hhc $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.b = $$0.K($$2);
      $$1.c.a($$0.a);
      $$1.d.a($$0.b);
      $$1.e.a($$0.c);
      $$1.f.a($$0.d);
      $$1.g.a($$0.e);
      $$1.h.a($$0.f);
   }
}
