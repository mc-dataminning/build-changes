public class gri extends gpq<cnp, gwx, gax> {
   private static final ali a = ali.b("textures/entity/warden/warden.png");
   private static final ali b = ali.b("textures/entity/warden/warden_bioluminescent_layer.png");
   private static final ali k = ali.b("textures/entity/warden/warden_heart.png");
   private static final ali l = ali.b("textures/entity/warden/warden_pulsating_spots_1.png");
   private static final ali m = ali.b("textures/entity/warden/warden_pulsating_spots_2.png");

   public gri(gok.a $$0) {
      super($$0, new gax($$0.a(gbl.cV)), 0.9F);
      this.a(new gti(this, b, ($$0x, $$1) -> 1.0F, gax::d));
      this.a(new gti(this, l, ($$0x, $$1) -> Math.max(0.0F, azk.b($$1 * 0.045F) * 0.25F), gax::h));
      this.a(new gti(this, m, ($$0x, $$1) -> Math.max(0.0F, azk.b($$1 * 0.045F + (float) Math.PI) * 0.25F), gax::h));
      this.a(new gti(this, a, ($$0x, $$1) -> $$0x.a, gax::b));
      this.a(new gti(this, k, ($$0x, $$1) -> $$0x.b, gax::c));
   }

   public ali a(gwx $$0) {
      return a;
   }

   public gwx c() {
      return new gwx();
   }

   public void a(cnp $$0, gwx $$1, float $$2) {
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
