public class fzb extends fxa<gts> {
   private static final String a = "body0";
   private static final String b = "body1";
   private static final String c = "right_middle_front_leg";
   private static final String d = "left_middle_front_leg";
   private static final String e = "right_middle_hind_leg";
   private static final String f = "left_middle_hind_leg";
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

   public fzb(gab $$0) {
      this.g = $$0;
      this.i = $$0.b("head");
      this.j = $$0.b("right_hind_leg");
      this.k = $$0.b("left_hind_leg");
      this.l = $$0.b("right_middle_hind_leg");
      this.m = $$0.b("left_middle_hind_leg");
      this.n = $$0.b("right_middle_front_leg");
      this.o = $$0.b("left_middle_front_leg");
      this.p = $$0.b("right_front_leg");
      this.q = $$0.b("left_front_leg");
   }

   public static gah b() {
      gaj $$0 = new gaj();
      gal $$1 = $$0.a();
      int $$2 = 15;
      $$1.a("head", gag.c().a(32, 4).a(-4.0F, -4.0F, -8.0F, 8.0F, 8.0F, 8.0F), gad.a(0.0F, 15.0F, -3.0F));
      $$1.a("body0", gag.c().a(0, 0).a(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F), gad.a(0.0F, 15.0F, 0.0F));
      $$1.a("body1", gag.c().a(0, 12).a(-5.0F, -4.0F, -6.0F, 10.0F, 8.0F, 12.0F), gad.a(0.0F, 15.0F, 9.0F));
      gag $$3 = gag.c().a(18, 0).a(-15.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F);
      gag $$4 = gag.c().a(18, 0).a().a(-1.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F);
      float $$5 = (float) (Math.PI / 4);
      float $$6 = (float) (Math.PI / 8);
      $$1.a("right_hind_leg", $$3, gad.a(-4.0F, 15.0F, 2.0F, 0.0F, (float) (Math.PI / 4), (float) (-Math.PI / 4)));
      $$1.a("left_hind_leg", $$4, gad.a(4.0F, 15.0F, 2.0F, 0.0F, (float) (-Math.PI / 4), (float) (Math.PI / 4)));
      $$1.a("right_middle_hind_leg", $$3, gad.a(-4.0F, 15.0F, 1.0F, 0.0F, (float) (Math.PI / 8), -0.58119464F));
      $$1.a("left_middle_hind_leg", $$4, gad.a(4.0F, 15.0F, 1.0F, 0.0F, (float) (-Math.PI / 8), 0.58119464F));
      $$1.a("right_middle_front_leg", $$3, gad.a(-4.0F, 15.0F, 0.0F, 0.0F, (float) (-Math.PI / 8), -0.58119464F));
      $$1.a("left_middle_front_leg", $$4, gad.a(4.0F, 15.0F, 0.0F, 0.0F, (float) (Math.PI / 8), 0.58119464F));
      $$1.a("right_front_leg", $$3, gad.a(-4.0F, 15.0F, -1.0F, 0.0F, (float) (-Math.PI / 4), (float) (-Math.PI / 4)));
      $$1.a("left_front_leg", $$4, gad.a(4.0F, 15.0F, -1.0F, 0.0F, (float) (Math.PI / 4), (float) (Math.PI / 4)));
      return gah.a($$0, 64, 32);
   }

   @Override
   public gab a() {
      return this.g;
   }

   public void a(gts $$0) {
      this.g.e().forEach(gab::c);
      this.i.f = $$0.U * (float) (Math.PI / 180.0);
      this.i.e = $$0.V * (float) (Math.PI / 180.0);
      float $$1 = $$0.X * 0.6662F;
      float $$2 = $$0.Y;
      float $$3 = -(azc.b($$1 * 2.0F + 0.0F) * 0.4F) * $$2;
      float $$4 = -(azc.b($$1 * 2.0F + (float) Math.PI) * 0.4F) * $$2;
      float $$5 = -(azc.b($$1 * 2.0F + (float) (Math.PI / 2)) * 0.4F) * $$2;
      float $$6 = -(azc.b($$1 * 2.0F + (float) (Math.PI * 3.0 / 2.0)) * 0.4F) * $$2;
      float $$7 = Math.abs(azc.a($$1 + 0.0F) * 0.4F) * $$2;
      float $$8 = Math.abs(azc.a($$1 + (float) Math.PI) * 0.4F) * $$2;
      float $$9 = Math.abs(azc.a($$1 + (float) (Math.PI / 2)) * 0.4F) * $$2;
      float $$10 = Math.abs(azc.a($$1 + (float) (Math.PI * 3.0 / 2.0)) * 0.4F) * $$2;
      this.j.f += $$3;
      this.k.f -= $$3;
      this.l.f += $$4;
      this.m.f -= $$4;
      this.n.f += $$5;
      this.o.f -= $$5;
      this.p.f += $$6;
      this.q.f -= $$6;
      this.j.g += $$7;
      this.k.g -= $$7;
      this.l.g += $$8;
      this.m.g -= $$8;
      this.n.g += $$9;
      this.o.g -= $$9;
      this.p.g += $$10;
      this.q.g -= $$10;
   }
}
