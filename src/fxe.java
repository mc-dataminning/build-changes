public class fxe extends fxa<gte> {
   private static final float a = 1.5F;
   private static final float b = 1.0F;
   private static final float c = 2.5F;
   private final gab d;
   private final gab e;
   private final gab f;
   private final gab g;
   private final gab i;
   private final gab j;
   private final gab k;
   private final gab l;
   private final gab m;
   private final gab n;

   public fxe(gab $$0) {
      this.d = $$0.b("root");
      this.e = this.d.b("body");
      this.f = this.e.b("head");
      this.g = this.f.b("eyes");
      this.i = this.e.b("tongue");
      this.j = this.e.b("left_arm");
      this.k = this.e.b("right_arm");
      this.l = this.d.b("left_leg");
      this.m = this.d.b("right_leg");
      this.n = this.e.b("croaking_body");
   }

   public static gah b() {
      gaj $$0 = new gaj();
      gal $$1 = $$0.a();
      gal $$2 = $$1.a("root", gag.c(), gad.a(0.0F, 24.0F, 0.0F));
      gal $$3 = $$2.a(
         "body", gag.c().a(3, 1).a(-3.5F, -2.0F, -8.0F, 7.0F, 3.0F, 9.0F).a(23, 22).a(-3.5F, -1.0F, -8.0F, 7.0F, 0.0F, 9.0F), gad.a(0.0F, -2.0F, 4.0F)
      );
      gal $$4 = $$3.a(
         "head", gag.c().a(23, 13).a(-3.5F, -1.0F, -7.0F, 7.0F, 0.0F, 9.0F).a(0, 13).a(-3.5F, -2.0F, -7.0F, 7.0F, 3.0F, 9.0F), gad.a(0.0F, -2.0F, -1.0F)
      );
      gal $$5 = $$4.a("eyes", gag.c(), gad.a(-0.5F, 0.0F, 2.0F));
      $$5.a("right_eye", gag.c().a(0, 0).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), gad.a(-1.5F, -3.0F, -6.5F));
      $$5.a("left_eye", gag.c().a(0, 5).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), gad.a(2.5F, -3.0F, -6.5F));
      $$3.a("croaking_body", gag.c().a(26, 5).a(-3.5F, -0.1F, -2.9F, 7.0F, 2.0F, 3.0F, new gaf(-0.1F)), gad.a(0.0F, -1.0F, -5.0F));
      gal $$6 = $$3.a("tongue", gag.c().a(17, 13).a(-2.0F, 0.0F, -7.1F, 4.0F, 0.0F, 7.0F), gad.a(0.0F, -1.01F, 1.0F));
      gal $$7 = $$3.a("left_arm", gag.c().a(0, 32).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), gad.a(4.0F, -1.0F, -6.5F));
      $$7.a("left_hand", gag.c().a(18, 40).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), gad.a(0.0F, 3.0F, -1.0F));
      gal $$8 = $$3.a("right_arm", gag.c().a(0, 38).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), gad.a(-4.0F, -1.0F, -6.5F));
      $$8.a("right_hand", gag.c().a(2, 40).a(-4.0F, 0.01F, -5.0F, 8.0F, 0.0F, 8.0F), gad.a(0.0F, 3.0F, 0.0F));
      gal $$9 = $$2.a("left_leg", gag.c().a(14, 25).a(-1.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), gad.a(3.5F, -3.0F, 4.0F));
      $$9.a("left_foot", gag.c().a(2, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), gad.a(2.0F, 3.0F, 0.0F));
      gal $$10 = $$2.a("right_leg", gag.c().a(0, 25).a(-2.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), gad.a(-3.5F, -3.0F, 4.0F));
      $$10.a("right_foot", gag.c().a(18, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), gad.a(-2.0F, 3.0F, 0.0F));
      return gah.a($$0, 48, 48);
   }

   public void a(gte $$0) {
      this.a().e().forEach(gab::c);
      this.a($$0.b, fix.c, $$0.p);
      this.a($$0.c, fix.a, $$0.p);
      this.a($$0.d, fix.d, $$0.p);
      if ($$0.a) {
         this.a(fix.e, $$0.X, $$0.Y, 1.0F, 2.5F);
      } else {
         this.a(fix.b, $$0.X, $$0.Y, 1.5F, 2.5F);
      }

      this.a($$0.e, fix.f, $$0.p);
      this.n.k = $$0.c.b();
   }

   @Override
   public gab a() {
      return this.d;
   }
}
