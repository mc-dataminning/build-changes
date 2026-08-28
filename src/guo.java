public class guo extends gsv<coz, hae, gdy> {
   private static final alz a = alz.b("textures/entity/warden/warden.png");
   private static final alz b = alz.b("textures/entity/warden/warden_bioluminescent_layer.png");
   private static final alz k = alz.b("textures/entity/warden/warden_heart.png");
   private static final alz l = alz.b("textures/entity/warden/warden_pulsating_spots_1.png");
   private static final alz m = alz.b("textures/entity/warden/warden_pulsating_spots_2.png");

   public guo(grp.a $$0) {
      super($$0, new gdy($$0.a(gem.dr)), 0.9F);
      this.a(new gvx<>(this, b, ($$0x, $$1) -> 1.0F, gdy::d, glu::k));
      this.a(new gvx<>(this, l, ($$0x, $$1) -> Math.max(0.0F, bae.b($$1 * 0.045F) * 0.25F), gdy::e, glu::k));
      this.a(new gvx<>(this, m, ($$0x, $$1) -> Math.max(0.0F, bae.b($$1 * 0.045F + (float) Math.PI) * 0.25F), gdy::e, glu::k));
      this.a(new gvx<>(this, a, ($$0x, $$1) -> $$0x.a, gdy::b, glu::k));
      this.a(new gvx<>(this, k, ($$0x, $$1) -> $$0x.b, gdy::c, glu::k));
   }

   public alz a(hae $$0) {
      return a;
   }

   public hae b() {
      return new hae();
   }

   public void a(coz $$0, hae $$1, float $$2) {
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
