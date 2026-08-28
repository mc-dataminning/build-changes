public class gha extends gic<hdz> {
   private final glg a;
   private final glg b;
   private final glg c;
   private final glg d;
   private final glg e;
   private final glg f;
   private final glg g;

   public gha(glg $$0) {
      super($$0, gsn::f);
      this.b = $$0.b("body");
      this.a = $$0.b("head");
      this.c = this.b.b("right_wing");
      this.e = this.c.b("right_wing_tip");
      this.d = this.b.b("left_wing");
      this.f = this.d.b("left_wing_tip");
      this.g = this.b.b("feet");
   }

   public static glm a() {
      glo $$0 = new glo();
      glq $$1 = $$0.a();
      glq $$2 = $$1.a("body", gll.c().a(0, 0).a(-1.5F, 0.0F, -1.0F, 3.0F, 5.0F, 2.0F), gli.a(0.0F, 17.0F, 0.0F));
      glq $$3 = $$1.a("head", gll.c().a(0, 7).a(-2.0F, -3.0F, -1.0F, 4.0F, 3.0F, 2.0F), gli.a(0.0F, 17.0F, 0.0F));
      $$3.a("right_ear", gll.c().a(1, 15).a(-2.5F, -4.0F, 0.0F, 3.0F, 5.0F, 0.0F), gli.a(-1.5F, -2.0F, 0.0F));
      $$3.a("left_ear", gll.c().a(8, 15).a(-0.1F, -3.0F, 0.0F, 3.0F, 5.0F, 0.0F), gli.a(1.1F, -3.0F, 0.0F));
      glq $$4 = $$2.a("right_wing", gll.c().a(12, 0).a(-2.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), gli.a(-1.5F, 0.0F, 0.0F));
      $$4.a("right_wing_tip", gll.c().a(16, 0).a(-6.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), gli.a(-2.0F, 0.0F, 0.0F));
      glq $$5 = $$2.a("left_wing", gll.c().a(12, 7).a(0.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), gli.a(1.5F, 0.0F, 0.0F));
      $$5.a("left_wing_tip", gll.c().a(16, 8).a(0.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), gli.a(2.0F, 0.0F, 0.0F));
      $$2.a("feet", gll.c().a(16, 16).a(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 0.0F), gli.a(0.0F, 5.0F, 0.0F));
      return glm.a($$0, 32, 32);
   }

   public void a(hdz $$0) {
      super.a($$0);
      if ($$0.a) {
         this.a($$0.aa);
      }

      this.a($$0.b, frx.b, $$0.u, 1.0F);
      this.a($$0.c, frx.a, $$0.u, 1.0F);
   }

   private void a(float $$0) {
      this.a.f = $$0 * (float) (Math.PI / 180.0);
   }
}
