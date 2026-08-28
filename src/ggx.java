public class ggx extends gea<hai> {
   private static final int a = 5;
   private static final int b = 12;
   private final ghd c;
   private final ghd[] d = new ghd[5];
   private final ghd[] e = new ghd[12];
   private final ghd f;
   private final ghd g;
   private final ghd i;
   private final ghd j;
   private final ghd k;
   private final ghd l;
   private final ghd m;
   private final ghd n;
   private final ghd o;
   private final ghd p;
   private final ghd q;
   private final ghd r;
   private final ghd s;
   private final ghd t;
   private final ghd u;
   private final ghd x;
   private final ghd y;
   private final ghd z;

   private static String a(int $$0) {
      return "neck" + $$0;
   }

   private static String b(int $$0) {
      return "tail" + $$0;
   }

   public ggx(ghd $$0) {
      super($$0);
      this.c = $$0.b("head");
      this.f = this.c.b("jaw");

      for (int $$1 = 0; $$1 < this.d.length; $$1++) {
         this.d[$$1] = $$0.b(a($$1));
      }

      for (int $$2 = 0; $$2 < this.e.length; $$2++) {
         this.e[$$2] = $$0.b(b($$2));
      }

      this.g = $$0.b("body");
      this.i = this.g.b("left_wing");
      this.j = this.i.b("left_wing_tip");
      this.k = this.g.b("left_front_leg");
      this.l = this.k.b("left_front_leg_tip");
      this.m = this.l.b("left_front_foot");
      this.n = this.g.b("left_hind_leg");
      this.o = this.n.b("left_hind_leg_tip");
      this.p = this.o.b("left_hind_foot");
      this.q = this.g.b("right_wing");
      this.r = this.q.b("right_wing_tip");
      this.s = this.g.b("right_front_leg");
      this.t = this.s.b("right_front_leg_tip");
      this.u = this.t.b("right_front_foot");
      this.x = this.g.b("right_hind_leg");
      this.y = this.x.b("right_hind_leg_tip");
      this.z = this.y.b("right_hind_foot");
   }

   public static ghj a() {
      ghl $$0 = new ghl();
      ghn $$1 = $$0.a();
      float $$2 = -16.0F;
      ghn $$3 = $$1.a(
         "head",
         ghi.c()
            .a("upperlip", -6.0F, -1.0F, -24.0F, 12, 5, 16, 176, 44)
            .a("upperhead", -8.0F, -8.0F, -10.0F, 16, 16, 16, 112, 30)
            .a()
            .a("scale", -5.0F, -12.0F, -4.0F, 2, 4, 6, 0, 0)
            .a("nostril", -5.0F, -3.0F, -22.0F, 2, 2, 4, 112, 0)
            .a()
            .a("scale", 3.0F, -12.0F, -4.0F, 2, 4, 6, 0, 0)
            .a("nostril", 3.0F, -3.0F, -22.0F, 2, 2, 4, 112, 0),
         ghf.a(0.0F, 20.0F, -62.0F)
      );
      $$3.a("jaw", ghi.c().a("jaw", -6.0F, 0.0F, -16.0F, 12, 4, 16, 176, 65), ghf.a(0.0F, 4.0F, -8.0F));
      ghi $$4 = ghi.c().a("box", -5.0F, -5.0F, -5.0F, 10, 10, 10, 192, 104).a("scale", -1.0F, -9.0F, -3.0F, 2, 4, 6, 48, 0);

      for (int $$5 = 0; $$5 < 5; $$5++) {
         $$1.a(a($$5), $$4, ghf.a(0.0F, 20.0F, -12.0F - (float)$$5 * 10.0F));
      }

      for (int $$6 = 0; $$6 < 12; $$6++) {
         $$1.a(b($$6), $$4, ghf.a(0.0F, 10.0F, 60.0F + (float)$$6 * 10.0F));
      }

      ghn $$7 = $$1.a(
         "body",
         ghi.c()
            .a("body", -12.0F, 1.0F, -16.0F, 24, 24, 64, 0, 0)
            .a("scale", -1.0F, -5.0F, -10.0F, 2, 6, 12, 220, 53)
            .a("scale", -1.0F, -5.0F, 10.0F, 2, 6, 12, 220, 53)
            .a("scale", -1.0F, -5.0F, 30.0F, 2, 6, 12, 220, 53),
         ghf.a(0.0F, 3.0F, 8.0F)
      );
      ghn $$8 = $$7.a(
         "left_wing", ghi.c().a().a("bone", 0.0F, -4.0F, -4.0F, 56, 8, 8, 112, 88).a("skin", 0.0F, 0.0F, 2.0F, 56, 0, 56, -56, 88), ghf.a(12.0F, 2.0F, -6.0F)
      );
      $$8.a(
         "left_wing_tip",
         ghi.c().a().a("bone", 0.0F, -2.0F, -2.0F, 56, 4, 4, 112, 136).a("skin", 0.0F, 0.0F, 2.0F, 56, 0, 56, -56, 144),
         ghf.a(56.0F, 0.0F, 0.0F)
      );
      ghn $$9 = $$7.a("left_front_leg", ghi.c().a("main", -4.0F, -4.0F, -4.0F, 8, 24, 8, 112, 104), ghf.a(12.0F, 17.0F, -6.0F, 1.3F, 0.0F, 0.0F));
      ghn $$10 = $$9.a("left_front_leg_tip", ghi.c().a("main", -3.0F, -1.0F, -3.0F, 6, 24, 6, 226, 138), ghf.a(0.0F, 20.0F, -1.0F, -0.5F, 0.0F, 0.0F));
      $$10.a("left_front_foot", ghi.c().a("main", -4.0F, 0.0F, -12.0F, 8, 4, 16, 144, 104), ghf.a(0.0F, 23.0F, 0.0F, 0.75F, 0.0F, 0.0F));
      ghn $$11 = $$7.a("left_hind_leg", ghi.c().a("main", -8.0F, -4.0F, -8.0F, 16, 32, 16, 0, 0), ghf.a(16.0F, 13.0F, 34.0F, 1.0F, 0.0F, 0.0F));
      ghn $$12 = $$11.a("left_hind_leg_tip", ghi.c().a("main", -6.0F, -2.0F, 0.0F, 12, 32, 12, 196, 0), ghf.a(0.0F, 32.0F, -4.0F, 0.5F, 0.0F, 0.0F));
      $$12.a("left_hind_foot", ghi.c().a("main", -9.0F, 0.0F, -20.0F, 18, 6, 24, 112, 0), ghf.a(0.0F, 31.0F, 4.0F, 0.75F, 0.0F, 0.0F));
      ghn $$13 = $$7.a(
         "right_wing", ghi.c().a("bone", -56.0F, -4.0F, -4.0F, 56, 8, 8, 112, 88).a("skin", -56.0F, 0.0F, 2.0F, 56, 0, 56, -56, 88), ghf.a(-12.0F, 2.0F, -6.0F)
      );
      $$13.a(
         "right_wing_tip",
         ghi.c().a("bone", -56.0F, -2.0F, -2.0F, 56, 4, 4, 112, 136).a("skin", -56.0F, 0.0F, 2.0F, 56, 0, 56, -56, 144),
         ghf.a(-56.0F, 0.0F, 0.0F)
      );
      ghn $$14 = $$7.a("right_front_leg", ghi.c().a("main", -4.0F, -4.0F, -4.0F, 8, 24, 8, 112, 104), ghf.a(-12.0F, 17.0F, -6.0F, 1.3F, 0.0F, 0.0F));
      ghn $$15 = $$14.a("right_front_leg_tip", ghi.c().a("main", -3.0F, -1.0F, -3.0F, 6, 24, 6, 226, 138), ghf.a(0.0F, 20.0F, -1.0F, -0.5F, 0.0F, 0.0F));
      $$15.a("right_front_foot", ghi.c().a("main", -4.0F, 0.0F, -12.0F, 8, 4, 16, 144, 104), ghf.a(0.0F, 23.0F, 0.0F, 0.75F, 0.0F, 0.0F));
      ghn $$16 = $$7.a("right_hind_leg", ghi.c().a("main", -8.0F, -4.0F, -8.0F, 16, 32, 16, 0, 0), ghf.a(-16.0F, 13.0F, 34.0F, 1.0F, 0.0F, 0.0F));
      ghn $$17 = $$16.a("right_hind_leg_tip", ghi.c().a("main", -6.0F, -2.0F, 0.0F, 12, 32, 12, 196, 0), ghf.a(0.0F, 32.0F, -4.0F, 0.5F, 0.0F, 0.0F));
      $$17.a("right_hind_foot", ghi.c().a("main", -9.0F, 0.0F, -20.0F, 18, 6, 24, 112, 0), ghf.a(0.0F, 31.0F, 4.0F, 0.75F, 0.0F, 0.0F));
      return ghj.a($$0, 256, 256);
   }

   public void a(hai $$0) {
      super.a($$0);
      float $$1 = $$0.a * (float) (Math.PI * 2);
      this.f.e = (azk.a($$1) + 1.0F) * 0.2F;
      float $$2 = azk.a($$1 - 1.0F) + 1.0F;
      $$2 = ($$2 * $$2 + $$2 * 2.0F) * 0.05F;
      this.v.c = ($$2 - 2.0F) * 16.0F;
      this.v.d = -48.0F;
      this.v.e = $$2 * 2.0F * (float) (Math.PI / 180.0);
      float $$3 = this.d[0].b;
      float $$4 = this.d[0].c;
      float $$5 = this.d[0].d;
      float $$6 = 1.5F;
      cle.a $$7 = $$0.a(6);
      float $$8 = azk.h($$0.a(5).b() - $$0.a(10).b());
      float $$9 = azk.h($$0.a(5).b() + $$8 / 2.0F);

      for (int $$10 = 0; $$10 < 5; $$10++) {
         ghd $$11 = this.d[$$10];
         cle.a $$12 = $$0.a(5 - $$10);
         float $$13 = azk.b((float)$$10 * 0.45F + $$1) * 0.15F;
         $$11.f = azk.h($$12.b() - $$7.b()) * (float) (Math.PI / 180.0) * 1.5F;
         $$11.e = $$13 + $$0.a($$10, $$7, $$12) * (float) (Math.PI / 180.0) * 1.5F * 5.0F;
         $$11.g = -azk.h($$12.b() - $$9) * (float) (Math.PI / 180.0) * 1.5F;
         $$11.c = $$4;
         $$11.d = $$5;
         $$11.b = $$3;
         $$3 -= azk.a($$11.f) * azk.b($$11.e) * 10.0F;
         $$4 += azk.a($$11.e) * 10.0F;
         $$5 -= azk.b($$11.f) * azk.b($$11.e) * 10.0F;
      }

      this.c.c = $$4;
      this.c.d = $$5;
      this.c.b = $$3;
      cle.a $$14 = $$0.a(0);
      this.c.f = azk.h($$14.b() - $$7.b()) * (float) (Math.PI / 180.0);
      this.c.e = azk.h($$0.a(6, $$7, $$14)) * (float) (Math.PI / 180.0) * 1.5F * 5.0F;
      this.c.g = -azk.h($$14.b() - $$9) * (float) (Math.PI / 180.0);
      this.g.g = -$$8 * 1.5F * (float) (Math.PI / 180.0);
      this.i.e = 0.125F - azk.b($$1) * 0.2F;
      this.i.f = -0.25F;
      this.i.g = -(azk.a($$1) + 0.125F) * 0.8F;
      this.j.g = (azk.a($$1 + 2.0F) + 0.5F) * 0.75F;
      this.q.e = this.i.e;
      this.q.f = -this.i.f;
      this.q.g = -this.i.g;
      this.r.g = -this.j.g;
      this.a($$2, this.k, this.l, this.m, this.n, this.o, this.p);
      this.a($$2, this.s, this.t, this.u, this.x, this.y, this.z);
      float $$15 = 0.0F;
      $$4 = this.e[0].c;
      $$5 = this.e[0].d;
      $$3 = this.e[0].b;
      $$7 = $$0.a(11);

      for (int $$16 = 0; $$16 < 12; $$16++) {
         cle.a $$17 = $$0.a(12 + $$16);
         $$15 += azk.a((float)$$16 * 0.45F + $$1) * 0.05F;
         ghd $$18 = this.e[$$16];
         $$18.f = (azk.h($$17.b() - $$7.b()) * 1.5F + 180.0F) * (float) (Math.PI / 180.0);
         $$18.e = $$15 + (float)($$17.a() - $$7.a()) * (float) (Math.PI / 180.0) * 1.5F * 5.0F;
         $$18.g = azk.h($$17.b() - $$9) * (float) (Math.PI / 180.0) * 1.5F;
         $$18.c = $$4;
         $$18.d = $$5;
         $$18.b = $$3;
         $$4 += azk.a($$18.e) * 10.0F;
         $$5 -= azk.b($$18.f) * azk.b($$18.e) * 10.0F;
         $$3 -= azk.a($$18.f) * azk.b($$18.e) * 10.0F;
      }
   }

   private void a(float $$0, ghd $$1, ghd $$2, ghd $$3, ghd $$4, ghd $$5, ghd $$6) {
      $$4.e = 1.0F + $$0 * 0.1F;
      $$5.e = 0.5F + $$0 * 0.1F;
      $$6.e = 0.75F + $$0 * 0.1F;
      $$1.e = 1.3F + $$0 * 0.1F;
      $$2.e = -0.5F - $$0 * 0.1F;
      $$3.e = 0.75F + $$0 * 0.1F;
   }
}
