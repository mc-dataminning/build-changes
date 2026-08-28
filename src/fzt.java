public class fzt extends fyk<gun> {
   private final gbm a;
   private final gbm b;

   public fzt(gbm $$0) {
      super($$0);
      this.a = $$0.b("left_fin");
      this.b = $$0.b("right_fin");
   }

   public static gbs a() {
      gbu $$0 = new gbu();
      gbw $$1 = $$0.a();
      int $$2 = 23;
      $$1.a("body", gbr.c().a(0, 27).a(-1.5F, -2.0F, -1.5F, 3.0F, 2.0F, 3.0F), gbo.a(0.0F, 23.0F, 0.0F));
      $$1.a("right_eye", gbr.c().a(24, 6).a(-1.5F, 0.0F, -1.5F, 1.0F, 1.0F, 1.0F), gbo.a(0.0F, 20.0F, 0.0F));
      $$1.a("left_eye", gbr.c().a(28, 6).a(0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 1.0F), gbo.a(0.0F, 20.0F, 0.0F));
      $$1.a("back_fin", gbr.c().a(-3, 0).a(-1.5F, 0.0F, 0.0F, 3.0F, 0.0F, 3.0F), gbo.a(0.0F, 22.0F, 1.5F));
      $$1.a("right_fin", gbr.c().a(25, 0).a(-1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 2.0F), gbo.a(-1.5F, 22.0F, -1.5F));
      $$1.a("left_fin", gbr.c().a(25, 0).a(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 2.0F), gbo.a(1.5F, 22.0F, -1.5F));
      return gbs.a($$0, 32, 32);
   }

   @Override
   public void a(gun $$0) {
      super.a($$0);
      this.b.g = -0.2F + 0.4F * azk.a($$0.p * 0.2F);
      this.a.g = 0.2F - 0.4F * azk.a($$0.p * 0.2F);
   }
}
