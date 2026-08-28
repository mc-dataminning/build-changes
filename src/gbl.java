public class gbl extends gca<gxx> {
   private static final float b = 2.0F;
   private static final float c = 2.5F;
   public static final gfl a = gfl.scaling(0.45F);
   private static final String d = "saddle";
   private static final String e = "bridle";
   private static final String f = "reins";
   private final gfc g;
   private final gfc[] i;
   private final gfc[] j;

   public gbl(gfc $$0) {
      super($$0);
      gfc $$1 = $$0.b("body");
      this.g = $$1.b("head");
      this.i = new gfc[]{$$1.b("saddle"), this.g.b("bridle")};
      this.j = new gfc[]{this.g.b("reins")};
   }

   public static gfi a() {
      gfk $$0 = new gfk();
      gfm $$1 = $$0.a();
      gfg $$2 = new gfg(0.05F);
      gfm $$3 = $$1.a("body", gfh.c().a(0, 25).a(-7.5F, -12.0F, -23.5F, 15.0F, 12.0F, 27.0F), gfe.a(0.0F, 4.0F, 9.5F));
      $$3.a("hump", gfh.c().a(74, 0).a(-4.5F, -5.0F, -5.5F, 9.0F, 5.0F, 11.0F), gfe.a(0.0F, -12.0F, -10.0F));
      $$3.a("tail", gfh.c().a(122, 0).a(-1.5F, 0.0F, 0.0F, 3.0F, 14.0F, 0.0F), gfe.a(0.0F, -9.0F, 3.5F));
      gfm $$4 = $$3.a(
         "head",
         gfh.c()
            .a(60, 24)
            .a(-3.5F, -7.0F, -15.0F, 7.0F, 8.0F, 19.0F)
            .a(21, 0)
            .a(-3.5F, -21.0F, -15.0F, 7.0F, 14.0F, 7.0F)
            .a(50, 0)
            .a(-2.5F, -21.0F, -21.0F, 5.0F, 5.0F, 6.0F),
         gfe.a(0.0F, -3.0F, -19.5F)
      );
      $$4.a("left_ear", gfh.c().a(45, 0).a(-0.5F, 0.5F, -1.0F, 3.0F, 1.0F, 2.0F), gfe.a(2.5F, -21.0F, -9.5F));
      $$4.a("right_ear", gfh.c().a(67, 0).a(-2.5F, 0.5F, -1.0F, 3.0F, 1.0F, 2.0F), gfe.a(-2.5F, -21.0F, -9.5F));
      $$1.a("left_hind_leg", gfh.c().a(58, 16).a(-2.5F, 2.0F, -2.5F, 5.0F, 21.0F, 5.0F), gfe.a(4.9F, 1.0F, 9.5F));
      $$1.a("right_hind_leg", gfh.c().a(94, 16).a(-2.5F, 2.0F, -2.5F, 5.0F, 21.0F, 5.0F), gfe.a(-4.9F, 1.0F, 9.5F));
      $$1.a("left_front_leg", gfh.c().a(0, 0).a(-2.5F, 2.0F, -2.5F, 5.0F, 21.0F, 5.0F), gfe.a(4.9F, 1.0F, -10.5F));
      $$1.a("right_front_leg", gfh.c().a(0, 26).a(-2.5F, 2.0F, -2.5F, 5.0F, 21.0F, 5.0F), gfe.a(-4.9F, 1.0F, -10.5F));
      $$3.a(
         "saddle",
         gfh.c()
            .a(74, 64)
            .a(-4.5F, -17.0F, -15.5F, 9.0F, 5.0F, 11.0F, $$2)
            .a(92, 114)
            .a(-3.5F, -20.0F, -15.5F, 7.0F, 3.0F, 11.0F, $$2)
            .a(0, 89)
            .a(-7.5F, -12.0F, -23.5F, 15.0F, 12.0F, 27.0F, $$2),
         gfe.a(0.0F, 0.0F, 0.0F)
      );
      $$4.a(
         "reins",
         gfh.c()
            .a(98, 42)
            .a(3.51F, -18.0F, -17.0F, 0.0F, 7.0F, 15.0F)
            .a(84, 57)
            .a(-3.5F, -18.0F, -2.0F, 7.0F, 7.0F, 0.0F)
            .a(98, 42)
            .a(-3.51F, -18.0F, -17.0F, 0.0F, 7.0F, 15.0F),
         gfe.a(0.0F, 0.0F, 0.0F)
      );
      $$4.a(
         "bridle",
         gfh.c()
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
         gfe.a(0.0F, 0.0F, 0.0F)
      );
      return gfi.a($$0, 128, 128);
   }

   public void a(gxx $$0) {
      super.a($$0);
      this.a($$0, $$0.aa, $$0.ab);
      this.b($$0);
      this.a(fmd.a, $$0.ad, $$0.ae, 2.0F, 2.5F);
      this.a($$0.d, fmd.b, $$0.u, 1.0F);
      this.a($$0.e, fmd.c, $$0.u, 1.0F);
      this.a($$0.f, fmd.d, $$0.u, 1.0F);
      this.a($$0.g, fmd.f, $$0.u, 1.0F);
      this.a($$0.h, fmd.e, $$0.u, 1.0F);
   }

   private void a(gxx $$0, float $$1, float $$2) {
      $$1 = ayz.a($$1, -30.0F, 30.0F);
      $$2 = ayz.a($$2, -25.0F, 45.0F);
      if ($$0.c > 0.0F) {
         float $$3 = 45.0F * $$0.c / 55.0F;
         $$2 = ayz.a($$2 + $$3, -25.0F, 70.0F);
      }

      this.g.f = $$1 * (float) (Math.PI / 180.0);
      this.g.e = $$2 * (float) (Math.PI / 180.0);
   }

   private void b(gxx $$0) {
      boolean $$1 = $$0.a;
      boolean $$2 = $$0.b;

      for (gfc $$3 : this.i) {
         $$3.k = $$1;
      }

      for (gfc $$4 : this.j) {
         $$4.k = $$2 && $$1;
      }
   }
}
