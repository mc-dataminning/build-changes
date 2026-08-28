public class gbn extends gcv {
   private static final String a = "bottom";
   private static final String b = "lid";
   private static final String c = "lock";
   private final gfc d;
   private final gfc e;

   public gbn(gfc $$0) {
      super($$0, gmh::d);
      this.d = $$0.b("lid");
      this.e = $$0.b("lock");
   }

   public static gfi a() {
      gfk $$0 = new gfk();
      gfm $$1 = $$0.a();
      $$1.a("bottom", gfh.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 14.0F, 10.0F, 14.0F), gfe.a);
      $$1.a("lid", gfh.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 14.0F, 5.0F, 14.0F), gfe.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", gfh.c().a(0, 0).a(7.0F, -2.0F, 14.0F, 2.0F, 4.0F, 1.0F), gfe.a(0.0F, 9.0F, 1.0F));
      return gfi.a($$0, 64, 64);
   }

   public static gfi b() {
      gfk $$0 = new gfk();
      gfm $$1 = $$0.a();
      $$1.a("bottom", gfh.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), gfe.a);
      $$1.a("lid", gfh.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), gfe.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", gfh.c().a(0, 0).a(15.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), gfe.a(0.0F, 9.0F, 1.0F));
      return gfi.a($$0, 64, 64);
   }

   public static gfi c() {
      gfk $$0 = new gfk();
      gfm $$1 = $$0.a();
      $$1.a("bottom", gfh.c().a(0, 19).a(0.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), gfe.a);
      $$1.a("lid", gfh.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), gfe.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", gfh.c().a(0, 0).a(0.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), gfe.a(0.0F, 9.0F, 1.0F));
      return gfi.a($$0, 64, 64);
   }

   public void a(float $$0) {
      this.d.e = -($$0 * (float) (Math.PI / 2));
      this.e.e = this.d.e;
   }
}
