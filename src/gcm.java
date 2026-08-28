public class gcm extends gdv {
   private static final String a = "bottom";
   private static final String b = "lid";
   private static final String c = "lock";
   private final ggc d;
   private final ggc e;

   public gcm(ggc $$0) {
      super($$0, gnh::d);
      this.d = $$0.b("lid");
      this.e = $$0.b("lock");
   }

   public static ggi a() {
      ggk $$0 = new ggk();
      ggm $$1 = $$0.a();
      $$1.a("bottom", ggh.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 14.0F, 10.0F, 14.0F), gge.a);
      $$1.a("lid", ggh.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 14.0F, 5.0F, 14.0F), gge.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", ggh.c().a(0, 0).a(7.0F, -2.0F, 14.0F, 2.0F, 4.0F, 1.0F), gge.a(0.0F, 9.0F, 1.0F));
      return ggi.a($$0, 64, 64);
   }

   public static ggi b() {
      ggk $$0 = new ggk();
      ggm $$1 = $$0.a();
      $$1.a("bottom", ggh.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), gge.a);
      $$1.a("lid", ggh.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), gge.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", ggh.c().a(0, 0).a(15.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), gge.a(0.0F, 9.0F, 1.0F));
      return ggi.a($$0, 64, 64);
   }

   public static ggi c() {
      ggk $$0 = new ggk();
      ggm $$1 = $$0.a();
      $$1.a("bottom", ggh.c().a(0, 19).a(0.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), gge.a);
      $$1.a("lid", ggh.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), gge.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", ggh.c().a(0, 0).a(0.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), gge.a(0.0F, 9.0F, 1.0F));
      return ggi.a($$0, 64, 64);
   }

   public void a(float $$0) {
      this.d.e = -($$0 * (float) (Math.PI / 2));
      this.e.e = this.d.e;
   }
}
