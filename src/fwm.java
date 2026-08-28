public class fwm extends fxa<gsk> {
   private static final float b = 2.0F;
   private static final float c = 2.5F;
   public static final gak a = gak.scaling(0.45F);
   private static final String d = "saddle";
   private static final String e = "bridle";
   private static final String f = "reins";
   private final gab g;
   private final gab i;
   private final gab[] j;
   private final gab[] k;

   public fwm(gab $$0) {
      this.g = $$0;
      gab $$1 = $$0.b("body");
      this.i = $$1.b("head");
      this.j = new gab[]{$$1.b("saddle"), this.i.b("bridle")};
      this.k = new gab[]{this.i.b("reins")};
   }

   public static gah b() {
      gaj $$0 = new gaj();
      gal $$1 = $$0.a();
      gaf $$2 = new gaf(0.05F);
      gal $$3 = $$1.a("body", gag.c().a(0, 25).a(-7.5F, -12.0F, -23.5F, 15.0F, 12.0F, 27.0F), gad.a(0.0F, 4.0F, 9.5F));
      $$3.a("hump", gag.c().a(74, 0).a(-4.5F, -5.0F, -5.5F, 9.0F, 5.0F, 11.0F), gad.a(0.0F, -12.0F, -10.0F));
      $$3.a("tail", gag.c().a(122, 0).a(-1.5F, 0.0F, 0.0F, 3.0F, 14.0F, 0.0F), gad.a(0.0F, -9.0F, 3.5F));
      gal $$4 = $$3.a(
         "head",
         gag.c()
            .a(60, 24)
            .a(-3.5F, -7.0F, -15.0F, 7.0F, 8.0F, 19.0F)
            .a(21, 0)
            .a(-3.5F, -21.0F, -15.0F, 7.0F, 14.0F, 7.0F)
            .a(50, 0)
            .a(-2.5F, -21.0F, -21.0F, 5.0F, 5.0F, 6.0F),
         gad.a(0.0F, -3.0F, -19.5F)
      );
      $$4.a("left_ear", gag.c().a(45, 0).a(-0.5F, 0.5F, -1.0F, 3.0F, 1.0F, 2.0F), gad.a(2.5F, -21.0F, -9.5F));
      $$4.a("right_ear", gag.c().a(67, 0).a(-2.5F, 0.5F, -1.0F, 3.0F, 1.0F, 2.0F), gad.a(-2.5F, -21.0F, -9.5F));
      $$1.a("left_hind_leg", gag.c().a(58, 16).a(-2.5F, 2.0F, -2.5F, 5.0F, 21.0F, 5.0F), gad.a(4.9F, 1.0F, 9.5F));
      $$1.a("right_hind_leg", gag.c().a(94, 16).a(-2.5F, 2.0F, -2.5F, 5.0F, 21.0F, 5.0F), gad.a(-4.9F, 1.0F, 9.5F));
      $$1.a("left_front_leg", gag.c().a(0, 0).a(-2.5F, 2.0F, -2.5F, 5.0F, 21.0F, 5.0F), gad.a(4.9F, 1.0F, -10.5F));
      $$1.a("right_front_leg", gag.c().a(0, 26).a(-2.5F, 2.0F, -2.5F, 5.0F, 21.0F, 5.0F), gad.a(-4.9F, 1.0F, -10.5F));
      $$3.a(
         "saddle",
         gag.c()
            .a(74, 64)
            .a(-4.5F, -17.0F, -15.5F, 9.0F, 5.0F, 11.0F, $$2)
            .a(92, 114)
            .a(-3.5F, -20.0F, -15.5F, 7.0F, 3.0F, 11.0F, $$2)
            .a(0, 89)
            .a(-7.5F, -12.0F, -23.5F, 15.0F, 12.0F, 27.0F, $$2),
         gad.a(0.0F, 0.0F, 0.0F)
      );
      $$4.a(
         "reins",
         gag.c()
            .a(98, 42)
            .a(3.51F, -18.0F, -17.0F, 0.0F, 7.0F, 15.0F)
            .a(84, 57)
            .a(-3.5F, -18.0F, -2.0F, 7.0F, 7.0F, 0.0F)
            .a(98, 42)
            .a(-3.51F, -18.0F, -17.0F, 0.0F, 7.0F, 15.0F),
         gad.a(0.0F, 0.0F, 0.0F)
      );
      $$4.a(
         "bridle",
         gag.c()
            .a(60, 87)
            .a(-3.5F, -7.0F, -15.0F, 7.0F, 8.0F, 19.0F, $$2)
            .a(21, 64)
            .a(-3.5F, -21.0F, -15.0F, 7.0F, 14.0F, 7.0F, $$2)
            .a(50, 64)
            .a(-2.5F, -21.0F, -21.0F, 5.0F, 5.0F, 6.0F, $$2)
            .a(74, 70)
            .a(2.5F, -19.0F, -18.0F, 1.0F, 2.0F, 2.0F)
            .a(74, 70)
            .a()
            .a(-3.5F, -19.0F, -18.0F, 1.0F, 2.0F, 2.0F),
         gad.a(0.0F, 0.0F, 0.0F)
      );
      return gah.a($$0, 128, 128);
   }

   public void a(gsk $$0) {
      this.a().e().forEach(gab::c);
      this.a($$0, $$0.U, $$0.V);
      this.b($$0);
      this.a(fiw.a, $$0.X, $$0.Y, 2.0F, 2.5F);
      this.a($$0.d, fiw.b, $$0.p, 1.0F);
      this.a($$0.e, fiw.c, $$0.p, 1.0F);
      this.a($$0.f, fiw.d, $$0.p, 1.0F);
      this.a($$0.g, fiw.f, $$0.p, 1.0F);
      this.a($$0.h, fiw.e, $$0.p, 1.0F);
   }

   private void a(gsk $$0, float $$1, float $$2) {
      $$1 = azc.a($$1, -30.0F, 30.0F);
      $$2 = azc.a($$2, -25.0F, 45.0F);
      if ($$0.c > 0.0F) {
         float $$3 = 45.0F * $$0.c / 55.0F;
         $$2 = azc.a($$2 + $$3, -25.0F, 70.0F);
      }

      this.i.f = $$1 * (float) (Math.PI / 180.0);
      this.i.e = $$2 * (float) (Math.PI / 180.0);
   }

   private void b(gsk $$0) {
      boolean $$1 = $$0.a;
      boolean $$2 = $$0.b;

      for (gab $$3 : this.j) {
         $$3.k = $$1;
      }

      for (gab $$4 : this.k) {
         $$4.k = $$2 && $$1;
      }
   }

   @Override
   public gab a() {
      return this.g;
   }
}
