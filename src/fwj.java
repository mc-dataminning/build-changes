public class fwj extends fwi {
   private static final String a = "right_body_stick";
   private static final String b = "left_body_stick";
   private static final String c = "shoulder_stick";
   private static final String d = "base_plate";
   private final gal e;
   private final gal f;
   private final gal g;
   private final gal w;

   public fwj(gal $$0) {
      super($$0);
      this.e = $$0.b("right_body_stick");
      this.f = $$0.b("left_body_stick");
      this.g = $$0.b("shoulder_stick");
      this.w = $$0.b("base_plate");
      this.p.k = false;
   }

   public static gar b() {
      gat $$0 = fxx.a(gap.a, 0.0F);
      gav $$1 = $$0.a();
      $$1.a("head", gaq.c().a(0, 0).a(-1.0F, -7.0F, -1.0F, 2.0F, 7.0F, 2.0F), gan.a(0.0F, 1.0F, 0.0F));
      $$1.a("body", gaq.c().a(0, 26).a(-6.0F, 0.0F, -1.5F, 12.0F, 3.0F, 3.0F), gan.a);
      $$1.a("right_arm", gaq.c().a(24, 0).a(-2.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), gan.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", gaq.c().a(32, 16).a().a(0.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), gan.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", gaq.c().a(8, 0).a(-1.0F, 0.0F, -1.0F, 2.0F, 11.0F, 2.0F), gan.a(-1.9F, 12.0F, 0.0F));
      $$1.a("left_leg", gaq.c().a(40, 16).a().a(-1.0F, 0.0F, -1.0F, 2.0F, 11.0F, 2.0F), gan.a(1.9F, 12.0F, 0.0F));
      $$1.a("right_body_stick", gaq.c().a(16, 0).a(-3.0F, 3.0F, -1.0F, 2.0F, 7.0F, 2.0F), gan.a);
      $$1.a("left_body_stick", gaq.c().a(48, 16).a(1.0F, 3.0F, -1.0F, 2.0F, 7.0F, 2.0F), gan.a);
      $$1.a("shoulder_stick", gaq.c().a(0, 48).a(-4.0F, 10.0F, -1.0F, 8.0F, 2.0F, 2.0F), gan.a);
      $$1.a("base_plate", gaq.c().a(0, 32).a(-6.0F, 11.0F, -6.0F, 12.0F, 1.0F, 12.0F), gan.a(0.0F, 12.0F, 0.0F));
      return gar.a($$0, 64, 64);
   }

   @Override
   public void a(gss $$0) {
      this.w.e = 0.0F;
      this.w.f = (float) (Math.PI / 180.0) * -$$0.a;
      this.w.g = 0.0F;
      super.a($$0);
      this.s.k = $$0.e;
      this.r.k = $$0.e;
      this.w.k = $$0.f;
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
   public void a(bue $$0, fde $$1) {
      gal $$2 = this.a($$0);
      boolean $$3 = $$2.k;
      $$2.k = true;
      super.a($$0, $$1);
      $$2.k = $$3;
   }
}
