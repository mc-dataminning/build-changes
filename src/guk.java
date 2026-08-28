public class guk extends gsr<cor, haa, gdu> {
   private static final alp a = alp.b("textures/entity/warden/warden.png");
   private static final alp b = alp.b("textures/entity/warden/warden_bioluminescent_layer.png");
   private static final alp k = alp.b("textures/entity/warden/warden_heart.png");
   private static final alp l = alp.b("textures/entity/warden/warden_pulsating_spots_1.png");
   private static final alp m = alp.b("textures/entity/warden/warden_pulsating_spots_2.png");

   public guk(grl.a $$0) {
      super($$0, new gdu($$0.a(gei.dx)), 0.9F);
      this.a(new gvt<>(this, b, ($$0x, $$1) -> 1.0F, gdu::d, glq::k));
      this.a(new gvt<>(this, l, ($$0x, $$1) -> Math.max(0.0F, azu.b($$1 * 0.045F) * 0.25F), gdu::e, glq::k));
      this.a(new gvt<>(this, m, ($$0x, $$1) -> Math.max(0.0F, azu.b($$1 * 0.045F + (float) Math.PI) * 0.25F), gdu::e, glq::k));
      this.a(new gvt<>(this, a, ($$0x, $$1) -> $$0x.a, gdu::b, glq::k));
      this.a(new gvt<>(this, k, ($$0x, $$1) -> $$0x.b, gdu::c, glq::k));
   }

   public alp a(haa $$0) {
      return a;
   }

   public haa b() {
      return new haa();
   }

   public void a(cor $$0, haa $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.b = $$0.K($$2);
      $$1.c.a($$0.a);
      $$1.d.a($$0.b);
      $$1.e.a($$0.c);
      $$1.f.a($$0.d);
      $$1.g.a($$0.bZ);
      $$1.h.a($$0.ca);
   }
}
