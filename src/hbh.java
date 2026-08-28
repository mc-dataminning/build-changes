public class hbh extends gzo<cra, hha, gko> {
   private static final ali a = ali.b("textures/entity/warden/warden.png");
   private static final ali j = ali.b("textures/entity/warden/warden_bioluminescent_layer.png");
   private static final ali k = ali.b("textures/entity/warden/warden_heart.png");
   private static final ali l = ali.b("textures/entity/warden/warden_pulsating_spots_1.png");
   private static final ali m = ali.b("textures/entity/warden/warden_pulsating_spots_2.png");

   public hbh(gyi.a $$0) {
      super($$0, new gko($$0.a(gld.dP)), 0.9F);
      this.a(new hcp<>(this, j, ($$0x, $$1) -> 1.0F, gko::d, gsl::k, false));
      this.a(new hcp<>(this, l, ($$0x, $$1) -> Math.max(0.0F, azo.b($$1 * 0.045F) * 0.25F), gko::e, gsl::k, false));
      this.a(new hcp<>(this, m, ($$0x, $$1) -> Math.max(0.0F, azo.b($$1 * 0.045F + (float) Math.PI) * 0.25F), gko::e, gsl::k, false));
      this.a(new hcp<>(this, a, ($$0x, $$1) -> $$0x.a, gko::b, gsl::k, false));
      this.a(new hcp<>(this, k, ($$0x, $$1) -> $$0x.b, gko::c, gsl::k, false));
   }

   public ali a(hha $$0) {
      return a;
   }

   public hha b() {
      return new hha();
   }

   public void a(cra $$0, hha $$1, float $$2) {
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
