public class fxd extends fxz<gtn> {
   public static final gbk a = gbk.scaling(0.5F);
   private static final String b = "bone";
   private static final String c = "stinger";
   private static final String d = "left_antenna";
   private static final String e = "right_antenna";
   private static final String f = "front_legs";
   private static final String g = "middle_legs";
   private static final String i = "back_legs";
   private final gbb j;
   private final gbb k;
   private final gbb l;
   private final gbb m;
   private final gbb n;
   private final gbb o;
   private final gbb p;
   private final gbb q;
   private final gbb r;
   private float s;

   public fxd(gbb $$0) {
      super($$0);
      this.j = $$0.b("bone");
      gbb $$1 = this.j.b("body");
      this.p = $$1.b("stinger");
      this.q = $$1.b("left_antenna");
      this.r = $$1.b("right_antenna");
      this.k = this.j.b("right_wing");
      this.l = this.j.b("left_wing");
      this.m = this.j.b("front_legs");
      this.n = this.j.b("middle_legs");
      this.o = this.j.b("back_legs");
   }

   public static gbh a() {
      gbj $$0 = new gbj();
      gbl $$1 = $$0.a();
      gbl $$2 = $$1.a("bone", gbg.c(), gbd.a(0.0F, 19.0F, 0.0F));
      gbl $$3 = $$2.a("body", gbg.c().a(0, 0).a(-3.5F, -4.0F, -5.0F, 7.0F, 7.0F, 10.0F), gbd.a);
      $$3.a("stinger", gbg.c().a(26, 7).a(0.0F, -1.0F, 5.0F, 0.0F, 1.0F, 2.0F), gbd.a);
      $$3.a("left_antenna", gbg.c().a(2, 0).a(1.5F, -2.0F, -3.0F, 1.0F, 2.0F, 3.0F), gbd.a(0.0F, -2.0F, -5.0F));
      $$3.a("right_antenna", gbg.c().a(2, 3).a(-2.5F, -2.0F, -3.0F, 1.0F, 2.0F, 3.0F), gbd.a(0.0F, -2.0F, -5.0F));
      gbf $$4 = new gbf(0.001F);
      $$2.a("right_wing", gbg.c().a(0, 18).a(-9.0F, 0.0F, 0.0F, 9.0F, 0.0F, 6.0F, $$4), gbd.a(-1.5F, -4.0F, -3.0F, 0.0F, -0.2618F, 0.0F));
      $$2.a("left_wing", gbg.c().a(0, 18).a().a(0.0F, 0.0F, 0.0F, 9.0F, 0.0F, 6.0F, $$4), gbd.a(1.5F, -4.0F, -3.0F, 0.0F, 0.2618F, 0.0F));
      $$2.a("front_legs", gbg.c().a("front_legs", -5.0F, 0.0F, 0.0F, 7, 2, 0, 26, 1), gbd.a(1.5F, 3.0F, -2.0F));
      $$2.a("middle_legs", gbg.c().a("middle_legs", -5.0F, 0.0F, 0.0F, 7, 2, 0, 26, 3), gbd.a(1.5F, 3.0F, 0.0F));
      $$2.a("back_legs", gbg.c().a("back_legs", -5.0F, 0.0F, 0.0F, 7, 2, 0, 26, 5), gbd.a(1.5F, 3.0F, 2.0F));
      return gbh.a($$0, 64, 64);
   }

   public void a(gtn $$0) {
      super.a($$0);
      this.s = $$0.a;
      this.p.k = $$0.b;
      if (!$$0.c) {
         float $$1 = $$0.p * 120.32113F * (float) (Math.PI / 180.0);
         this.k.f = 0.0F;
         this.k.g = azj.b($$1) * (float) Math.PI * 0.15F;
         this.l.e = this.k.e;
         this.l.f = this.k.f;
         this.l.g = -this.k.g;
         this.m.e = (float) (Math.PI / 4);
         this.n.e = (float) (Math.PI / 4);
         this.o.e = (float) (Math.PI / 4);
      }

      if (!$$0.d && !$$0.c) {
         float $$2 = azj.b($$0.p * 0.18F);
         this.j.e = 0.1F + $$2 * (float) Math.PI * 0.025F;
         this.q.e = $$2 * (float) Math.PI * 0.03F;
         this.r.e = $$2 * (float) Math.PI * 0.03F;
         this.m.e = -$$2 * (float) Math.PI * 0.1F + (float) (Math.PI / 8);
         this.o.e = -$$2 * (float) Math.PI * 0.05F + (float) (Math.PI / 4);
         this.j.c = this.j.c - azj.b($$0.p * 0.18F) * 0.9F;
      }

      if (this.s > 0.0F) {
         this.j.e = azj.j(this.s, this.j.e, 3.0915928F);
      }
   }
}
