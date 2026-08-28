public class fwo extends fxk<gsw> {
   private static final float b = 19.0F;
   public static final gau a = gau.scaling(0.5F);
   private static final String c = "bone";
   private static final String d = "stinger";
   private static final String e = "left_antenna";
   private static final String f = "right_antenna";
   private static final String g = "front_legs";
   private static final String i = "middle_legs";
   private static final String j = "back_legs";
   private final gal k;
   private final gal l;
   private final gal m;
   private final gal n;
   private final gal o;
   private final gal p;
   private final gal q;
   private final gal r;
   private final gal s;
   private final gal t;
   private float u;

   public fwo(gal $$0) {
      this.k = $$0;
      this.l = $$0.b("bone");
      gal $$1 = this.l.b("body");
      this.r = $$1.b("stinger");
      this.s = $$1.b("left_antenna");
      this.t = $$1.b("right_antenna");
      this.m = this.l.b("right_wing");
      this.n = this.l.b("left_wing");
      this.o = this.l.b("front_legs");
      this.p = this.l.b("middle_legs");
      this.q = this.l.b("back_legs");
   }

   public static gar b() {
      gat $$0 = new gat();
      gav $$1 = $$0.a();
      gav $$2 = $$1.a("bone", gaq.c(), gan.a(0.0F, 19.0F, 0.0F));
      gav $$3 = $$2.a("body", gaq.c().a(0, 0).a(-3.5F, -4.0F, -5.0F, 7.0F, 7.0F, 10.0F), gan.a);
      $$3.a("stinger", gaq.c().a(26, 7).a(0.0F, -1.0F, 5.0F, 0.0F, 1.0F, 2.0F), gan.a);
      $$3.a("left_antenna", gaq.c().a(2, 0).a(1.5F, -2.0F, -3.0F, 1.0F, 2.0F, 3.0F), gan.a(0.0F, -2.0F, -5.0F));
      $$3.a("right_antenna", gaq.c().a(2, 3).a(-2.5F, -2.0F, -3.0F, 1.0F, 2.0F, 3.0F), gan.a(0.0F, -2.0F, -5.0F));
      gap $$4 = new gap(0.001F);
      $$2.a("right_wing", gaq.c().a(0, 18).a(-9.0F, 0.0F, 0.0F, 9.0F, 0.0F, 6.0F, $$4), gan.a(-1.5F, -4.0F, -3.0F, 0.0F, -0.2618F, 0.0F));
      $$2.a("left_wing", gaq.c().a(0, 18).a().a(0.0F, 0.0F, 0.0F, 9.0F, 0.0F, 6.0F, $$4), gan.a(1.5F, -4.0F, -3.0F, 0.0F, 0.2618F, 0.0F));
      $$2.a("front_legs", gaq.c().a("front_legs", -5.0F, 0.0F, 0.0F, 7, 2, 0, 26, 1), gan.a(1.5F, 3.0F, -2.0F));
      $$2.a("middle_legs", gaq.c().a("middle_legs", -5.0F, 0.0F, 0.0F, 7, 2, 0, 26, 3), gan.a(1.5F, 3.0F, 0.0F));
      $$2.a("back_legs", gaq.c().a("back_legs", -5.0F, 0.0F, 0.0F, 7, 2, 0, 26, 5), gan.a(1.5F, 3.0F, 2.0F));
      return gar.a($$0, 64, 64);
   }

   public void a(gsw $$0) {
      this.u = $$0.a;
      this.r.k = $$0.b;
      this.m.e = 0.0F;
      this.s.e = 0.0F;
      this.t.e = 0.0F;
      this.l.e = 0.0F;
      if ($$0.c) {
         this.m.f = -0.2618F;
         this.m.g = 0.0F;
         this.n.e = 0.0F;
         this.n.f = 0.2618F;
         this.n.g = 0.0F;
         this.o.e = 0.0F;
         this.p.e = 0.0F;
         this.q.e = 0.0F;
      } else {
         float $$1 = $$0.p * 120.32113F * (float) (Math.PI / 180.0);
         this.m.f = 0.0F;
         this.m.g = azd.b($$1) * (float) Math.PI * 0.15F;
         this.n.e = this.m.e;
         this.n.f = this.m.f;
         this.n.g = -this.m.g;
         this.o.e = (float) (Math.PI / 4);
         this.p.e = (float) (Math.PI / 4);
         this.q.e = (float) (Math.PI / 4);
         this.l.e = 0.0F;
         this.l.f = 0.0F;
         this.l.g = 0.0F;
      }

      if (!$$0.d) {
         this.l.e = 0.0F;
         this.l.f = 0.0F;
         this.l.g = 0.0F;
         if (!$$0.c) {
            float $$2 = azd.b($$0.p * 0.18F);
            this.l.e = 0.1F + $$2 * (float) Math.PI * 0.025F;
            this.s.e = $$2 * (float) Math.PI * 0.03F;
            this.t.e = $$2 * (float) Math.PI * 0.03F;
            this.o.e = -$$2 * (float) Math.PI * 0.1F + (float) (Math.PI / 8);
            this.q.e = -$$2 * (float) Math.PI * 0.05F + (float) (Math.PI / 4);
            this.l.c = 19.0F - azd.b($$0.p * 0.18F) * 0.9F;
         }
      }

      if (this.u > 0.0F) {
         this.l.e = azd.j(this.u, this.l.e, 3.0915928F);
      }
   }

   @Override
   public gal a() {
      return this.k;
   }
}
