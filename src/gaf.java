public class gaf extends fxk<gtj> {
   private static final int a = 5;
   private static final int b = 12;
   private final gal c;
   private final gal d;
   private final gal[] e = new gal[5];
   private final gal[] f = new gal[12];
   private final gal g;
   private final gal i;
   private final gal j;
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
   private final gal u;
   private final gal w;
   private final gal x;
   private final gal y;
   private final gal z;

   private static String a(int $$0) {
      return "neck" + $$0;
   }

   private static String b(int $$0) {
      return "tail" + $$0;
   }

   public gaf(gal $$0) {
      this.c = $$0;
      this.d = $$0.b("head");
      this.g = this.d.b("jaw");

      for (int $$1 = 0; $$1 < this.e.length; $$1++) {
         this.e[$$1] = $$0.b(a($$1));
      }

      for (int $$2 = 0; $$2 < this.f.length; $$2++) {
         this.f[$$2] = $$0.b(b($$2));
      }

      this.i = $$0.b("body");
      this.j = this.i.b("left_wing");
      this.k = this.j.b("left_wing_tip");
      this.l = this.i.b("left_front_leg");
      this.m = this.l.b("left_front_leg_tip");
      this.n = this.m.b("left_front_foot");
      this.o = this.i.b("left_hind_leg");
      this.p = this.o.b("left_hind_leg_tip");
      this.q = this.p.b("left_hind_foot");
      this.r = this.i.b("right_wing");
      this.s = this.r.b("right_wing_tip");
      this.t = this.i.b("right_front_leg");
      this.u = this.t.b("right_front_leg_tip");
      this.w = this.u.b("right_front_foot");
      this.x = this.i.b("right_hind_leg");
      this.y = this.x.b("right_hind_leg_tip");
      this.z = this.y.b("right_hind_foot");
   }

   public static gar b() {
      gat $$0 = new gat();
      gav $$1 = $$0.a();
      float $$2 = -16.0F;
      gav $$3 = $$1.a(
         "head",
         gaq.c()
            .a("upperlip", -6.0F, -1.0F, -24.0F, 12, 5, 16, 176, 44)
            .a("upperhead", -8.0F, -8.0F, -10.0F, 16, 16, 16, 112, 30)
            .a()
            .a("scale", -5.0F, -12.0F, -4.0F, 2, 4, 6, 0, 0)
            .a("nostril", -5.0F, -3.0F, -22.0F, 2, 2, 4, 112, 0)
            .a()
            .a("scale", 3.0F, -12.0F, -4.0F, 2, 4, 6, 0, 0)
            .a("nostril", 3.0F, -3.0F, -22.0F, 2, 2, 4, 112, 0),
         gan.a(0.0F, 20.0F, -62.0F)
      );
      $$3.a("jaw", gaq.c().a("jaw", -6.0F, 0.0F, -16.0F, 12, 4, 16, 176, 65), gan.a(0.0F, 4.0F, -8.0F));
      gaq $$4 = gaq.c().a("box", -5.0F, -5.0F, -5.0F, 10, 10, 10, 192, 104).a("scale", -1.0F, -9.0F, -3.0F, 2, 4, 6, 48, 0);

      for (int $$5 = 0; $$5 < 5; $$5++) {
         $$1.a(a($$5), $$4, gan.a(0.0F, 20.0F, -12.0F - (float)$$5 * 10.0F));
      }

      for (int $$6 = 0; $$6 < 12; $$6++) {
         $$1.a(b($$6), $$4, gan.a(0.0F, 10.0F, 60.0F + (float)$$6 * 10.0F));
      }

      gav $$7 = $$1.a(
         "body",
         gaq.c()
            .a("body", -12.0F, 1.0F, -16.0F, 24, 24, 64, 0, 0)
            .a("scale", -1.0F, -5.0F, -10.0F, 2, 6, 12, 220, 53)
            .a("scale", -1.0F, -5.0F, 10.0F, 2, 6, 12, 220, 53)
            .a("scale", -1.0F, -5.0F, 30.0F, 2, 6, 12, 220, 53),
         gan.a(0.0F, 3.0F, 8.0F)
      );
      gav $$8 = $$7.a(
         "left_wing", gaq.c().a().a("bone", 0.0F, -4.0F, -4.0F, 56, 8, 8, 112, 88).a("skin", 0.0F, 0.0F, 2.0F, 56, 0, 56, -56, 88), gan.a(12.0F, 2.0F, -6.0F)
      );
      $$8.a(
         "left_wing_tip",
         gaq.c().a().a("bone", 0.0F, -2.0F, -2.0F, 56, 4, 4, 112, 136).a("skin", 0.0F, 0.0F, 2.0F, 56, 0, 56, -56, 144),
         gan.a(56.0F, 0.0F, 0.0F)
      );
      gav $$9 = $$7.a("left_front_leg", gaq.c().a("main", -4.0F, -4.0F, -4.0F, 8, 24, 8, 112, 104), gan.a(12.0F, 17.0F, -6.0F, 1.3F, 0.0F, 0.0F));
      gav $$10 = $$9.a("left_front_leg_tip", gaq.c().a("main", -3.0F, -1.0F, -3.0F, 6, 24, 6, 226, 138), gan.a(0.0F, 20.0F, -1.0F, -0.5F, 0.0F, 0.0F));
      $$10.a("left_front_foot", gaq.c().a("main", -4.0F, 0.0F, -12.0F, 8, 4, 16, 144, 104), gan.a(0.0F, 23.0F, 0.0F, 0.75F, 0.0F, 0.0F));
      gav $$11 = $$7.a("left_hind_leg", gaq.c().a("main", -8.0F, -4.0F, -8.0F, 16, 32, 16, 0, 0), gan.a(16.0F, 13.0F, 34.0F, 1.0F, 0.0F, 0.0F));
      gav $$12 = $$11.a("left_hind_leg_tip", gaq.c().a("main", -6.0F, -2.0F, 0.0F, 12, 32, 12, 196, 0), gan.a(0.0F, 32.0F, -4.0F, 0.5F, 0.0F, 0.0F));
      $$12.a("left_hind_foot", gaq.c().a("main", -9.0F, 0.0F, -20.0F, 18, 6, 24, 112, 0), gan.a(0.0F, 31.0F, 4.0F, 0.75F, 0.0F, 0.0F));
      gav $$13 = $$7.a(
         "right_wing", gaq.c().a("bone", -56.0F, -4.0F, -4.0F, 56, 8, 8, 112, 88).a("skin", -56.0F, 0.0F, 2.0F, 56, 0, 56, -56, 88), gan.a(-12.0F, 2.0F, -6.0F)
      );
      $$13.a(
         "right_wing_tip",
         gaq.c().a("bone", -56.0F, -2.0F, -2.0F, 56, 4, 4, 112, 136).a("skin", -56.0F, 0.0F, 2.0F, 56, 0, 56, -56, 144),
         gan.a(-56.0F, 0.0F, 0.0F)
      );
      gav $$14 = $$7.a("right_front_leg", gaq.c().a("main", -4.0F, -4.0F, -4.0F, 8, 24, 8, 112, 104), gan.a(-12.0F, 17.0F, -6.0F, 1.3F, 0.0F, 0.0F));
      gav $$15 = $$14.a("right_front_leg_tip", gaq.c().a("main", -3.0F, -1.0F, -3.0F, 6, 24, 6, 226, 138), gan.a(0.0F, 20.0F, -1.0F, -0.5F, 0.0F, 0.0F));
      $$15.a("right_front_foot", gaq.c().a("main", -4.0F, 0.0F, -12.0F, 8, 4, 16, 144, 104), gan.a(0.0F, 23.0F, 0.0F, 0.75F, 0.0F, 0.0F));
      gav $$16 = $$7.a("right_hind_leg", gaq.c().a("main", -8.0F, -4.0F, -8.0F, 16, 32, 16, 0, 0), gan.a(-16.0F, 13.0F, 34.0F, 1.0F, 0.0F, 0.0F));
      gav $$17 = $$16.a("right_hind_leg_tip", gaq.c().a("main", -6.0F, -2.0F, 0.0F, 12, 32, 12, 196, 0), gan.a(0.0F, 32.0F, -4.0F, 0.5F, 0.0F, 0.0F));
      $$17.a("right_hind_foot", gaq.c().a("main", -9.0F, 0.0F, -20.0F, 18, 6, 24, 112, 0), gan.a(0.0F, 31.0F, 4.0F, 0.75F, 0.0F, 0.0F));
      return gar.a($$0, 256, 256);
   }

   public void a(gtj $$0) {
      this.a().e().forEach(gal::c);
      float $$1 = $$0.a * (float) (Math.PI * 2);
      this.g.e = (azd.a($$1) + 1.0F) * 0.2F;
      float $$2 = azd.a($$1 - 1.0F) + 1.0F;
      $$2 = ($$2 * $$2 + $$2 * 2.0F) * 0.05F;
      this.c.c = ($$2 - 2.0F) * 16.0F;
      this.c.d = -48.0F;
      this.c.e = $$2 * 2.0F * (float) (Math.PI / 180.0);
      float $$3 = this.e[0].b;
      float $$4 = this.e[0].c;
      float $$5 = this.e[0].d;
      float $$6 = 1.5F;
      civ.a $$7 = $$0.a(6);
      float $$8 = azd.g($$0.a(5).b() - $$0.a(10).b());
      float $$9 = azd.g($$0.a(5).b() + $$8 / 2.0F);

      for (int $$10 = 0; $$10 < 5; $$10++) {
         gal $$11 = this.e[$$10];
         civ.a $$12 = $$0.a(5 - $$10);
         float $$13 = azd.b((float)$$10 * 0.45F + $$1) * 0.15F;
         $$11.f = azd.g($$12.b() - $$7.b()) * (float) (Math.PI / 180.0) * 1.5F;
         $$11.e = $$13 + $$0.a($$10, $$7, $$12) * (float) (Math.PI / 180.0) * 1.5F * 5.0F;
         $$11.g = -azd.g($$12.b() - $$9) * (float) (Math.PI / 180.0) * 1.5F;
         $$11.c = $$4;
         $$11.d = $$5;
         $$11.b = $$3;
         $$3 -= azd.a($$11.f) * azd.b($$11.e) * 10.0F;
         $$4 += azd.a($$11.e) * 10.0F;
         $$5 -= azd.b($$11.f) * azd.b($$11.e) * 10.0F;
      }

      this.d.c = $$4;
      this.d.d = $$5;
      this.d.b = $$3;
      civ.a $$14 = $$0.a(0);
      this.d.f = azd.g($$14.b() - $$7.b()) * (float) (Math.PI / 180.0);
      this.d.e = azd.g($$0.a(6, $$7, $$14)) * (float) (Math.PI / 180.0) * 1.5F * 5.0F;
      this.d.g = -azd.g($$14.b() - $$9) * (float) (Math.PI / 180.0);
      this.i.g = -$$8 * 1.5F * (float) (Math.PI / 180.0);
      this.j.e = 0.125F - azd.b($$1) * 0.2F;
      this.j.f = -0.25F;
      this.j.g = -(azd.a($$1) + 0.125F) * 0.8F;
      this.k.g = (azd.a($$1 + 2.0F) + 0.5F) * 0.75F;
      this.r.e = this.j.e;
      this.r.f = -this.j.f;
      this.r.g = -this.j.g;
      this.s.g = -this.k.g;
      this.a($$2, this.l, this.m, this.n, this.o, this.p, this.q);
      this.a($$2, this.t, this.u, this.w, this.x, this.y, this.z);
      float $$15 = 0.0F;
      $$4 = this.f[0].c;
      $$5 = this.f[0].d;
      $$3 = this.f[0].b;
      $$7 = $$0.a(11);

      for (int $$16 = 0; $$16 < 12; $$16++) {
         civ.a $$17 = $$0.a(12 + $$16);
         $$15 += azd.a((float)$$16 * 0.45F + $$1) * 0.05F;
         gal $$18 = this.f[$$16];
         $$18.f = (azd.g($$17.b() - $$7.b()) * 1.5F + 180.0F) * (float) (Math.PI / 180.0);
         $$18.e = $$15 + (float)($$17.a() - $$7.a()) * (float) (Math.PI / 180.0) * 1.5F * 5.0F;
         $$18.g = azd.g($$17.b() - $$9) * (float) (Math.PI / 180.0) * 1.5F;
         $$18.c = $$4;
         $$18.d = $$5;
         $$18.b = $$3;
         $$4 += azd.a($$18.e) * 10.0F;
         $$5 -= azd.b($$18.f) * azd.b($$18.e) * 10.0F;
         $$3 -= azd.a($$18.f) * azd.b($$18.e) * 10.0F;
      }
   }

   private void a(float $$0, gal $$1, gal $$2, gal $$3, gal $$4, gal $$5, gal $$6) {
      $$4.e = 1.0F + $$0 * 0.1F;
      $$5.e = 0.5F + $$0 * 0.1F;
      $$6.e = 0.75F + $$0 * 0.1F;
      $$1.e = 1.3F + $$0 * 0.1F;
      $$2.e = -0.5F - $$0 * 0.1F;
      $$3.e = 0.75F + $$0 * 0.1F;
   }

   @Override
   public gal a() {
      return this.c;
   }
}
