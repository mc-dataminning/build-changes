public class gbg extends fyk<gul> {
   private static final int a = 5;
   private static final int b = 12;
   private final gbm c;
   private final gbm[] d = new gbm[5];
   private final gbm[] e = new gbm[12];
   private final gbm f;
   private final gbm g;
   private final gbm i;
   private final gbm j;
   private final gbm k;
   private final gbm l;
   private final gbm m;
   private final gbm n;
   private final gbm o;
   private final gbm p;
   private final gbm q;
   private final gbm r;
   private final gbm s;
   private final gbm t;
   private final gbm u;
   private final gbm x;
   private final gbm y;
   private final gbm z;

   private static String a(int $$0) {
      return "neck" + $$0;
   }

   private static String b(int $$0) {
      return "tail" + $$0;
   }

   public gbg(gbm $$0) {
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

   public static gbs a() {
      gbu $$0 = new gbu();
      gbw $$1 = $$0.a();
      float $$2 = -16.0F;
      gbw $$3 = $$1.a(
         "head",
         gbr.c()
            .a("upperlip", -6.0F, -1.0F, -24.0F, 12, 5, 16, 176, 44)
            .a("upperhead", -8.0F, -8.0F, -10.0F, 16, 16, 16, 112, 30)
            .a()
            .a("scale", -5.0F, -12.0F, -4.0F, 2, 4, 6, 0, 0)
            .a("nostril", -5.0F, -3.0F, -22.0F, 2, 2, 4, 112, 0)
            .a()
            .a("scale", 3.0F, -12.0F, -4.0F, 2, 4, 6, 0, 0)
            .a("nostril", 3.0F, -3.0F, -22.0F, 2, 2, 4, 112, 0),
         gbo.a(0.0F, 20.0F, -62.0F)
      );
      $$3.a("jaw", gbr.c().a("jaw", -6.0F, 0.0F, -16.0F, 12, 4, 16, 176, 65), gbo.a(0.0F, 4.0F, -8.0F));
      gbr $$4 = gbr.c().a("box", -5.0F, -5.0F, -5.0F, 10, 10, 10, 192, 104).a("scale", -1.0F, -9.0F, -3.0F, 2, 4, 6, 48, 0);

      for (int $$5 = 0; $$5 < 5; $$5++) {
         $$1.a(a($$5), $$4, gbo.a(0.0F, 20.0F, -12.0F - (float)$$5 * 10.0F));
      }

      for (int $$6 = 0; $$6 < 12; $$6++) {
         $$1.a(b($$6), $$4, gbo.a(0.0F, 10.0F, 60.0F + (float)$$6 * 10.0F));
      }

      gbw $$7 = $$1.a(
         "body",
         gbr.c()
            .a("body", -12.0F, 1.0F, -16.0F, 24, 24, 64, 0, 0)
            .a("scale", -1.0F, -5.0F, -10.0F, 2, 6, 12, 220, 53)
            .a("scale", -1.0F, -5.0F, 10.0F, 2, 6, 12, 220, 53)
            .a("scale", -1.0F, -5.0F, 30.0F, 2, 6, 12, 220, 53),
         gbo.a(0.0F, 3.0F, 8.0F)
      );
      gbw $$8 = $$7.a(
         "left_wing", gbr.c().a().a("bone", 0.0F, -4.0F, -4.0F, 56, 8, 8, 112, 88).a("skin", 0.0F, 0.0F, 2.0F, 56, 0, 56, -56, 88), gbo.a(12.0F, 2.0F, -6.0F)
      );
      $$8.a(
         "left_wing_tip",
         gbr.c().a().a("bone", 0.0F, -2.0F, -2.0F, 56, 4, 4, 112, 136).a("skin", 0.0F, 0.0F, 2.0F, 56, 0, 56, -56, 144),
         gbo.a(56.0F, 0.0F, 0.0F)
      );
      gbw $$9 = $$7.a("left_front_leg", gbr.c().a("main", -4.0F, -4.0F, -4.0F, 8, 24, 8, 112, 104), gbo.a(12.0F, 17.0F, -6.0F, 1.3F, 0.0F, 0.0F));
      gbw $$10 = $$9.a("left_front_leg_tip", gbr.c().a("main", -3.0F, -1.0F, -3.0F, 6, 24, 6, 226, 138), gbo.a(0.0F, 20.0F, -1.0F, -0.5F, 0.0F, 0.0F));
      $$10.a("left_front_foot", gbr.c().a("main", -4.0F, 0.0F, -12.0F, 8, 4, 16, 144, 104), gbo.a(0.0F, 23.0F, 0.0F, 0.75F, 0.0F, 0.0F));
      gbw $$11 = $$7.a("left_hind_leg", gbr.c().a("main", -8.0F, -4.0F, -8.0F, 16, 32, 16, 0, 0), gbo.a(16.0F, 13.0F, 34.0F, 1.0F, 0.0F, 0.0F));
      gbw $$12 = $$11.a("left_hind_leg_tip", gbr.c().a("main", -6.0F, -2.0F, 0.0F, 12, 32, 12, 196, 0), gbo.a(0.0F, 32.0F, -4.0F, 0.5F, 0.0F, 0.0F));
      $$12.a("left_hind_foot", gbr.c().a("main", -9.0F, 0.0F, -20.0F, 18, 6, 24, 112, 0), gbo.a(0.0F, 31.0F, 4.0F, 0.75F, 0.0F, 0.0F));
      gbw $$13 = $$7.a(
         "right_wing", gbr.c().a("bone", -56.0F, -4.0F, -4.0F, 56, 8, 8, 112, 88).a("skin", -56.0F, 0.0F, 2.0F, 56, 0, 56, -56, 88), gbo.a(-12.0F, 2.0F, -6.0F)
      );
      $$13.a(
         "right_wing_tip",
         gbr.c().a("bone", -56.0F, -2.0F, -2.0F, 56, 4, 4, 112, 136).a("skin", -56.0F, 0.0F, 2.0F, 56, 0, 56, -56, 144),
         gbo.a(-56.0F, 0.0F, 0.0F)
      );
      gbw $$14 = $$7.a("right_front_leg", gbr.c().a("main", -4.0F, -4.0F, -4.0F, 8, 24, 8, 112, 104), gbo.a(-12.0F, 17.0F, -6.0F, 1.3F, 0.0F, 0.0F));
      gbw $$15 = $$14.a("right_front_leg_tip", gbr.c().a("main", -3.0F, -1.0F, -3.0F, 6, 24, 6, 226, 138), gbo.a(0.0F, 20.0F, -1.0F, -0.5F, 0.0F, 0.0F));
      $$15.a("right_front_foot", gbr.c().a("main", -4.0F, 0.0F, -12.0F, 8, 4, 16, 144, 104), gbo.a(0.0F, 23.0F, 0.0F, 0.75F, 0.0F, 0.0F));
      gbw $$16 = $$7.a("right_hind_leg", gbr.c().a("main", -8.0F, -4.0F, -8.0F, 16, 32, 16, 0, 0), gbo.a(-16.0F, 13.0F, 34.0F, 1.0F, 0.0F, 0.0F));
      gbw $$17 = $$16.a("right_hind_leg_tip", gbr.c().a("main", -6.0F, -2.0F, 0.0F, 12, 32, 12, 196, 0), gbo.a(0.0F, 32.0F, -4.0F, 0.5F, 0.0F, 0.0F));
      $$17.a("right_hind_foot", gbr.c().a("main", -9.0F, 0.0F, -20.0F, 18, 6, 24, 112, 0), gbo.a(0.0F, 31.0F, 4.0F, 0.75F, 0.0F, 0.0F));
      return gbs.a($$0, 256, 256);
   }

   public void a(gul $$0) {
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
      cjm.a $$7 = $$0.a(6);
      float $$8 = azk.h($$0.a(5).b() - $$0.a(10).b());
      float $$9 = azk.h($$0.a(5).b() + $$8 / 2.0F);

      for (int $$10 = 0; $$10 < 5; $$10++) {
         gbm $$11 = this.d[$$10];
         cjm.a $$12 = $$0.a(5 - $$10);
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
      cjm.a $$14 = $$0.a(0);
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
         cjm.a $$17 = $$0.a(12 + $$16);
         $$15 += azk.a((float)$$16 * 0.45F + $$1) * 0.05F;
         gbm $$18 = this.e[$$16];
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

   private void a(float $$0, gbm $$1, gbm $$2, gbm $$3, gbm $$4, gbm $$5, gbm $$6) {
      $$4.e = 1.0F + $$0 * 0.1F;
      $$5.e = 0.5F + $$0 * 0.1F;
      $$6.e = 0.75F + $$0 * 0.1F;
      $$1.e = 1.3F + $$0 * 0.1F;
      $$2.e = -0.5F - $$0 * 0.1F;
      $$3.e = 0.75F + $$0 * 0.1F;
   }
}
