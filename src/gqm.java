public class gqm extends gou<cnb, gwa, gab> {
   private static final ale a = ale.b("textures/entity/warden/warden.png");
   private static final ale b = ale.b("textures/entity/warden/warden_bioluminescent_layer.png");
   private static final ale k = ale.b("textures/entity/warden/warden_heart.png");
   private static final ale l = ale.b("textures/entity/warden/warden_pulsating_spots_1.png");
   private static final ale m = ale.b("textures/entity/warden/warden_pulsating_spots_2.png");

   public gqm(gno.a $$0) {
      super($$0, new gab($$0.a(gap.cV)), 0.9F);
      this.a(new gsm(this, b, ($$0x, $$1) -> 1.0F, gab::d));
      this.a(new gsm(this, l, ($$0x, $$1) -> Math.max(0.0F, azf.b($$1 * 0.045F) * 0.25F), gab::h));
      this.a(new gsm(this, m, ($$0x, $$1) -> Math.max(0.0F, azf.b($$1 * 0.045F + (float) Math.PI) * 0.25F), gab::h));
      this.a(new gsm(this, a, ($$0x, $$1) -> $$0x.a, gab::b));
      this.a(new gsm(this, k, ($$0x, $$1) -> $$0x.b, gab::c));
   }

   public ale a(gwa $$0) {
      return a;
   }

   public gwa c() {
      return new gwa();
   }

   public void a(cnb $$0, gwa $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.b = $$0.K($$2);
      $$1.c.a($$0.b);
      $$1.d.a($$0.c);
      $$1.e.a($$0.d);
      $$1.f.a($$0.e);
      $$1.g.a($$0.bY);
      $$1.h.a($$0.bZ);
   }
}
