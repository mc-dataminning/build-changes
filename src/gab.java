public class gab extends fzf {
   private static final String a = "plate";
   private static final String b = "handle";
   private static final int c = 10;
   private static final int d = 20;
   private final gbm e;
   private final gbm f;

   public gab(gbm $$0) {
      super($$0, gir::c);
      this.e = $$0.b("plate");
      this.f = $$0.b("handle");
   }

   public static gbs a() {
      gbu $$0 = new gbu();
      gbw $$1 = $$0.a();
      $$1.a("plate", gbr.c().a(0, 0).a(-6.0F, -11.0F, -2.0F, 12.0F, 22.0F, 1.0F), gbo.a);
      $$1.a("handle", gbr.c().a(26, 0).a(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 6.0F), gbo.a);
      return gbs.a($$0, 64, 64);
   }

   public gbm b() {
      return this.e;
   }

   public gbm c() {
      return this.f;
   }
}
