public class gve extends gtl<coa, hax, gep> {
   private static final akv a = akv.b("textures/entity/warden/warden.png");
   private static final akv b = akv.b("textures/entity/warden/warden_bioluminescent_layer.png");
   private static final akv k = akv.b("textures/entity/warden/warden_heart.png");
   private static final akv l = akv.b("textures/entity/warden/warden_pulsating_spots_1.png");
   private static final akv m = akv.b("textures/entity/warden/warden_pulsating_spots_2.png");

   public gve(gsf.a $$0) {
      super($$0, new gep($$0.a(gfd.dx)), 0.9F);
      this.a(new gwn<>(this, b, ($$0x, $$1) -> 1.0F, gep::d, gmj::k, false));
      this.a(new gwn<>(this, l, ($$0x, $$1) -> Math.max(0.0F, ayz.b($$1 * 0.045F) * 0.25F), gep::e, gmj::k, false));
      this.a(new gwn<>(this, m, ($$0x, $$1) -> Math.max(0.0F, ayz.b($$1 * 0.045F + (float) Math.PI) * 0.25F), gep::e, gmj::k, false));
      this.a(new gwn<>(this, a, ($$0x, $$1) -> $$0x.a, gep::b, gmj::k, false));
      this.a(new gwn<>(this, k, ($$0x, $$1) -> $$0x.b, gep::c, gmj::k, false));
   }

   public akv a(hax $$0) {
      return a;
   }

   public hax b() {
      return new hax();
   }

   public void a(coa $$0, hax $$1, float $$2) {
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
