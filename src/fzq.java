public class fzq extends fyu {
   private static final String a = "plate";
   private static final String b = "handle";
   private static final int c = 10;
   private static final int d = 20;
   private final gbb e;
   private final gbb f;

   public fzq(gbb $$0) {
      super($$0, gig::c);
      this.e = $$0.b("plate");
      this.f = $$0.b("handle");
   }

   public static gbh a() {
      gbj $$0 = new gbj();
      gbl $$1 = $$0.a();
      $$1.a("plate", gbg.c().a(0, 0).a(-6.0F, -11.0F, -2.0F, 12.0F, 22.0F, 1.0F), gbd.a);
      $$1.a("handle", gbg.c().a(26, 0).a(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 6.0F), gbd.a);
      return gbh.a($$0, 64, 64);
   }

   public gbb b() {
      return this.e;
   }

   public gbb c() {
      return this.f;
   }
}
