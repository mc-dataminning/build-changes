public class gay extends fyk<gun> {
   private static final int a = 16;
   private final gbm b;
   private final gbm c;
   private final gbm d;

   public gay(gbm $$0) {
      super($$0, gir::i);
      this.b = $$0.b("bone");
      this.d = this.b.b("wind");
      this.c = this.b.b("wind_charge");
   }

   public static gbs a() {
      gbu $$0 = new gbu();
      gbw $$1 = $$0.a();
      gbw $$2 = $$1.a("bone", gbr.c(), gbo.a(0.0F, 0.0F, 0.0F));
      $$2.a(
         "wind",
         gbr.c().a(15, 20).a(-4.0F, -1.0F, -4.0F, 8.0F, 2.0F, 8.0F, new gbq(0.0F)).a(0, 9).a(-3.0F, -2.0F, -3.0F, 6.0F, 4.0F, 6.0F, new gbq(0.0F)),
         gbo.a(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F)
      );
      $$2.a("wind_charge", gbr.c().a(0, 0).a(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new gbq(0.0F)), gbo.a(0.0F, 0.0F, 0.0F));
      return gbs.a($$0, 64, 32);
   }

   @Override
   public void a(gun $$0) {
      super.a($$0);
      this.c.f = -$$0.p * 16.0F * (float) (Math.PI / 180.0);
      this.d.f = $$0.p * 16.0F * (float) (Math.PI / 180.0);
   }
}
