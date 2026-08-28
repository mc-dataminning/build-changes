public class gcu extends gct {
   private static final String a = "right_body_stick";
   private static final String b = "left_body_stick";
   private static final String c = "shoulder_stick";
   private static final String d = "base_plate";
   private final ghd e;
   private final ghd f;
   private final ghd g;
   private final ghd x;

   public gcu(ghd $$0) {
      super($$0);
      this.e = $$0.b("right_body_stick");
      this.f = $$0.b("left_body_stick");
      this.g = $$0.b("shoulder_stick");
      this.x = $$0.b("base_plate");
      this.p.k = false;
   }

   public static ghj a() {
      ghl $$0 = geo.a(ghh.a, 0.0F);
      ghn $$1 = $$0.a();
      $$1.a("head", ghi.c().a(0, 0).a(-1.0F, -7.0F, -1.0F, 2.0F, 7.0F, 2.0F), ghf.a(0.0F, 1.0F, 0.0F));
      $$1.a("body", ghi.c().a(0, 26).a(-6.0F, 0.0F, -1.5F, 12.0F, 3.0F, 3.0F), ghf.a);
      $$1.a("right_arm", ghi.c().a(24, 0).a(-2.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), ghf.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", ghi.c().a(32, 16).a().a(0.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), ghf.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", ghi.c().a(8, 0).a(-1.0F, 0.0F, -1.0F, 2.0F, 11.0F, 2.0F), ghf.a(-1.9F, 12.0F, 0.0F));
      $$1.a("left_leg", ghi.c().a(40, 16).a().a(-1.0F, 0.0F, -1.0F, 2.0F, 11.0F, 2.0F), ghf.a(1.9F, 12.0F, 0.0F));
      $$1.a("right_body_stick", ghi.c().a(16, 0).a(-3.0F, 3.0F, -1.0F, 2.0F, 7.0F, 2.0F), ghf.a);
      $$1.a("left_body_stick", ghi.c().a(48, 16).a(1.0F, 3.0F, -1.0F, 2.0F, 7.0F, 2.0F), ghf.a);
      $$1.a("shoulder_stick", ghi.c().a(0, 48).a(-4.0F, 10.0F, -1.0F, 8.0F, 2.0F, 2.0F), ghf.a);
      $$1.a("base_plate", ghi.c().a(0, 32).a(-6.0F, 11.0F, -6.0F, 12.0F, 1.0F, 12.0F), ghf.a(0.0F, 12.0F, 0.0F));
      return ghj.a($$0, 64, 64);
   }

   @Override
   public void a(gzq $$0) {
      super.a($$0);
      this.x.f = (float) (Math.PI / 180.0) * -$$0.a;
      this.s.k = $$0.j;
      this.r.k = $$0.j;
      this.x.k = $$0.k;
      this.e.e = (float) (Math.PI / 180.0) * $$0.m.b();
      this.e.f = (float) (Math.PI / 180.0) * $$0.m.c();
      this.e.g = (float) (Math.PI / 180.0) * $$0.m.d();
      this.f.e = (float) (Math.PI / 180.0) * $$0.m.b();
      this.f.f = (float) (Math.PI / 180.0) * $$0.m.c();
      this.f.g = (float) (Math.PI / 180.0) * $$0.m.d();
      this.g.e = (float) (Math.PI / 180.0) * $$0.m.b();
      this.g.f = (float) (Math.PI / 180.0) * $$0.m.c();
      this.g.g = (float) (Math.PI / 180.0) * $$0.m.d();
   }

   @Override
   public void a(bwk $$0, fho $$1) {
      ghd $$2 = this.a($$0);
      boolean $$3 = $$2.k;
      $$2.k = true;
      super.a($$0, $$1);
      $$2.k = $$3;
   }
}
