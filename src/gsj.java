public class gsj extends gqq<cnw, gxy, gbw> {
   private static final alj a = alj.b("textures/entity/warden/warden.png");
   private static final alj b = alj.b("textures/entity/warden/warden_bioluminescent_layer.png");
   private static final alj k = alj.b("textures/entity/warden/warden_heart.png");
   private static final alj l = alj.b("textures/entity/warden/warden_pulsating_spots_1.png");
   private static final alj m = alj.b("textures/entity/warden/warden_pulsating_spots_2.png");

   public gsj(gpk.a $$0) {
      super($$0, new gbw($$0.a(gck.do)), 0.9F);
      this.a(new guj(this, b, ($$0x, $$1) -> 1.0F, gbw::d));
      this.a(new guj(this, l, ($$0x, $$1) -> Math.max(0.0F, azm.b($$1 * 0.045F) * 0.25F), gbw::h));
      this.a(new guj(this, m, ($$0x, $$1) -> Math.max(0.0F, azm.b($$1 * 0.045F + (float) Math.PI) * 0.25F), gbw::h));
      this.a(new guj(this, a, ($$0x, $$1) -> $$0x.a, gbw::b));
      this.a(new guj(this, k, ($$0x, $$1) -> $$0x.b, gbw::c));
   }

   public alj a(gxy $$0) {
      return a;
   }

   public gxy b() {
      return new gxy();
   }

   public void a(cnw $$0, gxy $$1, float $$2) {
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
