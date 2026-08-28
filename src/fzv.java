public class fzv extends fxa<gss> {
   private static final int a = 5;
   private static final int b = 12;
   private final gab c;
   private final gab d;
   private final gab[] e = new gab[5];
   private final gab[] f = new gab[12];
   private final gab g;
   private final gab i;
   private final gab j;
   private final gab k;
   private final gab l;
   private final gab m;
   private final gab n;
   private final gab o;
   private final gab p;
   private final gab q;
   private final gab r;
   private final gab s;
   private final gab t;
   private final gab u;
   private final gab w;
   private final gab x;
   private final gab y;
   private final gab z;

   private static String a(int $$0) {
      return "neck" + $$0;
   }

   private static String b(int $$0) {
      return "tail" + $$0;
   }

   public fzv(gab $$0) {
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

   public static gah b() {
      gaj $$0 = new gaj();
      gal $$1 = $$0.a();
      float $$2 = -16.0F;
      gal $$3 = $$1.a(
         "head",
         gag.c()
            .a("upperlip", -6.0F, -1.0F, -24.0F, 12, 5, 16, 176, 44)
            .a("upperhead", -8.0F, -8.0F, -10.0F, 16, 16, 16, 112, 30)
            .a()
            .a("scale", -5.0F, -12.0F, -4.0F, 2, 4, 6, 0, 0)
            .a("nostril", -5.0F, -3.0F, -22.0F, 2, 2, 4, 112, 0)
            .a()
            .a("scale", 3.0F, -12.0F, -4.0F, 2, 4, 6, 0, 0)
            .a("nostril", 3.0F, -3.0F, -22.0F, 2, 2, 4, 112, 0),
         gad.a(0.0F, 20.0F, -62.0F)
      );
      $$3.a("jaw", gag.c().a("jaw", -6.0F, 0.0F, -16.0F, 12, 4, 16, 176, 65), gad.a(0.0F, 4.0F, -8.0F));
      gag $$4 = gag.c().a("box", -5.0F, -5.0F, -5.0F, 10, 10, 10, 192, 104).a("scale", -1.0F, -9.0F, -3.0F, 2, 4, 6, 48, 0);

      for (int $$5 = 0; $$5 < 5; $$5++) {
         $$1.a(a($$5), $$4, gad.a(0.0F, 20.0F, -12.0F - (float)$$5 * 10.0F));
      }

      for (int $$6 = 0; $$6 < 12; $$6++) {
         $$1.a(b($$6), $$4, gad.a(0.0F, 10.0F, 60.0F + (float)$$6 * 10.0F));
      }

      gal $$7 = $$1.a(
         "body",
         gag.c()
            .a("body", -12.0F, 1.0F, -16.0F, 24, 24, 64, 0, 0)
            .a("scale", -1.0F, -5.0F, -10.0F, 2, 6, 12, 220, 53)
            .a("scale", -1.0F, -5.0F, 10.0F, 2, 6, 12, 220, 53)
            .a("scale", -1.0F, -5.0F, 30.0F, 2, 6, 12, 220, 53),
         gad.a(0.0F, 3.0F, 8.0F)
      );
      gal $$8 = $$7.a(
         "left_wing", gag.c().a().a("bone", 0.0F, -4.0F, -4.0F, 56, 8, 8, 112, 88).a("skin", 0.0F, 0.0F, 2.0F, 56, 0, 56, -56, 88), gad.a(12.0F, 2.0F, -6.0F)
      );
      $$8.a(
         "left_wing_tip",
         gag.c().a().a("bone", 0.0F, -2.0F, -2.0F, 56, 4, 4, 112, 136).a("skin", 0.0F, 0.0F, 2.0F, 56, 0, 56, -56, 144),
         gad.a(56.0F, 0.0F, 0.0F)
      );
      gal $$9 = $$7.a("left_front_leg", gag.c().a("main", -4.0F, -4.0F, -4.0F, 8, 24, 8, 112, 104), gad.a(12.0F, 17.0F, -6.0F, 1.3F, 0.0F, 0.0F));
      gal $$10 = $$9.a("left_front_leg_tip", gag.c().a("main", -3.0F, -1.0F, -3.0F, 6, 24, 6, 226, 138), gad.a(0.0F, 20.0F, -1.0F, -0.5F, 0.0F, 0.0F));
      $$10.a("left_front_foot", gag.c().a("main", -4.0F, 0.0F, -12.0F, 8, 4, 16, 144, 104), gad.a(0.0F, 23.0F, 0.0F, 0.75F, 0.0F, 0.0F));
      gal $$11 = $$7.a("left_hind_leg", gag.c().a("main", -8.0F, -4.0F, -8.0F, 16, 32, 16, 0, 0), gad.a(16.0F, 13.0F, 34.0F, 1.0F, 0.0F, 0.0F));
      gal $$12 = $$11.a("left_hind_leg_tip", gag.c().a("main", -6.0F, -2.0F, 0.0F, 12, 32, 12, 196, 0), gad.a(0.0F, 32.0F, -4.0F, 0.5F, 0.0F, 0.0F));
      $$12.a("left_hind_foot", gag.c().a("main", -9.0F, 0.0F, -20.0F, 18, 6, 24, 112, 0), gad.a(0.0F, 31.0F, 4.0F, 0.75F, 0.0F, 0.0F));
      gal $$13 = $$7.a(
         "right_wing", gag.c().a("bone", -56.0F, -4.0F, -4.0F, 56, 8, 8, 112, 88).a("skin", -56.0F, 0.0F, 2.0F, 56, 0, 56, -56, 88), gad.a(-12.0F, 2.0F, -6.0F)
      );
      $$13.a(
         "right_wing_tip",
         gag.c().a("bone", -56.0F, -2.0F, -2.0F, 56, 4, 4, 112, 136).a("skin", -56.0F, 0.0F, 2.0F, 56, 0, 56, -56, 144),
         gad.a(-56.0F, 0.0F, 0.0F)
      );
      gal $$14 = $$7.a("right_front_leg", gag.c().a("main", -4.0F, -4.0F, -4.0F, 8, 24, 8, 112, 104), gad.a(-12.0F, 17.0F, -6.0F, 1.3F, 0.0F, 0.0F));
      gal $$15 = $$14.a("right_front_leg_tip", gag.c().a("main", -3.0F, -1.0F, -3.0F, 6, 24, 6, 226, 138), gad.a(0.0F, 20.0F, -1.0F, -0.5F, 0.0F, 0.0F));
      $$15.a("right_front_foot", gag.c().a("main", -4.0F, 0.0F, -12.0F, 8, 4, 16, 144, 104), gad.a(0.0F, 23.0F, 0.0F, 0.75F, 0.0F, 0.0F));
      gal $$16 = $$7.a("right_hind_leg", gag.c().a("main", -8.0F, -4.0F, -8.0F, 16, 32, 16, 0, 0), gad.a(-16.0F, 13.0F, 34.0F, 1.0F, 0.0F, 0.0F));
      gal $$17 = $$16.a("right_hind_leg_tip", gag.c().a("main", -6.0F, -2.0F, 0.0F, 12, 32, 12, 196, 0), gad.a(0.0F, 32.0F, -4.0F, 0.5F, 0.0F, 0.0F));
      $$17.a("right_hind_foot", gag.c().a("main", -9.0F, 0.0F, -20.0F, 18, 6, 24, 112, 0), gad.a(0.0F, 31.0F, 4.0F, 0.75F, 0.0F, 0.0F));
      return gah.a($$0, 256, 256);
   }

   public void a(gss $$0) {
      this.a().e().forEach(gab::c);
      float $$1 = $$0.a * (float) (Math.PI * 2);
      this.g.e = (azc.a($$1) + 1.0F) * 0.2F;
      float $$2 = azc.a($$1 - 1.0F) + 1.0F;
      $$2 = ($$2 * $$2 + $$2 * 2.0F) * 0.05F;
      this.c.c = ($$2 - 2.0F) * 16.0F;
      this.c.d = -48.0F;
      this.c.e = $$2 * 2.0F * (float) (Math.PI / 180.0);
      float $$3 = this.e[0].b;
      float $$4 = this.e[0].c;
      float $$5 = this.e[0].d;
      float $$6 = 1.5F;
      ciq.a $$7 = $$0.a(6);
      float $$8 = azc.g($$0.a(5).b() - $$0.a(10).b());
      float $$9 = azc.g($$0.a(5).b() + $$8 / 2.0F);

      for (int $$10 = 0; $$10 < 5; $$10++) {
         gab $$11 = this.e[$$10];
         ciq.a $$12 = $$0.a(5 - $$10);
         float $$13 = azc.b((float)$$10 * 0.45F + $$1) * 0.15F;
         $$11.f = azc.g($$12.b() - $$7.b()) * (float) (Math.PI / 180.0) * 1.5F;
         $$11.e = $$13 + $$0.a($$10, $$7, $$12) * (float) (Math.PI / 180.0) * 1.5F * 5.0F;
         $$11.g = -azc.g($$12.b() - $$9) * (float) (Math.PI / 180.0) * 1.5F;
         $$11.c = $$4;
         $$11.d = $$5;
         $$11.b = $$3;
         $$3 -= azc.a($$11.f) * azc.b($$11.e) * 10.0F;
         $$4 += azc.a($$11.e) * 10.0F;
         $$5 -= azc.b($$11.f) * azc.b($$11.e) * 10.0F;
      }

      this.d.c = $$4;
      this.d.d = $$5;
      this.d.b = $$3;
      ciq.a $$14 = $$0.a(0);
      this.d.f = azc.g($$14.b() - $$7.b()) * (float) (Math.PI / 180.0);
      this.d.e = azc.g($$0.a(6, $$7, $$14)) * (float) (Math.PI / 180.0) * 1.5F * 5.0F;
      this.d.g = -azc.g($$14.b() - $$9) * (float) (Math.PI / 180.0);
      this.i.g = -$$8 * 1.5F * (float) (Math.PI / 180.0);
      this.j.e = 0.125F - azc.b($$1) * 0.2F;
      this.j.f = -0.25F;
      this.j.g = -(azc.a($$1) + 0.125F) * 0.8F;
      this.k.g = (azc.a($$1 + 2.0F) + 0.5F) * 0.75F;
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
         ciq.a $$17 = $$0.a(12 + $$16);
         $$15 += azc.a((float)$$16 * 0.45F + $$1) * 0.05F;
         gab $$18 = this.f[$$16];
         $$18.f = (azc.g($$17.b() - $$7.b()) * 1.5F + 180.0F) * (float) (Math.PI / 180.0);
         $$18.e = $$15 + (float)($$17.a() - $$7.a()) * (float) (Math.PI / 180.0) * 1.5F * 5.0F;
         $$18.g = azc.g($$17.b() - $$9) * (float) (Math.PI / 180.0) * 1.5F;
         $$18.c = $$4;
         $$18.d = $$5;
         $$18.b = $$3;
         $$4 += azc.a($$18.e) * 10.0F;
         $$5 -= azc.b($$18.f) * azc.b($$18.e) * 10.0F;
         $$3 -= azc.a($$18.f) * azc.b($$18.e) * 10.0F;
      }
   }

   private void a(float $$0, gab $$1, gab $$2, gab $$3, gab $$4, gab $$5, gab $$6) {
      $$4.e = 1.0F + $$0 * 0.1F;
      $$5.e = 0.5F + $$0 * 0.1F;
      $$6.e = 0.75F + $$0 * 0.1F;
      $$1.e = 1.3F + $$0 * 0.1F;
      $$2.e = -0.5F - $$0 * 0.1F;
      $$3.e = 0.75F + $$0 * 0.1F;
   }

   @Override
   public gab a() {
      return this.c;
   }
}
