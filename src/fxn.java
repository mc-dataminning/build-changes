public class fxn extends fyu {
   private static final String a = "bottom";
   private static final String b = "lid";
   private static final String c = "lock";
   private final gbb d;
   private final gbb e;

   public fxn(gbb $$0) {
      super($$0, gig::c);
      this.d = $$0.b("lid");
      this.e = $$0.b("lock");
   }

   public static gbh a() {
      gbj $$0 = new gbj();
      gbl $$1 = $$0.a();
      $$1.a("bottom", gbg.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 14.0F, 10.0F, 14.0F), gbd.a);
      $$1.a("lid", gbg.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 14.0F, 5.0F, 14.0F), gbd.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", gbg.c().a(0, 0).a(7.0F, -2.0F, 14.0F, 2.0F, 4.0F, 1.0F), gbd.a(0.0F, 9.0F, 1.0F));
      return gbh.a($$0, 64, 64);
   }

   public static gbh b() {
      gbj $$0 = new gbj();
      gbl $$1 = $$0.a();
      $$1.a("bottom", gbg.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), gbd.a);
      $$1.a("lid", gbg.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), gbd.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", gbg.c().a(0, 0).a(15.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), gbd.a(0.0F, 9.0F, 1.0F));
      return gbh.a($$0, 64, 64);
   }

   public static gbh c() {
      gbj $$0 = new gbj();
      gbl $$1 = $$0.a();
      $$1.a("bottom", gbg.c().a(0, 19).a(0.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), gbd.a);
      $$1.a("lid", gbg.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), gbd.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", gbg.c().a(0, 0).a(0.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), gbd.a(0.0F, 9.0F, 1.0F));
      return gbh.a($$0, 64, 64);
   }

   public void a(float $$0) {
      this.d.e = -($$0 * (float) (Math.PI / 2));
      this.e.e = this.d.e;
   }
}
