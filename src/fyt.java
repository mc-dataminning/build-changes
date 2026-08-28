import java.util.List;

public class fyt extends fyb<gvb> {
   private static final String f = "left_sleeve";
   private static final String g = "right_sleeve";
   private static final String x = "left_pants";
   private static final String y = "right_pants";
   private final List<gaq> z;
   public final gaq a;
   public final gaq b;
   public final gaq c;
   public final gaq d;
   public final gaq e;
   private final boolean A;

   public fyt(gaq $$0, boolean $$1) {
      super($$0, ghv::i);
      this.A = $$1;
      this.a = this.s.b("left_sleeve");
      this.b = this.r.b("right_sleeve");
      this.c = this.u.b("left_pants");
      this.d = this.t.b("right_pants");
      this.e = this.q.b("jacket");
      this.z = List.of(this.o, this.q, this.s, this.r, this.u, this.t);
   }

   public static gay a(gau $$0, boolean $$1) {
      gay $$2 = fyb.a($$0, 0.0F);
      gba $$3 = $$2.a();
      float $$4 = 0.25F;
      if ($$1) {
         gba $$5 = $$3.a("left_arm", gav.c().a(32, 48).a(-1.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, $$0), gas.a(5.0F, 2.0F, 0.0F));
         gba $$6 = $$3.a("right_arm", gav.c().a(40, 16).a(-2.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, $$0), gas.a(-5.0F, 2.0F, 0.0F));
         $$5.a("left_sleeve", gav.c().a(48, 48).a(-1.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, $$0.a(0.25F)), gas.a);
         $$6.a("right_sleeve", gav.c().a(40, 32).a(-2.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, $$0.a(0.25F)), gas.a);
      } else {
         gba $$7 = $$3.a("left_arm", gav.c().a(32, 48).a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), gas.a(5.0F, 2.0F, 0.0F));
         gba $$8 = $$3.b("right_arm");
         $$7.a("left_sleeve", gav.c().a(48, 48).a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.25F)), gas.a);
         $$8.a("right_sleeve", gav.c().a(40, 32).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.25F)), gas.a);
      }

      gba $$9 = $$3.a("left_leg", gav.c().a(16, 48).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), gas.a(1.9F, 12.0F, 0.0F));
      gba $$10 = $$3.b("right_leg");
      $$9.a("left_pants", gav.c().a(0, 48).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.25F)), gas.a);
      $$10.a("right_pants", gav.c().a(0, 32).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.25F)), gas.a);
      gba $$11 = $$3.b("body");
      $$11.a("jacket", gav.c().a(16, 32).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0.a(0.25F)), gas.a);
      return $$2;
   }

   public void a(gvb $$0) {
      boolean $$1 = !$$0.h;
      this.q.k = $$1;
      this.r.k = $$1;
      this.s.k = $$1;
      this.t.k = $$1;
      this.u.k = $$1;
      this.p.k = $$0.i;
      this.e.k = $$0.j;
      this.c.k = $$0.k;
      this.d.k = $$0.l;
      this.a.k = $$0.au;
      this.b.k = $$0.av;
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
   public void a(buh $$0, fdi $$1) {
      this.e().a($$1);
      gaq $$2 = this.a($$0);
      if (this.A) {
         float $$3 = 0.5F * (float)($$0 == buh.b ? 1 : -1);
         $$2.b += $$3;
         $$2.a($$1);
         $$2.b -= $$3;
      } else {
         $$2.a($$1);
      }
   }

   public gaq a(azn $$0) {
      return ad.a(this.z, $$0);
   }

   protected fyb.a a(gvb $$0, buh $$1) {
      fyb.a $$2 = gst.a($$0, $$0.aB, brr.a);
      fyb.a $$3 = gst.a($$0, $$0.aC, brr.b);
      if ($$2.a()) {
         $$3 = $$0.aC.a ? fyb.a.a : fyb.a.b;
      }

      return $$0.ap == $$1 ? $$2 : $$3;
   }
}
