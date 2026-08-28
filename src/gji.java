import java.util.List;

public class gji extends giq<hgd> {
   private static final String f = "left_sleeve";
   private static final String g = "right_sleeve";
   private static final String x = "left_pants";
   private static final String y = "right_pants";
   private final List<glg> z;
   public final glg a;
   public final glg b;
   public final glg c;
   public final glg d;
   public final glg e;
   private final boolean A;

   public gji(glg $$0, boolean $$1) {
      super($$0, gsn::j);
      this.A = $$1;
      this.a = this.s.b("left_sleeve");
      this.b = this.r.b("right_sleeve");
      this.c = this.u.b("left_pants");
      this.d = this.t.b("right_pants");
      this.e = this.q.b("jacket");
      this.z = List.of(this.o, this.q, this.s, this.r, this.u, this.t);
   }

   public static glo a(glk $$0, boolean $$1) {
      glo $$2 = giq.a($$0, 0.0F);
      glq $$3 = $$2.a();
      float $$4 = 0.25F;
      if ($$1) {
         glq $$5 = $$3.a("left_arm", gll.c().a(32, 48).a(-1.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, $$0), gli.a(5.0F, 2.0F, 0.0F));
         glq $$6 = $$3.a("right_arm", gll.c().a(40, 16).a(-2.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, $$0), gli.a(-5.0F, 2.0F, 0.0F));
         $$5.a("left_sleeve", gll.c().a(48, 48).a(-1.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, $$0.a(0.25F)), gli.a);
         $$6.a("right_sleeve", gll.c().a(40, 32).a(-2.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, $$0.a(0.25F)), gli.a);
      } else {
         glq $$7 = $$3.a("left_arm", gll.c().a(32, 48).a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), gli.a(5.0F, 2.0F, 0.0F));
         glq $$8 = $$3.b("right_arm");
         $$7.a("left_sleeve", gll.c().a(48, 48).a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.25F)), gli.a);
         $$8.a("right_sleeve", gll.c().a(40, 32).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.25F)), gli.a);
      }

      glq $$9 = $$3.a("left_leg", gll.c().a(16, 48).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), gli.a(1.9F, 12.0F, 0.0F));
      glq $$10 = $$3.b("right_leg");
      $$9.a("left_pants", gll.c().a(0, 48).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.25F)), gli.a);
      $$10.a("right_pants", gll.c().a(0, 32).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.25F)), gli.a);
      glq $$11 = $$3.b("body");
      $$11.a("jacket", gll.c().a(16, 32).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0.a(0.25F)), gli.a);
      return $$2;
   }

   public void a(hgd $$0) {
      boolean $$1 = !$$0.m;
      this.q.k = $$1;
      this.r.k = $$1;
      this.s.k = $$1;
      this.t.k = $$1;
      this.u.k = $$1;
      this.p.k = $$0.n;
      this.e.k = $$0.o;
      this.c.k = $$0.p;
      this.d.k = $$0.q;
      this.a.k = $$0.aw;
      this.b.k = $$0.ax;
      super.a($$0);
   }

   @Override
   public void c_(boolean $$0) {
      super.c_($$0);
      this.a.k = $$0;
      this.b.k = $$0;
      this.c.k = $$0;
      this.d.k = $$0;
      this.e.k = $$0;
   }

   @Override
   public void a(bxn $$0, flq $$1) {
      this.e().a($$1);
      glg $$2 = this.a($$0);
      if (this.A) {
         float $$3 = 0.5F * (float)($$0 == bxn.b ? 1 : -1);
         $$2.b += $$3;
         $$2.a($$1);
         $$2.b -= $$3;
      } else {
         $$2.a($$1);
      }
   }

   public glg a(azz $$0) {
      return ag.a(this.z, $$0);
   }
}
