public class fyi extends fyh {
   private static final String a = "right_body_stick";
   private static final String b = "left_body_stick";
   private static final String c = "shoulder_stick";
   private static final String d = "base_plate";
   private final gcl e;
   private final gcl f;
   private final gcl g;
   private final gcl x;

   public fyi(gcl $$0) {
      super($$0);
      this.e = $$0.b("right_body_stick");
      this.f = $$0.b("left_body_stick");
      this.g = $$0.b("shoulder_stick");
      this.x = $$0.b("base_plate");
      this.p.k = false;
   }

   public static gcr a() {
      gct $$0 = fzw.a(gcp.a, 0.0F);
      gcv $$1 = $$0.a();
      $$1.a("head", gcq.c().a(0, 0).a(-1.0F, -7.0F, -1.0F, 2.0F, 7.0F, 2.0F), gcn.a(0.0F, 1.0F, 0.0F));
      $$1.a("body", gcq.c().a(0, 26).a(-6.0F, 0.0F, -1.5F, 12.0F, 3.0F, 3.0F), gcn.a);
      $$1.a("right_arm", gcq.c().a(24, 0).a(-2.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), gcn.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", gcq.c().a(32, 16).a().a(0.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), gcn.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", gcq.c().a(8, 0).a(-1.0F, 0.0F, -1.0F, 2.0F, 11.0F, 2.0F), gcn.a(-1.9F, 12.0F, 0.0F));
      $$1.a("left_leg", gcq.c().a(40, 16).a().a(-1.0F, 0.0F, -1.0F, 2.0F, 11.0F, 2.0F), gcn.a(1.9F, 12.0F, 0.0F));
      $$1.a("right_body_stick", gcq.c().a(16, 0).a(-3.0F, 3.0F, -1.0F, 2.0F, 7.0F, 2.0F), gcn.a);
      $$1.a("left_body_stick", gcq.c().a(48, 16).a(1.0F, 3.0F, -1.0F, 2.0F, 7.0F, 2.0F), gcn.a);
      $$1.a("shoulder_stick", gcq.c().a(0, 48).a(-4.0F, 10.0F, -1.0F, 8.0F, 2.0F, 2.0F), gcn.a);
      $$1.a("base_plate", gcq.c().a(0, 32).a(-6.0F, 11.0F, -6.0F, 12.0F, 1.0F, 12.0F), gcn.a(0.0F, 12.0F, 0.0F));
      return gcr.a($$0, 64, 64);
   }

   @Override
   public void a(guv $$0) {
      super.a($$0);
      this.x.f = (float) (Math.PI / 180.0) * -$$0.a;
      this.s.k = $$0.e;
      this.r.k = $$0.e;
      this.x.k = $$0.f;
      this.e.e = (float) (Math.PI / 180.0) * $$0.h.b();
      this.e.f = (float) (Math.PI / 180.0) * $$0.h.c();
      this.e.g = (float) (Math.PI / 180.0) * $$0.h.d();
      this.f.e = (float) (Math.PI / 180.0) * $$0.h.b();
      this.f.f = (float) (Math.PI / 180.0) * $$0.h.c();
      this.f.g = (float) (Math.PI / 180.0) * $$0.h.d();
      this.g.e = (float) (Math.PI / 180.0) * $$0.h.b();
      this.g.f = (float) (Math.PI / 180.0) * $$0.h.c();
      this.g.g = (float) (Math.PI / 180.0) * $$0.h.d();
   }

   @Override
   public void a(bvb $$0, fer $$1) {
      gcl $$2 = this.a($$0);
      boolean $$3 = $$2.k;
      $$2.k = true;
      super.a($$0, $$1);
      $$2.k = $$3;
   }
}
