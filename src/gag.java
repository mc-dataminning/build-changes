public class gag extends gah {
   protected final gbm a;

   public gag(gbm $$0) {
      super($$0);
      this.a = $$0.b("head");
   }

   public static gbu a() {
      gbu $$0 = new gbu();
      gbw $$1 = $$0.a();
      $$1.a("head", gbr.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), gbo.a);
      return $$0;
   }

   public static gbs b() {
      gbu $$0 = a();
      gbw $$1 = $$0.a();
      $$1.b("head").a("hat", gbr.c().a(32, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new gbq(0.25F)), gbo.a);
      return gbs.a($$0, 64, 64);
   }

   public static gbs c() {
      gbu $$0 = a();
      return gbs.a($$0, 64, 32);
   }

   @Override
   public void a(float $$0, float $$1, float $$2) {
      this.a.f = $$1 * (float) (Math.PI / 180.0);
      this.a.e = $$2 * (float) (Math.PI / 180.0);
   }
}
