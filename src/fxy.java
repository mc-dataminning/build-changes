public class fxy extends fzf {
   private static final String a = "bottom";
   private static final String b = "lid";
   private static final String c = "lock";
   private final gbm d;
   private final gbm e;

   public fxy(gbm $$0) {
      super($$0, gir::c);
      this.d = $$0.b("lid");
      this.e = $$0.b("lock");
   }

   public static gbs a() {
      gbu $$0 = new gbu();
      gbw $$1 = $$0.a();
      $$1.a("bottom", gbr.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 14.0F, 10.0F, 14.0F), gbo.a);
      $$1.a("lid", gbr.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 14.0F, 5.0F, 14.0F), gbo.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", gbr.c().a(0, 0).a(7.0F, -2.0F, 14.0F, 2.0F, 4.0F, 1.0F), gbo.a(0.0F, 9.0F, 1.0F));
      return gbs.a($$0, 64, 64);
   }

   public static gbs b() {
      gbu $$0 = new gbu();
      gbw $$1 = $$0.a();
      $$1.a("bottom", gbr.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), gbo.a);
      $$1.a("lid", gbr.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), gbo.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", gbr.c().a(0, 0).a(15.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), gbo.a(0.0F, 9.0F, 1.0F));
      return gbs.a($$0, 64, 64);
   }

   public static gbs c() {
      gbu $$0 = new gbu();
      gbw $$1 = $$0.a();
      $$1.a("bottom", gbr.c().a(0, 19).a(0.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), gbo.a);
      $$1.a("lid", gbr.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), gbo.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", gbr.c().a(0, 0).a(0.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), gbo.a(0.0F, 9.0F, 1.0F));
      return gbs.a($$0, 64, 64);
   }

   public void a(float $$0) {
      this.d.e = -($$0 * (float) (Math.PI / 2));
      this.e.e = this.d.e;
   }
}
