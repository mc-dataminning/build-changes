public class hau extends gzb<crl, hgq, gkb> {
   private static final alr a = alr.b("textures/entity/warden/warden.png");
   private static final alr j = alr.b("textures/entity/warden/warden_bioluminescent_layer.png");
   private static final alr k = alr.b("textures/entity/warden/warden_heart.png");
   private static final alr l = alr.b("textures/entity/warden/warden_pulsating_spots_1.png");
   private static final alr m = alr.b("textures/entity/warden/warden_pulsating_spots_2.png");

   public hau(gxv.a $$0) {
      super($$0, new gkb($$0.a(gkq.dP)), 0.9F);
      this.a(new hcc<>(this, j, ($$0x, $$1) -> 1.0F, gkb::d, gry::k, false));
      this.a(new hcc<>(this, l, ($$0x, $$1) -> Math.max(0.0F, azz.b($$1 * 0.045F) * 0.25F), gkb::e, gry::k, false));
      this.a(new hcc<>(this, m, ($$0x, $$1) -> Math.max(0.0F, azz.b($$1 * 0.045F + (float) Math.PI) * 0.25F), gkb::e, gry::k, false));
      this.a(new hcc<>(this, a, ($$0x, $$1) -> $$0x.a, gkb::b, gry::k, false));
      this.a(new hcc<>(this, k, ($$0x, $$1) -> $$0x.b, gkb::c, gry::k, false));
   }

   public alr a(hgq $$0) {
      return a;
   }

   public hgq b() {
      return new hgq();
   }

   public void a(crl $$0, hgq $$1, float $$2) {
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
