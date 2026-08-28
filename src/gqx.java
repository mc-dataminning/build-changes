public class gqx extends gpf<cnk, gwm, gam> {
   private static final alh a = alh.b("textures/entity/warden/warden.png");
   private static final alh b = alh.b("textures/entity/warden/warden_bioluminescent_layer.png");
   private static final alh k = alh.b("textures/entity/warden/warden_heart.png");
   private static final alh l = alh.b("textures/entity/warden/warden_pulsating_spots_1.png");
   private static final alh m = alh.b("textures/entity/warden/warden_pulsating_spots_2.png");

   public gqx(gnz.a $$0) {
      super($$0, new gam($$0.a(gba.cV)), 0.9F);
      this.a(new gsx(this, b, ($$0x, $$1) -> 1.0F, gam::d));
      this.a(new gsx(this, l, ($$0x, $$1) -> Math.max(0.0F, azj.b($$1 * 0.045F) * 0.25F), gam::h));
      this.a(new gsx(this, m, ($$0x, $$1) -> Math.max(0.0F, azj.b($$1 * 0.045F + (float) Math.PI) * 0.25F), gam::h));
      this.a(new gsx(this, a, ($$0x, $$1) -> $$0x.a, gam::b));
      this.a(new gsx(this, k, ($$0x, $$1) -> $$0x.b, gam::c));
   }

   public alh a(gwm $$0) {
      return a;
   }

   public gwm c() {
      return new gwm();
   }

   public void a(cnk $$0, gwm $$1, float $$2) {
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
