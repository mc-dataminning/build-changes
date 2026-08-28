public class ggz extends gia<hdy> {
   public static final gln a = gln.scaling(0.5F);
   private static final String b = "bone";
   private static final String c = "stinger";
   private static final String d = "left_antenna";
   private static final String e = "right_antenna";
   private static final String f = "front_legs";
   private static final String g = "middle_legs";
   private static final String i = "back_legs";
   private final gle j;
   private final gle k;
   private final gle l;
   private final gle m;
   private final gle n;
   private final gle o;
   private final gle p;
   private final gle q;
   private final gle r;
   private float s;

   public ggz(gle $$0) {
      super($$0);
      this.j = $$0.b("bone");
      gle $$1 = this.j.b("body");
      this.p = $$1.b("stinger");
      this.q = $$1.b("left_antenna");
      this.r = $$1.b("right_antenna");
      this.k = this.j.b("right_wing");
      this.l = this.j.b("left_wing");
      this.m = this.j.b("front_legs");
      this.n = this.j.b("middle_legs");
      this.o = this.j.b("back_legs");
   }

   public static glk a() {
      glm $$0 = new glm();
      glo $$1 = $$0.a();
      glo $$2 = $$1.a("bone", glj.c(), glg.a(0.0F, 19.0F, 0.0F));
      glo $$3 = $$2.a("body", glj.c().a(0, 0).a(-3.5F, -4.0F, -5.0F, 7.0F, 7.0F, 10.0F), glg.a);
      $$3.a("stinger", glj.c().a(26, 7).a(0.0F, -1.0F, 5.0F, 0.0F, 1.0F, 2.0F), glg.a);
      $$3.a("left_antenna", glj.c().a(2, 0).a(1.5F, -2.0F, -3.0F, 1.0F, 2.0F, 3.0F), glg.a(0.0F, -2.0F, -5.0F));
      $$3.a("right_antenna", glj.c().a(2, 3).a(-2.5F, -2.0F, -3.0F, 1.0F, 2.0F, 3.0F), glg.a(0.0F, -2.0F, -5.0F));
      gli $$4 = new gli(0.001F);
      $$2.a("right_wing", glj.c().a(0, 18).a(-9.0F, 0.0F, 0.0F, 9.0F, 0.0F, 6.0F, $$4), glg.a(-1.5F, -4.0F, -3.0F, 0.0F, -0.2618F, 0.0F));
      $$2.a("left_wing", glj.c().a(0, 18).a().a(0.0F, 0.0F, 0.0F, 9.0F, 0.0F, 6.0F, $$4), glg.a(1.5F, -4.0F, -3.0F, 0.0F, 0.2618F, 0.0F));
      $$2.a("front_legs", glj.c().a("front_legs", -5.0F, 0.0F, 0.0F, 7, 2, 0, 26, 1), glg.a(1.5F, 3.0F, -2.0F));
      $$2.a("middle_legs", glj.c().a("middle_legs", -5.0F, 0.0F, 0.0F, 7, 2, 0, 26, 3), glg.a(1.5F, 3.0F, 0.0F));
      $$2.a("back_legs", glj.c().a("back_legs", -5.0F, 0.0F, 0.0F, 7, 2, 0, 26, 5), glg.a(1.5F, 3.0F, 2.0F));
      return glk.a($$0, 64, 64);
   }

   public void a(hdy $$0) {
      super.a($$0);
      this.s = $$0.a;
      this.p.k = $$0.b;
      if (!$$0.c) {
         float $$1 = $$0.u * 120.32113F * (float) (Math.PI / 180.0);
         this.k.f = 0.0F;
         this.k.g = azo.b($$1) * (float) Math.PI * 0.15F;
         this.l.e = this.k.e;
         this.l.f = this.k.f;
         this.l.g = -this.k.g;
         this.m.e = (float) (Math.PI / 4);
         this.n.e = (float) (Math.PI / 4);
         this.o.e = (float) (Math.PI / 4);
      }

      if (!$$0.d && !$$0.c) {
         float $$2 = azo.b($$0.u * 0.18F);
         this.j.e = 0.1F + $$2 * (float) Math.PI * 0.025F;
         this.q.e = $$2 * (float) Math.PI * 0.03F;
         this.r.e = $$2 * (float) Math.PI * 0.03F;
         this.m.e = -$$2 * (float) Math.PI * 0.1F + (float) (Math.PI / 8);
         this.o.e = -$$2 * (float) Math.PI * 0.05F + (float) (Math.PI / 4);
         this.j.c = this.j.c - azo.b($$0.u * 0.18F) * 0.9F;
      }

      if (this.s > 0.0F) {
         this.j.e = azo.j(this.s, this.j.e, 3.0915928F);
      }
   }
}
