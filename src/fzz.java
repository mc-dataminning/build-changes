public class fzz extends fxk<gvx> {
   private static final String a = "ribcage";
   private static final String b = "center_head";
   private static final String c = "right_head";
   private static final String d = "left_head";
   private static final float e = 0.065F;
   private static final float f = 0.265F;
   private final gal g;
   private final gal i;
   private final gal j;
   private final gal k;
   private final gal l;
   private final gal m;

   public fzz(gal $$0) {
      this.g = $$0;
      this.l = $$0.b("ribcage");
      this.m = $$0.b("tail");
      this.i = $$0.b("center_head");
      this.j = $$0.b("right_head");
      this.k = $$0.b("left_head");
   }

   public static gar a(gap $$0) {
      gat $$1 = new gat();
      gav $$2 = $$1.a();
      $$2.a("shoulders", gaq.c().a(0, 16).a(-10.0F, 3.9F, -0.5F, 20.0F, 3.0F, 3.0F, $$0), gan.a);
      float $$3 = 0.20420352F;
      $$2.a(
         "ribcage",
         gaq.c()
            .a(0, 22)
            .a(0.0F, 0.0F, 0.0F, 3.0F, 10.0F, 3.0F, $$0)
            .a(24, 22)
            .a(-4.0F, 1.5F, 0.5F, 11.0F, 2.0F, 2.0F, $$0)
            .a(24, 22)
            .a(-4.0F, 4.0F, 0.5F, 11.0F, 2.0F, 2.0F, $$0)
            .a(24, 22)
            .a(-4.0F, 6.5F, 0.5F, 11.0F, 2.0F, 2.0F, $$0),
         gan.a(-2.0F, 6.9F, -0.5F, 0.20420352F, 0.0F, 0.0F)
      );
      $$2.a(
         "tail",
         gaq.c().a(12, 22).a(0.0F, 0.0F, 0.0F, 3.0F, 6.0F, 3.0F, $$0),
         gan.a(-2.0F, 6.9F + azd.b(0.20420352F) * 10.0F, -0.5F + azd.a(0.20420352F) * 10.0F, 0.83252203F, 0.0F, 0.0F)
      );
      $$2.a("center_head", gaq.c().a(0, 0).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), gan.a);
      gaq $$4 = gaq.c().a(32, 0).a(-4.0F, -4.0F, -4.0F, 6.0F, 6.0F, 6.0F, $$0);
      $$2.a("right_head", $$4, gan.a(-8.0F, 4.0F, 0.0F));
      $$2.a("left_head", $$4, gan.a(10.0F, 4.0F, 0.0F));
      return gar.a($$1, 64, 64);
   }

   @Override
   public gal a() {
      return this.g;
   }

   public void a(gvx $$0) {
      a($$0, this.j, 0);
      a($$0, this.k, 1);
      float $$1 = azd.b($$0.p * 0.1F);
      this.l.e = (0.065F + 0.05F * $$1) * (float) Math.PI;
      this.m.a(-2.0F, 6.9F + azd.b(this.l.e) * 10.0F, -0.5F + azd.a(this.l.e) * 10.0F);
      this.m.e = (0.265F + 0.1F * $$1) * (float) Math.PI;
      this.i.f = $$0.U * (float) (Math.PI / 180.0);
      this.i.e = $$0.V * (float) (Math.PI / 180.0);
   }

   private static void a(gvx $$0, gal $$1, int $$2) {
      $$1.f = ($$0.b[$$2] - $$0.T) * (float) (Math.PI / 180.0);
      $$1.e = $$0.a[$$2] * (float) (Math.PI / 180.0);
   }
}
