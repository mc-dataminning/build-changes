public class gpq extends gny<cmt, gve, fzm> {
   private static final alb a = alb.b("textures/entity/warden/warden.png");
   private static final alb b = alb.b("textures/entity/warden/warden_bioluminescent_layer.png");
   private static final alb k = alb.b("textures/entity/warden/warden_heart.png");
   private static final alb l = alb.b("textures/entity/warden/warden_pulsating_spots_1.png");
   private static final alb m = alb.b("textures/entity/warden/warden_pulsating_spots_2.png");

   public gpq(gms.a $$0) {
      super($$0, new fzm($$0.a(gaa.cU)), 0.9F);
      this.a(new grq(this, b, ($$0x, $$1) -> 1.0F, fzm::e));
      this.a(new grq(this, l, ($$0x, $$1) -> Math.max(0.0F, azc.b($$1 * 0.045F) * 0.25F), fzm::f));
      this.a(new grq(this, m, ($$0x, $$1) -> Math.max(0.0F, azc.b($$1 * 0.045F + (float) Math.PI) * 0.25F), fzm::f));
      this.a(new grq(this, a, ($$0x, $$1) -> $$0x.a, fzm::c));
      this.a(new grq(this, k, ($$0x, $$1) -> $$0x.b, fzm::d));
   }

   public alb a(gve $$0) {
      return a;
   }

   public gve c() {
      return new gve();
   }

   public void a(cmt $$0, gve $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.b = $$0.K($$2);
      $$1.c.a($$0.b);
      $$1.d.a($$0.c);
      $$1.e.a($$0.d);
      $$1.f.a($$0.e);
      $$1.g.a($$0.bZ);
      $$1.h.a($$0.ca);
   }
}
