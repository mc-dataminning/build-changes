public class fyr extends fxv {
   private static final String a = "plate";
   private static final String b = "handle";
   private static final int c = 10;
   private static final int d = 20;
   private final gab e;
   private final gab f;
   private final gab g;

   public fyr(gab $$0) {
      super(ghe::c);
      this.e = $$0;
      this.f = $$0.b("plate");
      this.g = $$0.b("handle");
   }

   public static gah b() {
      gaj $$0 = new gaj();
      gal $$1 = $$0.a();
      $$1.a("plate", gag.c().a(0, 0).a(-6.0F, -11.0F, -2.0F, 12.0F, 22.0F, 1.0F), gad.a);
      $$1.a("handle", gag.c().a(26, 0).a(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 6.0F), gad.a);
      return gah.a($$0, 64, 64);
   }

   public gab c() {
      return this.f;
   }

   public gab d() {
      return this.g;
   }

   @Override
   public gab a() {
      return this.e;
   }
}
