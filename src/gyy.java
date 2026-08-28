public class gyy extends gxf<cqb, heq, gie> {
   private static final alg a = alg.b("textures/entity/warden/warden.png");
   private static final alg j = alg.b("textures/entity/warden/warden_bioluminescent_layer.png");
   private static final alg k = alg.b("textures/entity/warden/warden_heart.png");
   private static final alg l = alg.b("textures/entity/warden/warden_pulsating_spots_1.png");
   private static final alg m = alg.b("textures/entity/warden/warden_pulsating_spots_2.png");

   public gyy(gvz.a $$0) {
      super($$0, new gie($$0.a(git.dL)), 0.9F);
      this.a(new hag<>(this, j, ($$0x, $$1) -> 1.0F, gie::d, gqc::k, false));
      this.a(new hag<>(this, l, ($$0x, $$1) -> Math.max(0.0F, azm.b($$1 * 0.045F) * 0.25F), gie::e, gqc::k, false));
      this.a(new hag<>(this, m, ($$0x, $$1) -> Math.max(0.0F, azm.b($$1 * 0.045F + (float) Math.PI) * 0.25F), gie::e, gqc::k, false));
      this.a(new hag<>(this, a, ($$0x, $$1) -> $$0x.a, gie::b, gqc::k, false));
      this.a(new hag<>(this, k, ($$0x, $$1) -> $$0x.b, gie::c, gqc::k, false));
   }

   public alg a(heq $$0) {
      return a;
   }

   public heq b() {
      return new heq();
   }

   public void a(cqb $$0, heq $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.b = $$0.K($$2);
      $$1.c.a($$0.a);
      $$1.d.a($$0.b);
      $$1.e.a($$0.c);
      $$1.f.a($$0.d);
      $$1.g.a($$0.bF);
      $$1.h.a($$0.bG);
   }
}
