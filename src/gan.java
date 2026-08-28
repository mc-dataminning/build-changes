public class gan extends gbk<gxd> {
   public static final gev a = gev.scaling(0.5F);
   private static final String b = "bone";
   private static final String c = "stinger";
   private static final String d = "left_antenna";
   private static final String e = "right_antenna";
   private static final String f = "front_legs";
   private static final String g = "middle_legs";
   private static final String i = "back_legs";
   private final gem j;
   private final gem k;
   private final gem l;
   private final gem m;
   private final gem n;
   private final gem o;
   private final gem p;
   private final gem q;
   private final gem r;
   private float s;

   public gan(gem $$0) {
      super($$0);
      this.j = $$0.b("bone");
      gem $$1 = this.j.b("body");
      this.p = $$1.b("stinger");
      this.q = $$1.b("left_antenna");
      this.r = $$1.b("right_antenna");
      this.k = this.j.b("right_wing");
      this.l = this.j.b("left_wing");
      this.m = this.j.b("front_legs");
      this.n = this.j.b("middle_legs");
      this.o = this.j.b("back_legs");
   }

   public static ges a() {
      geu $$0 = new geu();
      gew $$1 = $$0.a();
      gew $$2 = $$1.a("bone", ger.c(), geo.a(0.0F, 19.0F, 0.0F));
      gew $$3 = $$2.a("body", ger.c().a(0, 0).a(-3.5F, -4.0F, -5.0F, 7.0F, 7.0F, 10.0F), geo.a);
      $$3.a("stinger", ger.c().a(26, 7).a(0.0F, -1.0F, 5.0F, 0.0F, 1.0F, 2.0F), geo.a);
      $$3.a("left_antenna", ger.c().a(2, 0).a(1.5F, -2.0F, -3.0F, 1.0F, 2.0F, 3.0F), geo.a(0.0F, -2.0F, -5.0F));
      $$3.a("right_antenna", ger.c().a(2, 3).a(-2.5F, -2.0F, -3.0F, 1.0F, 2.0F, 3.0F), geo.a(0.0F, -2.0F, -5.0F));
      geq $$4 = new geq(0.001F);
      $$2.a("right_wing", ger.c().a(0, 18).a(-9.0F, 0.0F, 0.0F, 9.0F, 0.0F, 6.0F, $$4), geo.a(-1.5F, -4.0F, -3.0F, 0.0F, -0.2618F, 0.0F));
      $$2.a("left_wing", ger.c().a(0, 18).a().a(0.0F, 0.0F, 0.0F, 9.0F, 0.0F, 6.0F, $$4), geo.a(1.5F, -4.0F, -3.0F, 0.0F, 0.2618F, 0.0F));
      $$2.a("front_legs", ger.c().a("front_legs", -5.0F, 0.0F, 0.0F, 7, 2, 0, 26, 1), geo.a(1.5F, 3.0F, -2.0F));
      $$2.a("middle_legs", ger.c().a("middle_legs", -5.0F, 0.0F, 0.0F, 7, 2, 0, 26, 3), geo.a(1.5F, 3.0F, 0.0F));
      $$2.a("back_legs", ger.c().a("back_legs", -5.0F, 0.0F, 0.0F, 7, 2, 0, 26, 5), geo.a(1.5F, 3.0F, 2.0F));
      return ges.a($$0, 64, 64);
   }

   public void a(gxd $$0) {
      super.a($$0);
      this.s = $$0.a;
      this.p.k = $$0.b;
      if (!$$0.c) {
         float $$1 = $$0.p * 120.32113F * (float) (Math.PI / 180.0);
         this.k.f = 0.0F;
         this.k.g = bae.b($$1) * (float) Math.PI * 0.15F;
         this.l.e = this.k.e;
         this.l.f = this.k.f;
         this.l.g = -this.k.g;
         this.m.e = (float) (Math.PI / 4);
         this.n.e = (float) (Math.PI / 4);
         this.o.e = (float) (Math.PI / 4);
      }

      if (!$$0.d && !$$0.c) {
         float $$2 = bae.b($$0.p * 0.18F);
         this.j.e = 0.1F + $$2 * (float) Math.PI * 0.025F;
         this.q.e = $$2 * (float) Math.PI * 0.03F;
         this.r.e = $$2 * (float) Math.PI * 0.03F;
         this.m.e = -$$2 * (float) Math.PI * 0.1F + (float) (Math.PI / 8);
         this.o.e = -$$2 * (float) Math.PI * 0.05F + (float) (Math.PI / 4);
         this.j.c = this.j.c - bae.b($$0.p * 0.18F) * 0.9F;
      }

      if (this.s > 0.0F) {
         this.j.e = bae.j(this.s, this.j.e, 3.0915928F);
      }
   }
}
