import com.google.common.collect.ImmutableList;

public class fuo<T extends cff> extends fuf<T> {
   private static final float a = 19.0F;
   private static final String b = "bone";
   private static final String f = "stinger";
   private static final String g = "left_antenna";
   private static final String h = "right_antenna";
   private static final String i = "front_legs";
   private static final String j = "middle_legs";
   private static final String k = "back_legs";
   private final fyk l;
   private final fyk m;
   private final fyk n;
   private final fyk o;
   private final fyk p;
   private final fyk q;
   private final fyk r;
   private final fyk s;
   private final fyk t;
   private float u;

   public fuo(fyk $$0) {
      super(false, 24.0F, 0.0F);
      this.l = $$0.b("bone");
      fyk $$1 = this.l.b("body");
      this.r = $$1.b("stinger");
      this.s = $$1.b("left_antenna");
      this.t = $$1.b("right_antenna");
      this.m = this.l.b("right_wing");
      this.n = this.l.b("left_wing");
      this.o = this.l.b("front_legs");
      this.p = this.l.b("middle_legs");
      this.q = this.l.b("back_legs");
   }

   public static fyq c() {
      fys $$0 = new fys();
      fyt $$1 = $$0.a();
      fyt $$2 = $$1.a("bone", fyp.c(), fym.a(0.0F, 19.0F, 0.0F));
      fyt $$3 = $$2.a("body", fyp.c().a(0, 0).a(-3.5F, -4.0F, -5.0F, 7.0F, 7.0F, 10.0F), fym.a);
      $$3.a("stinger", fyp.c().a(26, 7).a(0.0F, -1.0F, 5.0F, 0.0F, 1.0F, 2.0F), fym.a);
      $$3.a("left_antenna", fyp.c().a(2, 0).a(1.5F, -2.0F, -3.0F, 1.0F, 2.0F, 3.0F), fym.a(0.0F, -2.0F, -5.0F));
      $$3.a("right_antenna", fyp.c().a(2, 3).a(-2.5F, -2.0F, -3.0F, 1.0F, 2.0F, 3.0F), fym.a(0.0F, -2.0F, -5.0F));
      fyo $$4 = new fyo(0.001F);
      $$2.a("right_wing", fyp.c().a(0, 18).a(-9.0F, 0.0F, 0.0F, 9.0F, 0.0F, 6.0F, $$4), fym.a(-1.5F, -4.0F, -3.0F, 0.0F, -0.2618F, 0.0F));
      $$2.a("left_wing", fyp.c().a(0, 18).a().a(0.0F, 0.0F, 0.0F, 9.0F, 0.0F, 6.0F, $$4), fym.a(1.5F, -4.0F, -3.0F, 0.0F, 0.2618F, 0.0F));
      $$2.a("front_legs", fyp.c().a("front_legs", -5.0F, 0.0F, 0.0F, 7, 2, 0, 26, 1), fym.a(1.5F, 3.0F, -2.0F));
      $$2.a("middle_legs", fyp.c().a("middle_legs", -5.0F, 0.0F, 0.0F, 7, 2, 0, 26, 3), fym.a(1.5F, 3.0F, 0.0F));
      $$2.a("back_legs", fyp.c().a("back_legs", -5.0F, 0.0F, 0.0F, 7, 2, 0, 26, 5), fym.a(1.5F, 3.0F, 2.0F));
      return fyq.a($$0, 64, 64);
   }

   public void a(T $$0, float $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.u = $$0.H($$3);
      this.r.k = !$$0.gv();
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.m.e = 0.0F;
      this.s.e = 0.0F;
      this.t.e = 0.0F;
      this.l.e = 0.0F;
      boolean $$6 = $$0.aF() && $$0.dr().g() < 1.0E-7;
      if ($$6) {
         this.m.f = -0.2618F;
         this.m.g = 0.0F;
         this.n.e = 0.0F;
         this.n.f = 0.2618F;
         this.n.g = 0.0F;
         this.o.e = 0.0F;
         this.p.e = 0.0F;
         this.q.e = 0.0F;
      } else {
         float $$7 = $$3 * 120.32113F * (float) (Math.PI / 180.0);
         this.m.f = 0.0F;
         this.m.g = ayo.b($$7) * (float) Math.PI * 0.15F;
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

      if (!$$0.ad_()) {
         this.l.e = 0.0F;
         this.l.f = 0.0F;
         this.l.g = 0.0F;
         if (!$$6) {
            float $$8 = ayo.b($$3 * 0.18F);
            this.l.e = 0.1F + $$8 * (float) Math.PI * 0.025F;
            this.s.e = $$8 * (float) Math.PI * 0.03F;
            this.t.e = $$8 * (float) Math.PI * 0.03F;
            this.o.e = -$$8 * (float) Math.PI * 0.1F + (float) (Math.PI / 8);
            this.q.e = -$$8 * (float) Math.PI * 0.05F + (float) (Math.PI / 4);
            this.l.c = 19.0F - ayo.b($$3 * 0.18F) * 0.9F;
         }
      }

      if (this.u > 0.0F) {
         this.l.e = fwh.a(this.l.e, 3.0915928F, this.u);
      }
   }

   @Override
   protected Iterable<fyk> a() {
      return ImmutableList.of();
   }

   @Override
   protected Iterable<fyk> b() {
      return ImmutableList.of(this.l);
   }
}
