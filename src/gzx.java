public class gzx extends gye<cqp, hfq, gjd> {
   private static final alg a = alg.b("textures/entity/warden/warden.png");
   private static final alg j = alg.b("textures/entity/warden/warden_bioluminescent_layer.png");
   private static final alg k = alg.b("textures/entity/warden/warden_heart.png");
   private static final alg l = alg.b("textures/entity/warden/warden_pulsating_spots_1.png");
   private static final alg m = alg.b("textures/entity/warden/warden_pulsating_spots_2.png");

   public gzx(gwy.a $$0) {
      super($$0, new gjd($$0.a(gjs.dP)), 0.9F);
      this.a(new hbf<>(this, j, ($$0x, $$1) -> 1.0F, gjd::d, grc::k, false));
      this.a(new hbf<>(this, l, ($$0x, $$1) -> Math.max(0.0F, azm.b($$1 * 0.045F) * 0.25F), gjd::e, grc::k, false));
      this.a(new hbf<>(this, m, ($$0x, $$1) -> Math.max(0.0F, azm.b($$1 * 0.045F + (float) Math.PI) * 0.25F), gjd::e, grc::k, false));
      this.a(new hbf<>(this, a, ($$0x, $$1) -> $$0x.a, gjd::b, grc::k, false));
      this.a(new hbf<>(this, k, ($$0x, $$1) -> $$0x.b, gjd::c, grc::k, false));
   }

   public alg a(hfq $$0) {
      return a;
   }

   public hfq b() {
      return new hfq();
   }

   public void a(cqp $$0, hfq $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.b = $$0.K($$2);
      $$1.c.a($$0.a);
      $$1.d.a($$0.b);
      $$1.e.a($$0.c);
      $$1.f.a($$0.d);
      $$1.g.a($$0.bG);
      $$1.h.a($$0.bH);
   }
}
