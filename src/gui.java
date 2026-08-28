public class gui extends gsp<cov, gzy, gds> {
   private static final alz a = alz.b("textures/entity/warden/warden.png");
   private static final alz b = alz.b("textures/entity/warden/warden_bioluminescent_layer.png");
   private static final alz k = alz.b("textures/entity/warden/warden_heart.png");
   private static final alz l = alz.b("textures/entity/warden/warden_pulsating_spots_1.png");
   private static final alz m = alz.b("textures/entity/warden/warden_pulsating_spots_2.png");

   public gui(grj.a $$0) {
      super($$0, new gds($$0.a(geg.dr)), 0.9F);
      this.a(new gvr<>(this, b, ($$0x, $$1) -> 1.0F, gds::d, glo::j));
      this.a(new gvr<>(this, l, ($$0x, $$1) -> Math.max(0.0F, bae.b($$1 * 0.045F) * 0.25F), gds::e, glo::j));
      this.a(new gvr<>(this, m, ($$0x, $$1) -> Math.max(0.0F, bae.b($$1 * 0.045F + (float) Math.PI) * 0.25F), gds::e, glo::j));
      this.a(new gvr<>(this, a, ($$0x, $$1) -> $$0x.a, gds::b, glo::j));
      this.a(new gvr<>(this, k, ($$0x, $$1) -> $$0x.b, gds::c, glo::j));
   }

   public alz a(gzy $$0) {
      return a;
   }

   public gzy b() {
      return new gzy();
   }

   public void a(cov $$0, gzy $$1, float $$2) {
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
