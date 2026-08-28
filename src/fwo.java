public class fwo extends fxv {
   private static final String a = "bottom";
   private static final String b = "lid";
   private static final String c = "lock";
   private final gab d;
   private final gab e;
   private final gab f;

   public fwo(gab $$0) {
      super(ghe::c);
      this.d = $$0;
      this.e = $$0.b("lid");
      this.f = $$0.b("lock");
   }

   public static gah b() {
      gaj $$0 = new gaj();
      gal $$1 = $$0.a();
      $$1.a("bottom", gag.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 14.0F, 10.0F, 14.0F), gad.a);
      $$1.a("lid", gag.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 14.0F, 5.0F, 14.0F), gad.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", gag.c().a(0, 0).a(7.0F, -2.0F, 14.0F, 2.0F, 4.0F, 1.0F), gad.a(0.0F, 9.0F, 1.0F));
      return gah.a($$0, 64, 64);
   }

   public static gah c() {
      gaj $$0 = new gaj();
      gal $$1 = $$0.a();
      $$1.a("bottom", gag.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), gad.a);
      $$1.a("lid", gag.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), gad.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", gag.c().a(0, 0).a(15.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), gad.a(0.0F, 9.0F, 1.0F));
      return gah.a($$0, 64, 64);
   }

   public static gah d() {
      gaj $$0 = new gaj();
      gal $$1 = $$0.a();
      $$1.a("bottom", gag.c().a(0, 19).a(0.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), gad.a);
      $$1.a("lid", gag.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), gad.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", gag.c().a(0, 0).a(0.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), gad.a(0.0F, 9.0F, 1.0F));
      return gah.a($$0, 64, 64);
   }

   public void a(float $$0) {
      this.e.e = -($$0 * (float) (Math.PI / 2));
      this.f.e = this.e.e;
   }

   @Override
   public gab a() {
      return this.d;
   }
}
