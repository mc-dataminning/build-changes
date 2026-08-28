public class gzs extends gxz<cqm, hfk, giy> {
   private static final alg a = alg.b("textures/entity/warden/warden.png");
   private static final alg j = alg.b("textures/entity/warden/warden_bioluminescent_layer.png");
   private static final alg k = alg.b("textures/entity/warden/warden_heart.png");
   private static final alg l = alg.b("textures/entity/warden/warden_pulsating_spots_1.png");
   private static final alg m = alg.b("textures/entity/warden/warden_pulsating_spots_2.png");

   public gzs(gwt.a $$0) {
      super($$0, new giy($$0.a(gjn.dN)), 0.9F);
      this.a(new hba<>(this, j, ($$0x, $$1) -> 1.0F, giy::d, gqx::k, false));
      this.a(new hba<>(this, l, ($$0x, $$1) -> Math.max(0.0F, azm.b($$1 * 0.045F) * 0.25F), giy::e, gqx::k, false));
      this.a(new hba<>(this, m, ($$0x, $$1) -> Math.max(0.0F, azm.b($$1 * 0.045F + (float) Math.PI) * 0.25F), giy::e, gqx::k, false));
      this.a(new hba<>(this, a, ($$0x, $$1) -> $$0x.a, giy::b, gqx::k, false));
      this.a(new hba<>(this, k, ($$0x, $$1) -> $$0x.b, giy::c, gqx::k, false));
   }

   public alg a(hfk $$0) {
      return a;
   }

   public hfk b() {
      return new hfk();
   }

   public void a(cqm $$0, hfk $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.b = $$0.K($$2);
      $$1.c.a($$0.a);
      $$1.d.a($$0.b);
      $$1.e.a($$0.c);
      $$1.f.a($$0.d);
      $$1.g.a($$0.bG);
      $$1.h.a($$0.bH);
   }
}
