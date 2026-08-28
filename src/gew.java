public class gew extends gca<gyg> {
   private static final int a = 5;
   private static final int b = 12;
   private final gfc c;
   private final gfc[] d = new gfc[5];
   private final gfc[] e = new gfc[12];
   private final gfc f;
   private final gfc g;
   private final gfc i;
   private final gfc j;
   private final gfc k;
   private final gfc l;
   private final gfc m;
   private final gfc n;
   private final gfc o;
   private final gfc p;
   private final gfc q;
   private final gfc r;
   private final gfc s;
   private final gfc t;
   private final gfc u;
   private final gfc x;
   private final gfc y;
   private final gfc z;

   private static String a(int $$0) {
      return "neck" + $$0;
   }

   private static String b(int $$0) {
      return "tail" + $$0;
   }

   public gew(gfc $$0) {
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

   public static gfi a() {
      gfk $$0 = new gfk();
      gfm $$1 = $$0.a();
      float $$2 = -16.0F;
      gfm $$3 = $$1.a(
         "head",
         gfh.c()
            .a("upperlip", -6.0F, -1.0F, -24.0F, 12, 5, 16, 176, 44)
            .a("upperhead", -8.0F, -8.0F, -10.0F, 16, 16, 16, 112, 30)
            .a()
            .a("scale", -5.0F, -12.0F, -4.0F, 2, 4, 6, 0, 0)
            .a("nostril", -5.0F, -3.0F, -22.0F, 2, 2, 4, 112, 0)
            .a()
            .a("scale", 3.0F, -12.0F, -4.0F, 2, 4, 6, 0, 0)
            .a("nostril", 3.0F, -3.0F, -22.0F, 2, 2, 4, 112, 0),
         gfe.a(0.0F, 20.0F, -62.0F)
      );
      $$3.a("jaw", gfh.c().a("jaw", -6.0F, 0.0F, -16.0F, 12, 4, 16, 176, 65), gfe.a(0.0F, 4.0F, -8.0F));
      gfh $$4 = gfh.c().a("box", -5.0F, -5.0F, -5.0F, 10, 10, 10, 192, 104).a("scale", -1.0F, -9.0F, -3.0F, 2, 4, 6, 48, 0);

      for (int $$5 = 0; $$5 < 5; $$5++) {
         $$1.a(a($$5), $$4, gfe.a(0.0F, 20.0F, -12.0F - (float)$$5 * 10.0F));
      }

      for (int $$6 = 0; $$6 < 12; $$6++) {
         $$1.a(b($$6), $$4, gfe.a(0.0F, 10.0F, 60.0F + (float)$$6 * 10.0F));
      }

      gfm $$7 = $$1.a(
         "body",
         gfh.c()
            .a("body", -12.0F, 1.0F, -16.0F, 24, 24, 64, 0, 0)
            .a("scale", -1.0F, -5.0F, -10.0F, 2, 6, 12, 220, 53)
            .a("scale", -1.0F, -5.0F, 10.0F, 2, 6, 12, 220, 53)
            .a("scale", -1.0F, -5.0F, 30.0F, 2, 6, 12, 220, 53),
         gfe.a(0.0F, 3.0F, 8.0F)
      );
      gfm $$8 = $$7.a(
         "left_wing", gfh.c().a().a("bone", 0.0F, -4.0F, -4.0F, 56, 8, 8, 112, 88).a("skin", 0.0F, 0.0F, 2.0F, 56, 0, 56, -56, 88), gfe.a(12.0F, 2.0F, -6.0F)
      );
      $$8.a(
         "left_wing_tip",
         gfh.c().a().a("bone", 0.0F, -2.0F, -2.0F, 56, 4, 4, 112, 136).a("skin", 0.0F, 0.0F, 2.0F, 56, 0, 56, -56, 144),
         gfe.a(56.0F, 0.0F, 0.0F)
      );
      gfm $$9 = $$7.a("left_front_leg", gfh.c().a("main", -4.0F, -4.0F, -4.0F, 8, 24, 8, 112, 104), gfe.a(12.0F, 17.0F, -6.0F, 1.3F, 0.0F, 0.0F));
      gfm $$10 = $$9.a("left_front_leg_tip", gfh.c().a("main", -3.0F, -1.0F, -3.0F, 6, 24, 6, 226, 138), gfe.a(0.0F, 20.0F, -1.0F, -0.5F, 0.0F, 0.0F));
      $$10.a("left_front_foot", gfh.c().a("main", -4.0F, 0.0F, -12.0F, 8, 4, 16, 144, 104), gfe.a(0.0F, 23.0F, 0.0F, 0.75F, 0.0F, 0.0F));
      gfm $$11 = $$7.a("left_hind_leg", gfh.c().a("main", -8.0F, -4.0F, -8.0F, 16, 32, 16, 0, 0), gfe.a(16.0F, 13.0F, 34.0F, 1.0F, 0.0F, 0.0F));
      gfm $$12 = $$11.a("left_hind_leg_tip", gfh.c().a("main", -6.0F, -2.0F, 0.0F, 12, 32, 12, 196, 0), gfe.a(0.0F, 32.0F, -4.0F, 0.5F, 0.0F, 0.0F));
      $$12.a("left_hind_foot", gfh.c().a("main", -9.0F, 0.0F, -20.0F, 18, 6, 24, 112, 0), gfe.a(0.0F, 31.0F, 4.0F, 0.75F, 0.0F, 0.0F));
      gfm $$13 = $$7.a(
         "right_wing", gfh.c().a("bone", -56.0F, -4.0F, -4.0F, 56, 8, 8, 112, 88).a("skin", -56.0F, 0.0F, 2.0F, 56, 0, 56, -56, 88), gfe.a(-12.0F, 2.0F, -6.0F)
      );
      $$13.a(
         "right_wing_tip",
         gfh.c().a("bone", -56.0F, -2.0F, -2.0F, 56, 4, 4, 112, 136).a("skin", -56.0F, 0.0F, 2.0F, 56, 0, 56, -56, 144),
         gfe.a(-56.0F, 0.0F, 0.0F)
      );
      gfm $$14 = $$7.a("right_front_leg", gfh.c().a("main", -4.0F, -4.0F, -4.0F, 8, 24, 8, 112, 104), gfe.a(-12.0F, 17.0F, -6.0F, 1.3F, 0.0F, 0.0F));
      gfm $$15 = $$14.a("right_front_leg_tip", gfh.c().a("main", -3.0F, -1.0F, -3.0F, 6, 24, 6, 226, 138), gfe.a(0.0F, 20.0F, -1.0F, -0.5F, 0.0F, 0.0F));
      $$15.a("right_front_foot", gfh.c().a("main", -4.0F, 0.0F, -12.0F, 8, 4, 16, 144, 104), gfe.a(0.0F, 23.0F, 0.0F, 0.75F, 0.0F, 0.0F));
      gfm $$16 = $$7.a("right_hind_leg", gfh.c().a("main", -8.0F, -4.0F, -8.0F, 16, 32, 16, 0, 0), gfe.a(-16.0F, 13.0F, 34.0F, 1.0F, 0.0F, 0.0F));
      gfm $$17 = $$16.a("right_hind_leg_tip", gfh.c().a("main", -6.0F, -2.0F, 0.0F, 12, 32, 12, 196, 0), gfe.a(0.0F, 32.0F, -4.0F, 0.5F, 0.0F, 0.0F));
      $$17.a("right_hind_foot", gfh.c().a("main", -9.0F, 0.0F, -20.0F, 18, 6, 24, 112, 0), gfe.a(0.0F, 31.0F, 4.0F, 0.75F, 0.0F, 0.0F));
      return gfi.a($$0, 256, 256);
   }

   public void a(gyg $$0) {
      super.a($$0);
      float $$1 = $$0.a * (float) (Math.PI * 2);
      this.f.e = (ayz.a($$1) + 1.0F) * 0.2F;
      float $$2 = ayz.a($$1 - 1.0F) + 1.0F;
      $$2 = ($$2 * $$2 + $$2 * 2.0F) * 0.05F;
      this.v.c = ($$2 - 2.0F) * 16.0F;
      this.v.d = -48.0F;
      this.v.e = $$2 * 2.0F * (float) (Math.PI / 180.0);
      float $$3 = this.d[0].b;
      float $$4 = this.d[0].c;
      float $$5 = this.d[0].d;
      float $$6 = 1.5F;
      cjs.a $$7 = $$0.a(6);
      float $$8 = ayz.h($$0.a(5).b() - $$0.a(10).b());
      float $$9 = ayz.h($$0.a(5).b() + $$8 / 2.0F);

      for (int $$10 = 0; $$10 < 5; $$10++) {
         gfc $$11 = this.d[$$10];
         cjs.a $$12 = $$0.a(5 - $$10);
         float $$13 = ayz.b((float)$$10 * 0.45F + $$1) * 0.15F;
         $$11.f = ayz.h($$12.b() - $$7.b()) * (float) (Math.PI / 180.0) * 1.5F;
         $$11.e = $$13 + $$0.a($$10, $$7, $$12) * (float) (Math.PI / 180.0) * 1.5F * 5.0F;
         $$11.g = -ayz.h($$12.b() - $$9) * (float) (Math.PI / 180.0) * 1.5F;
         $$11.c = $$4;
         $$11.d = $$5;
         $$11.b = $$3;
         $$3 -= ayz.a($$11.f) * ayz.b($$11.e) * 10.0F;
         $$4 += ayz.a($$11.e) * 10.0F;
         $$5 -= ayz.b($$11.f) * ayz.b($$11.e) * 10.0F;
      }

      this.c.c = $$4;
      this.c.d = $$5;
      this.c.b = $$3;
      cjs.a $$14 = $$0.a(0);
      this.c.f = ayz.h($$14.b() - $$7.b()) * (float) (Math.PI / 180.0);
      this.c.e = ayz.h($$0.a(6, $$7, $$14)) * (float) (Math.PI / 180.0) * 1.5F * 5.0F;
      this.c.g = -ayz.h($$14.b() - $$9) * (float) (Math.PI / 180.0);
      this.g.g = -$$8 * 1.5F * (float) (Math.PI / 180.0);
      this.i.e = 0.125F - ayz.b($$1) * 0.2F;
      this.i.f = -0.25F;
      this.i.g = -(ayz.a($$1) + 0.125F) * 0.8F;
      this.j.g = (ayz.a($$1 + 2.0F) + 0.5F) * 0.75F;
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
         cjs.a $$17 = $$0.a(12 + $$16);
         $$15 += ayz.a((float)$$16 * 0.45F + $$1) * 0.05F;
         gfc $$18 = this.e[$$16];
         $$18.f = (ayz.h($$17.b() - $$7.b()) * 1.5F + 180.0F) * (float) (Math.PI / 180.0);
         $$18.e = $$15 + (float)($$17.a() - $$7.a()) * (float) (Math.PI / 180.0) * 1.5F * 5.0F;
         $$18.g = ayz.h($$17.b() - $$9) * (float) (Math.PI / 180.0) * 1.5F;
         $$18.c = $$4;
         $$18.d = $$5;
         $$18.b = $$3;
         $$4 += ayz.a($$18.e) * 10.0F;
         $$5 -= ayz.b($$18.f) * ayz.b($$18.e) * 10.0F;
         $$3 -= ayz.a($$18.f) * ayz.b($$18.e) * 10.0F;
      }
   }

   private void a(float $$0, gfc $$1, gfc $$2, gfc $$3, gfc $$4, gfc $$5, gfc $$6) {
      $$4.e = 1.0F + $$0 * 0.1F;
      $$5.e = 0.5F + $$0 * 0.1F;
      $$6.e = 0.75F + $$0 * 0.1F;
      $$1.e = 1.3F + $$0 * 0.1F;
      $$2.e = -0.5F - $$0 * 0.1F;
      $$3.e = 0.75F + $$0 * 0.1F;
   }
}
