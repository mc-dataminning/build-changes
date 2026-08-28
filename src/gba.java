public class gba extends fyk<gwz> {
   private static final String a = "ribcage";
   private static final String b = "center_head";
   private static final String c = "right_head";
   private static final String d = "left_head";
   private static final float e = 0.065F;
   private static final float f = 0.265F;
   private final gbm g;
   private final gbm i;
   private final gbm j;
   private final gbm k;
   private final gbm l;

   public gba(gbm $$0) {
      super($$0);
      this.k = $$0.b("ribcage");
      this.l = $$0.b("tail");
      this.g = $$0.b("center_head");
      this.i = $$0.b("right_head");
      this.j = $$0.b("left_head");
   }

   public static gbs a(gbq $$0) {
      gbu $$1 = new gbu();
      gbw $$2 = $$1.a();
      $$2.a("shoulders", gbr.c().a(0, 16).a(-10.0F, 3.9F, -0.5F, 20.0F, 3.0F, 3.0F, $$0), gbo.a);
      float $$3 = 0.20420352F;
      $$2.a(
         "ribcage",
         gbr.c()
            .a(0, 22)
            .a(0.0F, 0.0F, 0.0F, 3.0F, 10.0F, 3.0F, $$0)
            .a(24, 22)
            .a(-4.0F, 1.5F, 0.5F, 11.0F, 2.0F, 2.0F, $$0)
            .a(24, 22)
            .a(-4.0F, 4.0F, 0.5F, 11.0F, 2.0F, 2.0F, $$0)
            .a(24, 22)
            .a(-4.0F, 6.5F, 0.5F, 11.0F, 2.0F, 2.0F, $$0),
         gbo.a(-2.0F, 6.9F, -0.5F, 0.20420352F, 0.0F, 0.0F)
      );
      $$2.a(
         "tail",
         gbr.c().a(12, 22).a(0.0F, 0.0F, 0.0F, 3.0F, 6.0F, 3.0F, $$0),
         gbo.a(-2.0F, 6.9F + azk.b(0.20420352F) * 10.0F, -0.5F + azk.a(0.20420352F) * 10.0F, 0.83252203F, 0.0F, 0.0F)
      );
      $$2.a("center_head", gbr.c().a(0, 0).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), gbo.a);
      gbr $$4 = gbr.c().a(32, 0).a(-4.0F, -4.0F, -4.0F, 6.0F, 6.0F, 6.0F, $$0);
      $$2.a("right_head", $$4, gbo.a(-8.0F, 4.0F, 0.0F));
      $$2.a("left_head", $$4, gbo.a(10.0F, 4.0F, 0.0F));
      return gbs.a($$1, 64, 64);
   }

   public void a(gwz $$0) {
      super.a($$0);
      a($$0, this.i, 0);
      a($$0, this.j, 1);
      float $$1 = azk.b($$0.p * 0.1F);
      this.k.e = (0.065F + 0.05F * $$1) * (float) Math.PI;
      this.l.a(-2.0F, 6.9F + azk.b(this.k.e) * 10.0F, -0.5F + azk.a(this.k.e) * 10.0F);
      this.l.e = (0.265F + 0.1F * $$1) * (float) Math.PI;
      this.g.f = $$0.U * (float) (Math.PI / 180.0);
      this.g.e = $$0.V * (float) (Math.PI / 180.0);
   }

   private static void a(gwz $$0, gbm $$1, int $$2) {
      $$1.f = ($$0.b[$$2] - $$0.T) * (float) (Math.PI / 180.0);
      $$1.e = $$0.a[$$2] * (float) (Math.PI / 180.0);
   }
}
