public class gju extends giy {
   private static final String a = "plate";
   private static final String b = "handle";
   private static final int c = 10;
   private static final int d = 20;
   private final glg e;
   private final glg f;

   public gju(glg $$0) {
      super($$0, gsn::d);
      this.e = $$0.b("plate");
      this.f = $$0.b("handle");
   }

   public static glm a() {
      glo $$0 = new glo();
      glq $$1 = $$0.a();
      $$1.a("plate", gll.c().a(0, 0).a(-6.0F, -11.0F, -2.0F, 12.0F, 22.0F, 1.0F), gli.a);
      $$1.a("handle", gll.c().a(26, 0).a(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 6.0F), gli.a);
      return glm.a($$0, 64, 64);
   }

   public glg b() {
      return this.e;
   }

   public glg c() {
      return this.f;
   }
}
