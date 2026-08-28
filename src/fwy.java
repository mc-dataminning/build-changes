public class fwy extends fyf {
   private static final String a = "bottom";
   private static final String b = "lid";
   private static final String c = "lock";
   private final gal d;
   private final gal e;
   private final gal f;

   public fwy(gal $$0) {
      super(ghq::c);
      this.d = $$0;
      this.e = $$0.b("lid");
      this.f = $$0.b("lock");
   }

   public static gar b() {
      gat $$0 = new gat();
      gav $$1 = $$0.a();
      $$1.a("bottom", gaq.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 14.0F, 10.0F, 14.0F), gan.a);
      $$1.a("lid", gaq.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 14.0F, 5.0F, 14.0F), gan.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", gaq.c().a(0, 0).a(7.0F, -2.0F, 14.0F, 2.0F, 4.0F, 1.0F), gan.a(0.0F, 9.0F, 1.0F));
      return gar.a($$0, 64, 64);
   }

   public static gar c() {
      gat $$0 = new gat();
      gav $$1 = $$0.a();
      $$1.a("bottom", gaq.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), gan.a);
      $$1.a("lid", gaq.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), gan.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", gaq.c().a(0, 0).a(15.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), gan.a(0.0F, 9.0F, 1.0F));
      return gar.a($$0, 64, 64);
   }

   public static gar d() {
      gat $$0 = new gat();
      gav $$1 = $$0.a();
      $$1.a("bottom", gaq.c().a(0, 19).a(0.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), gan.a);
      $$1.a("lid", gaq.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), gan.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", gaq.c().a(0, 0).a(0.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), gan.a(0.0F, 9.0F, 1.0F));
      return gar.a($$0, 64, 64);
   }

   public void a(float $$0) {
      this.e.e = -($$0 * (float) (Math.PI / 2));
      this.f.e = this.e.e;
   }

   @Override
   public gal a() {
      return this.d;
   }
}
