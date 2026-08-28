public class gad extends fyk<gwh> {
   public static final String a = "lid";
   private static final String b = "base";
   private final gbm c;
   private final gbm d;

   public gad(gbm $$0) {
      super($$0, gir::g);
      this.c = $$0.b("lid");
      this.d = $$0.b("head");
   }

   private static gbu c() {
      gbu $$0 = new gbu();
      gbw $$1 = $$0.a();
      $$1.a("lid", gbr.c().a(0, 0).a(-8.0F, -16.0F, -8.0F, 16.0F, 12.0F, 16.0F), gbo.a(0.0F, 24.0F, 0.0F));
      $$1.a("base", gbr.c().a(0, 28).a(-8.0F, -8.0F, -8.0F, 16.0F, 8.0F, 16.0F), gbo.a(0.0F, 24.0F, 0.0F));
      return $$0;
   }

   public static gbs a() {
      gbu $$0 = c();
      $$0.a().a("head", gbr.c().a(0, 52).a(-3.0F, 0.0F, -3.0F, 6.0F, 6.0F, 6.0F), gbo.a(0.0F, 12.0F, 0.0F));
      return gbs.a($$0, 64, 64);
   }

   public static gbs b() {
      gbu $$0 = c();
      return gbs.a($$0, 64, 64);
   }

   public void a(gwh $$0) {
      super.a($$0);
      float $$1 = (0.5F + $$0.c) * (float) Math.PI;
      float $$2 = -1.0F + azk.a($$1);
      float $$3 = 0.0F;
      if ($$1 > (float) Math.PI) {
         $$3 = azk.a($$0.p * 0.1F) * 0.7F;
      }

      this.c.a(0.0F, 16.0F + azk.a($$1) * 8.0F + $$3, 0.0F);
      if ($$0.c > 0.3F) {
         this.c.f = $$2 * $$2 * $$2 * $$2 * (float) Math.PI * 0.125F;
      } else {
         this.c.f = 0.0F;
      }

      this.d.e = $$0.V * (float) (Math.PI / 180.0);
      this.d.f = ($$0.d - 180.0F - $$0.e) * (float) (Math.PI / 180.0);
   }
}
