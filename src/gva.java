public class gva extends gth<cnx, hat, gel> {
   private static final aku a = aku.b("textures/entity/warden/warden.png");
   private static final aku b = aku.b("textures/entity/warden/warden_bioluminescent_layer.png");
   private static final aku k = aku.b("textures/entity/warden/warden_heart.png");
   private static final aku l = aku.b("textures/entity/warden/warden_pulsating_spots_1.png");
   private static final aku m = aku.b("textures/entity/warden/warden_pulsating_spots_2.png");

   public gva(gsb.a $$0) {
      super($$0, new gel($$0.a(gez.dx)), 0.9F);
      this.a(new gwj<>(this, b, ($$0x, $$1) -> 1.0F, gel::d, gmf::k, false));
      this.a(new gwj<>(this, l, ($$0x, $$1) -> Math.max(0.0F, ayy.b($$1 * 0.045F) * 0.25F), gel::e, gmf::k, false));
      this.a(new gwj<>(this, m, ($$0x, $$1) -> Math.max(0.0F, ayy.b($$1 * 0.045F + (float) Math.PI) * 0.25F), gel::e, gmf::k, false));
      this.a(new gwj<>(this, a, ($$0x, $$1) -> $$0x.a, gel::b, gmf::k, false));
      this.a(new gwj<>(this, k, ($$0x, $$1) -> $$0x.b, gel::c, gmf::k, false));
   }

   public aku a(hat $$0) {
      return a;
   }

   public hat b() {
      return new hat();
   }

   public void a(cnx $$0, hat $$1, float $$2) {
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
