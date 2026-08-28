public class gku extends gic<hhe> {
   private static final String a = "ribcage";
   private static final String b = "center_head";
   private static final String c = "right_head";
   private static final String d = "left_head";
   private static final float e = 0.065F;
   private static final float f = 0.265F;
   private final glg g;
   private final glg i;
   private final glg j;
   private final glg k;
   private final glg l;

   public gku(glg $$0) {
      super($$0);
      this.k = $$0.b("ribcage");
      this.l = $$0.b("tail");
      this.g = $$0.b("center_head");
      this.i = $$0.b("right_head");
      this.j = $$0.b("left_head");
   }

   public static glm a(glk $$0) {
      glo $$1 = new glo();
      glq $$2 = $$1.a();
      $$2.a("shoulders", gll.c().a(0, 16).a(-10.0F, 3.9F, -0.5F, 20.0F, 3.0F, 3.0F, $$0), gli.a);
      float $$3 = 0.20420352F;
      $$2.a(
         "ribcage",
         gll.c()
            .a(0, 22)
            .a(0.0F, 0.0F, 0.0F, 3.0F, 10.0F, 3.0F, $$0)
            .a(24, 22)
            .a(-4.0F, 1.5F, 0.5F, 11.0F, 2.0F, 2.0F, $$0)
            .a(24, 22)
            .a(-4.0F, 4.0F, 0.5F, 11.0F, 2.0F, 2.0F, $$0)
            .a(24, 22)
            .a(-4.0F, 6.5F, 0.5F, 11.0F, 2.0F, 2.0F, $$0),
         gli.a(-2.0F, 6.9F, -0.5F, 0.20420352F, 0.0F, 0.0F)
      );
      $$2.a(
         "tail",
         gll.c().a(12, 22).a(0.0F, 0.0F, 0.0F, 3.0F, 6.0F, 3.0F, $$0),
         gli.a(-2.0F, 6.9F + azq.b(0.20420352F) * 10.0F, -0.5F + azq.a(0.20420352F) * 10.0F, 0.83252203F, 0.0F, 0.0F)
      );
      $$2.a("center_head", gll.c().a(0, 0).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), gli.a);
      gll $$4 = gll.c().a(32, 0).a(-4.0F, -4.0F, -4.0F, 6.0F, 6.0F, 6.0F, $$0);
      $$2.a("right_head", $$4, gli.a(-8.0F, 4.0F, 0.0F));
      $$2.a("left_head", $$4, gli.a(10.0F, 4.0F, 0.0F));
      return glm.a($$1, 64, 64);
   }

   public void a(hhe $$0) {
      super.a($$0);
      a($$0, this.i, 0);
      a($$0, this.j, 1);
      float $$1 = azq.b($$0.u * 0.1F);
      this.k.e = (0.065F + 0.05F * $$1) * (float) Math.PI;
      this.l.a(-2.0F, 6.9F + azq.b(this.k.e) * 10.0F, -0.5F + azq.a(this.k.e) * 10.0F);
      this.l.e = (0.265F + 0.1F * $$1) * (float) Math.PI;
      this.g.f = $$0.aa * (float) (Math.PI / 180.0);
      this.g.e = $$0.ab * (float) (Math.PI / 180.0);
   }

   private static void a(hhe $$0, glg $$1, int $$2) {
      $$1.f = ($$0.b[$$2] - $$0.Z) * (float) (Math.PI / 180.0);
      $$1.e = $$0.a[$$2] * (float) (Math.PI / 180.0);
   }
}
