public class gfh extends gfg {
   private static final String a = "right_body_stick";
   private static final String b = "left_body_stick";
   private static final String c = "shoulder_stick";
   private static final String d = "base_plate";
   private final gjt e;
   private final gjt f;
   private final gjt g;
   private final gjt x;

   public gfh(gjt $$0) {
      super($$0);
      this.e = $$0.b("right_body_stick");
      this.f = $$0.b("left_body_stick");
      this.g = $$0.b("shoulder_stick");
      this.x = $$0.b("base_plate");
      this.p.k = false;
   }

   public static gjz a() {
      gkb $$0 = ghd.a(gjx.a, 0.0F);
      gkd $$1 = $$0.a();
      $$1.a("head", gjy.c().a(0, 0).a(-1.0F, -7.0F, -1.0F, 2.0F, 7.0F, 2.0F), gjv.a(0.0F, 1.0F, 0.0F));
      $$1.a("body", gjy.c().a(0, 26).a(-6.0F, 0.0F, -1.5F, 12.0F, 3.0F, 3.0F), gjv.a);
      $$1.a("right_arm", gjy.c().a(24, 0).a(-2.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), gjv.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", gjy.c().a(32, 16).a().a(0.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), gjv.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", gjy.c().a(8, 0).a(-1.0F, 0.0F, -1.0F, 2.0F, 11.0F, 2.0F), gjv.a(-1.9F, 12.0F, 0.0F));
      $$1.a("left_leg", gjy.c().a(40, 16).a().a(-1.0F, 0.0F, -1.0F, 2.0F, 11.0F, 2.0F), gjv.a(1.9F, 12.0F, 0.0F));
      $$1.a("right_body_stick", gjy.c().a(16, 0).a(-3.0F, 3.0F, -1.0F, 2.0F, 7.0F, 2.0F), gjv.a);
      $$1.a("left_body_stick", gjy.c().a(48, 16).a(1.0F, 3.0F, -1.0F, 2.0F, 7.0F, 2.0F), gjv.a);
      $$1.a("shoulder_stick", gjy.c().a(0, 48).a(-4.0F, 10.0F, -1.0F, 8.0F, 2.0F, 2.0F), gjv.a);
      $$1.a("base_plate", gjy.c().a(0, 32).a(-6.0F, 11.0F, -6.0F, 12.0F, 1.0F, 12.0F), gjv.a(0.0F, 12.0F, 0.0F));
      return gjz.a($$0, 64, 64);
   }

   @Override
   public void a(hck $$0) {
      super.a($$0);
      this.x.f = (float) (Math.PI / 180.0) * -$$0.a;
      this.s.k = $$0.j;
      this.r.k = $$0.j;
      this.x.k = $$0.k;
      this.e.e = (float) (Math.PI / 180.0) * $$0.m.a();
      this.e.f = (float) (Math.PI / 180.0) * $$0.m.b();
      this.e.g = (float) (Math.PI / 180.0) * $$0.m.c();
      this.f.e = (float) (Math.PI / 180.0) * $$0.m.a();
      this.f.f = (float) (Math.PI / 180.0) * $$0.m.b();
      this.f.g = (float) (Math.PI / 180.0) * $$0.m.c();
      this.g.e = (float) (Math.PI / 180.0) * $$0.m.a();
      this.g.f = (float) (Math.PI / 180.0) * $$0.m.b();
      this.g.g = (float) (Math.PI / 180.0) * $$0.m.c();
   }

   @Override
   public void a(bxa $$0, fkd $$1) {
      gjt $$2 = this.a($$0);
      boolean $$3 = $$2.k;
      $$2.k = true;
      super.a($$0, $$1);
      $$2.k = $$3;
   }
}
