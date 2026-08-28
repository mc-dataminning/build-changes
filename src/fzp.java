public class fzp extends fxa<gvg> {
   private static final String a = "ribcage";
   private static final String b = "center_head";
   private static final String c = "right_head";
   private static final String d = "left_head";
   private static final float e = 0.065F;
   private static final float f = 0.265F;
   private final gab g;
   private final gab i;
   private final gab j;
   private final gab k;
   private final gab l;
   private final gab m;

   public fzp(gab $$0) {
      this.g = $$0;
      this.l = $$0.b("ribcage");
      this.m = $$0.b("tail");
      this.i = $$0.b("center_head");
      this.j = $$0.b("right_head");
      this.k = $$0.b("left_head");
   }

   public static gah a(gaf $$0) {
      gaj $$1 = new gaj();
      gal $$2 = $$1.a();
      $$2.a("shoulders", gag.c().a(0, 16).a(-10.0F, 3.9F, -0.5F, 20.0F, 3.0F, 3.0F, $$0), gad.a);
      float $$3 = 0.20420352F;
      $$2.a(
         "ribcage",
         gag.c()
            .a(0, 22)
            .a(0.0F, 0.0F, 0.0F, 3.0F, 10.0F, 3.0F, $$0)
            .a(24, 22)
            .a(-4.0F, 1.5F, 0.5F, 11.0F, 2.0F, 2.0F, $$0)
            .a(24, 22)
            .a(-4.0F, 4.0F, 0.5F, 11.0F, 2.0F, 2.0F, $$0)
            .a(24, 22)
            .a(-4.0F, 6.5F, 0.5F, 11.0F, 2.0F, 2.0F, $$0),
         gad.a(-2.0F, 6.9F, -0.5F, 0.20420352F, 0.0F, 0.0F)
      );
      $$2.a(
         "tail",
         gag.c().a(12, 22).a(0.0F, 0.0F, 0.0F, 3.0F, 6.0F, 3.0F, $$0),
         gad.a(-2.0F, 6.9F + azc.b(0.20420352F) * 10.0F, -0.5F + azc.a(0.20420352F) * 10.0F, 0.83252203F, 0.0F, 0.0F)
      );
      $$2.a("center_head", gag.c().a(0, 0).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), gad.a);
      gag $$4 = gag.c().a(32, 0).a(-4.0F, -4.0F, -4.0F, 6.0F, 6.0F, 6.0F, $$0);
      $$2.a("right_head", $$4, gad.a(-8.0F, 4.0F, 0.0F));
      $$2.a("left_head", $$4, gad.a(10.0F, 4.0F, 0.0F));
      return gah.a($$1, 64, 64);
   }

   @Override
   public gab a() {
      return this.g;
   }

   public void a(gvg $$0) {
      a($$0, this.j, 0);
      a($$0, this.k, 1);
      float $$1 = azc.b($$0.p * 0.1F);
      this.l.e = (0.065F + 0.05F * $$1) * (float) Math.PI;
      this.m.a(-2.0F, 6.9F + azc.b(this.l.e) * 10.0F, -0.5F + azc.a(this.l.e) * 10.0F);
      this.m.e = (0.265F + 0.1F * $$1) * (float) Math.PI;
      this.i.f = $$0.U * (float) (Math.PI / 180.0);
      this.i.e = $$0.V * (float) (Math.PI / 180.0);
   }

   private static void a(gvg $$0, gab $$1, int $$2) {
      $$1.f = ($$0.b[$$2] - $$0.T) * (float) (Math.PI / 180.0);
      $$1.e = $$0.a[$$2] * (float) (Math.PI / 180.0);
   }
}
